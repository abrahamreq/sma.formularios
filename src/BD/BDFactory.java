/**
 */
package BD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BD.BDPackage
 * @generated
 */
public interface BDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BDFactory eINSTANCE = BD.impl.BDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Esquema BD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Esquema BD</em>'.
	 * @generated
	 */
	EsquemaBD createEsquemaBD();

	/**
	 * Returns a new object of class '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla</em>'.
	 * @generated
	 */
	Tabla createTabla();

	/**
	 * Returns a new object of class '<em>Columna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columna</em>'.
	 * @generated
	 */
	Columna createColumna();

	/**
	 * Returns a new object of class '<em>Elemento Nombrado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Nombrado</em>'.
	 * @generated
	 */
	ElementoNombrado createElementoNombrado();

	/**
	 * Returns a new object of class '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clave Ajena</em>'.
	 * @generated
	 */
	ClaveAjena createClaveAjena();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BDPackage getBDPackage();

} //BDFactory
