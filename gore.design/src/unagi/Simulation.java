package unagi;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

public class Simulation extends AbstractHandler {
	/**
	 * Create a Java application launch configuration, save and run
	 */
	private void launch(IJavaProject proj, String main) {
		/**
		 * stringMain: Caminho do codigo Main do projeto a ser executado out:
		 * nome do projeto que vai ser utilizado. Fonte:
		 * https://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.jdt.doc.isv%2Fguide%2Fjdt_api_run.htm
		 */
		try {

			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType type = manager
					.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
			ILaunchConfigurationWorkingCopy wc = type.newInstance(null, "ZanshinSimulation");
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, proj.getElementName());
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, main);
			ILaunchConfiguration config = wc.doSave();
			config.launch(ILaunchManager.RUN_MODE, null);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private void executeProject() {

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];

			if (project.getName().equals("zanshin-simulations")) {
				launch(JavaCore.create(project), "it.unitn.disi.zanshin.simulation.Main");

			}
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		executeProject();

		return null;
	}
}
