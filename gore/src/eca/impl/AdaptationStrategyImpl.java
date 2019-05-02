/**
 */
package eca.impl;

import eca.AdaptationStrategy;
import eca.ApplicabilityCondition;
import eca.EcaPackage;

import gore.AwReq;
import gore.GoalModel;
import gore.GorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.AdaptationStrategyImpl#getAwreq <em>Awreq</em>}</li>
 *   <li>{@link eca.impl.AdaptationStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link eca.impl.AdaptationStrategyImpl#getApplicabilities <em>Applicabilities</em>}</li>
 *   <li>{@link eca.impl.AdaptationStrategyImpl#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationStrategyImpl extends MinimalEObjectImpl.Container implements AdaptationStrategy {
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
	 * The cached value of the '{@link #getApplicabilities() <em>Applicabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicabilityCondition> applicabilities;

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
	protected AdaptationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.ADAPTATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwReq getAwreq() {
		if (eContainerFeatureID() != EcaPackage.ADAPTATION_STRATEGY__AWREQ) return null;
		return (AwReq)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwreq(AwReq newAwreq, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAwreq, EcaPackage.ADAPTATION_STRATEGY__AWREQ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwreq(AwReq newAwreq) {
		if (newAwreq != eInternalContainer() || (eContainerFeatureID() != EcaPackage.ADAPTATION_STRATEGY__AWREQ && newAwreq != null)) {
			if (EcoreUtil.isAncestor(this, newAwreq))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAwreq != null)
				msgs = ((InternalEObject)newAwreq).eInverseAdd(this, GorePackage.AW_REQ__STRATEGIES, AwReq.class, msgs);
			msgs = basicSetAwreq(newAwreq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__AWREQ, newAwreq, newAwreq));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicabilityCondition> getApplicabilities() {
		if (applicabilities == null) {
			applicabilities = new EObjectContainmentWithInverseEList<ApplicabilityCondition>(ApplicabilityCondition.class, this, EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES, EcaPackage.APPLICABILITY_CONDITION__STRATEGY);
		}
		return applicabilities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.ADAPTATION_STRATEGY__INTERNAL_ID, oldInternalID, internalID));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAwreq((AwReq)otherEnd, msgs);
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplicabilities()).basicAdd(otherEnd, msgs);
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				return basicSetAwreq(null, msgs);
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				return ((InternalEList<?>)getApplicabilities()).basicRemove(otherEnd, msgs);
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				return eInternalContainer().eInverseRemove(this, GorePackage.AW_REQ__STRATEGIES, AwReq.class, msgs);
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				return getAwreq();
			case EcaPackage.ADAPTATION_STRATEGY__NAME:
				return getName();
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				return getApplicabilities();
			case EcaPackage.ADAPTATION_STRATEGY__INTERNAL_ID:
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				setAwreq((AwReq)newValue);
				return;
			case EcaPackage.ADAPTATION_STRATEGY__NAME:
				setName((String)newValue);
				return;
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				getApplicabilities().clear();
				getApplicabilities().addAll((Collection<? extends ApplicabilityCondition>)newValue);
				return;
			case EcaPackage.ADAPTATION_STRATEGY__INTERNAL_ID:
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				setAwreq((AwReq)null);
				return;
			case EcaPackage.ADAPTATION_STRATEGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				getApplicabilities().clear();
				return;
			case EcaPackage.ADAPTATION_STRATEGY__INTERNAL_ID:
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
			case EcaPackage.ADAPTATION_STRATEGY__AWREQ:
				return getAwreq() != null;
			case EcaPackage.ADAPTATION_STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcaPackage.ADAPTATION_STRATEGY__APPLICABILITIES:
				return applicabilities != null && !applicabilities.isEmpty();
			case EcaPackage.ADAPTATION_STRATEGY__INTERNAL_ID:
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
			case EcaPackage.ADAPTATION_STRATEGY___GET_ALL_PARAMETERS:
				return getAllParameters();
			case EcaPackage.ADAPTATION_STRATEGY___GENERATE_ID__GOALMODEL:
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

} //AdaptationStrategyImpl
