/**
 */
package eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getReconfigurationApplicabilityCondition()
 * @model
 * @generated
 */
public interface ReconfigurationApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Wrapped Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Condition</em>' reference.
	 * @see #setWrappedCondition(ApplicabilityCondition)
	 * @see eca.EcaPackage#getReconfigurationApplicabilityCondition_WrappedCondition()
	 * @model
	 * @generated
	 */
	ApplicabilityCondition getWrappedCondition();

	/**
	 * Sets the value of the '{@link eca.ReconfigurationApplicabilityCondition#getWrappedCondition <em>Wrapped Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Condition</em>' reference.
	 * @see #getWrappedCondition()
	 * @generated
	 */
	void setWrappedCondition(ApplicabilityCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"wrappedcondition\" + this.getWrappedCondition().getInternalID() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // ReconfigurationApplicabilityCondition
