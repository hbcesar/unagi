/**
 */
package eca;

import gore.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.WarningStrategy#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getWarningStrategy()
 * @model
 * @generated
 */
public interface WarningStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see eca.EcaPackage#getWarningStrategy_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link eca.WarningStrategy#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"actor=\\\"\" + this.getActor().getInternalID() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // WarningStrategy
