/**
 */
package form;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link form.SelectionList#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link form.SelectionList#getHasOption <em>Has Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see form.FormPackage#getSelectionList()
 * @model annotation="gmf.node label='name' figure='rectangle' label.placement='internal'"
 * @generated
 */
public interface SelectionList extends Editable {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see form.FormPackage#getSelectionList_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link form.SelectionList#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Option</b></em>' containment reference list.
	 * The list contents are of type {@link form.option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Option</em>' containment reference list.
	 * @see form.FormPackage#getSelectionList_HasOption()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<option> getHasOption();

} // SelectionList
