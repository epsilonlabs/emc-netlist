package org.eclipse.epsilon.netlist.merge.dt;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class LaunchMergeHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection ssel) {
			IFile fConcise = null;
			IFile fHash = null;
			for (Object e : ssel.toArray()) {
				if (e instanceof IFile f) {
					switch (f.getFileExtension()) {
					case "dat":
						fConcise = f;
						break;
					case "hash":
						fHash = f;
						break;
					}
				}
			}

			if (fConcise == null) {
				MessageDialog.openError(getShell(), "Could not merge", "Selection is missing a .dat file");
				return null;
			} else if (fHash == null) {
				MessageDialog.openError(getShell(), "Could not merge", "Selection is missing a .hash file");
				return null;
			}

			FileDialog dlgSave = new FileDialog(getShell(), SWT.SAVE);
			dlgSave.setFilterExtensions("*.blocknet", "*.*");
			dlgSave.setFilterNames("Blocknet Files", "All Files");
			dlgSave.setOverwrite(true);
			dlgSave.setFilterIndex(0);

			String path = dlgSave.open();
			if (path == null) {
				return null;
			}
			new MergeJob(fConcise, fHash, new File(path)).schedule();;
		}
		
		return null;
	}

    public static Shell getShell() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window == null) {
                IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
                if (windows.length > 0) {
                        return windows[0].getShell();
                }
        } else {
                return window.getShell();
        }
        return null;
}

}
