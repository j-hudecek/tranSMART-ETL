/*******************************************************************************
 * Copyright (c) 2012 Sanofi-Aventis Recherche et Développement.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Sanofi-Aventis Recherche et Développement - initial API and implementation
 ******************************************************************************/
package fr.sanofi.fcl4transmart.model.interfaces;

import java.io.File;
import java.util.Vector;

public interface StudyItf {
	public Vector<DataTypeItf> getDataTypes();
	public Vector<String> getMissingFolders();
	public File getPath();
	public void setName(String name);
	public void setPath(File newPath);
	public String getTopNode();
	public void setTopNode(String topNode);
}
