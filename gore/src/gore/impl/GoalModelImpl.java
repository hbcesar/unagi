/**
 */
package gore.impl;

import gore.Actor;
import gore.Configuration;
import gore.DifferentialRelation;
import gore.DomainAssumption;
import gore.GOREElement;
import gore.GoalModel;
import gore.GorePackage;
import gore.Hardgoal;
import gore.Parameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.GoalModelImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getRootGoal <em>Root Goal</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getDomainassumption <em>Domainassumption</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link gore.impl.GoalModelImpl#getInternalIDCounter <em>Internal ID Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalModelImpl extends MinimalEObjectImpl.Container implements GoalModel {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootGoal() <em>Root Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootGoal()
	 * @generated
	 * @ordered
	 */
	protected Hardgoal rootGoal;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<GOREElement> refinements;

	/**
	 * The cached value of the '{@link #getDomainassumption() <em>Domainassumption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainassumption()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAssumption> domainassumption;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferentialRelation> relations;

	/**
	 * The default value of the '{@link #getInternalIDCounter() <em>Internal ID Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalIDCounter()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("deprecation")
	protected static final Integer INTERNAL_ID_COUNTER_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getInternalIDCounter() <em>Internal ID Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalIDCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer internalIDCounter = INTERNAL_ID_COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GOAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardgoal getRootGoal() {
		if (rootGoal != null && rootGoal.eIsProxy()) {
			InternalEObject oldRootGoal = (InternalEObject)rootGoal;
			rootGoal = (Hardgoal)eResolveProxy(oldRootGoal);
			if (rootGoal != oldRootGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.GOAL_MODEL__ROOT_GOAL, oldRootGoal, rootGoal));
			}
		}
		return rootGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardgoal basicGetRootGoal() {
		return rootGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootGoal(Hardgoal newRootGoal, NotificationChain msgs) {
		Hardgoal oldRootGoal = rootGoal;
		rootGoal = newRootGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, oldRootGoal, newRootGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootGoal(Hardgoal newRootGoal) {
		if (newRootGoal != rootGoal) {
			NotificationChain msgs = null;
			if (rootGoal != null)
				msgs = ((InternalEObject)rootGoal).eInverseRemove(this, GorePackage.HARDGOAL__GOAL_MODEL, Hardgoal.class, msgs);
			if (newRootGoal != null)
				msgs = ((InternalEObject)newRootGoal).eInverseAdd(this, GorePackage.HARDGOAL__GOAL_MODEL, Hardgoal.class, msgs);
			msgs = basicSetRootGoal(newRootGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__ROOT_GOAL, newRootGoal, newRootGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOREElement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentEList<GOREElement>(GOREElement.class, this, GorePackage.GOAL_MODEL__REFINEMENTS);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAssumption> getDomainassumption() {
		if (domainassumption == null) {
			domainassumption = new EObjectContainmentEList<DomainAssumption>(DomainAssumption.class, this, GorePackage.GOAL_MODEL__DOMAINASSUMPTION);
		}
		return domainassumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, GorePackage.GOAL_MODEL__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GorePackage.GOAL_MODEL__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GorePackage.GOAL_MODEL__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, GorePackage.GOAL_MODEL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifferentialRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<DifferentialRelation>(DifferentialRelation.class, this, GorePackage.GOAL_MODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInternalIDCounter() {
		return internalIDCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalIDCounter(Integer newInternalIDCounter) {
		Integer oldInternalIDCounter = internalIDCounter;
		internalIDCounter = newInternalIDCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_MODEL__INTERNAL_ID_COUNTER, oldInternalIDCounter, internalIDCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelShortName() {
		return this.modelName.replaceAll(" ", "_").toLowerCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				if (rootGoal != null)
					msgs = ((InternalEObject)rootGoal).eInverseRemove(this, GorePackage.HARDGOAL__GOAL_MODEL, Hardgoal.class, msgs);
				return basicSetRootGoal((Hardgoal)otherEnd, msgs);
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
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				return basicSetRootGoal(null, msgs);
			case GorePackage.GOAL_MODEL__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_MODEL__DOMAINASSUMPTION:
				return ((InternalEList<?>)getDomainassumption()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_MODEL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_MODEL__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case GorePackage.GOAL_MODEL__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case GorePackage.GOAL_MODEL__MODEL_NAME:
				return getModelName();
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				if (resolve) return getRootGoal();
				return basicGetRootGoal();
			case GorePackage.GOAL_MODEL__REFINEMENTS:
				return getRefinements();
			case GorePackage.GOAL_MODEL__DOMAINASSUMPTION:
				return getDomainassumption();
			case GorePackage.GOAL_MODEL__ACTORS:
				return getActors();
			case GorePackage.GOAL_MODEL__CONFIGURATION:
				return getConfiguration();
			case GorePackage.GOAL_MODEL__PARAMETERS:
				return getParameters();
			case GorePackage.GOAL_MODEL__RELATIONS:
				return getRelations();
			case GorePackage.GOAL_MODEL__INTERNAL_ID_COUNTER:
				return getInternalIDCounter();
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
			case GorePackage.GOAL_MODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				setRootGoal((Hardgoal)newValue);
				return;
			case GorePackage.GOAL_MODEL__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends GOREElement>)newValue);
				return;
			case GorePackage.GOAL_MODEL__DOMAINASSUMPTION:
				getDomainassumption().clear();
				getDomainassumption().addAll((Collection<? extends DomainAssumption>)newValue);
				return;
			case GorePackage.GOAL_MODEL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case GorePackage.GOAL_MODEL__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case GorePackage.GOAL_MODEL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case GorePackage.GOAL_MODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends DifferentialRelation>)newValue);
				return;
			case GorePackage.GOAL_MODEL__INTERNAL_ID_COUNTER:
				setInternalIDCounter((Integer)newValue);
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
			case GorePackage.GOAL_MODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				setRootGoal((Hardgoal)null);
				return;
			case GorePackage.GOAL_MODEL__REFINEMENTS:
				getRefinements().clear();
				return;
			case GorePackage.GOAL_MODEL__DOMAINASSUMPTION:
				getDomainassumption().clear();
				return;
			case GorePackage.GOAL_MODEL__ACTORS:
				getActors().clear();
				return;
			case GorePackage.GOAL_MODEL__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case GorePackage.GOAL_MODEL__PARAMETERS:
				getParameters().clear();
				return;
			case GorePackage.GOAL_MODEL__RELATIONS:
				getRelations().clear();
				return;
			case GorePackage.GOAL_MODEL__INTERNAL_ID_COUNTER:
				setInternalIDCounter(INTERNAL_ID_COUNTER_EDEFAULT);
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
			case GorePackage.GOAL_MODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case GorePackage.GOAL_MODEL__ROOT_GOAL:
				return rootGoal != null;
			case GorePackage.GOAL_MODEL__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case GorePackage.GOAL_MODEL__DOMAINASSUMPTION:
				return domainassumption != null && !domainassumption.isEmpty();
			case GorePackage.GOAL_MODEL__ACTORS:
				return actors != null && !actors.isEmpty();
			case GorePackage.GOAL_MODEL__CONFIGURATION:
				return configuration != null;
			case GorePackage.GOAL_MODEL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case GorePackage.GOAL_MODEL__RELATIONS:
				return relations != null && !relations.isEmpty();
			case GorePackage.GOAL_MODEL__INTERNAL_ID_COUNTER:
				return INTERNAL_ID_COUNTER_EDEFAULT == null ? internalIDCounter != null : !INTERNAL_ID_COUNTER_EDEFAULT.equals(internalIDCounter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GorePackage.GOAL_MODEL___GET_MODEL_SHORT_NAME:
				return getModelShortName();
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", internalIDCounter: ");
		result.append(internalIDCounter);
		result.append(')');
		return result.toString();
	}

} //GoalModelImpl
