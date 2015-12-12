/**
 */
package BD.util;

import BD.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see BD.BDPackage
 * @generated
 */
public class BDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BDValidator INSTANCE = new BDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "BD";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BDPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BDPackage.ESQUEMA_BD:
				return validateEsquemaBD((EsquemaBD)value, diagnostics, context);
			case BDPackage.TABLA:
				return validateTabla((Tabla)value, diagnostics, context);
			case BDPackage.COLUMNA:
				return validateColumna((Columna)value, diagnostics, context);
			case BDPackage.ELEMENTO_NOMBRADO:
				return validateElementoNombrado((ElementoNombrado)value, diagnostics, context);
			case BDPackage.CLAVE_AJENA:
				return validateClaveAjena((ClaveAjena)value, diagnostics, context);
			case BDPackage.TIPO_PRIMITIVO:
				return validateTipoPrimitivo((TipoPrimitivo)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquemaBD(EsquemaBD esquemaBD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(esquemaBD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(esquemaBD, diagnostics, context);
		if (result || diagnostics != null) result &= validateEsquemaBD_TablaNoDuplicado(esquemaBD, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TablaNoDuplicado constraint of '<em>Esquema BD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESQUEMA_BD__TABLA_NO_DUPLICADO__EEXPRESSION = "\n" +
		"\t\t\ttablas->isUnique(nombre)";

	/**
	 * Validates the TablaNoDuplicado constraint of '<em>Esquema BD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquemaBD_TablaNoDuplicado(EsquemaBD esquemaBD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BDPackage.Literals.ESQUEMA_BD,
				 esquemaBD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TablaNoDuplicado",
				 ESQUEMA_BD__TABLA_NO_DUPLICADO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tabla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_ColumnaNoDuplicada(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_NombreMayuscula(tabla, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ColumnaNoDuplicada constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__COLUMNA_NO_DUPLICADA__EEXPRESSION = "\n" +
		"\t\t\tcolumnas->isUnique(nombre)";

	/**
	 * Validates the ColumnaNoDuplicada constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_ColumnaNoDuplicada(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BDPackage.Literals.TABLA,
				 tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ColumnaNoDuplicada",
				 TABLA__COLUMNA_NO_DUPLICADA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NombreMayuscula constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__NOMBRE_MAYUSCULA__EEXPRESSION = "\n" +
		"\t\t\tnombre.toUpperCase() = nombre";

	/**
	 * Validates the NombreMayuscula constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_NombreMayuscula(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BDPackage.Literals.TABLA,
				 tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreMayuscula",
				 TABLA__NOMBRE_MAYUSCULA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumna(Columna columna, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columna, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementoNombrado(ElementoNombrado elementoNombrado, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementoNombrado, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claveAjena, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoPrimitivo(TipoPrimitivo tipoPrimitivo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BDValidator
