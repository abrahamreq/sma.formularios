/**
 */
package form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link form.Element#getSalientes <em>Salientes</em>}</li>
 *   <li>{@link form.Element#getEntrantes <em>Entrantes</em>}</li>
 * </ul>
 * </p>
 *
 * @see form.FormPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {

	/**
	 * Returns the value of the '<em><b>Salientes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.Arista#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salientes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salientes</em>' reference.
	 * @see #setSalientes(Arista)
	 * @see form.FormPackage#getElement_Salientes()
	 * @see form.Arista#getOrigen
	 * @model opposite="origen"
	 * @generated
	 */
	Arista getSalientes();

	/**
	 * Sets the value of the '{@link form.Element#getSalientes <em>Salientes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salientes</em>' reference.
	 * @see #getSalientes()
	 * @generated
	 */
	void setSalientes(Arista value);

	/**
	 * Returns the value of the '<em><b>Entrantes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.Arista#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrantes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrantes</em>' reference.
	 * @see #setEntrantes(Arista)
	 * @see form.FormPackage#getElement_Entrantes()
	 * @see form.Arista#getDestino
	 * @model opposite="destino"
	 * @generated
	 */
	Arista getEntrantes();

	/**
	 * Sets the value of the '{@link form.Element#getEntrantes <em>Entrantes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrantes</em>' reference.
	 * @see #getEntrantes()
	 * @generated
	 */
	void setEntrantes(Arista value);
} // Element
