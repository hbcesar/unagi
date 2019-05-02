/**
 */
package gore.impl;

import eca.AdaptationStrategy;
import eca.EcaPackage;
import eca.ResolutionCondition;

import gore.AwReq;
import gore.GOREElement;
import gore.GorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.AwReqImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gore.impl.AwReqImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link gore.impl.AwReqImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwReqImpl extends GOREElementImpl implements AwReq {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected GOREElement target;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationStrategy> strategies;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected ResolutionCondition resolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.AW_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (GOREElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.AW_REQ__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOREElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(GOREElement newTarget, NotificationChain msgs) {
		GOREElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GOREElement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GorePackage.GORE_ELEMENT__AWREQS, GOREElement.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GorePackage.GORE_ELEMENT__AWREQS, GOREElement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentWithInverseEList<AdaptationStrategy>(AdaptationStrategy.class, this, GorePackage.AW_REQ__STRATEGIES, EcaPackage.ADAPTATION_STRATEGY__AWREQ);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionCondition getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolution(ResolutionCondition newResolution, NotificationChain msgs) {
		ResolutionCondition oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__RESOLUTION, oldResolution, newResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(ResolutionCondition newResolution) {
		if (newResolution != resolution) {
			NotificationChain msgs = null;
			if (resolution != null)
				msgs = ((InternalEObject)resolution).eInverseRemove(this, EcaPackage.RESOLUTION_CONDITION__AWREQ, ResolutionCondition.class, msgs);
			if (newResolution != null)
				msgs = ((InternalEObject)newResolution).eInverseAdd(this, EcaPackage.RESOLUTION_CONDITION__AWREQ, ResolutionCondition.class, msgs);
			msgs = basicSetResolution(newResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__RESOLUTION, newResolution, newResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "AR_" + this.name.replaceAll(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "AwReq";
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.AW_REQ__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GorePackage.GORE_ELEMENT__AWREQS, GOREElement.class, msgs);
				return basicSetTarget((GOREElement)otherEnd, msgs);
			case GorePackage.AW_REQ__STRATEGIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStrategies()).basicAdd(otherEnd, msgs);
			case GorePackage.AW_REQ__RESOLUTION:
				if (resolution != null)
					msgs = ((InternalEObject)resolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GorePackage.AW_REQ__RESOLUTION, null, msgs);
				return basicSetResolution((ResolutionCondition)otherEnd, msgs);
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
			case GorePackage.AW_REQ__TARGET:
				return basicSetTarget(null, msgs);
			case GorePackage.AW_REQ__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case GorePackage.AW_REQ__RESOLUTION:
				return basicSetResolution(null, msgs);
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
			case GorePackage.AW_REQ__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GorePackage.AW_REQ__STRATEGIES:
				return getStrategies();
			case GorePackage.AW_REQ__RESOLUTION:
				return getResolution();
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
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)newValue);
				return;
			case GorePackage.AW_REQ__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends AdaptationStrategy>)newValue);
				return;
			case GorePackage.AW_REQ__RESOLUTION:
				setResolution((ResolutionCondition)newValue);
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
			case GorePackage.AW_REQ__TARGET:
				setTarget((GOREElement)null);
				return;
			case GorePackage.AW_REQ__STRATEGIES:
				getStrategies().clear();
				return;
			case GorePackage.AW_REQ__RESOLUTION:
				setResolution((ResolutionCondition)null);
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
			case GorePackage.AW_REQ__TARGET:
				return target != null;
			case GorePackage.AW_REQ__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case GorePackage.AW_REQ__RESOLUTION:
				return resolution != null;
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
				case GorePackage.GORE_ELEMENT___GET_SHORT_NAME: return GorePackage.AW_REQ___GET_SHORT_NAME;
				case GorePackage.GORE_ELEMENT___GET_TYPE: return GorePackage.AW_REQ___GET_TYPE;
				case GorePackage.GORE_ELEMENT___GET_ALL_PARAMETERS: return GorePackage.AW_REQ___GET_ALL_PARAMETERS;
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
			case GorePackage.AW_REQ___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.AW_REQ___GET_TYPE:
				return getType();
			case GorePackage.AW_REQ___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AwReqImpl
