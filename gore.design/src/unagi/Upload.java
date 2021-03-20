package unagi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import java.io.File;

public class Upload extends AbstractHandler {

	private String getPathActive(IWorkbenchWindow window) {

		IWorkbenchPage activePage = window.getActivePage();
		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();
			IProject project = input.getAdapter(IProject.class);

			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);

				if (resource != null) {
					project = resource.getProject();
					return project.getLocation().toString();
				}
			}
		}

		return null;

	}

	private MessageConsole findConsole(String name, IWorkbenchWindow window) {

		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();

		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				IConsole myConsole = existing[i];
				IWorkbenchPage page = window.getActivePage();
				String id = IConsoleConstants.ID_CONSOLE_VIEW;
				IConsoleView view;

				try {
					view = (IConsoleView) page.showView(id);
					view.display(myConsole);

				} catch (PartInitException e) {

					e.printStackTrace();
				}

				return (MessageConsole) existing[i];
			}
		}

		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });

		return myConsole;
	}

	private void showLog(String path, MessageConsoleStream out) {

		InputStream arq;

		try {

			String url = path + "/zanshin-gen/log.txt";
			arq = new FileInputStream(url);
			InputStreamReader inr = new InputStreamReader(arq, "UTF-8");
			BufferedReader in = new BufferedReader(inr);

			while (in.ready()) {
				String msg;
				msg = in.readLine();
				out.println(msg);
			}

			in.close();

		} catch (IOException e) {
			out.println("Erro. A pasta está vazia. Verifique se a conversão foi executada!");
			e.printStackTrace();
		}
	}

	private void copyModel(String source, String destination) {

			source = source + "/zanshin-gen";
			destination = destination + "/git/ZanshinTest/zanshin-simulations/src/it/unitn/disi/zanshin/simulation/cases";

			File f = new File(source);
			File[] matchingFiles = f.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.endsWith(".ecore");
				}
			});

			for (int i = 0; i < matchingFiles.length; i++) {
				String fileModel = source + "/" + "model." + matchingFiles[i].getName().replaceAll(".ecore", "");
				String fileEcore = source + "/" + matchingFiles[i].getName();

				 System.out.println(fileModel);
				 System.out.println(fileEcore);

			}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		String console = "Unagi";

		String source = getPathActive(window);
		String destination = System.getProperty("user.home").replace("\\", "/");

		MessageConsole myConsole = findConsole(console, window);
		MessageConsoleStream out = myConsole.newMessageStream();

		showLog(source, out);

		copyModel(source, destination);

		return null;
	}

}