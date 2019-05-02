/**
 */
package gore.impl;

import gore.GOREElement;
import gore.GorePackage;
import gore.QualityConstraint;
import gore.Softgoal;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.QualityConstraintImpl#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityConstraintImpl extends GOREElementImpl implements QualityConstraint {
	/**
	 * The cached value of the '{@link #getSoftgoal() <em>Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftgoal()
	 * @generated
	 * @ordered
	 */
	protected Softgoal softgoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.QUALITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal getSoftgoal() {
		if (softgoal != null && softgoal.eIsProxy()) {
			InternalEObject oldSoftgoal = (InternalEObject)softgoal;
			softgoal = (Softgoal)eResolveProxy(oldSoftgoal);
			if (softgoal != oldSoftgoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, oldSoftgoal, softgoal));
			}
		}
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal basicGetSoftgoal() {
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftgoal(Softgoal newSoftgoal, NotificationChain msgs) {
		Softgoal oldSoftgoal = softgoal;
		softgoal = newSoftgoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, oldSoftgoal, newSoftgoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftgoal(Softgoal newSoftgoal) {
		if (newSoftgoal != softgoal) {
			NotificationChain msgs = null;
			if (softgoal != null)
				msgs = ((InternalEObject)softgoal).eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			if (newSoftgoal != null)
				msgs = ((InternalEObject)newSoftgoal).eInverseAdd(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
			msgs = basicSetSoftgoal(newSoftgoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.QUALITY_CONSTRAINT__SOFTGOAL, newSoftgoal, newSoftgoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "QC_" + this.name.replace(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "QualityConstraint";
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				if (softgoal != null)
					msgs = ((InternalEObject)softgoal).eInverseRemove(this, GorePackage.SOFTGOAL__CONSTRAINTS, Softgoal.class, msgs);
				return basicSetSoftgoal((Softgoal)otherEnd, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				return basicSetSoftgoal(null, msgs);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				if (resolve) return getSoftgoal();
				return basicGetSoftgoal();
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				setSoftgoal((Softgoal)newValue);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				setSoftgoal((Softgoal)null);
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
			case GorePackage.QUALITY_CONSTRAINT__SOFTGOAL:
				return softgoal != null;
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
				case GorePackage.GORE_ELEMENT___GET_SHORT_NAME: return GorePackage.QUALITY_CONSTRAINT___GET_SHORT_NAME;
				case GorePackage.GORE_ELEMENT___GET_TYPE: return GorePackage.QUALITY_CONSTRAINT___GET_TYPE;
				case GorePackage.GORE_ELEMENT___GET_ALL_PARAMETERS: return GorePackage.QUALITY_CONSTRAINT___GET_ALL_PARAMETERS;
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
			case GorePackage.QUALITY_CONSTRAINT___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.QUALITY_CONSTRAINT___GET_TYPE:
				return getType();
			case GorePackage.QUALITY_CONSTRAINT___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //QualityConstraintImpl
