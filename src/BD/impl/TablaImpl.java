/**
 */
package BD.impl;

import BD.BDPackage;
import BD.ClaveAjena;
import BD.Columna;
import BD.Tabla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BD.impl.TablaImpl#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link BD.impl.TablaImpl#getClavePrimaria <em>Clave Primaria</em>}</li>
 *   <li>{@link BD.impl.TablaImpl#getClavesAjenas <em>Claves Ajenas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TablaImpl extends ElementoNombradoImpl implements Tabla {
	/**
	 * The cached value of the '{@link #getColumnas() <em>Columnas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnas()
	 * @generated
	 * @ordered
	 */
	protected EList<Columna> columnas;

	/**
	 * The cached value of the '{@link #getClavePrimaria() <em>Clave Primaria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClavePrimaria()
	 * @generated
	 * @ordered
	 */
	protected Columna clavePrimaria;

	/**
	 * The cached value of the '{@link #getClavesAjenas() <em>Claves Ajenas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClavesAjenas()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaveAjena> clavesAjenas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDPackage.Literals.TABLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Columna> getColumnas() {
		if (columnas == null) {
			columnas = new EObjectContainmentEList<Columna>(Columna.class, this, BDPackage.TABLA__COLUMNAS);
		}
		return columnas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna getClavePrimaria() {
		if (clavePrimaria != null && clavePrimaria.eIsProxy()) {
			InternalEObject oldClavePrimaria = (InternalEObject)clavePrimaria;
			clavePrimaria = (Columna)eResolveProxy(oldClavePrimaria);
			if (clavePrimaria != oldClavePrimaria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BDPackage.TABLA__CLAVE_PRIMARIA, oldClavePrimaria, clavePrimaria));
			}
		}
		return clavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna basicGetClavePrimaria() {
		return clavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClavePrimaria(Columna newClavePrimaria) {
		Columna oldClavePrimaria = clavePrimaria;
		clavePrimaria = newClavePrimaria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BDPackage.TABLA__CLAVE_PRIMARIA, oldClavePrimaria, clavePrimaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaveAjena> getClavesAjenas() {
		if (clavesAjenas == null) {
			clavesAjenas = new EObjectContainmentEList<ClaveAjena>(ClaveAjena.class, this, BDPackage.TABLA__CLAVES_AJENAS);
		}
		return clavesAjenas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BDPackage.TABLA__COLUMNAS:
				return ((InternalEList<?>)getColumnas()).basicRemove(otherEnd, msgs);
			case BDPackage.TABLA__CLAVES_AJENAS:
				return ((InternalEList<?>)getClavesAjenas()).basicRemove(otherEnd, msgs);
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
			case BDPackage.TABLA__COLUMNAS:
				return getColumnas();
			case BDPackage.TABLA__CLAVE_PRIMARIA:
				if (resolve) return getClavePrimaria();
				return basicGetClavePrimaria();
			case BDPackage.TABLA__CLAVES_AJENAS:
				return getClavesAjenas();
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
			case BDPackage.TABLA__COLUMNAS:
				getColumnas().clear();
				getColumnas().addAll((Collection<? extends Columna>)newValue);
				return;
			case BDPackage.TABLA__CLAVE_PRIMARIA:
				setClavePrimaria((Columna)newValue);
				return;
			case BDPackage.TABLA__CLAVES_AJENAS:
				getClavesAjenas().clear();
				getClavesAjenas().addAll((Collection<? extends ClaveAjena>)newValue);
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
			case BDPackage.TABLA__COLUMNAS:
				getColumnas().clear();
				return;
			case BDPackage.TABLA__CLAVE_PRIMARIA:
				setClavePrimaria((Columna)null);
				return;
			case BDPackage.TABLA__CLAVES_AJENAS:
				getClavesAjenas().clear();
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
			case BDPackage.TABLA__COLUMNAS:
				return columnas != null && !columnas.isEmpty();
			case BDPackage.TABLA__CLAVE_PRIMARIA:
				return clavePrimaria != null;
			case BDPackage.TABLA__CLAVES_AJENAS:
				return clavesAjenas != null && !clavesAjenas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TablaImpl
