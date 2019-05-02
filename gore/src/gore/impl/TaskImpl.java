/**
 */
package gore.impl;

import gore.GOREElement;
import gore.GorePackage;
import gore.Task;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskImpl extends PerformativeRequirementImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "T_" + this.name.replace(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "Task";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		return "refinementType=\"" + this.getRefinementType().toString() + "\"";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GOREElement.class) {
			switch (baseOperationID) {
				case GorePackage.GORE_ELEMENT___GET_SHORT_NAME: return GorePackage.TASK___GET_SHORT_NAME;
				case GorePackage.GORE_ELEMENT___GET_TYPE: return GorePackage.TASK___GET_TYPE;
				case GorePackage.GORE_ELEMENT___GET_ALL_PARAMETERS: return GorePackage.TASK___GET_ALL_PARAMETERS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GorePackage.TASK___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.TASK___GET_TYPE:
				return getType();
			case GorePackage.TASK___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskImpl
