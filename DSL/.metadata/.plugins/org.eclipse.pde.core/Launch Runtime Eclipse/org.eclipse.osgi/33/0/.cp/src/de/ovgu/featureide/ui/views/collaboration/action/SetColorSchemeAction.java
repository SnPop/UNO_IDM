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
package de.ovgu.featureide.ui.views.collaboration.action;

import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.jface.action.IAction;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.color.FeatureColorManager;
import de.ovgu.featureide.ui.views.collaboration.CollaborationView;

/**
 * Action to select a colorscheme
 *
 * @author Sebastian Krieter
 */
public class SetColorSchemeAction extends AbstractColorAction {

	String newColorSchemeName;

	public SetColorSchemeAction(String text, GraphicalViewerImpl view, CollaborationView collaborationView, int index, String newColorSchemeName) {
		super(text, view, collaborationView, index, IAction.AS_CHECK_BOX);
		this.newColorSchemeName = newColorSchemeName;
	}

	/*
	 * (non-Javadoc)
	 * @see de.ovgu.featureide.ui.views.collaboration.color.action.AbstractColorAction#action(de.ovgu.featureide.fm.core.Feature)
	 */
	@Override
	protected boolean action(IFeatureModel fm, String collName) {
		FeatureColorManager.setActive(fm, collName);
		return true;
	}

}
