/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2019  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 *
 * FeatureIDE is free software: you can redistributedeadFeatures/or modify
 * it under the terms of the GNU LdeadFeatureseneral PudeadFeaturescense as published by
 * the FredeadFeaturesare Foundation, either version 3 of the License, or
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
package de.ovgu.featureide.ui.views.configMap.filters;

import java.util.List;

import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.FeatureModelProperty;
import de.ovgu.featureide.ui.views.configMap.ConfigurationMap;
import de.ovgu.featureide.ui.views.configMap.ConfigurationMapFilter;

/**
 * @author Paul Maximilian Bittner
 * @author Antje Moench
 */
public class DeadFeatureFilter extends ConfigurationMapFilter {

	private List<IFeature> deadFeatures;
	private IFeatureModel featureModelFilterIsInitializedFor;

	public DeadFeatureFilter(boolean isDefault) {
		super("dead features", isDefault);
		setImagePath(Image_Minus);
	}

	@Override
	public void initialize(ConfigurationMap configurationMap) {
		// skip when automated analyses are deactivated
		if (!FeatureModelProperty.isRunCalculationAutomatically(configurationMap.getFeatureProject().getFeatureModelManager().getObject())
			|| !FeatureModelProperty.isCalculateFeatures(configurationMap.getFeatureProject().getFeatureModelManager().getObject())) {
			return;
		}
		final FeatureModelFormula snapshot = configurationMap.getFeatureProject().getFeatureModelManager().getPersistentFormula();
		final IFeatureModel featureModel = snapshot.getFeatureModel();
		if (featureModel != featureModelFilterIsInitializedFor) {
			deadFeatures = snapshot.getAnalyzer().getDeadFeatures(null);
			featureModelFilterIsInitializedFor = featureModel;
		}
	}

	@Override
	public boolean test(ConfigurationMap configurationMap, IFeature feature) {
		return deadFeatures != null ? deadFeatures.contains(feature) : false;
	}

}
