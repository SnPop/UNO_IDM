/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2019  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 *
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package de.ovgu.featureide.ui.quickfix;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.ConfigurationAnalyzer;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.io.EclipseFileSystem;
import de.ovgu.featureide.fm.core.io.manager.FileHandler;
import de.ovgu.featureide.fm.core.job.monitor.IMonitor;
import de.ovgu.featureide.fm.core.job.monitor.NullMonitor;
import de.ovgu.featureide.fm.core.job.monitor.ProgressMonitor;

/**
 * Creates configurations for missing configurations.
 *
 * @author Jens Meinicke
 */
class QuickFixUnusedFeatures extends QuickFixMissingConfigurations {

	public QuickFixUnusedFeatures(final IMarker marker) {
		super(marker);
	}

	@Override
	public void run(final IMarker marker) {
		final Job job = new Job(getLabel()) {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				if (project != null) {
					final IMonitor<?> monitor2 = new ProgressMonitor<>("Cover unused features", monitor);
					monitor2.setRemainingWork(2);
					final IMonitor<?> subTask = monitor2.subTask(1);
					subTask.setTaskName("Collect unused features");
					final Collection<String> unusedFeatures = project.getUnusedConfigurationFeatures();
					subTask.step();
					subTask.done();
					createConfigurations(unusedFeatures, monitor2.subTask(1), false);
					monitor2.done();
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private List<Configuration> createConfigurations(final Collection<String> unusedFeatures, final IMonitor<List<List<String>>> monitor, boolean collect) {
		monitor.setTaskName("Create configurations");
		monitor.setRemainingWork(unusedFeatures.size());
		final List<Configuration> confs = new LinkedList<>();
		final FileHandler<Configuration> writer = new FileHandler<>(configFormat);
		final Configuration c = new Configuration(featureModel);
		final List<List<String>> solutions = new ConfigurationAnalyzer(featureModel, c).coverFeatures(unusedFeatures, true);
		for (final List<String> solution : solutions) {
			final Configuration configuration = new Configuration(featureModel);
			for (final String feature : solution) {
				configuration.setManual(feature, Selection.SELECTED);
			}
			if (collect) {
				confs.add(configuration);
			} else {
				final IFile configurationFile = getConfigurationFile(project.getConfigFolder());
				writer.write(EclipseFileSystem.getPath(configurationFile), configuration);
			}
		}

		return confs;
	}

	/**
	 * For testing purpose only.
	 *
	 * @param falseOptionalFeatures
	 * @param fm
	 * @return
	 */
	public Collection<Configuration> createConfigurations(Collection<String> falseOptionalFeatures, FeatureModelFormula fm) {
		featureModel = fm;
		return createConfigurations(falseOptionalFeatures, new NullMonitor<>(), true);
	}

}
