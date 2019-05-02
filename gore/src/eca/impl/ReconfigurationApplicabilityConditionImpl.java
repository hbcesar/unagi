/**
 */
package eca.impl;

import eca.ApplicabilityCondition;
import eca.EcaPackage;
import eca.ReconfigurationApplicabilityCondition;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.ReconfigurationApplicabilityConditionImpl#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationApplicabilityConditionImpl extends ApplicabilityConditionImpl implements ReconfigurationApplicabilityCondition {
	/**
	 * The cached value of the '{@link #getWrappedCondition() <em>Wrapped Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedCondition()
	 * @generated
	 * @ordered
	 */
	protected ApplicabilityCondition wrappedCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityCondition getWrappedCondition() {
		if (wrappedCondition != null && wrappedCondition.eIsProxy()) {
			InternalEObject oldWrappedCondition = (InternalEObject)wrappedCondition;
			wrappedCondition = (ApplicabilityCondition)eResolveProxy(oldWrappedCondition);
			if (wrappedCondition != oldWrappedCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, oldWrappedCondition, wrappedCondition));
			}
		}
		return wrappedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityCondition basicGetWrappedCondition() {
		return wrappedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedCondition(ApplicabilityCondition newWrappedCondition) {
		ApplicabilityCondition oldWrappedCondition = wrappedCondition;
		wrappedCondition = newWrappedCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION, oldWrappedCondition, wrappedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		String str;
		
		str = "wrappedcondition" + this.getWrappedCondition().getInternalID() + "\"";
		
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
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				if (resolve) return getWrappedCondition();
				return basicGetWrappedCondition();
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
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ApplicabilityCondition)newValue);
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
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				setWrappedCondition((ApplicabilityCondition)null);
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
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION:
				return wrappedCondition != null;
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
		if (baseClass == ApplicabilityCondition.class) {
			switch (baseOperationID) {
				case EcaPackage.APPLICABILITY_CONDITION___GET_ALL_PARAMETERS: return EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS;
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
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReconfigurationApplicabilityConditionImpl
