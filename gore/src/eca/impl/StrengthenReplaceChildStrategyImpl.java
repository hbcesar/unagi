/**
 */
package eca.impl;

import eca.AdaptationStrategy;
import eca.EcaPackage;
import eca.StrengthenReplaceChildStrategy;

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
 * An implementation of the model object '<em><b>Strengthen Replace Child Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.StrengthenReplaceChildStrategyImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link eca.impl.StrengthenReplaceChildStrategyImpl#getNewRequirement <em>New Requirement</em>}</li>
 *   <li>{@link eca.impl.StrengthenReplaceChildStrategyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eca.impl.StrengthenReplaceChildStrategyImpl#isCopy <em>Copy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrengthenReplaceChildStrategyImpl extends AdaptationStrategyImpl implements StrengthenReplaceChildStrategy {
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
	 * The cached value of the '{@link #getNewRequirement() <em>New Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRequirement()
	 * @generated
	 * @ordered
	 */
	protected GOREElement newRequirement;

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
	 * The default value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected boolean copy = COPY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrengthenReplaceChildStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.STRENGTHEN_REPLACE_CHILD_STRATEGY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getNewRequirement() {
		if (newRequirement != null && newRequirement.eIsProxy()) {
			InternalEObject oldNewRequirement = (InternalEObject)newRequirement;
			newRequirement = (GOREElement)eResolveProxy(oldNewRequirement);
			if (newRequirement != oldNewRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT, oldNewRequirement, newRequirement));
			}
		}
		return newRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetNewRequirement() {
		return newRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRequirement(GOREElement newNewRequirement) {
		GOREElement oldNewRequirement = newRequirement;
		newRequirement = newNewRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT, oldNewRequirement, newRequirement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCopy() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopy(boolean newCopy) {
		boolean oldCopy = copy;
		copy = newCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY, oldCopy, copy));
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
		str += " newRequirement=\"" + this.getNewRequirement().getInternalID() + "\"";
		str += " copy=\"" + this.isCopy() + "\"";
		
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
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT:
				if (resolve) return getNewRequirement();
				return basicGetNewRequirement();
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL:
				return getLevel();
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY:
				return isCopy();
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
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT:
				setRequirement((GOREElement)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT:
				setNewRequirement((GOREElement)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL:
				setLevel((AgregationLevel)newValue);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY:
				setCopy((Boolean)newValue);
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
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT:
				setRequirement((GOREElement)null);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT:
				setNewRequirement((GOREElement)null);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY:
				setCopy(COPY_EDEFAULT);
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
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT:
				return requirement != null;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT:
				return newRequirement != null;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY:
				return copy != COPY_EDEFAULT;
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
				case EcaPackage.ADAPTATION_STRATEGY___GET_ALL_PARAMETERS: return EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS;
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
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS:
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
		result.append(", copy: ");
		result.append(copy);
		result.append(')');
		return result.toString();
	}

} //StrengthenReplaceChildStrategyImpl
