/**
 */
package eca.impl;

import eca.AbortStrategy;
import eca.AdaptationStrategy;
import eca.AndRefinedApplicabilityCondition;
import eca.AndRefinedResolutionCondition;
import eca.ApplicabilityCondition;
import eca.DelegateStrategy;
import eca.EcaFactory;
import eca.EcaPackage;
import eca.MaxExecutionsPerSectionApplicabilityCondition;
import eca.OrRefinedApplicabilityCondition;
import eca.OrRefinedResolutionCondition;
import eca.ReconfigurationApplicabilityCondition;
import eca.ReconfigurationResolutionCondition;
import eca.ReconfigurationStrategy;
import eca.RelaxDisableChildStrategy;
import eca.RelaxReplaceChildStrategy;
import eca.ResolutionCondition;
import eca.RetryStrategy;
import eca.SimpleApplicabilityCondition;
import eca.SimpleResolutionCondition;
import eca.StrengthenEnableChildStrategy;
import eca.StrengthenReplaceChildStrategy;
import eca.WarningStrategy;

import gore.GorePackage;

import gore.impl.GorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class EcaPackageImpl extends EPackageImpl implements EcaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andRefinedResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRefinedResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxExecutionsPerSectionApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andRefinedApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRefinedApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxDisableChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxReplaceChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthenEnableChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthenReplaceChildStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warningStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationApplicabilityConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationResolutionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationStrategyEClass = null;

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
	 * @see eca.EcaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcaPackageImpl() {
		super(eNS_URI, EcaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcaPackage init() {
		if (isInited) return (EcaPackage)EPackage.Registry.INSTANCE.getEPackage(EcaPackage.eNS_URI);

		// Obtain or create and register package
		EcaPackageImpl theEcaPackage = (EcaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GorePackageImpl theGorePackage = (GorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) instanceof GorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI) : GorePackage.eINSTANCE);

		// Create package meta-data objects
		theEcaPackage.createPackageContents();
		theGorePackage.createPackageContents();

		// Initialize created meta-data
		theEcaPackage.initializePackageContents();
		theGorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcaPackage.eNS_URI, theEcaPackage);
		return theEcaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionCondition() {
		return resolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionCondition_Name() {
		return (EAttribute)resolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionCondition_Awreq() {
		return (EReference)resolutionConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionCondition_InternalID() {
		return (EAttribute)resolutionConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResolutionCondition__GetAllParameters() {
		return resolutionConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResolutionCondition__GenerateID__GoalModel() {
		return resolutionConditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicabilityCondition() {
		return applicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicabilityCondition_Name() {
		return (EAttribute)applicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicabilityCondition_Strategy() {
		return (EReference)applicabilityConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicabilityCondition_InternalID() {
		return (EAttribute)applicabilityConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicabilityCondition__GetAllParameters() {
		return applicabilityConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicabilityCondition__GenerateID__GoalModel() {
		return applicabilityConditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationStrategy() {
		return adaptationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_Awreq() {
		return (EReference)adaptationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationStrategy_Name() {
		return (EAttribute)adaptationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_Applicabilities() {
		return (EReference)adaptationStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationStrategy_InternalID() {
		return (EAttribute)adaptationStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdaptationStrategy__GetAllParameters() {
		return adaptationStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdaptationStrategy__GenerateID__GoalModel() {
		return adaptationStrategyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleResolutionCondition() {
		return simpleResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndRefinedResolutionCondition() {
		return andRefinedResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndRefinedResolutionCondition_Children() {
		return (EReference)andRefinedResolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAndRefinedResolutionCondition__GetAllParameters() {
		return andRefinedResolutionConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRefinedResolutionCondition() {
		return orRefinedResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrRefinedResolutionCondition_Children() {
		return (EReference)orRefinedResolutionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrRefinedResolutionCondition__GetAllParameters() {
		return orRefinedResolutionConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleApplicabilityCondition() {
		return simpleApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxExecutionsPerSectionApplicabilityCondition() {
		return maxExecutionsPerSectionApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxExecutionsPerSectionApplicabilityCondition_MaxExecutions() {
		return (EAttribute)maxExecutionsPerSectionApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxExecutionsPerSectionApplicabilityCondition__GetAllParameters() {
		return maxExecutionsPerSectionApplicabilityConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndRefinedApplicabilityCondition() {
		return andRefinedApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndRefinedApplicabilityCondition_Children() {
		return (EReference)andRefinedApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAndRefinedApplicabilityCondition__GetAllParameters() {
		return andRefinedApplicabilityConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRefinedApplicabilityCondition() {
		return orRefinedApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrRefinedApplicabilityCondition_Children() {
		return (EReference)orRefinedApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrRefinedApplicabilityCondition__GetAllParameters() {
		return orRefinedApplicabilityConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbortStrategy() {
		return abortStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegateStrategy() {
		return delegateStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegateStrategy_Actor() {
		return (EReference)delegateStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaxDisableChildStrategy() {
		return relaxDisableChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxDisableChildStrategy_Level() {
		return (EAttribute)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxDisableChildStrategy_Requirement() {
		return (EReference)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxDisableChildStrategy_Child() {
		return (EReference)relaxDisableChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelaxDisableChildStrategy__GetAllParameters() {
		return relaxDisableChildStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaxReplaceChildStrategy() {
		return relaxReplaceChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxReplaceChildStrategy_Requirement() {
		return (EReference)relaxReplaceChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxReplaceChildStrategy_NewRequirement() {
		return (EReference)relaxReplaceChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxReplaceChildStrategy_Level() {
		return (EAttribute)relaxReplaceChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelaxReplaceChildStrategy_Copy() {
		return (EAttribute)relaxReplaceChildStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelaxReplaceChildStrategy__GetAllParameters() {
		return relaxReplaceChildStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryStrategy() {
		return retryStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryStrategy_Copy() {
		return (EAttribute)retryStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryStrategy_Time() {
		return (EAttribute)retryStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRetryStrategy__GetAllParameters() {
		return retryStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrengthenEnableChildStrategy() {
		return strengthenEnableChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenEnableChildStrategy_Requirement() {
		return (EReference)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenEnableChildStrategy_Child() {
		return (EReference)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenEnableChildStrategy_Level() {
		return (EAttribute)strengthenEnableChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrengthenEnableChildStrategy__GetAllParameters() {
		return strengthenEnableChildStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrengthenReplaceChildStrategy() {
		return strengthenReplaceChildStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenReplaceChildStrategy_Requirement() {
		return (EReference)strengthenReplaceChildStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrengthenReplaceChildStrategy_NewRequirement() {
		return (EReference)strengthenReplaceChildStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenReplaceChildStrategy_Level() {
		return (EAttribute)strengthenReplaceChildStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrengthenReplaceChildStrategy_Copy() {
		return (EAttribute)strengthenReplaceChildStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrengthenReplaceChildStrategy__GetAllParameters() {
		return strengthenReplaceChildStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarningStrategy() {
		return warningStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWarningStrategy_Actor() {
		return (EReference)warningStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWarningStrategy__GetAllParameters() {
		return warningStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationApplicabilityCondition() {
		return reconfigurationApplicabilityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationApplicabilityCondition_WrappedCondition() {
		return (EReference)reconfigurationApplicabilityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReconfigurationApplicabilityCondition__GetAllParameters() {
		return reconfigurationApplicabilityConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationResolutionCondition() {
		return reconfigurationResolutionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationStrategy() {
		return reconfigurationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_Level() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_AlgorithmId() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationStrategy_ProcedureIds() {
		return (EAttribute)reconfigurationStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReconfigurationStrategy__GetAllParameters() {
		return reconfigurationStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaFactory getEcaFactory() {
		return (EcaFactory)getEFactoryInstance();
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
		resolutionConditionEClass = createEClass(RESOLUTION_CONDITION);
		createEAttribute(resolutionConditionEClass, RESOLUTION_CONDITION__NAME);
		createEReference(resolutionConditionEClass, RESOLUTION_CONDITION__AWREQ);
		createEAttribute(resolutionConditionEClass, RESOLUTION_CONDITION__INTERNAL_ID);
		createEOperation(resolutionConditionEClass, RESOLUTION_CONDITION___GET_ALL_PARAMETERS);
		createEOperation(resolutionConditionEClass, RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL);

		applicabilityConditionEClass = createEClass(APPLICABILITY_CONDITION);
		createEAttribute(applicabilityConditionEClass, APPLICABILITY_CONDITION__NAME);
		createEReference(applicabilityConditionEClass, APPLICABILITY_CONDITION__STRATEGY);
		createEAttribute(applicabilityConditionEClass, APPLICABILITY_CONDITION__INTERNAL_ID);
		createEOperation(applicabilityConditionEClass, APPLICABILITY_CONDITION___GET_ALL_PARAMETERS);
		createEOperation(applicabilityConditionEClass, APPLICABILITY_CONDITION___GENERATE_ID__GOALMODEL);

		adaptationStrategyEClass = createEClass(ADAPTATION_STRATEGY);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__AWREQ);
		createEAttribute(adaptationStrategyEClass, ADAPTATION_STRATEGY__NAME);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__APPLICABILITIES);
		createEAttribute(adaptationStrategyEClass, ADAPTATION_STRATEGY__INTERNAL_ID);
		createEOperation(adaptationStrategyEClass, ADAPTATION_STRATEGY___GET_ALL_PARAMETERS);
		createEOperation(adaptationStrategyEClass, ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL);

		simpleResolutionConditionEClass = createEClass(SIMPLE_RESOLUTION_CONDITION);

		andRefinedResolutionConditionEClass = createEClass(AND_REFINED_RESOLUTION_CONDITION);
		createEReference(andRefinedResolutionConditionEClass, AND_REFINED_RESOLUTION_CONDITION__CHILDREN);
		createEOperation(andRefinedResolutionConditionEClass, AND_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS);

		orRefinedResolutionConditionEClass = createEClass(OR_REFINED_RESOLUTION_CONDITION);
		createEReference(orRefinedResolutionConditionEClass, OR_REFINED_RESOLUTION_CONDITION__CHILDREN);
		createEOperation(orRefinedResolutionConditionEClass, OR_REFINED_RESOLUTION_CONDITION___GET_ALL_PARAMETERS);

		simpleApplicabilityConditionEClass = createEClass(SIMPLE_APPLICABILITY_CONDITION);

		maxExecutionsPerSectionApplicabilityConditionEClass = createEClass(MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION);
		createEAttribute(maxExecutionsPerSectionApplicabilityConditionEClass, MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION__MAX_EXECUTIONS);
		createEOperation(maxExecutionsPerSectionApplicabilityConditionEClass, MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS);

		andRefinedApplicabilityConditionEClass = createEClass(AND_REFINED_APPLICABILITY_CONDITION);
		createEReference(andRefinedApplicabilityConditionEClass, AND_REFINED_APPLICABILITY_CONDITION__CHILDREN);
		createEOperation(andRefinedApplicabilityConditionEClass, AND_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS);

		orRefinedApplicabilityConditionEClass = createEClass(OR_REFINED_APPLICABILITY_CONDITION);
		createEReference(orRefinedApplicabilityConditionEClass, OR_REFINED_APPLICABILITY_CONDITION__CHILDREN);
		createEOperation(orRefinedApplicabilityConditionEClass, OR_REFINED_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS);

		abortStrategyEClass = createEClass(ABORT_STRATEGY);

		delegateStrategyEClass = createEClass(DELEGATE_STRATEGY);
		createEReference(delegateStrategyEClass, DELEGATE_STRATEGY__ACTOR);

		relaxDisableChildStrategyEClass = createEClass(RELAX_DISABLE_CHILD_STRATEGY);
		createEAttribute(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__LEVEL);
		createEReference(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__REQUIREMENT);
		createEReference(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY__CHILD);
		createEOperation(relaxDisableChildStrategyEClass, RELAX_DISABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS);

		relaxReplaceChildStrategyEClass = createEClass(RELAX_REPLACE_CHILD_STRATEGY);
		createEReference(relaxReplaceChildStrategyEClass, RELAX_REPLACE_CHILD_STRATEGY__REQUIREMENT);
		createEReference(relaxReplaceChildStrategyEClass, RELAX_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT);
		createEAttribute(relaxReplaceChildStrategyEClass, RELAX_REPLACE_CHILD_STRATEGY__LEVEL);
		createEAttribute(relaxReplaceChildStrategyEClass, RELAX_REPLACE_CHILD_STRATEGY__COPY);
		createEOperation(relaxReplaceChildStrategyEClass, RELAX_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS);

		retryStrategyEClass = createEClass(RETRY_STRATEGY);
		createEAttribute(retryStrategyEClass, RETRY_STRATEGY__COPY);
		createEAttribute(retryStrategyEClass, RETRY_STRATEGY__TIME);
		createEOperation(retryStrategyEClass, RETRY_STRATEGY___GET_ALL_PARAMETERS);

		strengthenEnableChildStrategyEClass = createEClass(STRENGTHEN_ENABLE_CHILD_STRATEGY);
		createEReference(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__REQUIREMENT);
		createEReference(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__CHILD);
		createEAttribute(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY__LEVEL);
		createEOperation(strengthenEnableChildStrategyEClass, STRENGTHEN_ENABLE_CHILD_STRATEGY___GET_ALL_PARAMETERS);

		strengthenReplaceChildStrategyEClass = createEClass(STRENGTHEN_REPLACE_CHILD_STRATEGY);
		createEReference(strengthenReplaceChildStrategyEClass, STRENGTHEN_REPLACE_CHILD_STRATEGY__REQUIREMENT);
		createEReference(strengthenReplaceChildStrategyEClass, STRENGTHEN_REPLACE_CHILD_STRATEGY__NEW_REQUIREMENT);
		createEAttribute(strengthenReplaceChildStrategyEClass, STRENGTHEN_REPLACE_CHILD_STRATEGY__LEVEL);
		createEAttribute(strengthenReplaceChildStrategyEClass, STRENGTHEN_REPLACE_CHILD_STRATEGY__COPY);
		createEOperation(strengthenReplaceChildStrategyEClass, STRENGTHEN_REPLACE_CHILD_STRATEGY___GET_ALL_PARAMETERS);

		warningStrategyEClass = createEClass(WARNING_STRATEGY);
		createEReference(warningStrategyEClass, WARNING_STRATEGY__ACTOR);
		createEOperation(warningStrategyEClass, WARNING_STRATEGY___GET_ALL_PARAMETERS);

		reconfigurationApplicabilityConditionEClass = createEClass(RECONFIGURATION_APPLICABILITY_CONDITION);
		createEReference(reconfigurationApplicabilityConditionEClass, RECONFIGURATION_APPLICABILITY_CONDITION__WRAPPED_CONDITION);
		createEOperation(reconfigurationApplicabilityConditionEClass, RECONFIGURATION_APPLICABILITY_CONDITION___GET_ALL_PARAMETERS);

		reconfigurationResolutionConditionEClass = createEClass(RECONFIGURATION_RESOLUTION_CONDITION);

		reconfigurationStrategyEClass = createEClass(RECONFIGURATION_STRATEGY);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__LEVEL);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__ALGORITHM_ID);
		createEAttribute(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY__PROCEDURE_IDS);
		createEOperation(reconfigurationStrategyEClass, RECONFIGURATION_STRATEGY___GET_ALL_PARAMETERS);
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
		GorePackage theGorePackage = (GorePackage)EPackage.Registry.INSTANCE.getEPackage(GorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		andRefinedResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		orRefinedResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		simpleApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		maxExecutionsPerSectionApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		andRefinedApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		orRefinedApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		abortStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		delegateStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		relaxDisableChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		relaxReplaceChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		retryStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		strengthenEnableChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		strengthenReplaceChildStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		warningStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());
		reconfigurationApplicabilityConditionEClass.getESuperTypes().add(this.getApplicabilityCondition());
		reconfigurationResolutionConditionEClass.getESuperTypes().add(this.getResolutionCondition());
		reconfigurationStrategyEClass.getESuperTypes().add(this.getAdaptationStrategy());

		// Initialize classes, features, and operations; add parameters
		initEClass(resolutionConditionEClass, ResolutionCondition.class, "ResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolutionCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionCondition_Awreq(), theGorePackage.getAwReq(), theGorePackage.getAwReq_Resolution(), "awreq", null, 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolutionCondition_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, ResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResolutionCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getResolutionCondition__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGorePackage.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicabilityConditionEClass, ApplicabilityCondition.class, "ApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicabilityCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicabilityCondition_Strategy(), this.getAdaptationStrategy(), this.getAdaptationStrategy_Applicabilities(), "strategy", null, 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicabilityCondition_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, ApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplicabilityCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplicabilityCondition__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGorePackage.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adaptationStrategyEClass, AdaptationStrategy.class, "AdaptationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationStrategy_Awreq(), theGorePackage.getAwReq(), theGorePackage.getAwReq_Strategies(), "awreq", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationStrategy_Applicabilities(), this.getApplicabilityCondition(), this.getApplicabilityCondition_Strategy(), "applicabilities", null, 0, -1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationStrategy_InternalID(), ecorePackage.getEInt(), "internalID", null, 0, 1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdaptationStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAdaptationStrategy__GenerateID__GoalModel(), null, "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGorePackage.getGoalModel(), "gm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleResolutionConditionEClass, SimpleResolutionCondition.class, "SimpleResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andRefinedResolutionConditionEClass, AndRefinedResolutionCondition.class, "AndRefinedResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRefinedResolutionCondition_Children(), this.getResolutionCondition(), null, "children", null, 0, -1, AndRefinedResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAndRefinedResolutionCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orRefinedResolutionConditionEClass, OrRefinedResolutionCondition.class, "OrRefinedResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrRefinedResolutionCondition_Children(), this.getResolutionCondition(), null, "children", null, 0, -1, OrRefinedResolutionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrRefinedResolutionCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleApplicabilityConditionEClass, SimpleApplicabilityCondition.class, "SimpleApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxExecutionsPerSectionApplicabilityConditionEClass, MaxExecutionsPerSectionApplicabilityCondition.class, "MaxExecutionsPerSectionApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxExecutionsPerSectionApplicabilityCondition_MaxExecutions(), ecorePackage.getEInt(), "maxExecutions", null, 0, 1, MaxExecutionsPerSectionApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMaxExecutionsPerSectionApplicabilityCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(andRefinedApplicabilityConditionEClass, AndRefinedApplicabilityCondition.class, "AndRefinedApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRefinedApplicabilityCondition_Children(), this.getApplicabilityCondition(), null, "children", null, 0, -1, AndRefinedApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAndRefinedApplicabilityCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orRefinedApplicabilityConditionEClass, OrRefinedApplicabilityCondition.class, "OrRefinedApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrRefinedApplicabilityCondition_Children(), this.getApplicabilityCondition(), null, "children", null, 0, -1, OrRefinedApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrRefinedApplicabilityCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abortStrategyEClass, AbortStrategy.class, "AbortStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegateStrategyEClass, DelegateStrategy.class, "DelegateStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegateStrategy_Actor(), theGorePackage.getActor(), null, "actor", null, 0, 1, DelegateStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relaxDisableChildStrategyEClass, RelaxDisableChildStrategy.class, "RelaxDisableChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelaxDisableChildStrategy_Level(), theGorePackage.getAgregationLevel(), "level", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxDisableChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxDisableChildStrategy_Child(), theGorePackage.getGOREElement(), null, "child", null, 0, 1, RelaxDisableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRelaxDisableChildStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relaxReplaceChildStrategyEClass, RelaxReplaceChildStrategy.class, "RelaxReplaceChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelaxReplaceChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, RelaxReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxReplaceChildStrategy_NewRequirement(), theGorePackage.getGOREElement(), null, "newRequirement", null, 0, 1, RelaxReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelaxReplaceChildStrategy_Level(), theGorePackage.getAgregationLevel(), "level", null, 0, 1, RelaxReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelaxReplaceChildStrategy_Copy(), ecorePackage.getEBoolean(), "copy", null, 0, 1, RelaxReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRelaxReplaceChildStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(retryStrategyEClass, RetryStrategy.class, "RetryStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryStrategy_Copy(), ecorePackage.getEBoolean(), "copy", null, 0, 1, RetryStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryStrategy_Time(), ecorePackage.getELong(), "time", null, 0, 1, RetryStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRetryStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strengthenEnableChildStrategyEClass, StrengthenEnableChildStrategy.class, "StrengthenEnableChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrengthenEnableChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrengthenEnableChildStrategy_Child(), theGorePackage.getGOREElement(), null, "child", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenEnableChildStrategy_Level(), theGorePackage.getAgregationLevel(), "level", null, 0, 1, StrengthenEnableChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStrengthenEnableChildStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strengthenReplaceChildStrategyEClass, StrengthenReplaceChildStrategy.class, "StrengthenReplaceChildStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrengthenReplaceChildStrategy_Requirement(), theGorePackage.getGOREElement(), null, "requirement", null, 0, 1, StrengthenReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrengthenReplaceChildStrategy_NewRequirement(), theGorePackage.getGOREElement(), null, "newRequirement", null, 0, 1, StrengthenReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenReplaceChildStrategy_Level(), theGorePackage.getAgregationLevel(), "level", null, 0, 1, StrengthenReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrengthenReplaceChildStrategy_Copy(), ecorePackage.getEBoolean(), "copy", null, 0, 1, StrengthenReplaceChildStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStrengthenReplaceChildStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(warningStrategyEClass, WarningStrategy.class, "WarningStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWarningStrategy_Actor(), theGorePackage.getActor(), null, "actor", null, 0, 1, WarningStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWarningStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reconfigurationApplicabilityConditionEClass, ReconfigurationApplicabilityCondition.class, "ReconfigurationApplicabilityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationApplicabilityCondition_WrappedCondition(), this.getApplicabilityCondition(), null, "wrappedCondition", null, 0, 1, ReconfigurationApplicabilityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReconfigurationApplicabilityCondition__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reconfigurationResolutionConditionEClass, ReconfigurationResolutionCondition.class, "ReconfigurationResolutionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationStrategyEClass, ReconfigurationStrategy.class, "ReconfigurationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationStrategy_Level(), theGorePackage.getAgregationLevel(), "level", null, 0, 1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationStrategy_AlgorithmId(), ecorePackage.getEString(), "algorithmId", null, 0, 1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationStrategy_ProcedureIds(), ecorePackage.getEString(), "procedureIds", null, 0, -1, ReconfigurationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReconfigurationStrategy__GetAllParameters(), ecorePackage.getEString(), "getAllParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcaPackageImpl
