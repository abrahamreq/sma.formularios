/**
 */
package BD.impl;

import BD.BDPackage;
import BD.ClaveAjena;
import BD.Columna;
import BD.Tabla;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clave Ajena</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BD.impl.ClaveAjenaImpl#getColumna <em>Columna</em>}</li>
 *   <li>{@link BD.impl.ClaveAjenaImpl#getReferencia <em>Referencia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaveAjenaImpl extends EObjectImpl implements ClaveAjena {
	/**
	 * The cached value of the '{@link #getColumna() <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumna()
	 * @generated
	 * @ordered
	 */
	protected Columna columna;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected Tabla referencia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaveAjenaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDPackage.Literals.CLAVE_AJENA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna getColumna() {
		if (columna != null && columna.eIsProxy()) {
			InternalEObject oldColumna = (InternalEObject)columna;
			columna = (Columna)eResolveProxy(oldColumna);
			if (columna != oldColumna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BDPackage.CLAVE_AJENA__COLUMNA, oldColumna, columna));
			}
		}
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna basicGetColumna() {
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumna(Columna newColumna) {
		Columna oldColumna = columna;
		columna = newColumna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BDPackage.CLAVE_AJENA__COLUMNA, oldColumna, columna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getReferencia() {
		if (referencia != null && referencia.eIsProxy()) {
			InternalEObject oldReferencia = (InternalEObject)referencia;
			referencia = (Tabla)eResolveProxy(oldReferencia);
			if (referencia != oldReferencia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BDPackage.CLAVE_AJENA__REFERENCIA, oldReferencia, referencia));
			}
		}
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(Tabla newReferencia) {
		Tabla oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BDPackage.CLAVE_AJENA__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BDPackage.CLAVE_AJENA__COLUMNA:
				if (resolve) return getColumna();
				return basicGetColumna();
			case BDPackage.CLAVE_AJENA__REFERENCIA:
				if (resolve) return getReferencia();
				return basicGetReferencia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BDPackage.CLAVE_AJENA__COLUMNA:
				setColumna((Columna)newValue);
				return;
			case BDPackage.CLAVE_AJENA__REFERENCIA:
				setReferencia((Tabla)newValue);
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
			case BDPackage.CLAVE_AJENA__COLUMNA:
				setColumna((Columna)null);
				return;
			case BDPackage.CLAVE_AJENA__REFERENCIA:
				setReferencia((Tabla)null);
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
			case BDPackage.CLAVE_AJENA__COLUMNA:
				return columna != null;
			case BDPackage.CLAVE_AJENA__REFERENCIA:
				return referencia != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaveAjenaImpl
