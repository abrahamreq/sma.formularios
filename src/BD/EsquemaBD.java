/**
 */
package BD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esquema BD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BD.EsquemaBD#getTablas <em>Tablas</em>}</li>
 * </ul>
 * </p>
 *
 * @see BD.BDPackage#getEsquemaBD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TablaNoDuplicado'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TablaNoDuplicado='\n\t\t\ttablas->isUnique(nombre)'"
 * @generated
 */
public interface EsquemaBD extends ElementoNombrado {
	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link BD.Tabla}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see BD.BDPackage#getEsquemaBD_Tablas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tabla> getTablas();

} // EsquemaBD
