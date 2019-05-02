/**
 */
package eca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Refined Applicability Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.OrRefinedApplicabilityCondition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getOrRefinedApplicabilityCondition()
 * @model
 * @generated
 */
public interface OrRefinedApplicabilityCondition extends ApplicabilityCondition {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link eca.ApplicabilityCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see eca.EcaPackage#getOrRefinedApplicabilityCondition_Children()
	 * @model
	 * @generated
	 */
	EList<ApplicabilityCondition> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str = \"\";\n\t\t\n\t\tfor(ApplicabilityCondition chld : this.children){\n\t\t\tstr += chld.getInternalID();\n\t\t\tstr += \" \";\n\t\t}\n\t\t\n\t\treturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // OrRefinedApplicabilityCondition
