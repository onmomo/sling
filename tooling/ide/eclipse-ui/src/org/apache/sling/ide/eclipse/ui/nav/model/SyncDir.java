/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.ide.eclipse.ui.nav.model;

import org.apache.sling.ide.eclipse.ui.internal.SharedImages;
import org.eclipse.core.resources.IFolder;
import org.eclipse.swt.graphics.Image;

/** WIP: model object for the syncDir [root] shown in the content package view in project explorer **/
public class SyncDir extends JcrNode {

	private final IFolder folder;

	public SyncDir(IFolder folder) {
		if (folder==null) {
			throw new IllegalArgumentException("folder must not be null");
		}
		this.folder = folder;
		setResource(folder);
	}
	
	@Override
	public Image getImage() {
		return SharedImages.SLING_ICON.createImage();
	}

	public String getLabel() {
		return folder.getProjectRelativePath()+" [sling synched]";
	}
	
	@Override
	public String getDescription() {
		return folder.getProjectRelativePath().toString() + "[jcr root]";
	}

	public IFolder getFolder() {
		return folder;
	}
	
	@Override
	public String getName() {
		return "/";
	}

}
