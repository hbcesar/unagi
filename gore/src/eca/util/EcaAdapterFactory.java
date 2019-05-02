/**
 */
package eca.util;

import eca.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eca.EcaPackage
 * @generated
 */
public class EcaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcaSwitch<Adapter> modelSwitch =
		new EcaSwitch<Adapter>() {
			@Override
			public Adapter caseResolutionCondition(ResolutionCondition object) {
				return createResolutionConditionAdapter();
			}
			@Override
			public Adapter caseApplicabilityCondition(ApplicabilityCondition object) {
				return createApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseAdaptationStrategy(AdaptationStrategy object) {
				return createAdaptationStrategyAdapter();
			}
			@Override
			public Adapter caseSimpleResolutionCondition(SimpleResolutionCondition object) {
				return createSimpleResolutionConditionAdapter();
			}
			@Override
			public Adapter caseAndRefinedResolutionCondition(AndRefinedResolutionCondition object) {
				return createAndRefinedResolutionConditionAdapter();
			}
			@Override
			public Adapter caseOrRefinedResolutionCondition(OrRefinedResolutionCondition object) {
				return createOrRefinedResolutionConditionAdapter();
			}
			@Override
			public Adapter caseSimpleApplicabilityCondition(SimpleApplicabilityCondition object) {
				return createSimpleApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseMaxExecutionsPerSectionApplicabilityCondition(MaxExecutionsPerSectionApplicabilityCondition object) {
				return createMaxExecutionsPerSectionApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseAndRefinedApplicabilityCondition(AndRefinedApplicabilityCondition object) {
				return createAndRefinedApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseOrRefinedApplicabilityCondition(OrRefinedApplicabilityCondition object) {
				return createOrRefinedApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseAbortStrategy(AbortStrategy object) {
				return createAbortStrategyAdapter();
			}
			@Override
			public Adapter caseDelegateStrategy(DelegateStrategy object) {
				return createDelegateStrategyAdapter();
			}
			@Override
			public Adapter caseRelaxDisableChildStrategy(RelaxDisableChildStrategy object) {
				return createRelaxDisableChildStrategyAdapter();
			}
			@Override
			public Adapter caseRelaxReplaceChildStrategy(RelaxReplaceChildStrategy object) {
				return createRelaxReplaceChildStrategyAdapter();
			}
			@Override
			public Adapter caseRetryStrategy(RetryStrategy object) {
				return createRetryStrategyAdapter();
			}
			@Override
			public Adapter caseStrengthenEnableChildStrategy(StrengthenEnableChildStrategy object) {
				return createStrengthenEnableChildStrategyAdapter();
			}
			@Override
			public Adapter caseStrengthenReplaceChildStrategy(StrengthenReplaceChildStrategy object) {
				return createStrengthenReplaceChildStrategyAdapter();
			}
			@Override
			public Adapter caseWarningStrategy(WarningStrategy object) {
				return createWarningStrategyAdapter();
			}
			@Override
			public Adapter caseReconfigurationApplicabilityCondition(ReconfigurationApplicabilityCondition object) {
				return createReconfigurationApplicabilityConditionAdapter();
			}
			@Override
			public Adapter caseReconfigurationResolutionCondition(ReconfigurationResolutionCondition object) {
				return createReconfigurationResolutionConditionAdapter();
			}
			@Override
			public Adapter caseReconfigurationStrategy(ReconfigurationStrategy object) {
				return createReconfigurationStrategyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eca.ResolutionCondition <em>Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.ResolutionCondition
	 * @generated
	 */
	public Adapter createResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.ApplicabilityCondition <em>Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.ApplicabilityCondition
	 * @generated
	 */
	public Adapter createApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.AdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.AdaptationStrategy
	 * @generated
	 */
	public Adapter createAdaptationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.SimpleResolutionCondition <em>Simple Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.SimpleResolutionCondition
	 * @generated
	 */
	public Adapter createSimpleResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.AndRefinedResolutionCondition <em>And Refined Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.AndRefinedResolutionCondition
	 * @generated
	 */
	public Adapter createAndRefinedResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.OrRefinedResolutionCondition <em>Or Refined Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.OrRefinedResolutionCondition
	 * @generated
	 */
	public Adapter createOrRefinedResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.SimpleApplicabilityCondition <em>Simple Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.SimpleApplicabilityCondition
	 * @generated
	 */
	public Adapter createSimpleApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.MaxExecutionsPerSectionApplicabilityCondition <em>Max Executions Per Section Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.MaxExecutionsPerSectionApplicabilityCondition
	 * @generated
	 */
	public Adapter createMaxExecutionsPerSectionApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.AndRefinedApplicabilityCondition <em>And Refined Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.AndRefinedApplicabilityCondition
	 * @generated
	 */
	public Adapter createAndRefinedApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.OrRefinedApplicabilityCondition <em>Or Refined Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.OrRefinedApplicabilityCondition
	 * @generated
	 */
	public Adapter createOrRefinedApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.AbortStrategy <em>Abort Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.AbortStrategy
	 * @generated
	 */
	public Adapter createAbortStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.DelegateStrategy <em>Delegate Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.DelegateStrategy
	 * @generated
	 */
	public Adapter createDelegateStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.RelaxDisableChildStrategy <em>Relax Disable Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.RelaxDisableChildStrategy
	 * @generated
	 */
	public Adapter createRelaxDisableChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.RelaxReplaceChildStrategy <em>Relax Replace Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.RelaxReplaceChildStrategy
	 * @generated
	 */
	public Adapter createRelaxReplaceChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.RetryStrategy <em>Retry Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.RetryStrategy
	 * @generated
	 */
	public Adapter createRetryStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.StrengthenEnableChildStrategy <em>Strengthen Enable Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.StrengthenEnableChildStrategy
	 * @generated
	 */
	public Adapter createStrengthenEnableChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.StrengthenReplaceChildStrategy <em>Strengthen Replace Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.StrengthenReplaceChildStrategy
	 * @generated
	 */
	public Adapter createStrengthenReplaceChildStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.WarningStrategy <em>Warning Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.WarningStrategy
	 * @generated
	 */
	public Adapter createWarningStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.ReconfigurationApplicabilityCondition <em>Reconfiguration Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.ReconfigurationApplicabilityCondition
	 * @generated
	 */
	public Adapter createReconfigurationApplicabilityConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.ReconfigurationResolutionCondition <em>Reconfiguration Resolution Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.ReconfigurationResolutionCondition
	 * @generated
	 */
	public Adapter createReconfigurationResolutionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eca.ReconfigurationStrategy <em>Reconfiguration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eca.ReconfigurationStrategy
	 * @generated
	 */
	public Adapter createReconfigurationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcaAdapterFactory
