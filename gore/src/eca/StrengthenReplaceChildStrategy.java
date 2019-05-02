/**
 */
package eca;

import gore.AgregationLevel;
import gore.GOREElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strengthen Replace Child Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.StrengthenReplaceChildStrategy#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link eca.StrengthenReplaceChildStrategy#getNewRequirement <em>New Requirement</em>}</li>
 *   <li>{@link eca.StrengthenReplaceChildStrategy#getLevel <em>Level</em>}</li>
 *   <li>{@link eca.StrengthenReplaceChildStrategy#isCopy <em>Copy</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getStrengthenReplaceChildStrategy()
 * @model
 * @generated
 */
public interface StrengthenReplaceChildStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(GOREElement)
	 * @see eca.EcaPackage#getStrengthenReplaceChildStrategy_Requirement()
	 * @model
	 * @generated
	 */
	GOREElement getRequirement();

	/**
	 * Sets the value of the '{@link eca.StrengthenReplaceChildStrategy#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(GOREElement value);

	/**
	 * Returns the value of the '<em><b>New Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Requirement</em>' reference.
	 * @see #setNewRequirement(GOREElement)
	 * @see eca.EcaPackage#getStrengthenReplaceChildStrategy_NewRequirement()
	 * @model
	 * @generated
	 */
	GOREElement getNewRequirement();

	/**
	 * Sets the value of the '{@link eca.StrengthenReplaceChildStrategy#getNewRequirement <em>New Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Requirement</em>' reference.
	 * @see #getNewRequirement()
	 * @generated
	 */
	void setNewRequirement(GOREElement value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link gore.AgregationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see gore.AgregationLevel
	 * @see #setLevel(AgregationLevel)
	 * @see eca.EcaPackage#getStrengthenReplaceChildStrategy_Level()
	 * @model
	 * @generated
	 */
	AgregationLevel getLevel();

	/**
	 * Sets the value of the '{@link eca.StrengthenReplaceChildStrategy#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see gore.AgregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AgregationLevel value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(boolean)
	 * @see eca.EcaPackage#getStrengthenReplaceChildStrategy_Copy()
	 * @model
	 * @generated
	 */
	boolean isCopy();

	/**
	 * Sets the value of the '{@link eca.StrengthenReplaceChildStrategy#isCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #isCopy()
	 * @generated
	 */
	void setCopy(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"level=\\\"\" + this.getLevel().toString() + \"\\\"\";\nstr += \" requirement=\\\"\" + this.getRequirement().getInternalID() + \"\\\"\";\nstr += \" newRequirement=\\\"\" + this.getNewRequirement().getInternalID() + \"\\\"\";\nstr += \" copy=\\\"\" + this.isCopy() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // StrengthenReplaceChildStrategy
