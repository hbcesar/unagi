/**
 */
package eca.impl;

import eca.EcaPackage;
import eca.ResolutionCondition;

import gore.AwReq;
import gore.GoalModel;
import gore.GorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.ResolutionConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eca.impl.ResolutionConditionImpl#getAwreq <em>Awreq</em>}</li>
 *   <li>{@link eca.impl.ResolutionConditionImpl#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionConditionImpl extends MinimalEObjectImpl.Container implements ResolutionCondition {
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
	protected ResolutionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RESOLUTION_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RESOLUTION_CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwReq getAwreq() {
		if (eContainerFeatureID() != EcaPackage.RESOLUTION_CONDITION__AWREQ) return null;
		return (AwReq)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwreq(AwReq newAwreq, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAwreq, EcaPackage.RESOLUTION_CONDITION__AWREQ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwreq(AwReq newAwreq) {
		if (newAwreq != eInternalContainer() || (eContainerFeatureID() != EcaPackage.RESOLUTION_CONDITION__AWREQ && newAwreq != null)) {
			if (EcoreUtil.isAncestor(this, newAwreq))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAwreq != null)
				msgs = ((InternalEObject)newAwreq).eInverseAdd(this, GorePackage.AW_REQ__RESOLUTION, AwReq.class, msgs);
			msgs = basicSetAwreq(newAwreq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RESOLUTION_CONDITION__AWREQ, newAwreq, newAwreq));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RESOLUTION_CONDITION__INTERNAL_ID, oldInternalID, internalID));
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
	public void generateID(GoalModel gm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAwreq((AwReq)otherEnd, msgs);
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
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				return basicSetAwreq(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				return eInternalContainer().eInverseRemove(this, GorePackage.AW_REQ__RESOLUTION, AwReq.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__NAME:
				return getName();
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				return getAwreq();
			case EcaPackage.RESOLUTION_CONDITION__INTERNAL_ID:
				return getInternalID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcaPackage.RESOLUTION_CONDITION__NAME:
				setName((String)newValue);
				return;
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				setAwreq((AwReq)newValue);
				return;
			case EcaPackage.RESOLUTION_CONDITION__INTERNAL_ID:
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
			case EcaPackage.RESOLUTION_CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				setAwreq((AwReq)null);
				return;
			case EcaPackage.RESOLUTION_CONDITION__INTERNAL_ID:
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
			case EcaPackage.RESOLUTION_CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcaPackage.RESOLUTION_CONDITION__AWREQ:
				return getAwreq() != null;
			case EcaPackage.RESOLUTION_CONDITION__INTERNAL_ID:
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
			case EcaPackage.RESOLUTION_CONDITION___GET_ALL_PARAMETERS:
				return getAllParameters();
			case EcaPackage.RESOLUTION_CONDITION___GENERATE_ID__GOALMODEL:
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
		result.append(", internalID: ");
		result.append(internalID);
		result.append(')');
		return result.toString();
	}

} //ResolutionConditionImpl
