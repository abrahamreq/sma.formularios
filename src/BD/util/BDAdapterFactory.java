/**
 */
package BD.util;

import BD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BD.BDPackage
 * @generated
 */
public class BDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDSwitch<Adapter> modelSwitch =
		new BDSwitch<Adapter>() {
			@Override
			public Adapter caseEsquemaBD(EsquemaBD object) {
				return createEsquemaBDAdapter();
			}
			@Override
			public Adapter caseTabla(Tabla object) {
				return createTablaAdapter();
			}
			@Override
			public Adapter caseColumna(Columna object) {
				return createColumnaAdapter();
			}
			@Override
			public Adapter caseElementoNombrado(ElementoNombrado object) {
				return createElementoNombradoAdapter();
			}
			@Override
			public Adapter caseClaveAjena(ClaveAjena object) {
				return createClaveAjenaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BD.EsquemaBD <em>Esquema BD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BD.EsquemaBD
	 * @generated
	 */
	public Adapter createEsquemaBDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BD.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BD.Tabla
	 * @generated
	 */
	public Adapter createTablaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BD.Columna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BD.Columna
	 * @generated
	 */
	public Adapter createColumnaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BD.ElementoNombrado <em>Elemento Nombrado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BD.ElementoNombrado
	 * @generated
	 */
	public Adapter createElementoNombradoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BD.ClaveAjena <em>Clave Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BD.ClaveAjena
	 * @generated
	 */
	public Adapter createClaveAjenaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BDAdapterFactory
