/**
 */
package form.impl;

import form.Arista;
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
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link form.impl.ElementImpl#getSalientes <em>Salientes</em>}</li>
 *   <li>{@link form.impl.ElementImpl#getEntrantes <em>Entrantes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getSalientes() <em>Salientes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalientes()
	 * @generated
	 * @ordered
	 */
	protected Orden salientes;
	/**
	 * The cached value of the '{@link #getEntrantes() <em>Entrantes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrantes()
	 * @generated
	 * @ordered
	 */
	protected Orden entrantes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orden getSalientes() {
		if (salientes != null && salientes.eIsProxy()) {
			InternalEObject oldSalientes = (InternalEObject)salientes;
			salientes = (Orden)eResolveProxy(oldSalientes);
			if (salientes != oldSalientes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.ELEMENT__SALIENTES, oldSalientes, salientes));
			}
		}
		return salientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orden basicGetSalientes() {
		return salientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalientes(Orden newSalientes, NotificationChain msgs) {
		Orden oldSalientes = salientes;
		salientes = newSalientes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.ELEMENT__SALIENTES, oldSalientes, newSalientes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalientes(Orden newSalientes) {
		if (newSalientes != salientes) {
			NotificationChain msgs = null;
			if (salientes != null)
				msgs = ((InternalEObject)salientes).eInverseRemove(this, FormPackage.ORDEN__ORIGEN, Orden.class, msgs);
			if (newSalientes != null)
				msgs = ((InternalEObject)newSalientes).eInverseAdd(this, FormPackage.ORDEN__ORIGEN, Orden.class, msgs);
			msgs = basicSetSalientes(newSalientes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.ELEMENT__SALIENTES, newSalientes, newSalientes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orden getEntrantes() {
		if (entrantes != null && entrantes.eIsProxy()) {
			InternalEObject oldEntrantes = (InternalEObject)entrantes;
			entrantes = (Orden)eResolveProxy(oldEntrantes);
			if (entrantes != oldEntrantes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.ELEMENT__ENTRANTES, oldEntrantes, entrantes));
			}
		}
		return entrantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orden basicGetEntrantes() {
		return entrantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntrantes(Orden newEntrantes, NotificationChain msgs) {
		Orden oldEntrantes = entrantes;
		entrantes = newEntrantes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.ELEMENT__ENTRANTES, oldEntrantes, newEntrantes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrantes(Orden newEntrantes) {
		if (newEntrantes != entrantes) {
			NotificationChain msgs = null;
			if (entrantes != null)
				msgs = ((InternalEObject)entrantes).eInverseRemove(this, FormPackage.ORDEN__DESTINO, Orden.class, msgs);
			if (newEntrantes != null)
				msgs = ((InternalEObject)newEntrantes).eInverseAdd(this, FormPackage.ORDEN__DESTINO, Orden.class, msgs);
			msgs = basicSetEntrantes(newEntrantes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.ELEMENT__ENTRANTES, newEntrantes, newEntrantes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.ELEMENT__SALIENTES:
				if (salientes != null)
					msgs = ((InternalEObject)salientes).eInverseRemove(this, FormPackage.ORDEN__ORIGEN, Orden.class, msgs);
				return basicSetSalientes((Orden)otherEnd, msgs);
			case FormPackage.ELEMENT__ENTRANTES:
				if (entrantes != null)
					msgs = ((InternalEObject)entrantes).eInverseRemove(this, FormPackage.ORDEN__DESTINO, Orden.class, msgs);
				return basicSetEntrantes((Orden)otherEnd, msgs);
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
			case FormPackage.ELEMENT__SALIENTES:
				return basicSetSalientes(null, msgs);
			case FormPackage.ELEMENT__ENTRANTES:
				return basicSetEntrantes(null, msgs);
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
			case FormPackage.ELEMENT__SALIENTES:
				if (resolve) return getSalientes();
				return basicGetSalientes();
			case FormPackage.ELEMENT__ENTRANTES:
				if (resolve) return getEntrantes();
				return basicGetEntrantes();
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
			case FormPackage.ELEMENT__SALIENTES:
				setSalientes((Orden)newValue);
				return;
			case FormPackage.ELEMENT__ENTRANTES:
				setEntrantes((Orden)newValue);
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
			case FormPackage.ELEMENT__SALIENTES:
				setSalientes((Orden)null);
				return;
			case FormPackage.ELEMENT__ENTRANTES:
				setEntrantes((Orden)null);
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
			case FormPackage.ELEMENT__SALIENTES:
				return salientes != null;
			case FormPackage.ELEMENT__ENTRANTES:
				return entrantes != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
