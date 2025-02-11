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
package de.ovgu.featureide.ui.views.configMap;

import de.ovgu.featureide.fm.core.base.IFeature;

/**
 * A Filter for the Features in the ConfigurationMap.
 *
 * @author Paul Maximilian Bittner
 */
public interface IConfigurationMapFilter {

	public void initialize(ConfigurationMap configurationMap);

	/**
	 * @param configurationMap configuration map
	 * @param feature feature
	 * @return True, if the given IFeature is valid, false if it should be filtered out.
	 */
	public boolean test(ConfigurationMap configurationMap, IFeature feature);

	public String getName();

	public String getImagePath();

	public boolean isDefault();
}
