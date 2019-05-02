/**
 */
package eca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eca.EcaFactory
 * @model kind="package"
 * @generated
 */
public interface EcaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nemo.inf.ufes.br/gore/eca";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcaPackage eINSTANCE = eca.impl.EcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link eca.impl.ResolutionConditionImpl <em>Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.ResolutionConditionImpl
	 * @see eca.impl.EcaPackageImpl#getResolutionCondition()
	 * @generated
	 */
	int RESOLUTION_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION__AWREQ = 1;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION__INTERNAL_ID = 2;

	/**
	 * The number of structural features of the '<em>Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION___GET_ALL_PARAMETERS = 0;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = 1;

	/**
	 * The number of operations of the '<em>Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_CONDITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link eca.impl.ApplicabilityConditionImpl <em>Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.ApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getApplicabilityCondition()
	 * @generated
	 */
	int APPLICABILITY_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION__STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION__INTERNAL_ID = 2;

	/**
	 * The number of structural features of the '<em>Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = 0;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = 1;

	/**
	 * The number of operations of the '<em>Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_CONDITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link eca.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.AdaptationStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getAdaptationStrategy()
	 * @generated
	 */
	int ADAPTATION_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__AWREQ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__APPLICABILITIES = 2;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__INTERNAL_ID = 3;

	/**
	 * The number of structural features of the '<em>Adaptation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY___GET_ALL_PARAMETERS = 0;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL = 1;

	/**
	 * The number of operations of the '<em>Adaptation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link eca.impl.SimpleResolutionConditionImpl <em>Simple Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.SimpleResolutionConditionImpl
	 * @see eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
	 * @generated
	 */
	int SIMPLE_RESOLUTION_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION__NAME = RESOLUTION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION__AWREQ = RESOLUTION_CONDITION__AWREQ;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION__INTERNAL_ID = RESOLUTION_CONDITION__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Simple Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = RESOLUTION_CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Simple Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RESOLUTION_CONDITION_OPERATION_COUNT = RESOLUTION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eca.impl.AndRefinedResolutionConditionImpl <em>And Refined Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.AndRefinedResolutionConditionImpl
	 * @see eca.impl.EcaPackageImpl#getAndRefinedResolutionCondition()
	 * @generated
	 */
	int AND_REFINED_RESOLUTION_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__NAME = RESOLUTION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__AWREQ = RESOLUTION_CONDITION__AWREQ;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__INTERNAL_ID = RESOLUTION_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION__CHILDREN = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Refined Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = RESOLUTION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Refined Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_RESOLUTION_CONDITION_OPERATION_COUNT = RESOLUTION_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.OrRefinedResolutionConditionImpl <em>Or Refined Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.OrRefinedResolutionConditionImpl
	 * @see eca.impl.EcaPackageImpl#getOrRefinedResolutionCondition()
	 * @generated
	 */
	int OR_REFINED_RESOLUTION_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__NAME = RESOLUTION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__AWREQ = RESOLUTION_CONDITION__AWREQ;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__INTERNAL_ID = RESOLUTION_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION__CHILDREN = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Refined Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = RESOLUTION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Refined Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_RESOLUTION_CONDITION_OPERATION_COUNT = RESOLUTION_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.SimpleApplicabilityConditionImpl <em>Simple Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.SimpleApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
	 * @generated
	 */
	int SIMPLE_APPLICABILITY_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION__NAME = APPLICABILITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION__INTERNAL_ID = APPLICABILITY_CONDITION__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Simple Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = APPLICABILITY_CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Simple Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_APPLICABILITY_CONDITION_OPERATION_COUNT = APPLICABILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eca.impl.MaxExecutionsPerSectionApplicabilityConditionImpl <em>Max Executions Per Section Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.MaxExecutionsPerSectionApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getMaxExecutionsPerSectionApplicabilityCondition()
	 * @generated
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__NAME = APPLICABILITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__INTERNAL_ID = APPLICABILITY_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Max Executions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Executions Per Section Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = APPLICABILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Executions Per Section Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION_OPERATION_COUNT = APPLICABILITY_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.AndRefinedApplicabilityConditionImpl <em>And Refined Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.AndRefinedApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getAndRefinedApplicabilityCondition()
	 * @generated
	 */
	int AND_REFINED_APPLICABILITY_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__NAME = APPLICABILITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__INTERNAL_ID = APPLICABILITY_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION__CHILDREN = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Refined Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = APPLICABILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Refined Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFINED_APPLICABILITY_CONDITION_OPERATION_COUNT = APPLICABILITY_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.OrRefinedApplicabilityConditionImpl <em>Or Refined Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.OrRefinedApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getOrRefinedApplicabilityCondition()
	 * @generated
	 */
	int OR_REFINED_APPLICABILITY_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__NAME = APPLICABILITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__INTERNAL_ID = APPLICABILITY_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION__CHILDREN = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Refined Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = APPLICABILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Refined Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_REFINED_APPLICABILITY_CONDITION_OPERATION_COUNT = APPLICABILITY_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.AbortStrategyImpl <em>Abort Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.AbortStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getAbortStrategy()
	 * @generated
	 */
	int ABORT_STRATEGY = 10;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Abort Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Abort Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eca.impl.DelegateStrategyImpl <em>Delegate Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.DelegateStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getDelegateStrategy()
	 * @generated
	 */
	int DELEGATE_STRATEGY = 11;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY__ACTOR = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegate Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Delegate Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eca.impl.RelaxDisableChildStrategyImpl <em>Relax Disable Child Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.RelaxDisableChildStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getRelaxDisableChildStrategy()
	 * @generated
	 */
	int RELAX_DISABLE_CHILD_STRATEGY = 12;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY__CHILD = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relax Disable Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relax Disable Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_DISABLE_CHILD_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.RelaxReplaceChildStrategyImpl <em>Relax Replace Child Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.RelaxReplaceChildStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getRelaxReplaceChildStrategy()
	 * @generated
	 */
	int RELAX_REPLACE_CHILD_STRATEGY = 13;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relax Replace Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relax Replace Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_REPLACE_CHILD_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.RetryStrategyImpl <em>Retry Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.RetryStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getRetryStrategy()
	 * @generated
	 */
	int RETRY_STRATEGY = 14;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY__TIME = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Retry Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Retry Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.StrengthenEnableChildStrategyImpl <em>Strengthen Enable Child Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.StrengthenEnableChildStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getStrengthenEnableChildStrategy()
	 * @generated
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY = 15;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strengthen Enable Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strengthen Enable Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_ENABLE_CHILD_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.StrengthenReplaceChildStrategyImpl <em>Strengthen Replace Child Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.StrengthenReplaceChildStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getStrengthenReplaceChildStrategy()
	 * @generated
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY = 16;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strengthen Replace Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strengthen Replace Child Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTHEN_REPLACE_CHILD_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.WarningStrategyImpl <em>Warning Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.WarningStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getWarningStrategy()
	 * @generated
	 */
	int WARNING_STRATEGY = 17;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY__ACTOR = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Warning Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Warning Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.ReconfigurationApplicabilityConditionImpl <em>Reconfiguration Applicability Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.ReconfigurationApplicabilityConditionImpl
	 * @see eca.impl.EcaPackageImpl#getReconfigurationApplicabilityCondition()
	 * @generated
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__NAME = APPLICABILITY_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__STRATEGY = APPLICABILITY_CONDITION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__INTERNAL_ID = APPLICABILITY_CONDITION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Wrapped Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION = APPLICABILITY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reconfiguration Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION_FEATURE_COUNT = APPLICABILITY_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = APPLICABILITY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reconfiguration Applicability Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_APPLICABILITY_CONDITION_OPERATION_COUNT = APPLICABILITY_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eca.impl.ReconfigurationResolutionConditionImpl <em>Reconfiguration Resolution Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.ReconfigurationResolutionConditionImpl
	 * @see eca.impl.EcaPackageImpl#getReconfigurationResolutionCondition()
	 * @generated
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION__NAME = RESOLUTION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION__AWREQ = RESOLUTION_CONDITION__AWREQ;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION__INTERNAL_ID = RESOLUTION_CONDITION__INTERNAL_ID;

	/**
	 * The number of structural features of the '<em>Reconfiguration Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION_FEATURE_COUNT = RESOLUTION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = RESOLUTION_CONDITION___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Reconfiguration Resolution Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RESOLUTION_CONDITION_OPERATION_COUNT = RESOLUTION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eca.impl.ReconfigurationStrategyImpl <em>Reconfiguration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eca.impl.ReconfigurationStrategyImpl
	 * @see eca.impl.EcaPackageImpl#getReconfigurationStrategy()
	 * @generated
	 */
	int RECONFIGURATION_STRATEGY = 20;

	/**
	 * The feature id for the '<em><b>Awreq</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__AWREQ = ADAPTATION_STRATEGY__AWREQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__NAME = ADAPTATION_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__APPLICABILITIES = ADAPTATION_STRATEGY__APPLICABILITIES;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__INTERNAL_ID = ADAPTATION_STRATEGY__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__LEVEL = ADAPTATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__ALGORITHM_ID = ADAPTATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedure Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY__PROCEDURE_IDS = ADAPTATION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reconfiguration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY_FEATURE_COUNT = ADAPTATION_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY___GENERATE_ID__GOALMODEL = ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY___GET_ALL_PARAMETERS = ADAPTATION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reconfiguration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_STRATEGY_OPERATION_COUNT = ADAPTATION_STRATEGY_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eca.ResolutionCondition <em>Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Condition</em>'.
	 * @see eca.ResolutionCondition
	 * @generated
	 */
	EClass getResolutionCondition();

	/**
	 * Returns the meta object for the attribute '{@link eca.ResolutionCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eca.ResolutionCondition#getName()
	 * @see #getResolutionCondition()
	 * @generated
	 */
	EAttribute getResolutionCondition_Name();

	/**
	 * Returns the meta object for the container reference '{@link eca.ResolutionCondition#getAwreq <em>Awreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Awreq</em>'.
	 * @see eca.ResolutionCondition#getAwreq()
	 * @see #getResolutionCondition()
	 * @generated
	 */
	EReference getResolutionCondition_Awreq();

	/**
	 * Returns the meta object for the attribute '{@link eca.ResolutionCondition#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see eca.ResolutionCondition#getInternalID()
	 * @see #getResolutionCondition()
	 * @generated
	 */
	EAttribute getResolutionCondition_InternalID();

	/**
	 * Returns the meta object for the '{@link eca.ResolutionCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.ResolutionCondition#getAllParameters()
	 * @generated
	 */
	EOperation getResolutionCondition__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link eca.ResolutionCondition#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see eca.ResolutionCondition#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getResolutionCondition__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link eca.ApplicabilityCondition <em>Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicability Condition</em>'.
	 * @see eca.ApplicabilityCondition
	 * @generated
	 */
	EClass getApplicabilityCondition();

	/**
	 * Returns the meta object for the attribute '{@link eca.ApplicabilityCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eca.ApplicabilityCondition#getName()
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	EAttribute getApplicabilityCondition_Name();

	/**
	 * Returns the meta object for the container reference '{@link eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see eca.ApplicabilityCondition#getStrategy()
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	EReference getApplicabilityCondition_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link eca.ApplicabilityCondition#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see eca.ApplicabilityCondition#getInternalID()
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	EAttribute getApplicabilityCondition_InternalID();

	/**
	 * Returns the meta object for the '{@link eca.ApplicabilityCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.ApplicabilityCondition#getAllParameters()
	 * @generated
	 */
	EOperation getApplicabilityCondition__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link eca.ApplicabilityCondition#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see eca.ApplicabilityCondition#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getApplicabilityCondition__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link eca.AdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Strategy</em>'.
	 * @see eca.AdaptationStrategy
	 * @generated
	 */
	EClass getAdaptationStrategy();

	/**
	 * Returns the meta object for the container reference '{@link eca.AdaptationStrategy#getAwreq <em>Awreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Awreq</em>'.
	 * @see eca.AdaptationStrategy#getAwreq()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_Awreq();

	/**
	 * Returns the meta object for the attribute '{@link eca.AdaptationStrategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eca.AdaptationStrategy#getName()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EAttribute getAdaptationStrategy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eca.AdaptationStrategy#getApplicabilities <em>Applicabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicabilities</em>'.
	 * @see eca.AdaptationStrategy#getApplicabilities()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_Applicabilities();

	/**
	 * Returns the meta object for the attribute '{@link eca.AdaptationStrategy#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see eca.AdaptationStrategy#getInternalID()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EAttribute getAdaptationStrategy_InternalID();

	/**
	 * Returns the meta object for the '{@link eca.AdaptationStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.AdaptationStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getAdaptationStrategy__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link eca.AdaptationStrategy#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see eca.AdaptationStrategy#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getAdaptationStrategy__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link eca.SimpleResolutionCondition <em>Simple Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Resolution Condition</em>'.
	 * @see eca.SimpleResolutionCondition
	 * @generated
	 */
	EClass getSimpleResolutionCondition();

	/**
	 * Returns the meta object for class '{@link eca.AndRefinedResolutionCondition <em>And Refined Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Refined Resolution Condition</em>'.
	 * @see eca.AndRefinedResolutionCondition
	 * @generated
	 */
	EClass getAndRefinedResolutionCondition();

	/**
	 * Returns the meta object for the reference list '{@link eca.AndRefinedResolutionCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see eca.AndRefinedResolutionCondition#getChildren()
	 * @see #getAndRefinedResolutionCondition()
	 * @generated
	 */
	EReference getAndRefinedResolutionCondition_Children();

	/**
	 * Returns the meta object for the '{@link eca.AndRefinedResolutionCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.AndRefinedResolutionCondition#getAllParameters()
	 * @generated
	 */
	EOperation getAndRefinedResolutionCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.OrRefinedResolutionCondition <em>Or Refined Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Refined Resolution Condition</em>'.
	 * @see eca.OrRefinedResolutionCondition
	 * @generated
	 */
	EClass getOrRefinedResolutionCondition();

	/**
	 * Returns the meta object for the reference list '{@link eca.OrRefinedResolutionCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see eca.OrRefinedResolutionCondition#getChildren()
	 * @see #getOrRefinedResolutionCondition()
	 * @generated
	 */
	EReference getOrRefinedResolutionCondition_Children();

	/**
	 * Returns the meta object for the '{@link eca.OrRefinedResolutionCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.OrRefinedResolutionCondition#getAllParameters()
	 * @generated
	 */
	EOperation getOrRefinedResolutionCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.SimpleApplicabilityCondition <em>Simple Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Applicability Condition</em>'.
	 * @see eca.SimpleApplicabilityCondition
	 * @generated
	 */
	EClass getSimpleApplicabilityCondition();

	/**
	 * Returns the meta object for class '{@link eca.MaxExecutionsPerSectionApplicabilityCondition <em>Max Executions Per Section Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Executions Per Section Applicability Condition</em>'.
	 * @see eca.MaxExecutionsPerSectionApplicabilityCondition
	 * @generated
	 */
	EClass getMaxExecutionsPerSectionApplicabilityCondition();

	/**
	 * Returns the meta object for the attribute '{@link eca.MaxExecutionsPerSectionApplicabilityCondition#getMaxExecutions <em>Max Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Executions</em>'.
	 * @see eca.MaxExecutionsPerSectionApplicabilityCondition#getMaxExecutions()
	 * @see #getMaxExecutionsPerSectionApplicabilityCondition()
	 * @generated
	 */
	EAttribute getMaxExecutionsPerSectionApplicabilityCondition_MaxExecutions();

	/**
	 * Returns the meta object for the '{@link eca.MaxExecutionsPerSectionApplicabilityCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.MaxExecutionsPerSectionApplicabilityCondition#getAllParameters()
	 * @generated
	 */
	EOperation getMaxExecutionsPerSectionApplicabilityCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.AndRefinedApplicabilityCondition <em>And Refined Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Refined Applicability Condition</em>'.
	 * @see eca.AndRefinedApplicabilityCondition
	 * @generated
	 */
	EClass getAndRefinedApplicabilityCondition();

	/**
	 * Returns the meta object for the reference list '{@link eca.AndRefinedApplicabilityCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see eca.AndRefinedApplicabilityCondition#getChildren()
	 * @see #getAndRefinedApplicabilityCondition()
	 * @generated
	 */
	EReference getAndRefinedApplicabilityCondition_Children();

	/**
	 * Returns the meta object for the '{@link eca.AndRefinedApplicabilityCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.AndRefinedApplicabilityCondition#getAllParameters()
	 * @generated
	 */
	EOperation getAndRefinedApplicabilityCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.OrRefinedApplicabilityCondition <em>Or Refined Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Refined Applicability Condition</em>'.
	 * @see eca.OrRefinedApplicabilityCondition
	 * @generated
	 */
	EClass getOrRefinedApplicabilityCondition();

	/**
	 * Returns the meta object for the reference list '{@link eca.OrRefinedApplicabilityCondition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see eca.OrRefinedApplicabilityCondition#getChildren()
	 * @see #getOrRefinedApplicabilityCondition()
	 * @generated
	 */
	EReference getOrRefinedApplicabilityCondition_Children();

	/**
	 * Returns the meta object for the '{@link eca.OrRefinedApplicabilityCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.OrRefinedApplicabilityCondition#getAllParameters()
	 * @generated
	 */
	EOperation getOrRefinedApplicabilityCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.AbortStrategy <em>Abort Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abort Strategy</em>'.
	 * @see eca.AbortStrategy
	 * @generated
	 */
	EClass getAbortStrategy();

	/**
	 * Returns the meta object for class '{@link eca.DelegateStrategy <em>Delegate Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate Strategy</em>'.
	 * @see eca.DelegateStrategy
	 * @generated
	 */
	EClass getDelegateStrategy();

	/**
	 * Returns the meta object for the reference '{@link eca.DelegateStrategy#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see eca.DelegateStrategy#getActor()
	 * @see #getDelegateStrategy()
	 * @generated
	 */
	EReference getDelegateStrategy_Actor();

	/**
	 * Returns the meta object for class '{@link eca.RelaxDisableChildStrategy <em>Relax Disable Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relax Disable Child Strategy</em>'.
	 * @see eca.RelaxDisableChildStrategy
	 * @generated
	 */
	EClass getRelaxDisableChildStrategy();

	/**
	 * Returns the meta object for the attribute '{@link eca.RelaxDisableChildStrategy#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eca.RelaxDisableChildStrategy#getLevel()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EAttribute getRelaxDisableChildStrategy_Level();

	/**
	 * Returns the meta object for the reference '{@link eca.RelaxDisableChildStrategy#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see eca.RelaxDisableChildStrategy#getRequirement()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EReference getRelaxDisableChildStrategy_Requirement();

	/**
	 * Returns the meta object for the reference '{@link eca.RelaxDisableChildStrategy#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see eca.RelaxDisableChildStrategy#getChild()
	 * @see #getRelaxDisableChildStrategy()
	 * @generated
	 */
	EReference getRelaxDisableChildStrategy_Child();

	/**
	 * Returns the meta object for the '{@link eca.RelaxDisableChildStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.RelaxDisableChildStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getRelaxDisableChildStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.RelaxReplaceChildStrategy <em>Relax Replace Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relax Replace Child Strategy</em>'.
	 * @see eca.RelaxReplaceChildStrategy
	 * @generated
	 */
	EClass getRelaxReplaceChildStrategy();

	/**
	 * Returns the meta object for the reference '{@link eca.RelaxReplaceChildStrategy#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see eca.RelaxReplaceChildStrategy#getRequirement()
	 * @see #getRelaxReplaceChildStrategy()
	 * @generated
	 */
	EReference getRelaxReplaceChildStrategy_Requirement();

	/**
	 * Returns the meta object for the reference '{@link eca.RelaxReplaceChildStrategy#getNewRequirement <em>New Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Requirement</em>'.
	 * @see eca.RelaxReplaceChildStrategy#getNewRequirement()
	 * @see #getRelaxReplaceChildStrategy()
	 * @generated
	 */
	EReference getRelaxReplaceChildStrategy_NewRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eca.RelaxReplaceChildStrategy#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eca.RelaxReplaceChildStrategy#getLevel()
	 * @see #getRelaxReplaceChildStrategy()
	 * @generated
	 */
	EAttribute getRelaxReplaceChildStrategy_Level();

	/**
	 * Returns the meta object for the attribute '{@link eca.RelaxReplaceChildStrategy#isCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see eca.RelaxReplaceChildStrategy#isCopy()
	 * @see #getRelaxReplaceChildStrategy()
	 * @generated
	 */
	EAttribute getRelaxReplaceChildStrategy_Copy();

	/**
	 * Returns the meta object for the '{@link eca.RelaxReplaceChildStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.RelaxReplaceChildStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getRelaxReplaceChildStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.RetryStrategy <em>Retry Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Strategy</em>'.
	 * @see eca.RetryStrategy
	 * @generated
	 */
	EClass getRetryStrategy();

	/**
	 * Returns the meta object for the attribute '{@link eca.RetryStrategy#isCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see eca.RetryStrategy#isCopy()
	 * @see #getRetryStrategy()
	 * @generated
	 */
	EAttribute getRetryStrategy_Copy();

	/**
	 * Returns the meta object for the attribute '{@link eca.RetryStrategy#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see eca.RetryStrategy#getTime()
	 * @see #getRetryStrategy()
	 * @generated
	 */
	EAttribute getRetryStrategy_Time();

	/**
	 * Returns the meta object for the '{@link eca.RetryStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.RetryStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getRetryStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.StrengthenEnableChildStrategy <em>Strengthen Enable Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strengthen Enable Child Strategy</em>'.
	 * @see eca.StrengthenEnableChildStrategy
	 * @generated
	 */
	EClass getStrengthenEnableChildStrategy();

	/**
	 * Returns the meta object for the reference '{@link eca.StrengthenEnableChildStrategy#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see eca.StrengthenEnableChildStrategy#getRequirement()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EReference getStrengthenEnableChildStrategy_Requirement();

	/**
	 * Returns the meta object for the reference '{@link eca.StrengthenEnableChildStrategy#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see eca.StrengthenEnableChildStrategy#getChild()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EReference getStrengthenEnableChildStrategy_Child();

	/**
	 * Returns the meta object for the attribute '{@link eca.StrengthenEnableChildStrategy#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eca.StrengthenEnableChildStrategy#getLevel()
	 * @see #getStrengthenEnableChildStrategy()
	 * @generated
	 */
	EAttribute getStrengthenEnableChildStrategy_Level();

	/**
	 * Returns the meta object for the '{@link eca.StrengthenEnableChildStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.StrengthenEnableChildStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getStrengthenEnableChildStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.StrengthenReplaceChildStrategy <em>Strengthen Replace Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strengthen Replace Child Strategy</em>'.
	 * @see eca.StrengthenReplaceChildStrategy
	 * @generated
	 */
	EClass getStrengthenReplaceChildStrategy();

	/**
	 * Returns the meta object for the reference '{@link eca.StrengthenReplaceChildStrategy#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see eca.StrengthenReplaceChildStrategy#getRequirement()
	 * @see #getStrengthenReplaceChildStrategy()
	 * @generated
	 */
	EReference getStrengthenReplaceChildStrategy_Requirement();

	/**
	 * Returns the meta object for the reference '{@link eca.StrengthenReplaceChildStrategy#getNewRequirement <em>New Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Requirement</em>'.
	 * @see eca.StrengthenReplaceChildStrategy#getNewRequirement()
	 * @see #getStrengthenReplaceChildStrategy()
	 * @generated
	 */
	EReference getStrengthenReplaceChildStrategy_NewRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eca.StrengthenReplaceChildStrategy#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eca.StrengthenReplaceChildStrategy#getLevel()
	 * @see #getStrengthenReplaceChildStrategy()
	 * @generated
	 */
	EAttribute getStrengthenReplaceChildStrategy_Level();

	/**
	 * Returns the meta object for the attribute '{@link eca.StrengthenReplaceChildStrategy#isCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see eca.StrengthenReplaceChildStrategy#isCopy()
	 * @see #getStrengthenReplaceChildStrategy()
	 * @generated
	 */
	EAttribute getStrengthenReplaceChildStrategy_Copy();

	/**
	 * Returns the meta object for the '{@link eca.StrengthenReplaceChildStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.StrengthenReplaceChildStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getStrengthenReplaceChildStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.WarningStrategy <em>Warning Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Strategy</em>'.
	 * @see eca.WarningStrategy
	 * @generated
	 */
	EClass getWarningStrategy();

	/**
	 * Returns the meta object for the reference '{@link eca.WarningStrategy#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see eca.WarningStrategy#getActor()
	 * @see #getWarningStrategy()
	 * @generated
	 */
	EReference getWarningStrategy_Actor();

	/**
	 * Returns the meta object for the '{@link eca.WarningStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.WarningStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getWarningStrategy__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.ReconfigurationApplicabilityCondition <em>Reconfiguration Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Applicability Condition</em>'.
	 * @see eca.ReconfigurationApplicabilityCondition
	 * @generated
	 */
	EClass getReconfigurationApplicabilityCondition();

	/**
	 * Returns the meta object for the reference '{@link eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wrapped Condition</em>'.
	 * @see eca.ReconfigurationApplicabilityCondition#getWrappedCondition()
	 * @see #getReconfigurationApplicabilityCondition()
	 * @generated
	 */
	EReference getReconfigurationApplicabilityCondition_WrappedCondition();

	/**
	 * Returns the meta object for the '{@link eca.ReconfigurationApplicabilityCondition#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.ReconfigurationApplicabilityCondition#getAllParameters()
	 * @generated
	 */
	EOperation getReconfigurationApplicabilityCondition__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link eca.ReconfigurationResolutionCondition <em>Reconfiguration Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Resolution Condition</em>'.
	 * @see eca.ReconfigurationResolutionCondition
	 * @generated
	 */
	EClass getReconfigurationResolutionCondition();

	/**
	 * Returns the meta object for class '{@link eca.ReconfigurationStrategy <em>Reconfiguration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Strategy</em>'.
	 * @see eca.ReconfigurationStrategy
	 * @generated
	 */
	EClass getReconfigurationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link eca.ReconfigurationStrategy#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eca.ReconfigurationStrategy#getLevel()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_Level();

	/**
	 * Returns the meta object for the attribute '{@link eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Id</em>'.
	 * @see eca.ReconfigurationStrategy#getAlgorithmId()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_AlgorithmId();

	/**
	 * Returns the meta object for the attribute list '{@link eca.ReconfigurationStrategy#getProcedureIds <em>Procedure Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Procedure Ids</em>'.
	 * @see eca.ReconfigurationStrategy#getProcedureIds()
	 * @see #getReconfigurationStrategy()
	 * @generated
	 */
	EAttribute getReconfigurationStrategy_ProcedureIds();

	/**
	 * Returns the meta object for the '{@link eca.ReconfigurationStrategy#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see eca.ReconfigurationStrategy#getAllParameters()
	 * @generated
	 */
	EOperation getReconfigurationStrategy__GetAllParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcaFactory getEcaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eca.impl.ResolutionConditionImpl <em>Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.ResolutionConditionImpl
		 * @see eca.impl.EcaPackageImpl#getResolutionCondition()
		 * @generated
		 */
		EClass RESOLUTION_CONDITION = eINSTANCE.getResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_CONDITION__NAME = eINSTANCE.getResolutionCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Awreq</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_CONDITION__AWREQ = eINSTANCE.getResolutionCondition_Awreq();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_CONDITION__INTERNAL_ID = eINSTANCE.getResolutionCondition_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLUTION_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getResolutionCondition__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL = eINSTANCE.getResolutionCondition__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link eca.impl.ApplicabilityConditionImpl <em>Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.ApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getApplicabilityCondition()
		 * @generated
		 */
		EClass APPLICABILITY_CONDITION = eINSTANCE.getApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICABILITY_CONDITION__NAME = eINSTANCE.getApplicabilityCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABILITY_CONDITION__STRATEGY = eINSTANCE.getApplicabilityCondition_Strategy();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICABILITY_CONDITION__INTERNAL_ID = eINSTANCE.getApplicabilityCondition_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getApplicabilityCondition__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL = eINSTANCE.getApplicabilityCondition__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link eca.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.AdaptationStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getAdaptationStrategy()
		 * @generated
		 */
		EClass ADAPTATION_STRATEGY = eINSTANCE.getAdaptationStrategy();

		/**
		 * The meta object literal for the '<em><b>Awreq</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__AWREQ = eINSTANCE.getAdaptationStrategy_Awreq();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_STRATEGY__NAME = eINSTANCE.getAdaptationStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Applicabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__APPLICABILITIES = eINSTANCE.getAdaptationStrategy_Applicabilities();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_STRATEGY__INTERNAL_ID = eINSTANCE.getAdaptationStrategy_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTATION_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getAdaptationStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL = eINSTANCE.getAdaptationStrategy__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link eca.impl.SimpleResolutionConditionImpl <em>Simple Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.SimpleResolutionConditionImpl
		 * @see eca.impl.EcaPackageImpl#getSimpleResolutionCondition()
		 * @generated
		 */
		EClass SIMPLE_RESOLUTION_CONDITION = eINSTANCE.getSimpleResolutionCondition();

		/**
		 * The meta object literal for the '{@link eca.impl.AndRefinedResolutionConditionImpl <em>And Refined Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.AndRefinedResolutionConditionImpl
		 * @see eca.impl.EcaPackageImpl#getAndRefinedResolutionCondition()
		 * @generated
		 */
		EClass AND_REFINED_RESOLUTION_CONDITION = eINSTANCE.getAndRefinedResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_REFINED_RESOLUTION_CONDITION__CHILDREN = eINSTANCE.getAndRefinedResolutionCondition_Children();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getAndRefinedResolutionCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.OrRefinedResolutionConditionImpl <em>Or Refined Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.OrRefinedResolutionConditionImpl
		 * @see eca.impl.EcaPackageImpl#getOrRefinedResolutionCondition()
		 * @generated
		 */
		EClass OR_REFINED_RESOLUTION_CONDITION = eINSTANCE.getOrRefinedResolutionCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_REFINED_RESOLUTION_CONDITION__CHILDREN = eINSTANCE.getOrRefinedResolutionCondition_Children();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getOrRefinedResolutionCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.SimpleApplicabilityConditionImpl <em>Simple Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.SimpleApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getSimpleApplicabilityCondition()
		 * @generated
		 */
		EClass SIMPLE_APPLICABILITY_CONDITION = eINSTANCE.getSimpleApplicabilityCondition();

		/**
		 * The meta object literal for the '{@link eca.impl.MaxExecutionsPerSectionApplicabilityConditionImpl <em>Max Executions Per Section Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.MaxExecutionsPerSectionApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getMaxExecutionsPerSectionApplicabilityCondition()
		 * @generated
		 */
		EClass MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION = eINSTANCE.getMaxExecutionsPerSectionApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Max Executions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS = eINSTANCE.getMaxExecutionsPerSectionApplicabilityCondition_MaxExecutions();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getMaxExecutionsPerSectionApplicabilityCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.AndRefinedApplicabilityConditionImpl <em>And Refined Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.AndRefinedApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getAndRefinedApplicabilityCondition()
		 * @generated
		 */
		EClass AND_REFINED_APPLICABILITY_CONDITION = eINSTANCE.getAndRefinedApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_REFINED_APPLICABILITY_CONDITION__CHILDREN = eINSTANCE.getAndRefinedApplicabilityCondition_Children();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getAndRefinedApplicabilityCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.OrRefinedApplicabilityConditionImpl <em>Or Refined Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.OrRefinedApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getOrRefinedApplicabilityCondition()
		 * @generated
		 */
		EClass OR_REFINED_APPLICABILITY_CONDITION = eINSTANCE.getOrRefinedApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_REFINED_APPLICABILITY_CONDITION__CHILDREN = eINSTANCE.getOrRefinedApplicabilityCondition_Children();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getOrRefinedApplicabilityCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.AbortStrategyImpl <em>Abort Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.AbortStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getAbortStrategy()
		 * @generated
		 */
		EClass ABORT_STRATEGY = eINSTANCE.getAbortStrategy();

		/**
		 * The meta object literal for the '{@link eca.impl.DelegateStrategyImpl <em>Delegate Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.DelegateStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getDelegateStrategy()
		 * @generated
		 */
		EClass DELEGATE_STRATEGY = eINSTANCE.getDelegateStrategy();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_STRATEGY__ACTOR = eINSTANCE.getDelegateStrategy_Actor();

		/**
		 * The meta object literal for the '{@link eca.impl.RelaxDisableChildStrategyImpl <em>Relax Disable Child Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.RelaxDisableChildStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getRelaxDisableChildStrategy()
		 * @generated
		 */
		EClass RELAX_DISABLE_CHILD_STRATEGY = eINSTANCE.getRelaxDisableChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELAX_DISABLE_CHILD_STRATEGY__LEVEL = eINSTANCE.getRelaxDisableChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getRelaxDisableChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_DISABLE_CHILD_STRATEGY__CHILD = eINSTANCE.getRelaxDisableChildStrategy_Child();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELAX_DISABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getRelaxDisableChildStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.RelaxReplaceChildStrategyImpl <em>Relax Replace Child Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.RelaxReplaceChildStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getRelaxReplaceChildStrategy()
		 * @generated
		 */
		EClass RELAX_REPLACE_CHILD_STRATEGY = eINSTANCE.getRelaxReplaceChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_REPLACE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getRelaxReplaceChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>New Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT = eINSTANCE.getRelaxReplaceChildStrategy_NewRequirement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELAX_REPLACE_CHILD_STRATEGY__LEVEL = eINSTANCE.getRelaxReplaceChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELAX_REPLACE_CHILD_STRATEGY__COPY = eINSTANCE.getRelaxReplaceChildStrategy_Copy();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELAX_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getRelaxReplaceChildStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.RetryStrategyImpl <em>Retry Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.RetryStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getRetryStrategy()
		 * @generated
		 */
		EClass RETRY_STRATEGY = eINSTANCE.getRetryStrategy();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_STRATEGY__COPY = eINSTANCE.getRetryStrategy_Copy();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_STRATEGY__TIME = eINSTANCE.getRetryStrategy_Time();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETRY_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getRetryStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.StrengthenEnableChildStrategyImpl <em>Strengthen Enable Child Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.StrengthenEnableChildStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getStrengthenEnableChildStrategy()
		 * @generated
		 */
		EClass STRENGTHEN_ENABLE_CHILD_STRATEGY = eINSTANCE.getStrengthenEnableChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getStrengthenEnableChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD = eINSTANCE.getStrengthenEnableChildStrategy_Child();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL = eINSTANCE.getStrengthenEnableChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRENGTHEN_ENABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getStrengthenEnableChildStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.StrengthenReplaceChildStrategyImpl <em>Strengthen Replace Child Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.StrengthenReplaceChildStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getStrengthenReplaceChildStrategy()
		 * @generated
		 */
		EClass STRENGTHEN_REPLACE_CHILD_STRATEGY = eINSTANCE.getStrengthenReplaceChildStrategy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT = eINSTANCE.getStrengthenReplaceChildStrategy_Requirement();

		/**
		 * The meta object literal for the '<em><b>New Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT = eINSTANCE.getStrengthenReplaceChildStrategy_NewRequirement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL = eINSTANCE.getStrengthenReplaceChildStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY = eINSTANCE.getStrengthenReplaceChildStrategy_Copy();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRENGTHEN_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getStrengthenReplaceChildStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.WarningStrategyImpl <em>Warning Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.WarningStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getWarningStrategy()
		 * @generated
		 */
		EClass WARNING_STRATEGY = eINSTANCE.getWarningStrategy();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNING_STRATEGY__ACTOR = eINSTANCE.getWarningStrategy_Actor();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WARNING_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getWarningStrategy__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.ReconfigurationApplicabilityConditionImpl <em>Reconfiguration Applicability Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.ReconfigurationApplicabilityConditionImpl
		 * @see eca.impl.EcaPackageImpl#getReconfigurationApplicabilityCondition()
		 * @generated
		 */
		EClass RECONFIGURATION_APPLICABILITY_CONDITION = eINSTANCE.getReconfigurationApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Wrapped Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION = eINSTANCE.getReconfigurationApplicabilityCondition_WrappedCondition();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECONFIGURATION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS = eINSTANCE.getReconfigurationApplicabilityCondition__GetAllParameters();

		/**
		 * The meta object literal for the '{@link eca.impl.ReconfigurationResolutionConditionImpl <em>Reconfiguration Resolution Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.ReconfigurationResolutionConditionImpl
		 * @see eca.impl.EcaPackageImpl#getReconfigurationResolutionCondition()
		 * @generated
		 */
		EClass RECONFIGURATION_RESOLUTION_CONDITION = eINSTANCE.getReconfigurationResolutionCondition();

		/**
		 * The meta object literal for the '{@link eca.impl.ReconfigurationStrategyImpl <em>Reconfiguration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eca.impl.ReconfigurationStrategyImpl
		 * @see eca.impl.EcaPackageImpl#getReconfigurationStrategy()
		 * @generated
		 */
		EClass RECONFIGURATION_STRATEGY = eINSTANCE.getReconfigurationStrategy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__LEVEL = eINSTANCE.getReconfigurationStrategy_Level();

		/**
		 * The meta object literal for the '<em><b>Algorithm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__ALGORITHM_ID = eINSTANCE.getReconfigurationStrategy_AlgorithmId();

		/**
		 * The meta object literal for the '<em><b>Procedure Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_STRATEGY__PROCEDURE_IDS = eINSTANCE.getReconfigurationStrategy_ProcedureIds();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECONFIGURATION_STRATEGY___GET_ALL_PARAMETERS = eINSTANCE.getReconfigurationStrategy__GetAllParameters();

	}

} //EcaPackage
