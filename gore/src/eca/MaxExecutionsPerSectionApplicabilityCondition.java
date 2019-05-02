/**
 */
package eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Executions Per Section Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.MaxExecutionsPerSectionApplicabilityCondition#getMaxExecutions <em>Max Executions</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getMaxExecutionsPerSectionApplicabilityCondition()
 * @model
 * @generated
 */
public interface MaxExecutionsPerSectionApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Max Executions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Executions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Executions</em>' attribute.
	 * @see #setMaxExecutions(int)
	 * @see eca.EcaPackage#getMaxExecutionsPerSectionApplicabilityCondition_MaxExecutions()
	 * @model
	 * @generated
	 */
	int getMaxExecutions();

	/**
	 * Sets the value of the '{@link eca.MaxExecutionsPerSectionApplicabilityCondition#getMaxExecutions <em>Max Executions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Executions</em>' attribute.
	 * @see #getMaxExecutions()
	 * @generated
	 */
	void setMaxExecutions(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"maxExecutions=\\\"\" + this.maxExecutions + \"\\\"\";'"
	 * @generated
	 */
	String getAllParameters();

} // MaxExecutionsPerSectionApplicabilityCondition
