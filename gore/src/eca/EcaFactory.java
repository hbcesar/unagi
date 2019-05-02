/**
 */
package eca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eca.EcaPackage
 * @generated
 */
public interface EcaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcaFactory eINSTANCE = eca.impl.EcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Condition</em>'.
	 * @generated
	 */
	ResolutionCondition createResolutionCondition();

	/**
	 * Returns a new object of class '<em>Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Applicability Condition</em>'.
	 * @generated
	 */
	ApplicabilityCondition createApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Adaptation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Strategy</em>'.
	 * @generated
	 */
	AdaptationStrategy createAdaptationStrategy();

	/**
	 * Returns a new object of class '<em>Simple Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Resolution Condition</em>'.
	 * @generated
	 */
	SimpleResolutionCondition createSimpleResolutionCondition();

	/**
	 * Returns a new object of class '<em>And Refined Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Refined Resolution Condition</em>'.
	 * @generated
	 */
	AndRefinedResolutionCondition createAndRefinedResolutionCondition();

	/**
	 * Returns a new object of class '<em>Or Refined Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Refined Resolution Condition</em>'.
	 * @generated
	 */
	OrRefinedResolutionCondition createOrRefinedResolutionCondition();

	/**
	 * Returns a new object of class '<em>Simple Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Applicability Condition</em>'.
	 * @generated
	 */
	SimpleApplicabilityCondition createSimpleApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Max Executions Per Section Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Executions Per Section Applicability Condition</em>'.
	 * @generated
	 */
	MaxExecutionsPerSectionApplicabilityCondition createMaxExecutionsPerSectionApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>And Refined Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Refined Applicability Condition</em>'.
	 * @generated
	 */
	AndRefinedApplicabilityCondition createAndRefinedApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Or Refined Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Refined Applicability Condition</em>'.
	 * @generated
	 */
	OrRefinedApplicabilityCondition createOrRefinedApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Abort Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abort Strategy</em>'.
	 * @generated
	 */
	AbortStrategy createAbortStrategy();

	/**
	 * Returns a new object of class '<em>Delegate Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate Strategy</em>'.
	 * @generated
	 */
	DelegateStrategy createDelegateStrategy();

	/**
	 * Returns a new object of class '<em>Relax Disable Child Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relax Disable Child Strategy</em>'.
	 * @generated
	 */
	RelaxDisableChildStrategy createRelaxDisableChildStrategy();

	/**
	 * Returns a new object of class '<em>Relax Replace Child Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relax Replace Child Strategy</em>'.
	 * @generated
	 */
	RelaxReplaceChildStrategy createRelaxReplaceChildStrategy();

	/**
	 * Returns a new object of class '<em>Retry Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Strategy</em>'.
	 * @generated
	 */
	RetryStrategy createRetryStrategy();

	/**
	 * Returns a new object of class '<em>Strengthen Enable Child Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strengthen Enable Child Strategy</em>'.
	 * @generated
	 */
	StrengthenEnableChildStrategy createStrengthenEnableChildStrategy();

	/**
	 * Returns a new object of class '<em>Strengthen Replace Child Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strengthen Replace Child Strategy</em>'.
	 * @generated
	 */
	StrengthenReplaceChildStrategy createStrengthenReplaceChildStrategy();

	/**
	 * Returns a new object of class '<em>Warning Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Strategy</em>'.
	 * @generated
	 */
	WarningStrategy createWarningStrategy();

	/**
	 * Returns a new object of class '<em>Reconfiguration Applicability Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Applicability Condition</em>'.
	 * @generated
	 */
	ReconfigurationApplicabilityCondition createReconfigurationApplicabilityCondition();

	/**
	 * Returns a new object of class '<em>Reconfiguration Resolution Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Resolution Condition</em>'.
	 * @generated
	 */
	ReconfigurationResolutionCondition createReconfigurationResolutionCondition();

	/**
	 * Returns a new object of class '<em>Reconfiguration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Strategy</em>'.
	 * @generated
	 */
	ReconfigurationStrategy createReconfigurationStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcaPackage getEcaPackage();

} //EcaFactory
