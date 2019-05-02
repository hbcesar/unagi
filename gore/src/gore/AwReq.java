/**
 */
package gore;

import eca.AdaptationStrategy;
import eca.ResolutionCondition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aw Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.AwReq#getTarget <em>Target</em>}</li>
 *   <li>{@link gore.AwReq#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link gore.AwReq#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getAwReq()
 * @model
 * @generated
 */
public interface AwReq extends GOREElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gore.GOREElement#getAwreqs <em>Awreqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GOREElement)
	 * @see gore.GorePackage#getAwReq_Target()
	 * @see gore.GOREElement#getAwreqs
	 * @model opposite="awreqs"
	 * @generated
	 */
	GOREElement getTarget();

	/**
	 * Sets the value of the '{@link gore.AwReq#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GOREElement value);

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link eca.AdaptationStrategy}.
	 * It is bidirectional and its opposite is '{@link eca.AdaptationStrategy#getAwreq <em>Awreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see gore.GorePackage#getAwReq_Strategies()
	 * @see eca.AdaptationStrategy#getAwreq
	 * @model opposite="awreq" containment="true"
	 * @generated
	 */
	EList<AdaptationStrategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eca.ResolutionCondition#getAwreq <em>Awreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(ResolutionCondition)
	 * @see gore.GorePackage#getAwReq_Resolution()
	 * @see eca.ResolutionCondition#getAwreq
	 * @model opposite="awreq" containment="true"
	 * @generated
	 */
	ResolutionCondition getResolution();

	/**
	 * Sets the value of the '{@link gore.AwReq#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(ResolutionCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"AR_\" + this.name.replaceAll(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"AwReq\";'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
	 * @generated
	 */
	String getAllParameters();

} // AwReq
