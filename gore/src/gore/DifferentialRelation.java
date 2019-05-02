/**
 */
package gore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differential Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gore.DifferentialRelation#getName <em>Name</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getValue <em>Value</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getDifferentialRelationOperator <em>Differential Relation Operator</em>}</li>
 *   <li>{@link gore.DifferentialRelation#getInternalID <em>Internal ID</em>}</li>
 * </ul>
 *
 * @see gore.GorePackage#getDifferentialRelation()
 * @model
 * @generated
 */
public interface DifferentialRelation extends EObject {
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
	 * @see gore.GorePackage#getDifferentialRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see gore.GorePackage#getDifferentialRelation_Indicator()
	 * @model
	 * @generated
	 */
	AwReq getIndicator();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getIndicator <em>Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' reference.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(AwReq value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see gore.GorePackage#getDifferentialRelation_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see gore.GorePackage#getDifferentialRelation_LowerBound()
	 * @model
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see gore.GorePackage#getDifferentialRelation_UpperBound()
	 * @model
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see gore.GorePackage#getDifferentialRelation_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Differential Relation Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link gore.DifferentialRelationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Differential Relation Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Relation Operator</em>' attribute.
	 * @see gore.DifferentialRelationOperator
	 * @see #setDifferentialRelationOperator(DifferentialRelationOperator)
	 * @see gore.GorePackage#getDifferentialRelation_DifferentialRelationOperator()
	 * @model
	 * @generated
	 */
	DifferentialRelationOperator getDifferentialRelationOperator();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getDifferentialRelationOperator <em>Differential Relation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Differential Relation Operator</em>' attribute.
	 * @see gore.DifferentialRelationOperator
	 * @see #getDifferentialRelationOperator()
	 * @generated
	 */
	void setDifferentialRelationOperator(DifferentialRelationOperator value);

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
	 * @see gore.GorePackage#getDifferentialRelation_InternalID()
	 * @model id="true"
	 * @generated
	 */
	int getInternalID();

	/**
	 * Sets the value of the '{@link gore.DifferentialRelation#getInternalID <em>Internal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal ID</em>' attribute.
	 * @see #getInternalID()
	 * @generated
	 */
	void setInternalID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"DR_\" + this.name.replace(\" \", \"_\");'"
	 * @generated
	 */
	String getShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"DiferrentialRelation\";'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String str = \"\";\n\nstr = \"indicator=\\\"\" + this.getIndicator().getInternalID() + \"\\\"\";\nstr += \" parameter=\\\"\" + this.getParameter().getInternalID() + \"\\\"\";\nstr += \" lowerBound=\\\"\" + this.getLowerBound().toString() + \"\\\"\";\nstr += \" upperBound=\\\"\" + this.getUpperBound().toString() + \"\\\"\";\nstr += \" value=\\\"\" + this.getValue() + \"\\\"\";\nstr += \" differentialRelationOperator=\\\"\" + this.getDifferentialRelationOperator().toString() + \"\\\"\";\n\nreturn str;'"
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

} // DifferentialRelation
