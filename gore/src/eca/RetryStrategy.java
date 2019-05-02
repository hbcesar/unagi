/**
 */
package eca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.RetryStrategy#isCopy <em>Copy</em>}</li>
 *   <li>{@link eca.RetryStrategy#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getRetryStrategy()
 * @model
 * @generated
 */
public interface RetryStrategy extends AdaptationStrategy {
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
	 * @see eca.EcaPackage#getRetryStrategy_Copy()
	 * @model
	 * @generated
	 */
	boolean isCopy();

	/**
	 * Sets the value of the '{@link eca.RetryStrategy#isCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #isCopy()
	 * @generated
	 */
	void setCopy(boolean value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see eca.EcaPackage#getRetryStrategy_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link eca.RetryStrategy#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"copy=\\\"\" + this.isCopy() + \"\\\"\";\nstr += \" time=\\\"\" + this.getTime() + \"\\\"\"; \n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // RetryStrategy
