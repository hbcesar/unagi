/**
 */
package gore.util;

import gore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gore.GorePackage
 * @generated
 */
public class GoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GorePackage.eINSTANCE;
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
	protected GoreSwitch<Adapter> modelSwitch =
		new GoreSwitch<Adapter>() {
			@Override
			public Adapter caseGoalModel(GoalModel object) {
				return createGoalModelAdapter();
			}
			@Override
			public Adapter caseGOREElement(GOREElement object) {
				return createGOREElementAdapter();
			}
			@Override
			public Adapter caseGoalOrientedRequirement(GoalOrientedRequirement object) {
				return createGoalOrientedRequirementAdapter();
			}
			@Override
			public Adapter casePerformativeRequirement(PerformativeRequirement object) {
				return createPerformativeRequirementAdapter();
			}
			@Override
			public Adapter caseHardgoal(Hardgoal object) {
				return createHardgoalAdapter();
			}
			@Override
			public Adapter caseSoftgoal(Softgoal object) {
				return createSoftgoalAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseAwReq(AwReq object) {
				return createAwReqAdapter();
			}
			@Override
			public Adapter caseQualityConstraint(QualityConstraint object) {
				return createQualityConstraintAdapter();
			}
			@Override
			public Adapter caseDomainAssumption(DomainAssumption object) {
				return createDomainAssumptionAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseDifferentialRelation(DifferentialRelation object) {
				return createDifferentialRelationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link gore.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.GoalModel
	 * @generated
	 */
	public Adapter createGoalModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.GOREElement <em>GORE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.GOREElement
	 * @generated
	 */
	public Adapter createGOREElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.GoalOrientedRequirement <em>Goal Oriented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.GoalOrientedRequirement
	 * @generated
	 */
	public Adapter createGoalOrientedRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.PerformativeRequirement <em>Performative Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.PerformativeRequirement
	 * @generated
	 */
	public Adapter createPerformativeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Hardgoal <em>Hardgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Hardgoal
	 * @generated
	 */
	public Adapter createHardgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Softgoal
	 * @generated
	 */
	public Adapter createSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.AwReq <em>Aw Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.AwReq
	 * @generated
	 */
	public Adapter createAwReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.QualityConstraint <em>Quality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.QualityConstraint
	 * @generated
	 */
	public Adapter createQualityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.DomainAssumption <em>Domain Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.DomainAssumption
	 * @generated
	 */
	public Adapter createDomainAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.DifferentialRelation <em>Differential Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.DifferentialRelation
	 * @generated
	 */
	public Adapter createDifferentialRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gore.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gore.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
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

} //GoreAdapterFactory
