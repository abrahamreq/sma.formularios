/**
 */
package BD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BD.Columna#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see BD.BDPackage#getColumna()
 * @model annotation="gmf.node label='nombre,tipo' label.placement='internal' figure='rectangle' label.icon='false' label.pattern='{0}:{1}'"
 * @generated
 */
public interface Columna extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link BD.TipoPrimitivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see BD.TipoPrimitivo
	 * @see #setTipo(TipoPrimitivo)
	 * @see BD.BDPackage#getColumna_Tipo()
	 * @model
	 * @generated
	 */
	TipoPrimitivo getTipo();

	/**
	 * Sets the value of the '{@link BD.Columna#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see BD.TipoPrimitivo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPrimitivo value);

} // Columna
