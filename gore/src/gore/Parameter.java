/**
 */
package gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link gore.Parameter#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link gore.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link gore.Parameter#getUnit <em>Unit</em>}</li>
 *   <li>{@link gore.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link gore.Parameter#getMetric <em>Metric</em>}</li>
 *   <li>{@link gore.Parameter#getInternalID <em>Internal ID</em>}</li>
 *   <li>{@link gore.Parameter#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gore.GorePackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gore.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gore.Configuration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see gore.GorePackage#getParameter_Configuration()
	 * @see gore.Configuration#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link gore.Parameter#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gore.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gore.ParameterType
	 * @see #setType(ParameterType)
	 * @see gore.GorePackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link gore.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gore.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see gore.GorePackage#getParameter_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link gore.Parameter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gore.GorePackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gore.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link gore.ParameterMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see gore.ParameterMetric
	 * @see #setMetric(ParameterMetric)
	 * @see gore.GorePackage#getParameter_Metric()
	 * @model required="true"
	 * @generated
	 */
	ParameterMetric getMetric();

	/**
	 * Sets the value of the '{@link gore.Parameter#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see gore.ParameterMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ParameterMetric value);

	/**
	 * Returns the value of the '<em><b>Internal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal ID</em>' attribute.
	 * @see #setInternalID(int)
	 * @see gore.GorePackage#getParameter_InternalID()
	 * @model id="true"
	 * @generated
	 */
	int getInternalID();

	/**
	 * Sets the value of the '{@link gore.Parameter#getInternalID <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID</em>' attribute.
	 * @see #getInternalID()
	 * @generated
	 */
	void setInternalID(int value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator</em>' reference.
	 * @see #setIndicator(AwReq)
	 * @see gore.GorePackage#getParameter_Indicator()
	 * @model
	 * @generated
	 */
	AwReq getIndicator();

	/**
	 * Sets the value of the '{@link gore.Parameter#getIndicator <em>Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' reference.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(AwReq value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Vp_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str = \"\";\n\nstr = \"type=\\\"\" + this.getType().toString() + \"\\\"\";\nstr += \" unit=\\\"\" + this.getUnit().toString() + \"\\\"\";\nstr += \" value=\\\"\" + this.getValue().toString() + \"\\\"\";\nstr += \" metric=\\\"\" + this.getMetric().toString() + \"\\\"\";\n\nreturn str;'"
	 * @generated
	 */
	String getAllParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model gmAnnotation="http://www.eclipse.org/emf/2002/GenModel body='this.internalID = gm.getInternalIDCounter();\ngm.setInternalIDCounter(this.internalID + 1);'"
	 * @generated
	 */
	void generateID(GoalModel gm);

} // Parameter
