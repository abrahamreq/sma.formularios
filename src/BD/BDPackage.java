/**
 */
package BD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BD.BDFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface BDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "BD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BDPackage eINSTANCE = BD.impl.BDPackageImpl.init();

	/**
	 * The meta object id for the '{@link BD.impl.ElementoNombradoImpl <em>Elemento Nombrado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.impl.ElementoNombradoImpl
	 * @see BD.impl.BDPackageImpl#getElementoNombrado()
	 * @generated
	 */
	int ELEMENTO_NOMBRADO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Elemento Nombrado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_NOMBRADO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link BD.impl.EsquemaBDImpl <em>Esquema BD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.impl.EsquemaBDImpl
	 * @see BD.impl.BDPackageImpl#getEsquemaBD()
	 * @generated
	 */
	int ESQUEMA_BD = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_BD__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tablas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_BD__TABLAS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Esquema BD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_BD_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BD.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.impl.TablaImpl
	 * @see BD.impl.BDPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Columnas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__COLUMNAS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__CLAVE_PRIMARIA = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Claves Ajenas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__CLAVES_AJENAS = ELEMENTO_NOMBRADO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link BD.impl.ColumnaImpl <em>Columna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.impl.ColumnaImpl
	 * @see BD.impl.BDPackageImpl#getColumna()
	 * @generated
	 */
	int COLUMNA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__NOMBRE = ELEMENTO_NOMBRADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TIPO = ELEMENTO_NOMBRADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Columna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA_FEATURE_COUNT = ELEMENTO_NOMBRADO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BD.impl.ClaveAjenaImpl <em>Clave Ajena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.impl.ClaveAjenaImpl
	 * @see BD.impl.BDPackageImpl#getClaveAjena()
	 * @generated
	 */
	int CLAVE_AJENA = 4;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__COLUMNA = 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__REFERENCIA = 1;

	/**
	 * The number of structural features of the '<em>Clave Ajena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link BD.TipoPrimitivo <em>Tipo Primitivo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BD.TipoPrimitivo
	 * @see BD.impl.BDPackageImpl#getTipoPrimitivo()
	 * @generated
	 */
	int TIPO_PRIMITIVO = 5;


	/**
	 * Returns the meta object for class '{@link BD.EsquemaBD <em>Esquema BD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esquema BD</em>'.
	 * @see BD.EsquemaBD
	 * @generated
	 */
	EClass getEsquemaBD();

	/**
	 * Returns the meta object for the containment reference list '{@link BD.EsquemaBD#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see BD.EsquemaBD#getTablas()
	 * @see #getEsquemaBD()
	 * @generated
	 */
	EReference getEsquemaBD_Tablas();

	/**
	 * Returns the meta object for class '{@link BD.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see BD.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the containment reference list '{@link BD.Tabla#getColumnas <em>Columnas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnas</em>'.
	 * @see BD.Tabla#getColumnas()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Columnas();

	/**
	 * Returns the meta object for the reference '{@link BD.Tabla#getClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clave Primaria</em>'.
	 * @see BD.Tabla#getClavePrimaria()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_ClavePrimaria();

	/**
	 * Returns the meta object for the containment reference list '{@link BD.Tabla#getClavesAjenas <em>Claves Ajenas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claves Ajenas</em>'.
	 * @see BD.Tabla#getClavesAjenas()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_ClavesAjenas();

	/**
	 * Returns the meta object for class '{@link BD.Columna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columna</em>'.
	 * @see BD.Columna
	 * @generated
	 */
	EClass getColumna();

	/**
	 * Returns the meta object for the attribute '{@link BD.Columna#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see BD.Columna#getTipo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Tipo();

	/**
	 * Returns the meta object for class '{@link BD.ElementoNombrado <em>Elemento Nombrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Nombrado</em>'.
	 * @see BD.ElementoNombrado
	 * @generated
	 */
	EClass getElementoNombrado();

	/**
	 * Returns the meta object for the attribute '{@link BD.ElementoNombrado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see BD.ElementoNombrado#getNombre()
	 * @see #getElementoNombrado()
	 * @generated
	 */
	EAttribute getElementoNombrado_Nombre();

	/**
	 * Returns the meta object for class '{@link BD.ClaveAjena <em>Clave Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Ajena</em>'.
	 * @see BD.ClaveAjena
	 * @generated
	 */
	EClass getClaveAjena();

	/**
	 * Returns the meta object for the reference '{@link BD.ClaveAjena#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna</em>'.
	 * @see BD.ClaveAjena#getColumna()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EReference getClaveAjena_Columna();

	/**
	 * Returns the meta object for the reference '{@link BD.ClaveAjena#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see BD.ClaveAjena#getReferencia()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EReference getClaveAjena_Referencia();

	/**
	 * Returns the meta object for enum '{@link BD.TipoPrimitivo <em>Tipo Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Primitivo</em>'.
	 * @see BD.TipoPrimitivo
	 * @generated
	 */
	EEnum getTipoPrimitivo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BDFactory getBDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BD.impl.EsquemaBDImpl <em>Esquema BD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.impl.EsquemaBDImpl
		 * @see BD.impl.BDPackageImpl#getEsquemaBD()
		 * @generated
		 */
		EClass ESQUEMA_BD = eINSTANCE.getEsquemaBD();

		/**
		 * The meta object literal for the '<em><b>Tablas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESQUEMA_BD__TABLAS = eINSTANCE.getEsquemaBD_Tablas();

		/**
		 * The meta object literal for the '{@link BD.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.impl.TablaImpl
		 * @see BD.impl.BDPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '<em><b>Columnas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__COLUMNAS = eINSTANCE.getTabla_Columnas();

		/**
		 * The meta object literal for the '<em><b>Clave Primaria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__CLAVE_PRIMARIA = eINSTANCE.getTabla_ClavePrimaria();

		/**
		 * The meta object literal for the '<em><b>Claves Ajenas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__CLAVES_AJENAS = eINSTANCE.getTabla_ClavesAjenas();

		/**
		 * The meta object literal for the '{@link BD.impl.ColumnaImpl <em>Columna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.impl.ColumnaImpl
		 * @see BD.impl.BDPackageImpl#getColumna()
		 * @generated
		 */
		EClass COLUMNA = eINSTANCE.getColumna();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__TIPO = eINSTANCE.getColumna_Tipo();

		/**
		 * The meta object literal for the '{@link BD.impl.ElementoNombradoImpl <em>Elemento Nombrado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.impl.ElementoNombradoImpl
		 * @see BD.impl.BDPackageImpl#getElementoNombrado()
		 * @generated
		 */
		EClass ELEMENTO_NOMBRADO = eINSTANCE.getElementoNombrado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_NOMBRADO__NOMBRE = eINSTANCE.getElementoNombrado_Nombre();

		/**
		 * The meta object literal for the '{@link BD.impl.ClaveAjenaImpl <em>Clave Ajena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.impl.ClaveAjenaImpl
		 * @see BD.impl.BDPackageImpl#getClaveAjena()
		 * @generated
		 */
		EClass CLAVE_AJENA = eINSTANCE.getClaveAjena();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAVE_AJENA__COLUMNA = eINSTANCE.getClaveAjena_Columna();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAVE_AJENA__REFERENCIA = eINSTANCE.getClaveAjena_Referencia();

		/**
		 * The meta object literal for the '{@link BD.TipoPrimitivo <em>Tipo Primitivo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BD.TipoPrimitivo
		 * @see BD.impl.BDPackageImpl#getTipoPrimitivo()
		 * @generated
		 */
		EEnum TIPO_PRIMITIVO = eINSTANCE.getTipoPrimitivo();

	}

} //BDPackage
