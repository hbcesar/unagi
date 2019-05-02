/**
 */
package eca;

import gore.AgregationLevel;
import gore.GOREElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strengthen Enable Child Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.StrengthenEnableChildStrategy#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link eca.StrengthenEnableChildStrategy#getChild <em>Child</em>}</li>
 *   <li>{@link eca.StrengthenEnableChildStrategy#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getStrengthenEnableChildStrategy()
 * @model
 * @generated
 */
public interface StrengthenEnableChildStrategy extends AdaptationStrategy {
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
	 * @see eca.EcaPackage#getStrengthenEnableChildStrategy_Requirement()
	 * @model
	 * @generated
	 */
	GOREElement getRequirement();

	/**
	 * Sets the value of the '{@link eca.StrengthenEnableChildStrategy#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(GOREElement value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(GOREElement)
	 * @see eca.EcaPackage#getStrengthenEnableChildStrategy_Child()
	 * @model
	 * @generated
	 */
	GOREElement getChild();

	/**
	 * Sets the value of the '{@link eca.StrengthenEnableChildStrategy#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(GOREElement value);

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
	 * @see eca.EcaPackage#getStrengthenEnableChildStrategy_Level()
	 * @model
	 * @generated
	 */
	AgregationLevel getLevel();

	/**
	 * Sets the value of the '{@link eca.StrengthenEnableChildStrategy#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see gore.AgregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AgregationLevel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"level=\\\"\" + this.getLevel().toString() + \"\\\"\";\nstr += \" requirement=\\\"\" + this.getRequirement().getInternalID()+ \"\\\"\";\nstr += \" child=\\\"\" + this.getChild().getInternalID() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // StrengthenEnableChildStrategy
