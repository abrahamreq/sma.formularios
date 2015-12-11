/**
 */
package form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link form.Formulario#getHasElement <em>Has Element</em>}</li>
 *   <li>{@link form.Formulario#getAristas <em>Aristas</em>}</li>
 * </ul>
 * </p>
 *
 * @see form.FormPackage#getFormulario()
 * @model
 * @generated
 */
public interface Formulario extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Element</b></em>' containment reference list.
	 * The list contents are of type {@link form.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Element</em>' containment reference list.
	 * @see form.FormPackage#getFormulario_HasElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getHasElement();

	/**
	 * Returns the value of the '<em><b>Aristas</b></em>' containment reference list.
	 * The list contents are of type {@link form.Arista}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aristas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aristas</em>' containment reference list.
	 * @see form.FormPackage#getFormulario_Aristas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arista> getAristas();

} // Formulario
