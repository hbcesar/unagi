/**
 */
package gore.impl;

import gore.AwReq;
import gore.DifferentialRelation;
import gore.DifferentialRelationOperator;
import gore.GoalModel;
import gore.GorePackage;
import gore.Parameter;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Differential Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getDifferentialRelationOperator <em>Differential Relation Operator</em>}</li>
 *   <li>{@link gore.impl.DifferentialRelationImpl#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifferentialRelationImpl extends MinimalEObjectImpl.Container implements DifferentialRelation {
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
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected AwReq indicator;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifferentialRelationOperator() <em>Differential Relation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentialRelationOperator()
	 * @generated
	 * @ordered
	 */
	protected static final DifferentialRelationOperator DIFFERENTIAL_RELATION_OPERATOR_EDEFAULT = DifferentialRelationOperator.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getDifferentialRelationOperator() <em>Differential Relation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentialRelationOperator()
	 * @generated
	 * @ordered
	 */
	protected DifferentialRelationOperator differentialRelationOperator = DIFFERENTIAL_RELATION_OPERATOR_EDEFAULT;

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
	protected DifferentialRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.DIFFERENTIAL_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.DIFFERENTIAL_RELATION__INDICATOR, oldIndicator, indicator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.DIFFERENTIAL_RELATION__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentialRelationOperator getDifferentialRelationOperator() {
		return differentialRelationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifferentialRelationOperator(DifferentialRelationOperator newDifferentialRelationOperator) {
		DifferentialRelationOperator oldDifferentialRelationOperator = differentialRelationOperator;
		differentialRelationOperator = newDifferentialRelationOperator == null ? DIFFERENTIAL_RELATION_OPERATOR_EDEFAULT : newDifferentialRelationOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR, oldDifferentialRelationOperator, differentialRelationOperator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.DIFFERENTIAL_RELATION__INTERNAL_ID, oldInternalID, internalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return "DR_" + this.name.replace(" ", "_");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "DiferrentialRelation";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		String str = "";
		
		str = "indicator=\"" + this.getIndicator().getInternalID() + "\"";
		str += " parameter=\"" + this.getParameter().getInternalID() + "\"";
		str += " lowerBound=\"" + this.getLowerBound().toString() + "\"";
		str += " upperBound=\"" + this.getUpperBound().toString() + "\"";
		str += " value=\"" + this.getValue() + "\"";
		str += " differentialRelationOperator=\"" + this.getDifferentialRelationOperator().toString() + "\"";
		
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GorePackage.DIFFERENTIAL_RELATION__NAME:
				return getName();
			case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
				if (resolve) return getIndicator();
				return basicGetIndicator();
			case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
				return getLowerBound();
			case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
				return getUpperBound();
			case GorePackage.DIFFERENTIAL_RELATION__VALUE:
				return getValue();
			case GorePackage.DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR:
				return getDifferentialRelationOperator();
			case GorePackage.DIFFERENTIAL_RELATION__INTERNAL_ID:
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
			case GorePackage.DIFFERENTIAL_RELATION__NAME:
				setName((String)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
				setIndicator((AwReq)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__VALUE:
				setValue((Double)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR:
				setDifferentialRelationOperator((DifferentialRelationOperator)newValue);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__INTERNAL_ID:
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
			case GorePackage.DIFFERENTIAL_RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
				setIndicator((AwReq)null);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
				setParameter((Parameter)null);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR:
				setDifferentialRelationOperator(DIFFERENTIAL_RELATION_OPERATOR_EDEFAULT);
				return;
			case GorePackage.DIFFERENTIAL_RELATION__INTERNAL_ID:
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
			case GorePackage.DIFFERENTIAL_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GorePackage.DIFFERENTIAL_RELATION__INDICATOR:
				return indicator != null;
			case GorePackage.DIFFERENTIAL_RELATION__PARAMETER:
				return parameter != null;
			case GorePackage.DIFFERENTIAL_RELATION__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case GorePackage.DIFFERENTIAL_RELATION__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case GorePackage.DIFFERENTIAL_RELATION__VALUE:
				return value != VALUE_EDEFAULT;
			case GorePackage.DIFFERENTIAL_RELATION__DIFFERENTIAL_RELATION_OPERATOR:
				return differentialRelationOperator != DIFFERENTIAL_RELATION_OPERATOR_EDEFAULT;
			case GorePackage.DIFFERENTIAL_RELATION__INTERNAL_ID:
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
			case GorePackage.DIFFERENTIAL_RELATION___GET_SHORT_NAME:
				return getShortName();
			case GorePackage.DIFFERENTIAL_RELATION___GET_TYPE:
				return getType();
			case GorePackage.DIFFERENTIAL_RELATION___GET_ALL_PARAMETERS:
				return getAllParameters();
			case GorePackage.DIFFERENTIAL_RELATION___GENERATE_ID__GOALMODEL:
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
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", value: ");
		result.append(value);
		result.append(", DifferentialRelationOperator: ");
		result.append(differentialRelationOperator);
		result.append(", internalID: ");
		result.append(internalID);
		result.append(')');
		return result.toString();
	}

} //DifferentialRelationImpl
