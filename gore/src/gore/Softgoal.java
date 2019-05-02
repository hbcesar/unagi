/**
 */
package gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.Softgoal#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getSoftgoal()
 * @model
 * @generated
 */
public interface Softgoal extends GoalOrientedRequirement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link gore.QualityConstraint}.
	 * It is bidirectional and its opposite is '{@link gore.QualityConstraint#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see gore.GorePackage#getSoftgoal_Constraints()
	 * @see gore.QualityConstraint#getSoftgoal
	 * @model opposite="softgoal" required="true"
	 * @generated
	 */
	EList<QualityConstraint> getConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"SG_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Softgoal\";'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"refinementType=\\\"\" + this.getRefinementType().toString() + \"\\\"\";'"
	 * @generated
	 */
	String getAllParameters();

} // Softgoal
