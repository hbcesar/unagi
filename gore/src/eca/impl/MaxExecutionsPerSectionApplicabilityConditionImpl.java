/**
 */
package eca.impl;

import eca.ApplicabilityCondition;
import eca.EcaPackage;
import eca.MaxExecutionsPerSectionApplicabilityCondition;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Executions Per Section Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.MaxExecutionsPerSectionApplicabilityConditionImpl#getMaxExecutions <em>Max Executions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxExecutionsPerSectionApplicabilityConditionImpl extends ApplicabilityConditionImpl implements MaxExecutionsPerSectionApplicabilityCondition {
	/**
	 * The default value of the '{@link #getMaxExecutions() <em>Max Executions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExecutions()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EXECUTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxExecutions() <em>Max Executions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExecutions()
	 * @generated
	 * @ordered
	 */
	protected int maxExecutions = MAX_EXECUTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxExecutionsPerSectionApplicabilityConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxExecutions() {
		return maxExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExecutions(int newMaxExecutions) {
		int oldMaxExecutions = maxExecutions;
		maxExecutions = newMaxExecutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS, oldMaxExecutions, maxExecutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		return "maxExecutions=\"" + this.maxExecutions + "\"";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
				return getMaxExecutions();
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
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
				setMaxExecutions((Integer)newValue);
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
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
				setMaxExecutions(MAX_EXECUTIONS_EDEFAULT);
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
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS:
				return maxExecutions != MAX_EXECUTIONS_EDEFAULT;
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
				case EcaPackage.APPLICABILITY_CONDITION___GET_ALL_PARAMETERS: return EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS;
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
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS:
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
		result.append(" (maxExecutions: ");
		result.append(maxExecutions);
		result.append(')');
		return result.toString();
	}

} //MaxExecutionsPerSectionApplicabilityConditionImpl
