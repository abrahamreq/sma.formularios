/**
 */
package BD.impl;

import BD.BDPackage;
import BD.EsquemaBD;
import BD.Tabla;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Esquema BD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BD.impl.EsquemaBDImpl#getTablas <em>Tablas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EsquemaBDImpl extends ElementoNombradoImpl implements EsquemaBD {
	/**
	 * The cached value of the '{@link #getTablas() <em>Tablas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablas()
	 * @generated
	 * @ordered
	 */
	protected EList<Tabla> tablas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsquemaBDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDPackage.Literals.ESQUEMA_BD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tabla> getTablas() {
		if (tablas == null) {
			tablas = new EObjectContainmentEList<Tabla>(Tabla.class, this, BDPackage.ESQUEMA_BD__TABLAS);
		}
		return tablas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BDPackage.ESQUEMA_BD__TABLAS:
				return ((InternalEList<?>)getTablas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BDPackage.ESQUEMA_BD__TABLAS:
				return getTablas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BDPackage.ESQUEMA_BD__TABLAS:
				getTablas().clear();
				getTablas().addAll((Collection<? extends Tabla>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BDPackage.ESQUEMA_BD__TABLAS:
				getTablas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BDPackage.ESQUEMA_BD__TABLAS:
				return tablas != null && !tablas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EsquemaBDImpl
