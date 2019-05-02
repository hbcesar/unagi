/**
 */
package gore.impl;

import gore.AwReq;
import gore.GOREElement;
import gore.GOREElementState;
import gore.GoalModel;
import gore.GorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GORE Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.GOREElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link gore.impl.GOREElementImpl#getTime <em>Time</em>}</li>
 *   <li>{@link gore.impl.GOREElementImpl#getState <em>State</em>}</li>
 *   <li>{@link gore.impl.GOREElementImpl#getAwreqs <em>Awreqs</em>}</li>
 *   <li>{@link gore.impl.GOREElementImpl#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GOREElementImpl extends MinimalEObjectImpl.Container implements GOREElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final GOREElementState STATE_EDEFAULT = GOREElementState.UNDEFINED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected GOREElementState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAwreqs() <em>Awreqs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwreqs()
	 * @generated
	 * @ordered
	 */
	protected EList<AwReq> awreqs;

	/**
	 * The default value of the '{@link #getInternalID() <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalID()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERNAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInternalID() <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalID()
	 * @generated
	 * @ordered
	 */
	protected int internalID = INTERNAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GOREElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GORE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElementState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(GOREElementState newState) {
		GOREElementState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AwReq> getAwreqs() {
		if (awreqs == null) {
			awreqs = new EObjectWithInverseResolvingEList<AwReq>(AwReq.class, this, GorePackage.GORE_ELEMENT__AWREQS, GorePackage.AW_REQ__TARGET);
		}
		return awreqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInternalID() {
		return internalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalID(int newInternalID) {
		int oldInternalID = internalID;
		internalID = newInternalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GORE_ELEMENT__INTERNAL_ID, oldInternalID, internalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return this.name.replaceAll(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "GOREElement";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateID(final GoalModel gm) {
		this.internalID = gm.getInternalIDCounter();
		gm.setInternalIDCounter(this.internalID + 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GORE_ELEMENT__AWREQS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAwreqs()).basicAdd(otherEnd, msgs);
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
			case GorePackage.GORE_ELEMENT__AWREQS:
				return ((InternalEList<?>)getAwreqs()).basicRemove(otherEnd, msgs);
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
			case GorePackage.GORE_ELEMENT__NAME:
				return getName();
			case GorePackage.GORE_ELEMENT__TIME:
				return getTime();
			case GorePackage.GORE_ELEMENT__STATE:
				return getState();
			case GorePackage.GORE_ELEMENT__AWREQS:
				return getAwreqs();
			case GorePackage.GORE_ELEMENT__INTERNAL_ID:
				return getInternalID();
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
			case GorePackage.GORE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case GorePackage.GORE_ELEMENT__TIME:
				setTime((Date)newValue);
				return;
			case GorePackage.GORE_ELEMENT__STATE:
				setState((GOREElementState)newValue);
				return;
			case GorePackage.GORE_ELEMENT__AWREQS:
				getAwreqs().clear();
				getAwreqs().addAll((Collection<? extends AwReq>)newValue);
				return;
			case GorePackage.GORE_ELEMENT__INTERNAL_ID:
				setInternalID((Integer)newValue);
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
			case GorePackage.GORE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GorePackage.GORE_ELEMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GorePackage.GORE_ELEMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GorePackage.GORE_ELEMENT__AWREQS:
				getAwreqs().clear();
				return;
			case GorePackage.GORE_ELEMENT__INTERNAL_ID:
				setInternalID(INTERNAL_ID_EDEFAULT);
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
			case GorePackage.GORE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GorePackage.GORE_ELEMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GorePackage.GORE_ELEMENT__STATE:
				return state != STATE_EDEFAULT;
			case GorePackage.GORE_ELEMENT__AWREQS:
				return awreqs != null && !awreqs.isEmpty();
			case GorePackage.GORE_ELEMENT__INTERNAL_ID:
				return internalID != INTERNAL_ID_EDEFAULT;
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
			case GorePackage.GORE_ELEMENT___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.GORE_ELEMENT___GET_TYPE:
				return getType();
			case GorePackage.GORE_ELEMENT___GET_ALL_PARAMETERS:
				return getAllParameters();
			case GorePackage.GORE_ELEMENT___GENERATE_ID__GOALMODEL:
				generateID((GoalModel)arguments.get(0));
				return null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", time: ");
		result.append(time);
		result.append(", state: ");
		result.append(state);
		result.append(", internalID: ");
		result.append(internalID);
		result.append(')');
		return result.toString();
	}

} //GOREElementImpl
