/**
 */
package form.impl;

import form.Arista;
import form.Element;
import form.FormPackage;
import form.Formulario;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link form.impl.FormularioImpl#getHasElement <em>Has Element</em>}</li>
 *   <li>{@link form.impl.FormularioImpl#getAristas <em>Aristas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormularioImpl extends EObjectImpl implements Formulario {
	/**
	 * The cached value of the '{@link #getHasElement() <em>Has Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> hasElement;

	/**
	 * The cached value of the '{@link #getAristas() <em>Aristas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAristas()
	 * @generated
	 * @ordered
	 */
	protected EList<Arista> aristas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormularioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.FORMULARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getHasElement() {
		if (hasElement == null) {
			hasElement = new EObjectContainmentEList<Element>(Element.class, this, FormPackage.FORMULARIO__HAS_ELEMENT);
		}
		return hasElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arista> getAristas() {
		if (aristas == null) {
			aristas = new EObjectContainmentEList<Arista>(Arista.class, this, FormPackage.FORMULARIO__ARISTAS);
		}
		return aristas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.FORMULARIO__HAS_ELEMENT:
				return ((InternalEList<?>)getHasElement()).basicRemove(otherEnd, msgs);
			case FormPackage.FORMULARIO__ARISTAS:
				return ((InternalEList<?>)getAristas()).basicRemove(otherEnd, msgs);
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
			case FormPackage.FORMULARIO__HAS_ELEMENT:
				return getHasElement();
			case FormPackage.FORMULARIO__ARISTAS:
				return getAristas();
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
			case FormPackage.FORMULARIO__HAS_ELEMENT:
				getHasElement().clear();
				getHasElement().addAll((Collection<? extends Element>)newValue);
				return;
			case FormPackage.FORMULARIO__ARISTAS:
				getAristas().clear();
				getAristas().addAll((Collection<? extends Arista>)newValue);
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
			case FormPackage.FORMULARIO__HAS_ELEMENT:
				getHasElement().clear();
				return;
			case FormPackage.FORMULARIO__ARISTAS:
				getAristas().clear();
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
			case FormPackage.FORMULARIO__HAS_ELEMENT:
				return hasElement != null && !hasElement.isEmpty();
			case FormPackage.FORMULARIO__ARISTAS:
				return aristas != null && !aristas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormularioImpl
