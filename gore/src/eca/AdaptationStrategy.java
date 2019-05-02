/**
 */
package eca;

import gore.AwReq;
import gore.GoalModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.AdaptationStrategy#getAwreq <em>Awreq</em>}</li>
 *   <li>{@link eca.AdaptationStrategy#getName <em>Name</em>}</li>
 *   <li>{@link eca.AdaptationStrategy#getApplicabilities <em>Applicabilities</em>}</li>
 *   <li>{@link eca.AdaptationStrategy#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getAdaptationStrategy()
 * @model
 * @generated
 */
public interface AdaptationStrategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Awreq</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gore.AwReq#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Awreq</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awreq</em>' container reference.
	 * @see #setAwreq(AwReq)
	 * @see eca.EcaPackage#getAdaptationStrategy_Awreq()
	 * @see gore.AwReq#getStrategies
	 * @model opposite="strategies" transient="false"
	 * @generated
	 */
	AwReq getAwreq();

	/**
	 * Sets the value of the '{@link eca.AdaptationStrategy#getAwreq <em>Awreq</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awreq</em>' container reference.
	 * @see #getAwreq()
	 * @generated
	 */
	void setAwreq(AwReq value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eca.EcaPackage#getAdaptationStrategy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eca.AdaptationStrategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Applicabilities</b></em>' containment reference list.
	 * The list contents are of type {@link eca.ApplicabilityCondition}.
	 * It is bidirectional and its opposite is '{@link eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicabilities</em>' containment reference list.
	 * @see eca.EcaPackage#getAdaptationStrategy_Applicabilities()
	 * @see eca.ApplicabilityCondition#getStrategy
	 * @model opposite="strategy" containment="true"
	 * @generated
	 */
	EList<ApplicabilityCondition> getApplicabilities();

	/**
	 * Returns the value of the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal ID</em>' attribute.
	 * @see #setInternalID(int)
	 * @see eca.EcaPackage#getAdaptationStrategy_InternalID()
	 * @model id="true"
	 * @generated
	 */
	int getInternalID();

	/**
	 * Sets the value of the '{@link eca.AdaptationStrategy#getInternalID <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID</em>' attribute.
	 * @see #getInternalID()
	 * @generated
	 */
	void setInternalID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
	 * @generated
	 */
	String getAllParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model gmAnnotation="http://www.eclipse.org/emf/2002/GenModel body='this.internalID = gm.getInternalIDCounter();\ngm.setInternalIDCounter(this.internalID + 1);'"
	 * @generated
	 */
	void generateID(GoalModel gm);

} // AdaptationStrategy
