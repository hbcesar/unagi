package unagi;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;

public class Server extends AbstractHandler {
	/**
	 * Create a OSGi Framework launch configuration, save and run
	 */
	private void launch() {
		/**
		 * stringMain: Caminho do codigo Main do projeto a ser executado out:
		 * nome do projeto que vai ser utilizado. Fonte:
		 * https://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.jdt.doc.isv%2Fguide%2Fjdt_api_run.htm
		 * No final do projeto, lembrar de trocar a linha abaixo
		 * wc.setAttribute("configLocation", "${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/Zanshin");
		 */
		try {
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType type = manager.getLaunchConfigurationType("org.eclipse.pde.ui.EquinoxLauncher");
			ILaunchConfigurationWorkingCopy wc = type.newInstance(null, "Zanshin");
			wc.setAttribute("append.args", true);
			wc.setAttribute("automaticAdd", true);
			wc.setAttribute("automaticValidate", true);
			wc.setAttribute("bootstrap", "");
			wc.setAttribute("checked", "[NONE]");
			wc.setAttribute("clearConfig", false);
			wc.setAttribute("configLocation", "${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/Zanshin");
			wc.setAttribute("default", true);
			wc.setAttribute("default_auto_start", true);
			wc.setAttribute("default_start_level", 4);
			wc.setAttribute("includeOptional", true);
			wc.setAttribute("org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD", true);
			wc.setAttribute("org.eclipse.jdt.launching.JRE_CONTAINER",
					"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8");
			wc.setAttribute("org.eclipse.jdt.launching.PROGRAM_ARGUMENTS",
					"-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -console");
			wc.setAttribute("org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER",
					"org.eclipse.pde.ui.workbenchClasspathProvider");
			wc.setAttribute("org.eclipse.jdt.launching.VM_ARGUMENTS",
					"-Declipse.ignoreApp=true -Dosgi.noShutdown=true");
			wc.setAttribute("pde.version", "3.3");
			wc.setAttribute("show_selected_only", false);
			wc.setAttribute("target_bundles", "com.ibm.icu@default:default," + "javax.inject@default:default,"
					+ "javax.servlet*3.1.0.v201410161800@default:default," + "javax.xml@default:default,"
					+ "org.apache.batik.css*1.7.0.v201011041433@default:default,"
					+ "org.apache.batik.util*1.7.0.v201011041433@default:default,"
					+ "org.apache.batik.util.gui*1.7.0.v200903091627@default:default,"
					+ "org.apache.commons.jxpath@default:default," + "org.apache.felix.gogo.runtime@default:default,"
					+ "org.apache.felix.gogo.shell@default:default," + "org.eclipse.ant.core@default:default,"
					+ "org.eclipse.compare.core@default:default," + "org.eclipse.core.commands@default:default,"
					+ "org.eclipse.core.contenttype@default:default,"
					+ "org.eclipse.core.databinding.observable@default:default,"
					+ "org.eclipse.core.databinding.property@default:default,"
					+ "org.eclipse.core.databinding@default:default," + "org.eclipse.core.expressions@default:default,"
					+ "org.eclipse.core.filesystem.win32.x86_64@default:false,"
					+ "org.eclipse.core.filesystem@default:default," + "org.eclipse.core.jobs@default:default,"
					+ "org.eclipse.core.resources.win32.x86_64@default:false,"
					+ "org.eclipse.core.resources@default:default," + "org.eclipse.core.runtime@default:true,"
					+ "org.eclipse.core.variables@default:default," + "org.eclipse.debug.core@default:default,"
					+ "org.eclipse.e4.core.commands@default:default," + "org.eclipse.e4.core.contexts@default:default,"
					+ "org.eclipse.e4.core.di.annotations@default:default,"
					+ "org.eclipse.e4.core.di.extensions@default:default," + "org.eclipse.e4.core.di@default:default,"
					+ "org.eclipse.e4.core.services@default:default," + "org.eclipse.e4.emf.xpath@default:default,"
					+ "org.eclipse.e4.ui.bindings@default:default," + "org.eclipse.e4.ui.css.core@default:default,"
					+ "org.eclipse.e4.ui.css.swt.theme@default:default," + "org.eclipse.e4.ui.css.swt@default:default,"
					+ "org.eclipse.e4.ui.di@default:default," + "org.eclipse.e4.ui.model.workbench@default:default,"
					+ "org.eclipse.e4.ui.services@default:default," + "org.eclipse.e4.ui.widgets@default:default,"
					+ "org.eclipse.e4.ui.workbench.addons.swt@default:default,"
					+ "org.eclipse.e4.ui.workbench.renderers.swt@default:default,"
					+ "org.eclipse.e4.ui.workbench.swt@default:default,"
					+ "org.eclipse.e4.ui.workbench3@default:default," + "org.eclipse.e4.ui.workbench@default:default,"
					+ "org.eclipse.emf.codegen.ecore@default:default," + "org.eclipse.emf.codegen@default:default,"
					+ "org.eclipse.emf.common@default:default," + "org.eclipse.emf.ecore.change@default:default,"
					+ "org.eclipse.emf.ecore.xmi@default:default," + "org.eclipse.emf.ecore@default:default,"
					+ "org.eclipse.equinox.app@default:default," + "org.eclipse.equinox.bidi@default:default,"
					+ "org.eclipse.equinox.common@2:true," + "org.eclipse.equinox.console@default:default,"
					+ "org.eclipse.equinox.ds@1:true," + "org.eclipse.equinox.event@default:default,"
					+ "org.eclipse.equinox.preferences@default:default,"
					+ "org.eclipse.equinox.registry@default:default," + "org.eclipse.equinox.util@default:default,"
					+ "org.eclipse.equinox.weaving.hook@default:false," + "org.eclipse.help@default:default,"
					+ "org.eclipse.jdt.compiler.apt@default:false," + "org.eclipse.jdt.compiler.tool@default:false,"
					+ "org.eclipse.jdt.core@default:default," + "org.eclipse.jdt.debug@default:default,"
					+ "org.eclipse.jdt.launching@default:default," + "org.eclipse.jface.databinding@default:default,"
					+ "org.eclipse.jface@default:default," + "org.eclipse.osgi.compatibility.state@default:false,"
					+ "org.eclipse.osgi.services@default:default," + "org.eclipse.osgi@-1:true,"
					+ "org.eclipse.swt.win32.win32.x86_64@default:false," + "org.eclipse.swt@default:default,"
					+ "org.eclipse.team.core@default:default," + "org.eclipse.text@default:default,"
					+ "org.eclipse.ui.trace@default:default," + "org.eclipse.ui.workbench@default:default,"
					+ "org.eclipse.ui@default:default," + "org.w3c.css.sac@default:default,"
					+ "org.w3c.dom.events@default:default," + "org.w3c.dom.smil@default:default,"
					+ "org.w3c.dom.svg@default:default");
			wc.setAttribute("tracing", false);
			wc.setAttribute("useCustomFeatures", false);
			wc.setAttribute("useDefaultConfigArea", false);
			wc.setAttribute("workspace_bundles", "it.unitn.disi.zanshin.adaptation.qualia@default:default,"
					+ "it.unitn.disi.zanshin.adaptation@default:default,"
					+ "it.unitn.disi.zanshin.controller@default:default," + "it.unitn.disi.zanshin.core@3:default,"
					+ "it.unitn.disi.zanshin.logging@2:default," + "it.unitn.disi.zanshin.monitoring@default:default");
			ILaunchConfiguration config = wc.doSave();
			config.launch(ILaunchManager.RUN_MODE, null);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		launch();
		return null;
	}
}
