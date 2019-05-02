/**
 */
package eca;

import gore.AwReq;
import gore.GoalModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.ResolutionCondition#getName <em>Name</em>}</li>
 *   <li>{@link eca.ResolutionCondition#getAwreq <em>Awreq</em>}</li>
 *   <li>{@link eca.ResolutionCondition#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getResolutionCondition()
 * @model
 * @generated
 */
public interface ResolutionCondition extends EObject {
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
	 * @see eca.EcaPackage#getResolutionCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eca.ResolutionCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Awreq</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gore.AwReq#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Awreq</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awreq</em>' container reference.
	 * @see #setAwreq(AwReq)
	 * @see eca.EcaPackage#getResolutionCondition_Awreq()
	 * @see gore.AwReq#getResolution
	 * @model opposite="resolution" transient="false"
	 * @generated
	 */
	AwReq getAwreq();

	/**
	 * Sets the value of the '{@link eca.ResolutionCondition#getAwreq <em>Awreq</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awreq</em>' container reference.
	 * @see #getAwreq()
	 * @generated
	 */
	void setAwreq(AwReq value);

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
	 * @see eca.EcaPackage#getResolutionCondition_InternalID()
	 * @model id="true"
	 * @generated
	 */
	int getInternalID();

	/**
	 * Sets the value of the '{@link eca.ResolutionCondition#getInternalID <em>Internal ID</em>}' attribute.
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

} // ResolutionCondition
