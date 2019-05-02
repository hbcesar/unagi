/**
 */
package gore.impl;

import eca.EcaPackage;

import eca.impl.EcaPackageImpl;

import gore.Actor;
import gore.AgregationLevel;
import gore.AwReq;
import gore.Configuration;
import gore.DifferentialRelation;
import gore.DifferentialRelationOperator;
import gore.DomainAssumption;
import gore.GOREElement;
import gore.GOREElementState;
import gore.GoalModel;
import gore.GoalOrientedRequirement;
import gore.GoreFactory;
import gore.GorePackage;
import gore.Hardgoal;
import gore.Parameter;
import gore.ParameterMetric;
import gore.ParameterType;
import gore.PerformativeRequirement;
import gore.QualityConstraint;
import gore.RefinementType;
import gore.Softgoal;
import gore.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GorePackageImpl extends EPackageImpl implements GorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goreElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalOrientedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performativeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentialRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goreElementStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum differentialRelationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refinementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agregationLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gore.GorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GorePackageImpl() {
		super(eNS_URI, GoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GorePackage init() {
		if (isInited) return (GorePackage)EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI);

		// Obtain or create and register package
		GorePackageImpl theGorePackage = (GorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcaPackageImpl theEcaPackage = (EcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) instanceof EcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI) : EcaPackage.eINSTANCE);

		// Create package meta-data objects
		theGorePackage.createPackageContents();
		theEcaPackage.createPackageContents();

		// Initialize created meta-data
		theGorePackage.initializePackageContents();
		theEcaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GorePackage.eNS_URI, theGorePackage);
		return theGorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalModel() {
		return goalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalModel_ModelName() {
		return (EAttribute)goalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_RootGoal() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Refinements() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Domainassumption() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Actors() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Configuration() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Parameters() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalModel_Relations() {
		return (EReference)goalModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalModel_InternalIDCounter() {
		return (EAttribute)goalModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGoalModel__GetModelShortName() {
		return goalModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGOREElement() {
		return goreElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_Name() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_Time() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_State() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGOREElement_Awreqs() {
		return (EReference)goreElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOREElement_InternalID() {
		return (EAttribute)goreElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGOREElement__GetShortName() {
		return goreElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGOREElement__GetType() {
		return goreElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGOREElement__GetAllParameters() {
		return goreElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGOREElement__GenerateID__GoalModel() {
		return goreElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalOrientedRequirement() {
		return goalOrientedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalOrientedRequirement_RefinementType() {
		return (EAttribute)goalOrientedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Assumptions() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Refinements() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOrientedRequirement_Parent() {
		return (EReference)goalOrientedRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformativeRequirement() {
		return performativeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformativeRequirement_StartTime() {
		return (EAttribute)performativeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardgoal() {
		return hardgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardgoal_Task() {
		return (EReference)hardgoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardgoal_GoalModel() {
		return (EReference)hardgoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHardgoal__GetShortName() {
		return hardgoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHardgoal__GetType() {
		return hardgoalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHardgoal__GetAllParameters() {
		return hardgoalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftgoal() {
		return softgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftgoal_Constraints() {
		return (EReference)softgoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoftgoal__GetShortName() {
		return softgoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoftgoal__GetType() {
		return softgoalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoftgoal__GetAllParameters() {
		return softgoalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetShortName() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetType() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetAllParameters() {
		return taskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwReq() {
		return awReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwReq_Target() {
		return (EReference)awReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwReq_Strategies() {
		return (EReference)awReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwReq_Resolution() {
		return (EReference)awReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAwReq__GetShortName() {
		return awReqEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAwReq__GetType() {
		return awReqEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAwReq__GetAllParameters() {
		return awReqEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityConstraint() {
		return qualityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityConstraint_Softgoal() {
		return (EReference)qualityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualityConstraint__GetShortName() {
		return qualityConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualityConstraint__GetType() {
		return qualityConstraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualityConstraint__GetAllParameters() {
		return qualityConstraintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAssumption() {
		return domainAssumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAssumption_Parent() {
		return (EReference)domainAssumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainAssumption__GetShortName() {
		return domainAssumptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainAssumption__GetType() {
		return domainAssumptionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Name() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_InternalID() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__GetShortName() {
		return actorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__GetType() {
		return actorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__GenerateID__GoalModel() {
		return actorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Parameters() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__GetShortName() {
		return configurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__GetType() {
		return configurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentialRelation() {
		return differentialRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_Name() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentialRelation_Indicator() {
		return (EReference)differentialRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentialRelation_Parameter() {
		return (EReference)differentialRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_LowerBound() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_UpperBound() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_Value() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_DifferentialRelationOperator() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferentialRelation_InternalID() {
		return (EAttribute)differentialRelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDifferentialRelation__GetShortName() {
		return differentialRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDifferentialRelation__GetType() {
		return differentialRelationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDifferentialRelation__GetAllParameters() {
		return differentialRelationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDifferentialRelation__GenerateID__GoalModel() {
		return differentialRelationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Configuration() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Unit() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Metric() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_InternalID() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Indicator() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetShortName() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetAllParameters() {
		return parameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateID__GoalModel() {
		return parameterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGOREElementState() {
		return goreElementStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDifferentialRelationOperator() {
		return differentialRelationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMetric() {
		return parameterMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefinementType() {
		return refinementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgregationLevel() {
		return agregationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreFactory getGoreFactory() {
		return (GoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		goalModelEClass = createEClass(GOAL_MODEL);
		createEAttribute(goalModelEClass, GOAL_MODEL__MODEL_NAME);
		createEReference(goalModelEClass, GOAL_MODEL__ROOT_GOAL);
		createEReference(goalModelEClass, GOAL_MODEL__REFINEMENTS);
		createEReference(goalModelEClass, GOAL_MODEL__DOMAINASSUMPTION);
		createEReference(goalModelEClass, GOAL_MODEL__ACTORS);
		createEReference(goalModelEClass, GOAL_MODEL__CONFIGURATION);
		createEReference(goalModelEClass, GOAL_MODEL__PARAMETERS);
		createEReference(goalModelEClass, GOAL_MODEL__RELATIONS);
		createEAttribute(goalModelEClass, GOAL_MODEL__INTERNAL_ID_COUNTER);
		createEOperation(goalModelEClass, GOAL_MODEL___GET_MODEL_SHORT_NAME);

		goreElementEClass = createEClass(GORE_ELEMENT);
		createEAttribute(goreElementEClass, GORE_ELEMENT__NAME);
		createEAttribute(goreElementEClass, GORE_ELEMENT__TIME);
		createEAttribute(goreElementEClass, GORE_ELEMENT__STATE);
		createEReference(goreElementEClass, GORE_ELEMENT__AWREQS);
		createEAttribute(goreElementEClass, GORE_ELEMENT__INTERNAL_ID);
		createEOperation(goreElementEClass, GORE_ELEMENT___GET_SHORT_NAME);
		createEOperation(goreElementEClass, GORE_ELEMENT___GET_TYPE);
		createEOperation(goreElementEClass, GORE_ELEMENT___GET_ALL_PARAMETERS);
		createEOperation(goreElementEClass, GORE_ELEMENT___GENERATE_ID__GOALMODEL);

		goalOrientedRequirementEClass = createEClass(GOAL_ORIENTED_REQUIREMENT);
		createEAttribute(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__REFINEMENTS);
		createEReference(goalOrientedRequirementEClass, GOAL_ORIENTED_REQUIREMENT__PARENT);

		performativeRequirementEClass = createEClass(PERFORMATIVE_REQUIREMENT);
		createEAttribute(performativeRequirementEClass, PERFORMATIVE_REQUIREMENT__START_TIME);

		hardgoalEClass = createEClass(HARDGOAL);
		createEReference(hardgoalEClass, HARDGOAL__TASK);
		createEReference(hardgoalEClass, HARDGOAL__GOAL_MODEL);
		createEOperation(hardgoalEClass, HARDGOAL___GET_SHORT_NAME);
		createEOperation(hardgoalEClass, HARDGOAL___GET_TYPE);
		createEOperation(hardgoalEClass, HARDGOAL___GET_ALL_PARAMETERS);

		softgoalEClass = createEClass(SOFTGOAL);
		createEReference(softgoalEClass, SOFTGOAL__CONSTRAINTS);
		createEOperation(softgoalEClass, SOFTGOAL___GET_SHORT_NAME);
		createEOperation(softgoalEClass, SOFTGOAL___GET_TYPE);
		createEOperation(softgoalEClass, SOFTGOAL___GET_ALL_PARAMETERS);

		taskEClass = createEClass(TASK);
		createEOperation(taskEClass, TASK___GET_SHORT_NAME);
		createEOperation(taskEClass, TASK___GET_TYPE);
		createEOperation(taskEClass, TASK___GET_ALL_PARAMETERS);

		awReqEClass = createEClass(AW_REQ);
		createEReference(awReqEClass, AW_REQ__TARGET);
		createEReference(awReqEClass, AW_REQ__STRATEGIES);
		createEReference(awReqEClass, AW_REQ__RESOLUTION);
		createEOperation(awReqEClass, AW_REQ___GET_SHORT_NAME);
		createEOperation(awReqEClass, AW_REQ___GET_TYPE);
		createEOperation(awReqEClass, AW_REQ___GET_ALL_PARAMETERS);

		qualityConstraintEClass = createEClass(QUALITY_CONSTRAINT);
		createEReference(qualityConstraintEClass, QUALITY_CONSTRAINT__SOFTGOAL);
		createEOperation(qualityConstraintEClass, QUALITY_CONSTRAINT___GET_SHORT_NAME);
		createEOperation(qualityConstraintEClass, QUALITY_CONSTRAINT___GET_TYPE);
		createEOperation(qualityConstraintEClass, QUALITY_CONSTRAINT___GET_ALL_PARAMETERS);

		domainAssumptionEClass = createEClass(DOMAIN_ASSUMPTION);
		createEReference(domainAssumptionEClass, DOMAIN_ASSUMPTION__PARENT);
		createEOperation(domainAssumptionEClass, DOMAIN_ASSUMPTION___GET_SHORT_NAME);
		createEOperation(domainAssumptionEClass, DOMAIN_ASSUMPTION___GET_TYPE);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__NAME);
		createEAttribute(actorEClass, ACTOR__INTERNAL_ID);
		createEOperation(actorEClass, ACTOR___GET_SHORT_NAME);
		createEOperation(actorEClass, ACTOR___GET_TYPE);
		createEOperation(actorEClass, ACTOR___GENERATE_ID__GOALMODEL);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__PARAMETERS);
		createEOperation(configurationEClass, CONFIGURATION___GET_SHORT_NAME);
		createEOperation(configurationEClass, CONFIGURATION___GET_TYPE);

		differentialRelationEClass = createEClass(DIFFERENTIAL_RELATION);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__NAME);
		createEReference(differentialRelationEClass, DIFFERENTIAL_RELATION__INDICATOR);
		createEReference(differentialRelationEClass, DIFFERENTIAL_RELATION__PARAMETER);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__LOWER_BOUND);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__UPPER_BOUND);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__VALUE);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR);
		createEAttribute(differentialRelationEClass, DIFFERENTIAL_RELATION__INTERNAL_ID);
		createEOperation(differentialRelationEClass, DIFFERENTIAL_RELATION___GET_SHORT_NAME);
		createEOperation(differentialRelationEClass, DIFFERENTIAL_RELATION___GET_TYPE);
		createEOperation(differentialRelationEClass, DIFFERENTIAL_RELATION___GET_ALL_PARAMETERS);
		createEOperation(differentialRelationEClass, DIFFERENTIAL_RELATION___GENERATE_ID__GOALMODEL);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__CONFIGURATION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__UNIT);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__METRIC);
		createEAttribute(parameterEClass, PARAMETER__INTERNAL_ID);
		createEReference(parameterEClass, PARAMETER__INDICATOR);
		createEOperation(parameterEClass, PARAMETER___GET_SHORT_NAME);
		createEOperation(parameterEClass, PARAMETER___GET_ALL_PARAMETERS);
		createEOperation(parameterEClass, PARAMETER___GENERATE_ID__GOALMODEL);

		// Create enums
		goreElementStateEEnum = createEEnum(GORE_ELEMENT_STATE);
		differentialRelationOperatorEEnum = createEEnum(DIFFERENTIAL_RELATION_OPERATOR);
		parameterMetricEEnum = createEEnum(PARAMETER_METRIC);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		refinementTypeEEnum = createEEnum(REFINEMENT_TYPE);
		agregationLevelEEnum = createEEnum(AGREGATION_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcaPackage theEcaPackage = (EcaPackage)EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		goalOrientedRequirementEClass.getESuperTypes().add(this.getGOREElement());
		performativeRequirementEClass.getESuperTypes().add(this.getGoalOrientedRequirement());
		hardgoalEClass.getESuperTypes().add(this.getPerformativeRequirement());
		softgoalEClass.getESuperTypes().add(this.getGoalOrientedRequirement());
		taskEClass.getESuperTypes().add(this.getPerformativeRequirement());
		awReqEClass.getESuperTypes().add(this.getGOREElement());
		qualityConstraintEClass.getESuperTypes().add(this.getGOREElement());
		domainAssumptionEClass.getESuperTypes().add(this.getGOREElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(goalModelEClass, GoalModel.class, "GoalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoalModel_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_RootGoal(), this.getHardgoal(), this.getHardgoal_GoalModel(), "rootGoal", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Refinements(), this.getGOREElement(), null, "refinements", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Domainassumption(), this.getDomainAssumption(), null, "domainassumption", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Actors(), this.getActor(), null, "actors", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalModel_Relations(), this.getDifferentialRelation(), null, "relations", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoalModel_InternalIDCounter(), ecorePackage.getEIntegerObject(), "internalIDCounter", "0", 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGoalModel__GetModelShortName(), ecorePackage.getEString(), "getModelShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(goreElementEClass, GOREElement.class, "GOREElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGOREElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGOREElement_Time(), ecorePackage.getEDate(), "time", null, 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGOREElement_State(), this.getGOREElementState(), "state", null, 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGOREElement_Awreqs(), this.getAwReq(), this.getAwReq_Target(), "awreqs", null, 0, -1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGOREElement_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, GOREElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGOREElement__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGOREElement__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGOREElement__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGOREElement__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(goalOrientedRequirementEClass, GoalOrientedRequirement.class, "GoalOrientedRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoalOrientedRequirement_RefinementType(), this.getRefinementType(), "refinementType", null, 0, 1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Assumptions(), this.getDomainAssumption(), this.getDomainAssumption_Parent(), "assumptions", null, 0, -1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Refinements(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Parent(), "refinements", null, 0, -1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalOrientedRequirement_Parent(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Refinements(), "parent", null, 0, 1, GoalOrientedRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performativeRequirementEClass, PerformativeRequirement.class, "PerformativeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformativeRequirement_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, PerformativeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardgoalEClass, Hardgoal.class, "Hardgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardgoal_Task(), this.getTask(), null, "task", null, 0, -1, Hardgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardgoal_GoalModel(), this.getGoalModel(), this.getGoalModel_RootGoal(), "goalModel", null, 0, 1, Hardgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHardgoal__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHardgoal__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHardgoal__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftgoal_Constraints(), this.getQualityConstraint(), this.getQualityConstraint_Softgoal(), "constraints", null, 1, -1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSoftgoal__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSoftgoal__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSoftgoal__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTask__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(awReqEClass, AwReq.class, "AwReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwReq_Target(), this.getGOREElement(), this.getGOREElement_Awreqs(), "target", null, 0, 1, AwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwReq_Strategies(), theEcaPackage.getAdaptationStrategy(), theEcaPackage.getAdaptationStrategy_Awreq(), "strategies", null, 0, -1, AwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwReq_Resolution(), theEcaPackage.getResolutionCondition(), theEcaPackage.getResolutionCondition_Awreq(), "resolution", null, 0, 1, AwReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAwReq__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAwReq__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAwReq__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qualityConstraintEClass, QualityConstraint.class, "QualityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityConstraint_Softgoal(), this.getSoftgoal(), this.getSoftgoal_Constraints(), "softgoal", null, 0, 1, QualityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getQualityConstraint__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getQualityConstraint__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getQualityConstraint__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(domainAssumptionEClass, DomainAssumption.class, "DomainAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainAssumption_Parent(), this.getGoalOrientedRequirement(), this.getGoalOrientedRequirement_Assumptions(), "parent", null, 0, 1, DomainAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDomainAssumption__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDomainAssumption__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActor__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActor__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActor__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Parameters(), this.getParameter(), this.getParameter_Configuration(), "parameters", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConfiguration__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConfiguration__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(differentialRelationEClass, DifferentialRelation.class, "DifferentialRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifferentialRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferentialRelation_Indicator(), this.getAwReq(), null, "indicator", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferentialRelation_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_LowerBound(), ecorePackage.getEString(), "lowerBound", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_UpperBound(), ecorePackage.getEString(), "upperBound", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_DifferentialRelationOperator(), this.getDifferentialRelationOperator(), "DifferentialRelationOperator", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDifferentialRelation_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, DifferentialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDifferentialRelation__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDifferentialRelation__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDifferentialRelation__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDifferentialRelation__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Configuration(), this.getConfiguration(), this.getConfiguration_Parameters(), "configuration", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Metric(), this.getParameterMetric(), "metric", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Indicator(), this.getAwReq(), null, "indicator", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameter__GetShortName(), ecorePackage.getEString(), "getShortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(goreElementStateEEnum, GOREElementState.class, "GOREElementState");
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.UNDEFINED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.STARTED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.SUCCEEDED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.FAILED);
		addEEnumLiteral(goreElementStateEEnum, GOREElementState.CANCELED);

		initEEnum(differentialRelationOperatorEEnum, DifferentialRelationOperator.class, "DifferentialRelationOperator");
		addEEnumLiteral(differentialRelationOperatorEEnum, DifferentialRelationOperator.GREATER_THAN);
		addEEnumLiteral(differentialRelationOperatorEEnum, DifferentialRelationOperator.FEWER_THAN);

		initEEnum(parameterMetricEEnum, ParameterMetric.class, "ParameterMetric");
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.ENUMERATED);
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.INTEGER);
		addEEnumLiteral(parameterMetricEEnum, ParameterMetric.REAL);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.VARIATION_POINT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.ENUMERATED_CONTROL_VARIABLE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.NUMERIC_CONTROL_VARIABLE);

		initEEnum(refinementTypeEEnum, RefinementType.class, "RefinementType");
		addEEnumLiteral(refinementTypeEEnum, RefinementType.AND);
		addEEnumLiteral(refinementTypeEEnum, RefinementType.OR);

		initEEnum(agregationLevelEEnum, AgregationLevel.class, "AgregationLevel");
		addEEnumLiteral(agregationLevelEEnum, AgregationLevel.INSTANCE);
		addEEnumLiteral(agregationLevelEEnum, AgregationLevel.CLASS);
		addEEnumLiteral(agregationLevelEEnum, AgregationLevel.BOTH);

		// Create resource
		createResource(eNS_URI);
	}

} //GorePackageImpl
