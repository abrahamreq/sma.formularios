/**
 */
package form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orden</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link form.Orden#getOrigen <em>Origen</em>}</li>
 *   <li>{@link form.Orden#getDestino <em>Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @see form.FormPackage#getOrden()
 * @model annotation="gmf.link source='origen' target='destino' style='solid' width='2' target.decoration='arrow'"
 * @generated
 */
public interface Orden extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.Element#getSalientes <em>Salientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Element)
	 * @see form.FormPackage#getOrden_Origen()
	 * @see form.Element#getSalientes
	 * @model opposite="salientes" required="true"
	 * @generated
	 */
	Element getOrigen();

	/**
	 * Sets the value of the '{@link form.Orden#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Element value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.Element#getEntrantes <em>Entrantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Element)
	 * @see form.FormPackage#getOrden_Destino()
	 * @see form.Element#getEntrantes
	 * @model opposite="entrantes" required="true"
	 * @generated
	 */
	Element getDestino();

	/**
	 * Sets the value of the '{@link form.Orden#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Element value);

} // Orden
