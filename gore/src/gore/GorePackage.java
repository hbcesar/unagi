/**
 */
package gore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see gore.GoreFactory
 * @model kind="package"
 * @generated
 */
public interface GorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nemo.inf.ufes.br/gore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GorePackage eINSTANCE = gore.impl.GorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.GoalModelImpl
	 * @see gore.impl.GorePackageImpl#getGoalModel()
	 * @generated
	 */
	int GOAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__MODEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Root Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ROOT_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__REFINEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Domainassumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__DOMAINASSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__ACTORS = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>Internal ID Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__INTERNAL_ID_COUNTER = 8;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Model Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL___GET_MODEL_SHORT_NAME = 0;

	/**
	 * The number of operations of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gore.impl.GOREElementImpl <em>GORE Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.GOREElementImpl
	 * @see gore.impl.GorePackageImpl#getGOREElement()
	 * @generated
	 */
	int GORE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__TIME = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__STATE = 2;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__AWREQS = 3;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT__INTERNAL_ID = 4;

	/**
	 * The number of structural features of the '<em>GORE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT___GET_SHORT_NAME = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT___GET_TYPE = 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT___GET_ALL_PARAMETERS = 2;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT___GENERATE_ID__GOALMODEL = 3;

	/**
	 * The number of operations of the '<em>GORE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GORE_ELEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gore.impl.GoalOrientedRequirementImpl <em>Goal Oriented Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.GoalOrientedRequirementImpl
	 * @see gore.impl.GorePackageImpl#getGoalOrientedRequirement()
	 * @generated
	 */
	int GOAL_ORIENTED_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__NAME = GORE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__INTERNAL_ID = GORE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__REFINEMENTS = GORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT__PARENT = GORE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal Oriented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT___GET_SHORT_NAME = GORE_ELEMENT___GET_SHORT_NAME;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT___GET_TYPE = GORE_ELEMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT___GET_ALL_PARAMETERS = GORE_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT___GENERATE_ID__GOALMODEL = GORE_ELEMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Goal Oriented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT = GORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gore.impl.PerformativeRequirementImpl <em>Performative Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.PerformativeRequirementImpl
	 * @see gore.impl.GorePackageImpl#getPerformativeRequirement()
	 * @generated
	 */
	int PERFORMATIVE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__NAME = GOAL_ORIENTED_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__TIME = GOAL_ORIENTED_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__STATE = GOAL_ORIENTED_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__AWREQS = GOAL_ORIENTED_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__INTERNAL_ID = GOAL_ORIENTED_REQUIREMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE = GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__ASSUMPTIONS = GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__REFINEMENTS = GOAL_ORIENTED_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__PARENT = GOAL_ORIENTED_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT__START_TIME = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performative Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT_FEATURE_COUNT = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT___GET_SHORT_NAME = GOAL_ORIENTED_REQUIREMENT___GET_SHORT_NAME;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT___GET_TYPE = GOAL_ORIENTED_REQUIREMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT___GET_ALL_PARAMETERS = GOAL_ORIENTED_REQUIREMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT___GENERATE_ID__GOALMODEL = GOAL_ORIENTED_REQUIREMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The number of operations of the '<em>Performative Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMATIVE_REQUIREMENT_OPERATION_COUNT = GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gore.impl.HardgoalImpl <em>Hardgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.HardgoalImpl
	 * @see gore.impl.GorePackageImpl#getHardgoal()
	 * @generated
	 */
	int HARDGOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__NAME = PERFORMATIVE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__TIME = PERFORMATIVE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__STATE = PERFORMATIVE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__AWREQS = PERFORMATIVE_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__INTERNAL_ID = PERFORMATIVE_REQUIREMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__ASSUMPTIONS = PERFORMATIVE_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__REFINEMENTS = PERFORMATIVE_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__START_TIME = PERFORMATIVE_REQUIREMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__TASK = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL__GOAL_MODEL = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL_FEATURE_COUNT = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL___GENERATE_ID__GOALMODEL = PERFORMATIVE_REQUIREMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL___GET_SHORT_NAME = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL___GET_TYPE = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL___GET_ALL_PARAMETERS = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDGOAL_OPERATION_COUNT = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gore.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.SoftgoalImpl
	 * @see gore.impl.GorePackageImpl#getSoftgoal()
	 * @generated
	 */
	int SOFTGOAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__NAME = GOAL_ORIENTED_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__TIME = GOAL_ORIENTED_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__STATE = GOAL_ORIENTED_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__AWREQS = GOAL_ORIENTED_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__INTERNAL_ID = GOAL_ORIENTED_REQUIREMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__REFINEMENT_TYPE = GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__ASSUMPTIONS = GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__REFINEMENTS = GOAL_ORIENTED_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__PARENT = GOAL_ORIENTED_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL__CONSTRAINTS = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_FEATURE_COUNT = GOAL_ORIENTED_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL___GENERATE_ID__GOALMODEL = GOAL_ORIENTED_REQUIREMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL___GET_SHORT_NAME = GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL___GET_TYPE = GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL___GET_ALL_PARAMETERS = GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTGOAL_OPERATION_COUNT = GOAL_ORIENTED_REQUIREMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gore.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.TaskImpl
	 * @see gore.impl.GorePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = PERFORMATIVE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIME = PERFORMATIVE_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATE = PERFORMATIVE_REQUIREMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AWREQS = PERFORMATIVE_REQUIREMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INTERNAL_ID = PERFORMATIVE_REQUIREMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINEMENT_TYPE = PERFORMATIVE_REQUIREMENT__REFINEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSUMPTIONS = PERFORMATIVE_REQUIREMENT__ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINEMENTS = PERFORMATIVE_REQUIREMENT__REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = PERFORMATIVE_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = PERFORMATIVE_REQUIREMENT__START_TIME;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PERFORMATIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GENERATE_ID__GOALMODEL = PERFORMATIVE_REQUIREMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_SHORT_NAME = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_TYPE = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_ALL_PARAMETERS = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PERFORMATIVE_REQUIREMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gore.impl.AwReqImpl <em>Aw Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.AwReqImpl
	 * @see gore.impl.GorePackageImpl#getAwReq()
	 * @generated
	 */
	int AW_REQ = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__NAME = GORE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__INTERNAL_ID = GORE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__TARGET = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__STRATEGIES = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ__RESOLUTION = GORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aw Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ___GENERATE_ID__GOALMODEL = GORE_ELEMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ___GET_SHORT_NAME = GORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ___GET_TYPE = GORE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ___GET_ALL_PARAMETERS = GORE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aw Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AW_REQ_OPERATION_COUNT = GORE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.QualityConstraintImpl
	 * @see gore.impl.GorePackageImpl#getQualityConstraint()
	 * @generated
	 */
	int QUALITY_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__NAME = GORE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__INTERNAL_ID = GORE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT__SOFTGOAL = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT___GENERATE_ID__GOALMODEL = GORE_ELEMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT___GET_SHORT_NAME = GORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT___GET_TYPE = GORE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT___GET_ALL_PARAMETERS = GORE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CONSTRAINT_OPERATION_COUNT = GORE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gore.impl.DomainAssumptionImpl <em>Domain Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.DomainAssumptionImpl
	 * @see gore.impl.GorePackageImpl#getDomainAssumption()
	 * @generated
	 */
	int DOMAIN_ASSUMPTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__NAME = GORE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__TIME = GORE_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__STATE = GORE_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Awreqs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__AWREQS = GORE_ELEMENT__AWREQS;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__INTERNAL_ID = GORE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION__PARENT = GORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION_FEATURE_COUNT = GORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION___GET_ALL_PARAMETERS = GORE_ELEMENT___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION___GENERATE_ID__GOALMODEL = GORE_ELEMENT___GENERATE_ID__GOALMODEL;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION___GET_SHORT_NAME = GORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION___GET_TYPE = GORE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSUMPTION_OPERATION_COUNT = GORE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link gore.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.ActorImpl
	 * @see gore.impl.GorePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTERNAL_ID = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_SHORT_NAME = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_TYPE = 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GENERATE_ID__GOALMODEL = 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link gore.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.ConfigurationImpl
	 * @see gore.impl.GorePackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___GET_SHORT_NAME = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___GET_TYPE = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gore.impl.DifferentialRelationImpl <em>Differential Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.DifferentialRelationImpl
	 * @see gore.impl.GorePackageImpl#getDifferentialRelation()
	 * @generated
	 */
	int DIFFERENTIAL_RELATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__INDICATOR = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__UPPER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Differential Relation Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR = 6;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION__INTERNAL_ID = 7;

	/**
	 * The number of structural features of the '<em>Differential Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION___GET_SHORT_NAME = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION___GET_TYPE = 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION___GET_ALL_PARAMETERS = 2;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION___GENERATE_ID__GOALMODEL = 3;

	/**
	 * The number of operations of the '<em>Differential Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENTIAL_RELATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gore.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.impl.ParameterImpl
	 * @see gore.impl.GorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__METRIC = 5;

	/**
	 * The feature id for the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INTERNAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INDICATOR = 7;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_SHORT_NAME = 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_ALL_PARAMETERS = 1;

	/**
	 * The operation id for the '<em>Generate ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE_ID__GOALMODEL = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link gore.GOREElementState <em>GORE Element State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.GOREElementState
	 * @see gore.impl.GorePackageImpl#getGOREElementState()
	 * @generated
	 */
	int GORE_ELEMENT_STATE = 14;

	/**
	 * The meta object id for the '{@link gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.DifferentialRelationOperator
	 * @see gore.impl.GorePackageImpl#getDifferentialRelationOperator()
	 * @generated
	 */
	int DIFFERENTIAL_RELATION_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link gore.ParameterMetric <em>Parameter Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.ParameterMetric
	 * @see gore.impl.GorePackageImpl#getParameterMetric()
	 * @generated
	 */
	int PARAMETER_METRIC = 16;

	/**
	 * The meta object id for the '{@link gore.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.ParameterType
	 * @see gore.impl.GorePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 17;

	/**
	 * The meta object id for the '{@link gore.RefinementType <em>Refinement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.RefinementType
	 * @see gore.impl.GorePackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 18;

	/**
	 * The meta object id for the '{@link gore.AgregationLevel <em>Agregation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gore.AgregationLevel
	 * @see gore.impl.GorePackageImpl#getAgregationLevel()
	 * @generated
	 */
	int AGREGATION_LEVEL = 19;


	/**
	 * Returns the meta object for class '{@link gore.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see gore.GoalModel
	 * @generated
	 */
	EClass getGoalModel();

	/**
	 * Returns the meta object for the attribute '{@link gore.GoalModel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see gore.GoalModel#getModelName()
	 * @see #getGoalModel()
	 * @generated
	 */
	EAttribute getGoalModel_ModelName();

	/**
	 * Returns the meta object for the reference '{@link gore.GoalModel#getRootGoal <em>Root Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Goal</em>'.
	 * @see gore.GoalModel#getRootGoal()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_RootGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.GoalModel#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinements</em>'.
	 * @see gore.GoalModel#getRefinements()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Refinements();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.GoalModel#getDomainassumption <em>Domainassumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainassumption</em>'.
	 * @see gore.GoalModel#getDomainassumption()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Domainassumption();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.GoalModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see gore.GoalModel#getActors()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Actors();

	/**
	 * Returns the meta object for the containment reference '{@link gore.GoalModel#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see gore.GoalModel#getConfiguration()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link gore.GoalModel#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see gore.GoalModel#getParameters()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.GoalModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see gore.GoalModel#getRelations()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Relations();

	/**
	 * Returns the meta object for the attribute '{@link gore.GoalModel#getInternalIDCounter <em>Internal ID Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID Counter</em>'.
	 * @see gore.GoalModel#getInternalIDCounter()
	 * @see #getGoalModel()
	 * @generated
	 */
	EAttribute getGoalModel_InternalIDCounter();

	/**
	 * Returns the meta object for the '{@link gore.GoalModel#getModelShortName() <em>Get Model Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Short Name</em>' operation.
	 * @see gore.GoalModel#getModelShortName()
	 * @generated
	 */
	EOperation getGoalModel__GetModelShortName();

	/**
	 * Returns the meta object for class '{@link gore.GOREElement <em>GORE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GORE Element</em>'.
	 * @see gore.GOREElement
	 * @generated
	 */
	EClass getGOREElement();

	/**
	 * Returns the meta object for the attribute '{@link gore.GOREElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gore.GOREElement#getName()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link gore.GOREElement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see gore.GOREElement#getTime()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_Time();

	/**
	 * Returns the meta object for the attribute '{@link gore.GOREElement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gore.GOREElement#getState()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_State();

	/**
	 * Returns the meta object for the reference list '{@link gore.GOREElement#getAwreqs <em>Awreqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Awreqs</em>'.
	 * @see gore.GOREElement#getAwreqs()
	 * @see #getGOREElement()
	 * @generated
	 */
	EReference getGOREElement_Awreqs();

	/**
	 * Returns the meta object for the attribute '{@link gore.GOREElement#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see gore.GOREElement#getInternalID()
	 * @see #getGOREElement()
	 * @generated
	 */
	EAttribute getGOREElement_InternalID();

	/**
	 * Returns the meta object for the '{@link gore.GOREElement#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.GOREElement#getShortName()
	 * @generated
	 */
	EOperation getGOREElement__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.GOREElement#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.GOREElement#getType()
	 * @generated
	 */
	EOperation getGOREElement__GetType();

	/**
	 * Returns the meta object for the '{@link gore.GOREElement#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.GOREElement#getAllParameters()
	 * @generated
	 */
	EOperation getGOREElement__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link gore.GOREElement#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see gore.GOREElement#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getGOREElement__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link gore.GoalOrientedRequirement <em>Goal Oriented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Oriented Requirement</em>'.
	 * @see gore.GoalOrientedRequirement
	 * @generated
	 */
	EClass getGoalOrientedRequirement();

	/**
	 * Returns the meta object for the attribute '{@link gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Type</em>'.
	 * @see gore.GoalOrientedRequirement#getRefinementType()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EAttribute getGoalOrientedRequirement_RefinementType();

	/**
	 * Returns the meta object for the reference list '{@link gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumptions</em>'.
	 * @see gore.GoalOrientedRequirement#getAssumptions()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Assumptions();

	/**
	 * Returns the meta object for the reference list '{@link gore.GoalOrientedRequirement#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinements</em>'.
	 * @see gore.GoalOrientedRequirement#getRefinements()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Refinements();

	/**
	 * Returns the meta object for the reference '{@link gore.GoalOrientedRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see gore.GoalOrientedRequirement#getParent()
	 * @see #getGoalOrientedRequirement()
	 * @generated
	 */
	EReference getGoalOrientedRequirement_Parent();

	/**
	 * Returns the meta object for class '{@link gore.PerformativeRequirement <em>Performative Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performative Requirement</em>'.
	 * @see gore.PerformativeRequirement
	 * @generated
	 */
	EClass getPerformativeRequirement();

	/**
	 * Returns the meta object for the attribute '{@link gore.PerformativeRequirement#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see gore.PerformativeRequirement#getStartTime()
	 * @see #getPerformativeRequirement()
	 * @generated
	 */
	EAttribute getPerformativeRequirement_StartTime();

	/**
	 * Returns the meta object for class '{@link gore.Hardgoal <em>Hardgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardgoal</em>'.
	 * @see gore.Hardgoal
	 * @generated
	 */
	EClass getHardgoal();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.Hardgoal#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see gore.Hardgoal#getTask()
	 * @see #getHardgoal()
	 * @generated
	 */
	EReference getHardgoal_Task();

	/**
	 * Returns the meta object for the reference '{@link gore.Hardgoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal Model</em>'.
	 * @see gore.Hardgoal#getGoalModel()
	 * @see #getHardgoal()
	 * @generated
	 */
	EReference getHardgoal_GoalModel();

	/**
	 * Returns the meta object for the '{@link gore.Hardgoal#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Hardgoal#getShortName()
	 * @generated
	 */
	EOperation getHardgoal__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Hardgoal#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.Hardgoal#getType()
	 * @generated
	 */
	EOperation getHardgoal__GetType();

	/**
	 * Returns the meta object for the '{@link gore.Hardgoal#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.Hardgoal#getAllParameters()
	 * @generated
	 */
	EOperation getHardgoal__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link gore.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see gore.Softgoal
	 * @generated
	 */
	EClass getSoftgoal();

	/**
	 * Returns the meta object for the reference list '{@link gore.Softgoal#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see gore.Softgoal#getConstraints()
	 * @see #getSoftgoal()
	 * @generated
	 */
	EReference getSoftgoal_Constraints();

	/**
	 * Returns the meta object for the '{@link gore.Softgoal#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Softgoal#getShortName()
	 * @generated
	 */
	EOperation getSoftgoal__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Softgoal#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.Softgoal#getType()
	 * @generated
	 */
	EOperation getSoftgoal__GetType();

	/**
	 * Returns the meta object for the '{@link gore.Softgoal#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.Softgoal#getAllParameters()
	 * @generated
	 */
	EOperation getSoftgoal__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link gore.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see gore.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the '{@link gore.Task#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Task#getShortName()
	 * @generated
	 */
	EOperation getTask__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Task#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.Task#getType()
	 * @generated
	 */
	EOperation getTask__GetType();

	/**
	 * Returns the meta object for the '{@link gore.Task#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.Task#getAllParameters()
	 * @generated
	 */
	EOperation getTask__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link gore.AwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aw Req</em>'.
	 * @see gore.AwReq
	 * @generated
	 */
	EClass getAwReq();

	/**
	 * Returns the meta object for the reference '{@link gore.AwReq#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see gore.AwReq#getTarget()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link gore.AwReq#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see gore.AwReq#getStrategies()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_Strategies();

	/**
	 * Returns the meta object for the containment reference '{@link gore.AwReq#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see gore.AwReq#getResolution()
	 * @see #getAwReq()
	 * @generated
	 */
	EReference getAwReq_Resolution();

	/**
	 * Returns the meta object for the '{@link gore.AwReq#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.AwReq#getShortName()
	 * @generated
	 */
	EOperation getAwReq__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.AwReq#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.AwReq#getType()
	 * @generated
	 */
	EOperation getAwReq__GetType();

	/**
	 * Returns the meta object for the '{@link gore.AwReq#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.AwReq#getAllParameters()
	 * @generated
	 */
	EOperation getAwReq__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link gore.QualityConstraint <em>Quality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Constraint</em>'.
	 * @see gore.QualityConstraint
	 * @generated
	 */
	EClass getQualityConstraint();

	/**
	 * Returns the meta object for the reference '{@link gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Softgoal</em>'.
	 * @see gore.QualityConstraint#getSoftgoal()
	 * @see #getQualityConstraint()
	 * @generated
	 */
	EReference getQualityConstraint_Softgoal();

	/**
	 * Returns the meta object for the '{@link gore.QualityConstraint#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.QualityConstraint#getShortName()
	 * @generated
	 */
	EOperation getQualityConstraint__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.QualityConstraint#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.QualityConstraint#getType()
	 * @generated
	 */
	EOperation getQualityConstraint__GetType();

	/**
	 * Returns the meta object for the '{@link gore.QualityConstraint#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.QualityConstraint#getAllParameters()
	 * @generated
	 */
	EOperation getQualityConstraint__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link gore.DomainAssumption <em>Domain Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Assumption</em>'.
	 * @see gore.DomainAssumption
	 * @generated
	 */
	EClass getDomainAssumption();

	/**
	 * Returns the meta object for the reference '{@link gore.DomainAssumption#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see gore.DomainAssumption#getParent()
	 * @see #getDomainAssumption()
	 * @generated
	 */
	EReference getDomainAssumption_Parent();

	/**
	 * Returns the meta object for the '{@link gore.DomainAssumption#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.DomainAssumption#getShortName()
	 * @generated
	 */
	EOperation getDomainAssumption__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.DomainAssumption#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.DomainAssumption#getType()
	 * @generated
	 */
	EOperation getDomainAssumption__GetType();

	/**
	 * Returns the meta object for class '{@link gore.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see gore.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link gore.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gore.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link gore.Actor#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see gore.Actor#getInternalID()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_InternalID();

	/**
	 * Returns the meta object for the '{@link gore.Actor#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Actor#getShortName()
	 * @generated
	 */
	EOperation getActor__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Actor#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.Actor#getType()
	 * @generated
	 */
	EOperation getActor__GetType();

	/**
	 * Returns the meta object for the '{@link gore.Actor#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see gore.Actor#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getActor__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link gore.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see gore.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link gore.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gore.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gore.Configuration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see gore.Configuration#getParameters()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Parameters();

	/**
	 * Returns the meta object for the '{@link gore.Configuration#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Configuration#getShortName()
	 * @generated
	 */
	EOperation getConfiguration__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Configuration#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.Configuration#getType()
	 * @generated
	 */
	EOperation getConfiguration__GetType();

	/**
	 * Returns the meta object for class '{@link gore.DifferentialRelation <em>Differential Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Differential Relation</em>'.
	 * @see gore.DifferentialRelation
	 * @generated
	 */
	EClass getDifferentialRelation();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gore.DifferentialRelation#getName()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link gore.DifferentialRelation#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Indicator</em>'.
	 * @see gore.DifferentialRelation#getIndicator()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EReference getDifferentialRelation_Indicator();

	/**
	 * Returns the meta object for the reference '{@link gore.DifferentialRelation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see gore.DifferentialRelation#getParameter()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EReference getDifferentialRelation_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see gore.DifferentialRelation#getLowerBound()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see gore.DifferentialRelation#getUpperBound()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gore.DifferentialRelation#getValue()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_Value();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getDifferentialRelationOperator <em>Differential Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Differential Relation Operator</em>'.
	 * @see gore.DifferentialRelation#getDifferentialRelationOperator()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_DifferentialRelationOperator();

	/**
	 * Returns the meta object for the attribute '{@link gore.DifferentialRelation#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see gore.DifferentialRelation#getInternalID()
	 * @see #getDifferentialRelation()
	 * @generated
	 */
	EAttribute getDifferentialRelation_InternalID();

	/**
	 * Returns the meta object for the '{@link gore.DifferentialRelation#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.DifferentialRelation#getShortName()
	 * @generated
	 */
	EOperation getDifferentialRelation__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.DifferentialRelation#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see gore.DifferentialRelation#getType()
	 * @generated
	 */
	EOperation getDifferentialRelation__GetType();

	/**
	 * Returns the meta object for the '{@link gore.DifferentialRelation#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.DifferentialRelation#getAllParameters()
	 * @generated
	 */
	EOperation getDifferentialRelation__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link gore.DifferentialRelation#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see gore.DifferentialRelation#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getDifferentialRelation__GenerateID__GoalModel();

	/**
	 * Returns the meta object for class '{@link gore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gore.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gore.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the container reference '{@link gore.Parameter#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see gore.Parameter#getConfiguration()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gore.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see gore.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gore.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see gore.Parameter#getMetric()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Metric();

	/**
	 * Returns the meta object for the attribute '{@link gore.Parameter#getInternalID <em>Internal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal ID</em>'.
	 * @see gore.Parameter#getInternalID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_InternalID();

	/**
	 * Returns the meta object for the reference '{@link gore.Parameter#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Indicator</em>'.
	 * @see gore.Parameter#getIndicator()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Indicator();

	/**
	 * Returns the meta object for the '{@link gore.Parameter#getShortName() <em>Get Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name</em>' operation.
	 * @see gore.Parameter#getShortName()
	 * @generated
	 */
	EOperation getParameter__GetShortName();

	/**
	 * Returns the meta object for the '{@link gore.Parameter#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see gore.Parameter#getAllParameters()
	 * @generated
	 */
	EOperation getParameter__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link gore.Parameter#generateID(gore.GoalModel) <em>Generate ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate ID</em>' operation.
	 * @see gore.Parameter#generateID(gore.GoalModel)
	 * @generated
	 */
	EOperation getParameter__GenerateID__GoalModel();

	/**
	 * Returns the meta object for enum '{@link gore.GOREElementState <em>GORE Element State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GORE Element State</em>'.
	 * @see gore.GOREElementState
	 * @generated
	 */
	EEnum getGOREElementState();

	/**
	 * Returns the meta object for enum '{@link gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Differential Relation Operator</em>'.
	 * @see gore.DifferentialRelationOperator
	 * @generated
	 */
	EEnum getDifferentialRelationOperator();

	/**
	 * Returns the meta object for enum '{@link gore.ParameterMetric <em>Parameter Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Metric</em>'.
	 * @see gore.ParameterMetric
	 * @generated
	 */
	EEnum getParameterMetric();

	/**
	 * Returns the meta object for enum '{@link gore.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see gore.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link gore.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refinement Type</em>'.
	 * @see gore.RefinementType
	 * @generated
	 */
	EEnum getRefinementType();

	/**
	 * Returns the meta object for enum '{@link gore.AgregationLevel <em>Agregation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agregation Level</em>'.
	 * @see gore.AgregationLevel
	 * @generated
	 */
	EEnum getAgregationLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoreFactory getGoreFactory();

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
		 * The meta object literal for the '{@link gore.impl.GoalModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.GoalModelImpl
		 * @see gore.impl.GorePackageImpl#getGoalModel()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoalModel();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__MODEL_NAME = eINSTANCE.getGoalModel_ModelName();

		/**
		 * The meta object literal for the '<em><b>Root Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ROOT_GOAL = eINSTANCE.getGoalModel_RootGoal();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__REFINEMENTS = eINSTANCE.getGoalModel_Refinements();

		/**
		 * The meta object literal for the '<em><b>Domainassumption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__DOMAINASSUMPTION = eINSTANCE.getGoalModel_Domainassumption();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__ACTORS = eINSTANCE.getGoalModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__CONFIGURATION = eINSTANCE.getGoalModel_Configuration();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__PARAMETERS = eINSTANCE.getGoalModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__RELATIONS = eINSTANCE.getGoalModel_Relations();

		/**
		 * The meta object literal for the '<em><b>Internal ID Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__INTERNAL_ID_COUNTER = eINSTANCE.getGoalModel_InternalIDCounter();

		/**
		 * The meta object literal for the '<em><b>Get Model Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GOAL_MODEL___GET_MODEL_SHORT_NAME = eINSTANCE.getGoalModel__GetModelShortName();

		/**
		 * The meta object literal for the '{@link gore.impl.GOREElementImpl <em>GORE Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.GOREElementImpl
		 * @see gore.impl.GorePackageImpl#getGOREElement()
		 * @generated
		 */
		EClass GORE_ELEMENT = eINSTANCE.getGOREElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__NAME = eINSTANCE.getGOREElement_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__TIME = eINSTANCE.getGOREElement_Time();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__STATE = eINSTANCE.getGOREElement_State();

		/**
		 * The meta object literal for the '<em><b>Awreqs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GORE_ELEMENT__AWREQS = eINSTANCE.getGOREElement_Awreqs();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GORE_ELEMENT__INTERNAL_ID = eINSTANCE.getGOREElement_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GORE_ELEMENT___GET_SHORT_NAME = eINSTANCE.getGOREElement__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GORE_ELEMENT___GET_TYPE = eINSTANCE.getGOREElement__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GORE_ELEMENT___GET_ALL_PARAMETERS = eINSTANCE.getGOREElement__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GORE_ELEMENT___GENERATE_ID__GOALMODEL = eINSTANCE.getGOREElement__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link gore.impl.GoalOrientedRequirementImpl <em>Goal Oriented Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.GoalOrientedRequirementImpl
		 * @see gore.impl.GorePackageImpl#getGoalOrientedRequirement()
		 * @generated
		 */
		EClass GOAL_ORIENTED_REQUIREMENT = eINSTANCE.getGoalOrientedRequirement();

		/**
		 * The meta object literal for the '<em><b>Refinement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE = eINSTANCE.getGoalOrientedRequirement_RefinementType();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS = eINSTANCE.getGoalOrientedRequirement_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__REFINEMENTS = eINSTANCE.getGoalOrientedRequirement_Refinements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ORIENTED_REQUIREMENT__PARENT = eINSTANCE.getGoalOrientedRequirement_Parent();

		/**
		 * The meta object literal for the '{@link gore.impl.PerformativeRequirementImpl <em>Performative Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.PerformativeRequirementImpl
		 * @see gore.impl.GorePackageImpl#getPerformativeRequirement()
		 * @generated
		 */
		EClass PERFORMATIVE_REQUIREMENT = eINSTANCE.getPerformativeRequirement();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMATIVE_REQUIREMENT__START_TIME = eINSTANCE.getPerformativeRequirement_StartTime();

		/**
		 * The meta object literal for the '{@link gore.impl.HardgoalImpl <em>Hardgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.HardgoalImpl
		 * @see gore.impl.GorePackageImpl#getHardgoal()
		 * @generated
		 */
		EClass HARDGOAL = eINSTANCE.getHardgoal();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDGOAL__TASK = eINSTANCE.getHardgoal_Task();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDGOAL__GOAL_MODEL = eINSTANCE.getHardgoal_GoalModel();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDGOAL___GET_SHORT_NAME = eINSTANCE.getHardgoal__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDGOAL___GET_TYPE = eINSTANCE.getHardgoal__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDGOAL___GET_ALL_PARAMETERS = eINSTANCE.getHardgoal__GetAllParameters();

		/**
		 * The meta object literal for the '{@link gore.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.SoftgoalImpl
		 * @see gore.impl.GorePackageImpl#getSoftgoal()
		 * @generated
		 */
		EClass SOFTGOAL = eINSTANCE.getSoftgoal();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTGOAL__CONSTRAINTS = eINSTANCE.getSoftgoal_Constraints();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOFTGOAL___GET_SHORT_NAME = eINSTANCE.getSoftgoal__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOFTGOAL___GET_TYPE = eINSTANCE.getSoftgoal__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOFTGOAL___GET_ALL_PARAMETERS = eINSTANCE.getSoftgoal__GetAllParameters();

		/**
		 * The meta object literal for the '{@link gore.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.TaskImpl
		 * @see gore.impl.GorePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_SHORT_NAME = eINSTANCE.getTask__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_TYPE = eINSTANCE.getTask__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_ALL_PARAMETERS = eINSTANCE.getTask__GetAllParameters();

		/**
		 * The meta object literal for the '{@link gore.impl.AwReqImpl <em>Aw Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.AwReqImpl
		 * @see gore.impl.GorePackageImpl#getAwReq()
		 * @generated
		 */
		EClass AW_REQ = eINSTANCE.getAwReq();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__TARGET = eINSTANCE.getAwReq_Target();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__STRATEGIES = eINSTANCE.getAwReq_Strategies();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AW_REQ__RESOLUTION = eINSTANCE.getAwReq_Resolution();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AW_REQ___GET_SHORT_NAME = eINSTANCE.getAwReq__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AW_REQ___GET_TYPE = eINSTANCE.getAwReq__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AW_REQ___GET_ALL_PARAMETERS = eINSTANCE.getAwReq__GetAllParameters();

		/**
		 * The meta object literal for the '{@link gore.impl.QualityConstraintImpl <em>Quality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.QualityConstraintImpl
		 * @see gore.impl.GorePackageImpl#getQualityConstraint()
		 * @generated
		 */
		EClass QUALITY_CONSTRAINT = eINSTANCE.getQualityConstraint();

		/**
		 * The meta object literal for the '<em><b>Softgoal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CONSTRAINT__SOFTGOAL = eINSTANCE.getQualityConstraint_Softgoal();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUALITY_CONSTRAINT___GET_SHORT_NAME = eINSTANCE.getQualityConstraint__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUALITY_CONSTRAINT___GET_TYPE = eINSTANCE.getQualityConstraint__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUALITY_CONSTRAINT___GET_ALL_PARAMETERS = eINSTANCE.getQualityConstraint__GetAllParameters();

		/**
		 * The meta object literal for the '{@link gore.impl.DomainAssumptionImpl <em>Domain Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.DomainAssumptionImpl
		 * @see gore.impl.GorePackageImpl#getDomainAssumption()
		 * @generated
		 */
		EClass DOMAIN_ASSUMPTION = eINSTANCE.getDomainAssumption();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ASSUMPTION__PARENT = eINSTANCE.getDomainAssumption_Parent();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN_ASSUMPTION___GET_SHORT_NAME = eINSTANCE.getDomainAssumption__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN_ASSUMPTION___GET_TYPE = eINSTANCE.getDomainAssumption__GetType();

		/**
		 * The meta object literal for the '{@link gore.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.ActorImpl
		 * @see gore.impl.GorePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__INTERNAL_ID = eINSTANCE.getActor_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___GET_SHORT_NAME = eINSTANCE.getActor__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___GET_TYPE = eINSTANCE.getActor__GetType();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___GENERATE_ID__GOALMODEL = eINSTANCE.getActor__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link gore.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.ConfigurationImpl
		 * @see gore.impl.GorePackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PARAMETERS = eINSTANCE.getConfiguration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___GET_SHORT_NAME = eINSTANCE.getConfiguration__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___GET_TYPE = eINSTANCE.getConfiguration__GetType();

		/**
		 * The meta object literal for the '{@link gore.impl.DifferentialRelationImpl <em>Differential Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.DifferentialRelationImpl
		 * @see gore.impl.GorePackageImpl#getDifferentialRelation()
		 * @generated
		 */
		EClass DIFFERENTIAL_RELATION = eINSTANCE.getDifferentialRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__NAME = eINSTANCE.getDifferentialRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENTIAL_RELATION__INDICATOR = eINSTANCE.getDifferentialRelation_Indicator();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENTIAL_RELATION__PARAMETER = eINSTANCE.getDifferentialRelation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__LOWER_BOUND = eINSTANCE.getDifferentialRelation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__UPPER_BOUND = eINSTANCE.getDifferentialRelation_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__VALUE = eINSTANCE.getDifferentialRelation_Value();

		/**
		 * The meta object literal for the '<em><b>Differential Relation Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR = eINSTANCE.getDifferentialRelation_DifferentialRelationOperator();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFERENTIAL_RELATION__INTERNAL_ID = eINSTANCE.getDifferentialRelation_InternalID();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFFERENTIAL_RELATION___GET_SHORT_NAME = eINSTANCE.getDifferentialRelation__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFFERENTIAL_RELATION___GET_TYPE = eINSTANCE.getDifferentialRelation__GetType();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFFERENTIAL_RELATION___GET_ALL_PARAMETERS = eINSTANCE.getDifferentialRelation__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFFERENTIAL_RELATION___GENERATE_ID__GOALMODEL = eINSTANCE.getDifferentialRelation__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link gore.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.impl.ParameterImpl
		 * @see gore.impl.GorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONFIGURATION = eINSTANCE.getParameter_Configuration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__METRIC = eINSTANCE.getParameter_Metric();

		/**
		 * The meta object literal for the '<em><b>Internal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__INTERNAL_ID = eINSTANCE.getParameter_InternalID();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INDICATOR = eINSTANCE.getParameter_Indicator();

		/**
		 * The meta object literal for the '<em><b>Get Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_SHORT_NAME = eINSTANCE.getParameter__GetShortName();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_ALL_PARAMETERS = eINSTANCE.getParameter__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Generate ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GENERATE_ID__GOALMODEL = eINSTANCE.getParameter__GenerateID__GoalModel();

		/**
		 * The meta object literal for the '{@link gore.GOREElementState <em>GORE Element State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.GOREElementState
		 * @see gore.impl.GorePackageImpl#getGOREElementState()
		 * @generated
		 */
		EEnum GORE_ELEMENT_STATE = eINSTANCE.getGOREElementState();

		/**
		 * The meta object literal for the '{@link gore.DifferentialRelationOperator <em>Differential Relation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.DifferentialRelationOperator
		 * @see gore.impl.GorePackageImpl#getDifferentialRelationOperator()
		 * @generated
		 */
		EEnum DIFFERENTIAL_RELATION_OPERATOR = eINSTANCE.getDifferentialRelationOperator();

		/**
		 * The meta object literal for the '{@link gore.ParameterMetric <em>Parameter Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.ParameterMetric
		 * @see gore.impl.GorePackageImpl#getParameterMetric()
		 * @generated
		 */
		EEnum PARAMETER_METRIC = eINSTANCE.getParameterMetric();

		/**
		 * The meta object literal for the '{@link gore.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.ParameterType
		 * @see gore.impl.GorePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link gore.RefinementType <em>Refinement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.RefinementType
		 * @see gore.impl.GorePackageImpl#getRefinementType()
		 * @generated
		 */
		EEnum REFINEMENT_TYPE = eINSTANCE.getRefinementType();

		/**
		 * The meta object literal for the '{@link gore.AgregationLevel <em>Agregation Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gore.AgregationLevel
		 * @see gore.impl.GorePackageImpl#getAgregationLevel()
		 * @generated
		 */
		EEnum AGREGATION_LEVEL = eINSTANCE.getAgregationLevel();

	}

} //GorePackage
