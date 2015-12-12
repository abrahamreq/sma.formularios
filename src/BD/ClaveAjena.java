/**
 */
package BD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clave Ajena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BD.ClaveAjena#getColumna <em>Columna</em>}</li>
 *   <li>{@link BD.ClaveAjena#getReferencia <em>Referencia</em>}</li>
 * </ul>
 * </p>
 *
 * @see BD.BDPackage#getClaveAjena()
 * @model annotation="gmf.link source='columna' target='referencia' style='solid' width='2' target.decoration='arrow'"
 * @generated
 */
public interface ClaveAjena extends EObject {
	/**
	 * Returns the value of the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna</em>' reference.
	 * @see #setColumna(Columna)
	 * @see BD.BDPackage#getClaveAjena_Columna()
	 * @model required="true"
	 * @generated
	 */
	Columna getColumna();

	/**
	 * Sets the value of the '{@link BD.ClaveAjena#getColumna <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columna</em>' reference.
	 * @see #getColumna()
	 * @generated
	 */
	void setColumna(Columna value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' reference.
	 * @see #setReferencia(Tabla)
	 * @see BD.BDPackage#getClaveAjena_Referencia()
	 * @model required="true"
	 * @generated
	 */
	Tabla getReferencia();

	/**
	 * Sets the value of the '{@link BD.ClaveAjena#getReferencia <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(Tabla value);

} // ClaveAjena
