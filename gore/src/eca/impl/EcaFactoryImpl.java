/**
 */
package eca.impl;

import eca.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcaFactoryImpl extends EFactoryImpl implements EcaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcaFactory init() {
		try {
			EcaFactory theEcaFactory = (EcaFactory)EPackage.Registry.INSTANCE.getEFactory(EcaPackage.eNS_URI);
			if (theEcaFactory != null) {
				return theEcaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcaPackage.RESOLUTION_CONDITION: return createResolutionCondition();
			case EcaPackage.APPLICABILITY_CONDITION: return createApplicabilityCondition();
			case EcaPackage.ADAPTATION_STRATEGY: return createAdaptationStrategy();
			case EcaPackage.SIMPLE_RESOLUTION_CONDITION: return createSimpleResolutionCondition();
			case EcaPackage.AND_REFINED_RESOLUTION_CONDITION: return createAndRefinedResolutionCondition();
			case EcaPackage.OR_REFINED_RESOLUTION_CONDITION: return createOrRefinedResolutionCondition();
			case EcaPackage.SIMPLE_APPLICABILITY_CONDITION: return createSimpleApplicabilityCondition();
			case EcaPackage.MAX_EXECUTIONS_PER_SECTION_APPLICABILITY_CONDITION: return createMaxExecutionsPerSectionApplicabilityCondition();
			case EcaPackage.AND_REFINED_APPLICABILITY_CONDITION: return createAndRefinedApplicabilityCondition();
			case EcaPackage.OR_REFINED_APPLICABILITY_CONDITION: return createOrRefinedApplicabilityCondition();
			case EcaPackage.ABORT_STRATEGY: return createAbortStrategy();
			case EcaPackage.DELEGATE_STRATEGY: return createDelegateStrategy();
			case EcaPackage.RELAX_DISABLE_CHILD_STRATEGY: return createRelaxDisableChildStrategy();
			case EcaPackage.RELAX_REPLACE_CHILD_STRATEGY: return createRelaxReplaceChildStrategy();
			case EcaPackage.RETRY_STRATEGY: return createRetryStrategy();
			case EcaPackage.STRENGTHEN_ENABLE_CHILD_STRATEGY: return createStrengthenEnableChildStrategy();
			case EcaPackage.STRENGTHEN_REPLACE_CHILD_STRATEGY: return createStrengthenReplaceChildStrategy();
			case EcaPackage.WARNING_STRATEGY: return createWarningStrategy();
			case EcaPackage.RECONFIGURATION_APPLICABILITY_CONDITION: return createReconfigurationApplicabilityCondition();
			case EcaPackage.RECONFIGURATION_RESOLUTION_CONDITION: return createReconfigurationResolutionCondition();
			case EcaPackage.RECONFIGURATION_STRATEGY: return createReconfigurationStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionCondition createResolutionCondition() {
		ResolutionConditionImpl resolutionCondition = new ResolutionConditionImpl();
		return resolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityCondition createApplicabilityCondition() {
		ApplicabilityConditionImpl applicabilityCondition = new ApplicabilityConditionImpl();
		return applicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationStrategy createAdaptationStrategy() {
		AdaptationStrategyImpl adaptationStrategy = new AdaptationStrategyImpl();
		return adaptationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleResolutionCondition createSimpleResolutionCondition() {
		SimpleResolutionConditionImpl simpleResolutionCondition = new SimpleResolutionConditionImpl();
		return simpleResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRefinedResolutionCondition createAndRefinedResolutionCondition() {
		AndRefinedResolutionConditionImpl andRefinedResolutionCondition = new AndRefinedResolutionConditionImpl();
		return andRefinedResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRefinedResolutionCondition createOrRefinedResolutionCondition() {
		OrRefinedResolutionConditionImpl orRefinedResolutionCondition = new OrRefinedResolutionConditionImpl();
		return orRefinedResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleApplicabilityCondition createSimpleApplicabilityCondition() {
		SimpleApplicabilityConditionImpl simpleApplicabilityCondition = new SimpleApplicabilityConditionImpl();
		return simpleApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxExecutionsPerSectionApplicabilityCondition createMaxExecutionsPerSectionApplicabilityCondition() {
		MaxExecutionsPerSectionApplicabilityConditionImpl maxExecutionsPerSectionApplicabilityCondition = new MaxExecutionsPerSectionApplicabilityConditionImpl();
		return maxExecutionsPerSectionApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRefinedApplicabilityCondition createAndRefinedApplicabilityCondition() {
		AndRefinedApplicabilityConditionImpl andRefinedApplicabilityCondition = new AndRefinedApplicabilityConditionImpl();
		return andRefinedApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRefinedApplicabilityCondition createOrRefinedApplicabilityCondition() {
		OrRefinedApplicabilityConditionImpl orRefinedApplicabilityCondition = new OrRefinedApplicabilityConditionImpl();
		return orRefinedApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortStrategy createAbortStrategy() {
		AbortStrategyImpl abortStrategy = new AbortStrategyImpl();
		return abortStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateStrategy createDelegateStrategy() {
		DelegateStrategyImpl delegateStrategy = new DelegateStrategyImpl();
		return delegateStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxDisableChildStrategy createRelaxDisableChildStrategy() {
		RelaxDisableChildStrategyImpl relaxDisableChildStrategy = new RelaxDisableChildStrategyImpl();
		return relaxDisableChildStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxReplaceChildStrategy createRelaxReplaceChildStrategy() {
		RelaxReplaceChildStrategyImpl relaxReplaceChildStrategy = new RelaxReplaceChildStrategyImpl();
		return relaxReplaceChildStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryStrategy createRetryStrategy() {
		RetryStrategyImpl retryStrategy = new RetryStrategyImpl();
		return retryStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthenEnableChildStrategy createStrengthenEnableChildStrategy() {
		StrengthenEnableChildStrategyImpl strengthenEnableChildStrategy = new StrengthenEnableChildStrategyImpl();
		return strengthenEnableChildStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthenReplaceChildStrategy createStrengthenReplaceChildStrategy() {
		StrengthenReplaceChildStrategyImpl strengthenReplaceChildStrategy = new StrengthenReplaceChildStrategyImpl();
		return strengthenReplaceChildStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningStrategy createWarningStrategy() {
		WarningStrategyImpl warningStrategy = new WarningStrategyImpl();
		return warningStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationApplicabilityCondition createReconfigurationApplicabilityCondition() {
		ReconfigurationApplicabilityConditionImpl reconfigurationApplicabilityCondition = new ReconfigurationApplicabilityConditionImpl();
		return reconfigurationApplicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationResolutionCondition createReconfigurationResolutionCondition() {
		ReconfigurationResolutionConditionImpl reconfigurationResolutionCondition = new ReconfigurationResolutionConditionImpl();
		return reconfigurationResolutionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationStrategy createReconfigurationStrategy() {
		ReconfigurationStrategyImpl reconfigurationStrategy = new ReconfigurationStrategyImpl();
		return reconfigurationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaPackage getEcaPackage() {
		return (EcaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcaPackage getPackage() {
		return EcaPackage.eINSTANCE;
	}

} //EcaFactoryImpl
