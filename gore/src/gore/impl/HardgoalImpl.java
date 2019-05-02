/**
 */
package gore.impl;

import gore.GOREElement;
import gore.GoalModel;
import gore.GorePackage;
import gore.Hardgoal;
import gore.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardgoal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.HardgoalImpl#getTask <em>Task</em>}</li>
 *   <li>{@link gore.impl.HardgoalImpl#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardgoalImpl extends PerformativeRequirementImpl implements Hardgoal {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getGoalModel() <em>Goal Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalModel()
	 * @generated
	 * @ordered
	 */
	protected GoalModel goalModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardgoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.HARDGOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, GorePackage.HARDGOAL__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel getGoalModel() {
		if (goalModel != null && goalModel.eIsProxy()) {
			InternalEObject oldGoalModel = (InternalEObject)goalModel;
			goalModel = (GoalModel)eResolveProxy(oldGoalModel);
			if (goalModel != oldGoalModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.HARDGOAL__GOAL_MODEL, oldGoalModel, goalModel));
			}
		}
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModel basicGetGoalModel() {
		return goalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalModel(GoalModel newGoalModel, NotificationChain msgs) {
		GoalModel oldGoalModel = goalModel;
		goalModel = newGoalModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.HARDGOAL__GOAL_MODEL, oldGoalModel, newGoalModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalModel(GoalModel newGoalModel) {
		if (newGoalModel != goalModel) {
			NotificationChain msgs = null;
			if (goalModel != null)
				msgs = ((InternalEObject)goalModel).eInverseRemove(this, GorePackage.GOAL_MODEL__ROOT_GOAL, GoalModel.class, msgs);
			if (newGoalModel != null)
				msgs = ((InternalEObject)newGoalModel).eInverseAdd(this, GorePackage.GOAL_MODEL__ROOT_GOAL, GoalModel.class, msgs);
			msgs = basicSetGoalModel(newGoalModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.HARDGOAL__GOAL_MODEL, newGoalModel, newGoalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "HG_" + this.name.replace(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "HardGoal";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		return "refinementType=\"" + this.getRefinementType().toString() + "\"";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.HARDGOAL__GOAL_MODEL:
				if (goalModel != null)
					msgs = ((InternalEObject)goalModel).eInverseRemove(this, GorePackage.GOAL_MODEL__ROOT_GOAL, GoalModel.class, msgs);
				return basicSetGoalModel((GoalModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.HARDGOAL__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case GorePackage.HARDGOAL__GOAL_MODEL:
				return basicSetGoalModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GorePackage.HARDGOAL__TASK:
				return getTask();
			case GorePackage.HARDGOAL__GOAL_MODEL:
				if (resolve) return getGoalModel();
				return basicGetGoalModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GorePackage.HARDGOAL__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case GorePackage.HARDGOAL__GOAL_MODEL:
				setGoalModel((GoalModel)newValue);
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
			case GorePackage.HARDGOAL__TASK:
				getTask().clear();
				return;
			case GorePackage.HARDGOAL__GOAL_MODEL:
				setGoalModel((GoalModel)null);
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
			case GorePackage.HARDGOAL__TASK:
				return task != null && !task.isEmpty();
			case GorePackage.HARDGOAL__GOAL_MODEL:
				return goalModel != null;
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
		if (baseClass == GOREElement.class) {
			switch (baseOperationID) {
				case GorePackage.GORE_ELEMENT___GET_SHORT_NAME: return GorePackage.HARDGOAL___GET_SHORT_NAME;
				case GorePackage.GORE_ELEMENT___GET_TYPE: return GorePackage.HARDGOAL___GET_TYPE;
				case GorePackage.GORE_ELEMENT___GET_ALL_PARAMETERS: return GorePackage.HARDGOAL___GET_ALL_PARAMETERS;
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
			case GorePackage.HARDGOAL___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.HARDGOAL___GET_TYPE:
				return getType();
			case GorePackage.HARDGOAL___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HardgoalImpl
