/**
 */
package BD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BD.Tabla#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link BD.Tabla#getClavePrimaria <em>Clave Primaria</em>}</li>
 *   <li>{@link BD.Tabla#getClavesAjenas <em>Claves Ajenas</em>}</li>
 * </ul>
 * </p>
 *
 * @see BD.BDPackage#getTabla()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ColumnaNoDuplicada NombreMayuscula'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ColumnaNoDuplicada='\n\t\t\tcolumnas->isUnique(nombre)' NombreMayuscula='\n\t\t\tnombre.toUpperCase() = nombre'"
 *        annotation="gmf.node label='nombre' label.placement='internal' figure='rectangle' label.icon='false'"
 * @generated
 */
public interface Tabla extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Columnas</b></em>' containment reference list.
	 * The list contents are of type {@link BD.Columna}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnas</em>' containment reference list.
	 * @see BD.BDPackage#getTabla_Columnas()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<Columna> getColumnas();

	/**
	 * Returns the value of the '<em><b>Clave Primaria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clave Primaria</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clave Primaria</em>' reference.
	 * @see #setClavePrimaria(Columna)
	 * @see BD.BDPackage#getTabla_ClavePrimaria()
	 * @model
	 * @generated
	 */
	Columna getClavePrimaria();

	/**
	 * Sets the value of the '{@link BD.Tabla#getClavePrimaria <em>Clave Primaria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clave Primaria</em>' reference.
	 * @see #getClavePrimaria()
	 * @generated
	 */
	void setClavePrimaria(Columna value);

	/**
	 * Returns the value of the '<em><b>Claves Ajenas</b></em>' containment reference list.
	 * The list contents are of type {@link BD.ClaveAjena}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claves Ajenas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claves Ajenas</em>' containment reference list.
	 * @see BD.BDPackage#getTabla_ClavesAjenas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaveAjena> getClavesAjenas();

} // Tabla
