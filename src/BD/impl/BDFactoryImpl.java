/**
 */
package BD.impl;

import BD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BDFactoryImpl extends EFactoryImpl implements BDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BDFactory init() {
		try {
			BDFactory theBDFactory = (BDFactory)EPackage.Registry.INSTANCE.getEFactory(BDPackage.eNS_URI);
			if (theBDFactory != null) {
				return theBDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BDPackage.ESQUEMA_BD: return createEsquemaBD();
			case BDPackage.TABLA: return createTabla();
			case BDPackage.COLUMNA: return createColumna();
			case BDPackage.ELEMENTO_NOMBRADO: return createElementoNombrado();
			case BDPackage.CLAVE_AJENA: return createClaveAjena();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BDPackage.TIPO_PRIMITIVO:
				return createTipoPrimitivoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BDPackage.TIPO_PRIMITIVO:
				return convertTipoPrimitivoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsquemaBD createEsquemaBD() {
		EsquemaBDImpl esquemaBD = new EsquemaBDImpl();
		return esquemaBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla createTabla() {
		TablaImpl tabla = new TablaImpl();
		return tabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna createColumna() {
		ColumnaImpl columna = new ColumnaImpl();
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoNombrado createElementoNombrado() {
		ElementoNombradoImpl elementoNombrado = new ElementoNombradoImpl();
		return elementoNombrado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaveAjena createClaveAjena() {
		ClaveAjenaImpl claveAjena = new ClaveAjenaImpl();
		return claveAjena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPrimitivo createTipoPrimitivoFromString(EDataType eDataType, String initialValue) {
		TipoPrimitivo result = TipoPrimitivo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPrimitivoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDPackage getBDPackage() {
		return (BDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BDPackage getPackage() {
		return BDPackage.eINSTANCE;
	}

} //BDFactoryImpl
