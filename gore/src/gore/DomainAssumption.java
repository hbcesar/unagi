/**
 */
package gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.DomainAssumption#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getDomainAssumption()
 * @model
 * @generated
 */
public interface DomainAssumption extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GoalOrientedRequirement)
	 * @see gore.GorePackage#getDomainAssumption_Parent()
	 * @see gore.GoalOrientedRequirement#getAssumptions
	 * @model opposite="assumptions"
	 * @generated
	 */
	GoalOrientedRequirement getParent();

	/**
	 * Sets the value of the '{@link gore.DomainAssumption#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GoalOrientedRequirement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"DA_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"DomainAssumption\";'"
	 * @generated
	 */
	String getType();

} // DomainAssumption
