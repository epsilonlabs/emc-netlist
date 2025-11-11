/*******************************************************************************
 * Copyright (c) 2011-2025 The University of York.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 *     Antonio Garcia-Dominguez - adaptation to concise netlists
 ******************************************************************************/
package org.eclipse.epsilon.emc.netlist.dt;

import org.eclipse.epsilon.common.dt.launching.dialogs.AbstractModelConfigurationDialog;
import org.eclipse.epsilon.common.dt.launching.dialogs.BrowseWorkspaceUtil;
import org.eclipse.epsilon.common.dt.util.DialogUtil;
import org.eclipse.epsilon.emc.netlist.ConciseNetlistModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ConciseNetlistModelConfigurationDialog extends AbstractModelConfigurationDialog {

	private Text fileText;

	@Override
	protected String getModelName() {
		return "Allegro/Cadence Concise Netlist";
	}

	@Override
	protected String getModelType() {
		return "CONCISE_NETLIST";
	}

	@Override
	protected void createGroups(Composite control) {
		createNameAliasGroup(control);
		createFileGroup(control);
	}

	private void createFileGroup(Composite parent) {
		final Composite groupContent = DialogUtil.createGroupContainer(parent, "Netlist Source", 3);

		final Label bibtexFileLabel = new Label(groupContent, SWT.NONE);
		bibtexFileLabel.setText("Netlist file: ");

		fileText = new Text(groupContent, SWT.BORDER);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		final Button browseHutnFile = new Button(groupContent, SWT.NONE);
		browseHutnFile.setText("Browse Workspace...");
		browseHutnFile.addListener(SWT.Selection, new BrowseWorkspaceForSourceFilesListener(fileText));

		groupContent.layout();
		groupContent.pack();
	}

	@Override
	protected void loadProperties() {
		super.loadProperties();
		if (properties != null) {
			fileText.setText(properties.getProperty(ConciseNetlistModel.PROPERTY_MODEL_PATH));
		}
	}

	@Override
	protected void storeProperties() {
		super.storeProperties();
		properties.put(ConciseNetlistModel.PROPERTY_MODEL_PATH, fileText.getText());
	}

	protected class BrowseWorkspaceForSourceFilesListener implements Listener {

		private final Text text;

		public BrowseWorkspaceForSourceFilesListener(Text text) {
			this.text = text;
		}

		@Override
		public void handleEvent(Event event) {
			final String file = BrowseWorkspaceUtil.browseFilePath(getShell(),
				"Concise Netlist files in the workspace",
				"Select a concise netlist (dialcnet.dat) file", "dat", null);

			if (file != null) {
				text.setText(file);
			}
		}
	}

}
