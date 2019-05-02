/**
 */
package eca.impl;

import eca.AdaptationStrategy;
import eca.EcaPackage;
import eca.RelaxDisableChildStrategy;

import gore.AgregationLevel;
import gore.GOREElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relax Disable Child Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.RelaxDisableChildStrategyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eca.impl.RelaxDisableChildStrategyImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link eca.impl.RelaxDisableChildStrategyImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelaxDisableChildStrategyImpl extends AdaptationStrategyImpl implements RelaxDisableChildStrategy {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AgregationLevel LEVEL_EDEFAULT = AgregationLevel.INSTANCE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected AgregationLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected GOREElement requirement;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected GOREElement child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelaxDisableChildStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RELAX_DISABLE_CHILD_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(AgregationLevel newLevel) {
		AgregationLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (GOREElement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(GOREElement newRequirement) {
		GOREElement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (GOREElement)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(GOREElement newChild) {
		GOREElement oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		String str;
		
		str = "level=\"" + this.getLevel().toString() + "\"";
		str += " requirement=\"" + this.getRequirement().getInternalID() + "\"";
		str += " child=\"" + this.getChild().getInternalID() + "\"";
		
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
				return getLevel();
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
				setLevel((AgregationLevel)newValue);
				return;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
				setRequirement((GOREElement)newValue);
				return;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
				setChild((GOREElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
				setRequirement((GOREElement)null);
				return;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
				setChild((GOREElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT:
				return requirement != null;
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdaptationStrategy.class) {
			switch (baseOperationID) {
				case EcaPackage.ADAPTATION_STRATEGY___GET_ALL_PARAMETERS: return EcaPackage.RELAX_DISABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS;
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
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //RelaxDisableChildStrategyImpl
