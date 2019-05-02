/**
 */
package gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.Hardgoal#getTask <em>Task</em>}</li>
 *   <li>{@link gore.Hardgoal#getGoalModel <em>Goal Model</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getHardgoal()
 * @model
 * @generated
 */
public interface Hardgoal extends PerformativeRequirement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link gore.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see gore.GorePackage#getHardgoal_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.GoalModel#getRootGoal <em>Root Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' reference.
	 * @see #setGoalModel(GoalModel)
	 * @see gore.GorePackage#getHardgoal_GoalModel()
	 * @see gore.GoalModel#getRootGoal
	 * @model opposite="rootGoal"
	 * @generated
	 */
	GoalModel getGoalModel();

	/**
	 * Sets the value of the '{@link gore.Hardgoal#getGoalModel <em>Goal Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Model</em>' reference.
	 * @see #getGoalModel()
	 * @generated
	 */
	void setGoalModel(GoalModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"HG_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"HardGoal\";'"
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

} // Hardgoal
