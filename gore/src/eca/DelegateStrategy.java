/**
 */
package eca;

import gore.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegate Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.DelegateStrategy#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getDelegateStrategy()
 * @model
 * @generated
 */
public interface DelegateStrategy extends AdaptationStrategy {
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
	 * @see eca.EcaPackage#getDelegateStrategy_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link eca.DelegateStrategy#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

} // DelegateStrategy
