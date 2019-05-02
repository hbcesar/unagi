/**
 */
package gore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getQualityConstraint()
 * @model
 * @generated
 */
public interface QualityConstraint extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Softgoal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.Softgoal#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softgoal</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softgoal</em>' reference.
	 * @see #setSoftgoal(Softgoal)
	 * @see gore.GorePackage#getQualityConstraint_Softgoal()
	 * @see gore.Softgoal#getConstraints
	 * @model opposite="constraints"
	 * @generated
	 */
	Softgoal getSoftgoal();

	/**
	 * Sets the value of the '{@link gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Softgoal</em>' reference.
	 * @see #getSoftgoal()
	 * @generated
	 */
	void setSoftgoal(Softgoal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"QC_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"QualityConstraint\";'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
	 * @generated
	 */
	String getAllParameters();

} // QualityConstraint
