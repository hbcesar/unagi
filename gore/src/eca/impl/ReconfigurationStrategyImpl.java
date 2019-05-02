/**
 */
package eca.impl;

import eca.AdaptationStrategy;
import eca.EcaPackage;
import eca.ReconfigurationStrategy;

import gore.AgregationLevel;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eca.impl.ReconfigurationStrategyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eca.impl.ReconfigurationStrategyImpl#getAlgorithmId <em>Algorithm Id</em>}</li>
 *   <li>{@link eca.impl.ReconfigurationStrategyImpl#getProcedureIds <em>Procedure Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationStrategyImpl extends AdaptationStrategyImpl implements ReconfigurationStrategy {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AgregationLevel LEVEL_EDEFAULT = AgregationLevel.INSTANCE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected AgregationLevel level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmId() <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmId()
	 * @generated
	 * @ordered
	 */
	protected String algorithmId = ALGORITHM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcedureIds() <em>Procedure Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> procedureIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcaPackage.Literals.RECONFIGURATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(AgregationLevel newLevel) {
		AgregationLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_STRATEGY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmId() {
		return algorithmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmId(String newAlgorithmId) {
		String oldAlgorithmId = algorithmId;
		algorithmId = newAlgorithmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID, oldAlgorithmId, algorithmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProcedureIds() {
		if (procedureIds == null) {
			procedureIds = new EDataTypeUniqueEList<String>(String.class, this, EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS);
		}
		return procedureIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllParameters() {
		String str;
		
		str = "level=\"" + this.getLevel().toString() + "\"";
		str += " algorithmId=\"" + this.getAlgorithmId().toString() + "\"";
		str += " procedureIds=\"" + this.getProcedureIds().toString() + "\"";
		
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				return getLevel();
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				return getAlgorithmId();
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				return getProcedureIds();
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
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				setLevel((AgregationLevel)newValue);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				setAlgorithmId((String)newValue);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				getProcedureIds().clear();
				getProcedureIds().addAll((Collection<? extends String>)newValue);
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
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				setAlgorithmId(ALGORITHM_ID_EDEFAULT);
				return;
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				getProcedureIds().clear();
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
			case EcaPackage.RECONFIGURATION_STRATEGY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcaPackage.RECONFIGURATION_STRATEGY__ALGORITHM_ID:
				return ALGORITHM_ID_EDEFAULT == null ? algorithmId != null : !ALGORITHM_ID_EDEFAULT.equals(algorithmId);
			case EcaPackage.RECONFIGURATION_STRATEGY__PROCEDURE_IDS:
				return procedureIds != null && !procedureIds.isEmpty();
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
		if (baseClass == AdaptationStrategy.class) {
			switch (baseOperationID) {
				case EcaPackage.ADAPTATION_STRATEGY___GET_ALL_PARAMETERS: return EcaPackage.RECONFIGURATION_STRATEGY___GET_ALL_PARAMETERS;
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
			case EcaPackage.RECONFIGURATION_STRATEGY___GET_ALL_PARAMETERS:
				return getAllParameters();
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
		result.append(" (level: ");
		result.append(level);
		result.append(", algorithmId: ");
		result.append(algorithmId);
		result.append(", procedureIds: ");
		result.append(procedureIds);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationStrategyImpl
