/**
 */
package eca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Refined Resolution Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.AndRefinedResolutionCondition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getAndRefinedResolutionCondition()
 * @model
 * @generated
 */
public interface AndRefinedResolutionCondition extends ResolutionCondition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link eca.ResolutionCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see eca.EcaPackage#getAndRefinedResolutionCondition_Children()
	 * @model
	 * @generated
	 */
	EList<ResolutionCondition> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str = \"\";\n\t\t\t\t\nfor(ResolutionCondition chld : this.children){\n\tstr += chld.getInternalID();\n\tstr += \" \";\n}\n\t\t\t\t\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // AndRefinedResolutionCondition
