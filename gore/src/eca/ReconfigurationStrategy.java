/**
 */
package eca;

import gore.AgregationLevel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eca.ReconfigurationStrategy#getLevel <em>Level</em>}</li>
 *   <li>{@link eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}</li>
 *   <li>{@link eca.ReconfigurationStrategy#getProcedureIds <em>Procedure Ids</em>}</li>
 * </ul>
 *
 * @see eca.EcaPackage#getReconfigurationStrategy()
 * @model
 * @generated
 */
public interface ReconfigurationStrategy extends AdaptationStrategy {
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
	 * @see eca.EcaPackage#getReconfigurationStrategy_Level()
	 * @model
	 * @generated
	 */
	AgregationLevel getLevel();

	/**
	 * Sets the value of the '{@link eca.ReconfigurationStrategy#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see gore.AgregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AgregationLevel value);

	/**
	 * Returns the value of the '<em><b>Algorithm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Id</em>' attribute.
	 * @see #setAlgorithmId(String)
	 * @see eca.EcaPackage#getReconfigurationStrategy_AlgorithmId()
	 * @model
	 * @generated
	 */
	String getAlgorithmId();

	/**
	 * Sets the value of the '{@link eca.ReconfigurationStrategy#getAlgorithmId <em>Algorithm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Id</em>' attribute.
	 * @see #getAlgorithmId()
	 * @generated
	 */
	void setAlgorithmId(String value);

	/**
	 * Returns the value of the '<em><b>Procedure Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Ids</em>' attribute list.
	 * @see eca.EcaPackage#getReconfigurationStrategy_ProcedureIds()
	 * @model
	 * @generated
	 */
	EList<String> getProcedureIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str;\n\nstr = \"level=\\\"\" + this.getLevel().toString() + \"\\\"\";\nstr += \" algorithmId=\\\"\" + this.getAlgorithmId().toString() + \"\\\"\";\nstr += \" procedureIds=\\\"\" + this.getProcedureIds().toString() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

} // ReconfigurationStrategy
