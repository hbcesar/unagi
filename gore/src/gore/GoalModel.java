/**
 */
package gore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.GoalModel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link gore.GoalModel#getRootGoal <em>Root Goal</em>}</li>
 *   <li>{@link gore.GoalModel#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link gore.GoalModel#getDomainassumption <em>Domainassumption</em>}</li>
 *   <li>{@link gore.GoalModel#getActors <em>Actors</em>}</li>
 *   <li>{@link gore.GoalModel#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link gore.GoalModel#getParameters <em>Parameters</em>}</li>
 *   <li>{@link gore.GoalModel#getRelations <em>Relations</em>}</li>
 *   <li>{@link gore.GoalModel#getInternalIDCounter <em>Internal ID Counter</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getGoalModel()
 * @model
 * @generated
 */
public interface GoalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see gore.GorePackage#getGoalModel_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link gore.GoalModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Root Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.Hardgoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Goal</em>' reference.
	 * @see #setRootGoal(Hardgoal)
	 * @see gore.GorePackage#getGoalModel_RootGoal()
	 * @see gore.Hardgoal#getGoalModel
	 * @model opposite="goalModel"
	 * @generated
	 */
	Hardgoal getRootGoal();

	/**
	 * Sets the value of the '{@link gore.GoalModel#getRootGoal <em>Root Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Goal</em>' reference.
	 * @see #getRootGoal()
	 * @generated
	 */
	void setRootGoal(Hardgoal value);

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link gore.GOREElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinements</em>' containment reference list.
	 * @see gore.GorePackage#getGoalModel_Refinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GOREElement> getRefinements();

	/**
	 * Returns the value of the '<em><b>Domainassumption</b></em>' containment reference list.
	 * The list contents are of type {@link gore.DomainAssumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domainassumption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainassumption</em>' containment reference list.
	 * @see gore.GorePackage#getGoalModel_Domainassumption()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainAssumption> getDomainassumption();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link gore.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see gore.GorePackage#getGoalModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see gore.GorePackage#getGoalModel_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link gore.GoalModel#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link gore.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see gore.GorePackage#getGoalModel_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link gore.DifferentialRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see gore.GorePackage#getGoalModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifferentialRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Internal ID Counter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal ID Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal ID Counter</em>' attribute.
	 * @see #setInternalIDCounter(Integer)
	 * @see gore.GorePackage#getGoalModel_InternalIDCounter()
	 * @model default="0"
	 * @generated
	 */
	Integer getInternalIDCounter();

	/**
	 * Sets the value of the '{@link gore.GoalModel#getInternalIDCounter <em>Internal ID Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID Counter</em>' attribute.
	 * @see #getInternalIDCounter()
	 * @generated
	 */
	void setInternalIDCounter(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.modelName.replaceAll(\" \", \"_\").toLowerCase();'"
	 * @generated
	 */
	String getModelShortName();

} // GoalModel
