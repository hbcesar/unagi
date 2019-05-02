/**
 */
package gore.impl;

import gore.AwReq;
import gore.Configuration;
import gore.GoalModel;
import gore.GorePackage;
import gore.Parameter;
import gore.ParameterMetric;
import gore.ParameterType;

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
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getInternalID <em>Internal ID</em>}</li>
 *   <li>{@link gore.impl.ParameterImpl#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.VARIATION_POINT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterMetric METRIC_EDEFAULT = ParameterMetric.ENUMERATED;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected ParameterMetric metric = METRIC_EDEFAULT;

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
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected AwReq indicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (eContainerFeatureID() != GorePackage.PARAMETER__CONFIGURATION) return null;
		return (Configuration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfiguration, GorePackage.PARAMETER__CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != eInternalContainer() || (eContainerFeatureID() != GorePackage.PARAMETER__CONFIGURATION && newConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, GorePackage.CONFIGURATION__PARAMETERS, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(ParameterMetric newMetric) {
		ParameterMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__METRIC, oldMetric, metric));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__INTERNAL_ID, oldInternalID, internalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwReq getIndicator() {
		if (indicator != null && indicator.eIsProxy()) {
			InternalEObject oldIndicator = (InternalEObject)indicator;
			indicator = (AwReq)eResolveProxy(oldIndicator);
			if (indicator != oldIndicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.PARAMETER__INDICATOR, oldIndicator, indicator));
			}
		}
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwReq basicGetIndicator() {
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicator(AwReq newIndicator) {
		AwReq oldIndicator = indicator;
		indicator = newIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.PARAMETER__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "Vp_" + this.name.replace(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		String str = "";
		
		str = "type=\"" + this.getType().toString() + "\"";
		str += " unit=\"" + this.getUnit().toString() + "\"";
		str += " value=\"" + this.getValue().toString() + "\"";
		str += " metric=\"" + this.getMetric().toString() + "\"";
		
		return str;
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
			case GorePackage.PARAMETER__CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfiguration((Configuration)otherEnd, msgs);
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
			case GorePackage.PARAMETER__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case GorePackage.PARAMETER__CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, GorePackage.CONFIGURATION__PARAMETERS, Configuration.class, msgs);
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
			case GorePackage.PARAMETER__NAME:
				return getName();
			case GorePackage.PARAMETER__CONFIGURATION:
				return getConfiguration();
			case GorePackage.PARAMETER__TYPE:
				return getType();
			case GorePackage.PARAMETER__UNIT:
				return getUnit();
			case GorePackage.PARAMETER__VALUE:
				return getValue();
			case GorePackage.PARAMETER__METRIC:
				return getMetric();
			case GorePackage.PARAMETER__INTERNAL_ID:
				return getInternalID();
			case GorePackage.PARAMETER__INDICATOR:
				if (resolve) return getIndicator();
				return basicGetIndicator();
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
			case GorePackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case GorePackage.PARAMETER__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case GorePackage.PARAMETER__TYPE:
				setType((ParameterType)newValue);
				return;
			case GorePackage.PARAMETER__UNIT:
				setUnit((String)newValue);
				return;
			case GorePackage.PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case GorePackage.PARAMETER__METRIC:
				setMetric((ParameterMetric)newValue);
				return;
			case GorePackage.PARAMETER__INTERNAL_ID:
				setInternalID((Integer)newValue);
				return;
			case GorePackage.PARAMETER__INDICATOR:
				setIndicator((AwReq)newValue);
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
			case GorePackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GorePackage.PARAMETER__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case GorePackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GorePackage.PARAMETER__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case GorePackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GorePackage.PARAMETER__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case GorePackage.PARAMETER__INTERNAL_ID:
				setInternalID(INTERNAL_ID_EDEFAULT);
				return;
			case GorePackage.PARAMETER__INDICATOR:
				setIndicator((AwReq)null);
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
			case GorePackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GorePackage.PARAMETER__CONFIGURATION:
				return getConfiguration() != null;
			case GorePackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case GorePackage.PARAMETER__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case GorePackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GorePackage.PARAMETER__METRIC:
				return metric != METRIC_EDEFAULT;
			case GorePackage.PARAMETER__INTERNAL_ID:
				return internalID != INTERNAL_ID_EDEFAULT;
			case GorePackage.PARAMETER__INDICATOR:
				return indicator != null;
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
			case GorePackage.PARAMETER___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.PARAMETER___GET_ALL_PARAMETERS:
				return getAllParameters();
			case GorePackage.PARAMETER___GENERATE_ID__GOALMODEL:
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
		result.append(", type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(", metric: ");
		result.append(metric);
		result.append(", internalID: ");
		result.append(internalID);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
