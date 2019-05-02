/**
 */
package eca;

import gore.GoalModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.ApplicabilityCondition#getName <em>Name</em>}</li>
 *   <li>{@link eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eca.ApplicabilityCondition#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getApplicabilityCondition()
 * @model
 * @generated
 */
public interface ApplicabilityCondition extends EObject {
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
	 * @see eca.EcaPackage#getApplicabilityCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eca.ApplicabilityCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eca.AdaptationStrategy#getApplicabilities <em>Applicabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(AdaptationStrategy)
	 * @see eca.EcaPackage#getApplicabilityCondition_Strategy()
	 * @see eca.AdaptationStrategy#getApplicabilities
	 * @model opposite="applicabilities" transient="false"
	 * @generated
	 */
	AdaptationStrategy getStrategy();

	/**
	 * Sets the value of the '{@link eca.ApplicabilityCondition#getStrategy <em>Strategy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(AdaptationStrategy value);

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
	 * @see eca.EcaPackage#getApplicabilityCondition_InternalID()
	 * @model id="true"
	 * @generated
	 */
	int getInternalID();

	/**
	 * Sets the value of the '{@link eca.ApplicabilityCondition#getInternalID <em>Internal ID</em>}' attribute.
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

} // ApplicabilityCondition
