/**
 */
package form.impl;

import form.Element;
import form.FormPackage;
import form.Orden;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orden</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link form.impl.OrdenImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link form.impl.OrdenImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdenImpl extends EObjectImpl implements Orden {
	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Element origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Element destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.ORDEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Element)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.ORDEN__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigen(Element newOrigen, NotificationChain msgs) {
		Element oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.ORDEN__ORIGEN, oldOrigen, newOrigen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Element newOrigen) {
		if (newOrigen != origen) {
			NotificationChain msgs = null;
			if (origen != null)
				msgs = ((InternalEObject)origen).eInverseRemove(this, FormPackage.ELEMENT__SALIENTES, Element.class, msgs);
			if (newOrigen != null)
				msgs = ((InternalEObject)newOrigen).eInverseAdd(this, FormPackage.ELEMENT__SALIENTES, Element.class, msgs);
			msgs = basicSetOrigen(newOrigen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.ORDEN__ORIGEN, newOrigen, newOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Element)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.ORDEN__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestino(Element newDestino, NotificationChain msgs) {
		Element oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.ORDEN__DESTINO, oldDestino, newDestino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Element newDestino) {
		if (newDestino != destino) {
			NotificationChain msgs = null;
			if (destino != null)
				msgs = ((InternalEObject)destino).eInverseRemove(this, FormPackage.ELEMENT__ENTRANTES, Element.class, msgs);
			if (newDestino != null)
				msgs = ((InternalEObject)newDestino).eInverseAdd(this, FormPackage.ELEMENT__ENTRANTES, Element.class, msgs);
			msgs = basicSetDestino(newDestino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.ORDEN__DESTINO, newDestino, newDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.ORDEN__ORIGEN:
				if (origen != null)
					msgs = ((InternalEObject)origen).eInverseRemove(this, FormPackage.ELEMENT__SALIENTES, Element.class, msgs);
				return basicSetOrigen((Element)otherEnd, msgs);
			case FormPackage.ORDEN__DESTINO:
				if (destino != null)
					msgs = ((InternalEObject)destino).eInverseRemove(this, FormPackage.ELEMENT__ENTRANTES, Element.class, msgs);
				return basicSetDestino((Element)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.ORDEN__ORIGEN:
				return basicSetOrigen(null, msgs);
			case FormPackage.ORDEN__DESTINO:
				return basicSetDestino(null, msgs);
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
			case FormPackage.ORDEN__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case FormPackage.ORDEN__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
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
			case FormPackage.ORDEN__ORIGEN:
				setOrigen((Element)newValue);
				return;
			case FormPackage.ORDEN__DESTINO:
				setDestino((Element)newValue);
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
			case FormPackage.ORDEN__ORIGEN:
				setOrigen((Element)null);
				return;
			case FormPackage.ORDEN__DESTINO:
				setDestino((Element)null);
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
			case FormPackage.ORDEN__ORIGEN:
				return origen != null;
			case FormPackage.ORDEN__DESTINO:
				return destino != null;
		}
		return super.eIsSet(featureID);
	}

} //OrdenImpl
