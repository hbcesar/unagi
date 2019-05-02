/**
 */
package gore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Oriented Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link gore.GoalOrientedRequirement#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link gore.GoalOrientedRequirement#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link gore.GoalOrientedRequirement#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getGoalOrientedRequirement()
 * @model
 * @generated
 */
public interface GoalOrientedRequirement extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Refinement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gore.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Type</em>' attribute.
	 * @see gore.RefinementType
	 * @see #setRefinementType(RefinementType)
	 * @see gore.GorePackage#getGoalOrientedRequirement_RefinementType()
	 * @model
	 * @generated
	 */
	RefinementType getRefinementType();

	/**
	 * Sets the value of the '{@link gore.GoalOrientedRequirement#getRefinementType <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement Type</em>' attribute.
	 * @see gore.RefinementType
	 * @see #getRefinementType()
	 * @generated
	 */
	void setRefinementType(RefinementType value);

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
	 * The list contents are of type {@link gore.DomainAssumption}.
	 * It is bidirectional and its opposite is '{@link gore.DomainAssumption#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' reference list.
	 * @see gore.GorePackage#getGoalOrientedRequirement_Assumptions()
	 * @see gore.DomainAssumption#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<DomainAssumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' reference list.
	 * The list contents are of type {@link gore.GoalOrientedRequirement}.
	 * It is bidirectional and its opposite is '{@link gore.GoalOrientedRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinements</em>' reference list.
	 * @see gore.GorePackage#getGoalOrientedRequirement_Refinements()
	 * @see gore.GoalOrientedRequirement#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<GoalOrientedRequirement> getRefinements();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.GoalOrientedRequirement#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GoalOrientedRequirement)
	 * @see gore.GorePackage#getGoalOrientedRequirement_Parent()
	 * @see gore.GoalOrientedRequirement#getRefinements
	 * @model opposite="refinements"
	 * @generated
	 */
	GoalOrientedRequirement getParent();

	/**
	 * Sets the value of the '{@link gore.GoalOrientedRequirement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GoalOrientedRequirement value);

} // GoalOrientedRequirement
