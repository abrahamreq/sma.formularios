/**
 */
package form;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see form.FormFactory
 * @model kind="package"
 * @generated
 */
public interface FormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "form";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sma.form/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.form";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormPackage eINSTANCE = form.impl.FormPackageImpl.init();

	/**
	 * The meta object id for the '{@link form.impl.FormularioImpl <em>Formulario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.FormularioImpl
	 * @see form.impl.FormPackageImpl#getFormulario()
	 * @generated
	 */
	int FORMULARIO = 0;

	/**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__HAS_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Orden</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__ORDEN = 1;

	/**
	 * The number of structural features of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link form.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.ElementImpl
	 * @see form.impl.FormPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SALIENTES = 0;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ENTRANTES = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link form.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.LabelImpl
	 * @see form.impl.FormPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 1;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SALIENTES = ELEMENT__SALIENTES;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ENTRANTES = ELEMENT__ENTRANTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOR = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.EditableImpl <em>Editable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.EditableImpl
	 * @see form.impl.FormPackageImpl#getEditable()
	 * @generated
	 */
	int EDITABLE = 2;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE__SALIENTES = ELEMENT__SALIENTES;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE__ENTRANTES = ELEMENT__ENTRANTES;

	/**
	 * The feature id for the '<em><b>Has Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE__HAS_LABEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE__DISABLED = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Editable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.InputImpl
	 * @see form.impl.FormPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 3;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SALIENTES = EDITABLE__SALIENTES;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ENTRANTES = EDITABLE__ENTRANTES;

	/**
	 * The feature id for the '<em><b>Has Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HAS_LABEL = EDITABLE__HAS_LABEL;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DISABLED = EDITABLE__DISABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = EDITABLE__NAME;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CHECKED = EDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = EDITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = EDITABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = EDITABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link form.impl.SelectionListImpl <em>Selection List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.SelectionListImpl
	 * @see form.impl.FormPackageImpl#getSelectionList()
	 * @generated
	 */
	int SELECTION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__SALIENTES = EDITABLE__SALIENTES;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__ENTRANTES = EDITABLE__ENTRANTES;

	/**
	 * The feature id for the '<em><b>Has Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__HAS_LABEL = EDITABLE__HAS_LABEL;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__DISABLED = EDITABLE__DISABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__NAME = EDITABLE__NAME;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__MULTIPLE = EDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST__HAS_OPTION = EDITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LIST_FEATURE_COUNT = EDITABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link form.impl.textAreaImpl <em>text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.textAreaImpl
	 * @see form.impl.FormPackageImpl#gettextArea()
	 * @generated
	 */
	int TEXT_AREA = 5;

	/**
	 * The feature id for the '<em><b>Salientes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__SALIENTES = EDITABLE__SALIENTES;

	/**
	 * The feature id for the '<em><b>Entrantes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ENTRANTES = EDITABLE__ENTRANTES;

	/**
	 * The feature id for the '<em><b>Has Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__HAS_LABEL = EDITABLE__HAS_LABEL;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DISABLED = EDITABLE__DISABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = EDITABLE__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CONTENT = EDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = EDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link form.impl.optionImpl <em>option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.optionImpl
	 * @see form.impl.FormPackageImpl#getoption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link form.impl.OrdenImpl <em>Orden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see form.impl.OrdenImpl
	 * @see form.impl.FormPackageImpl#getOrden()
	 * @generated
	 */
	int ORDEN = 7;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEN__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEN__DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Orden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEN_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link form.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulario</em>'.
	 * @see form.Formulario
	 * @generated
	 */
	EClass getFormulario();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Formulario#getHasElement <em>Has Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Element</em>'.
	 * @see form.Formulario#getHasElement()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_HasElement();

	/**
	 * Returns the meta object for the containment reference list '{@link form.Formulario#getOrden <em>Orden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orden</em>'.
	 * @see form.Formulario#getOrden()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Orden();

	/**
	 * Returns the meta object for class '{@link form.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see form.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link form.Label#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see form.Label#getContent()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Content();

	/**
	 * Returns the meta object for the attribute '{@link form.Label#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For</em>'.
	 * @see form.Label#getFor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_For();

	/**
	 * Returns the meta object for class '{@link form.Editable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editable</em>'.
	 * @see form.Editable
	 * @generated
	 */
	EClass getEditable();

	/**
	 * Returns the meta object for the containment reference '{@link form.Editable#getHasLabel <em>Has Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Label</em>'.
	 * @see form.Editable#getHasLabel()
	 * @see #getEditable()
	 * @generated
	 */
	EReference getEditable_HasLabel();

	/**
	 * Returns the meta object for the attribute '{@link form.Editable#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see form.Editable#isDisabled()
	 * @see #getEditable()
	 * @generated
	 */
	EAttribute getEditable_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link form.Editable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see form.Editable#getName()
	 * @see #getEditable()
	 * @generated
	 */
	EAttribute getEditable_Name();

	/**
	 * Returns the meta object for class '{@link form.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see form.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link form.Input#isChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see form.Input#isChecked()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Checked();

	/**
	 * Returns the meta object for the attribute '{@link form.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see form.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link form.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see form.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Value();

	/**
	 * Returns the meta object for class '{@link form.SelectionList <em>Selection List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection List</em>'.
	 * @see form.SelectionList
	 * @generated
	 */
	EClass getSelectionList();

	/**
	 * Returns the meta object for the attribute '{@link form.SelectionList#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see form.SelectionList#isMultiple()
	 * @see #getSelectionList()
	 * @generated
	 */
	EAttribute getSelectionList_Multiple();

	/**
	 * Returns the meta object for the containment reference list '{@link form.SelectionList#getHasOption <em>Has Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Option</em>'.
	 * @see form.SelectionList#getHasOption()
	 * @see #getSelectionList()
	 * @generated
	 */
	EReference getSelectionList_HasOption();

	/**
	 * Returns the meta object for class '{@link form.textArea <em>text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>text Area</em>'.
	 * @see form.textArea
	 * @generated
	 */
	EClass gettextArea();

	/**
	 * Returns the meta object for the attribute '{@link form.textArea#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see form.textArea#getContent()
	 * @see #gettextArea()
	 * @generated
	 */
	EAttribute gettextArea_Content();

	/**
	 * Returns the meta object for class '{@link form.option <em>option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>option</em>'.
	 * @see form.option
	 * @generated
	 */
	EClass getoption();

	/**
	 * Returns the meta object for the attribute '{@link form.option#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see form.option#getContent()
	 * @see #getoption()
	 * @generated
	 */
	EAttribute getoption_Content();

	/**
	 * Returns the meta object for the attribute '{@link form.option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see form.option#getValue()
	 * @see #getoption()
	 * @generated
	 */
	EAttribute getoption_Value();

	/**
	 * Returns the meta object for class '{@link form.Orden <em>Orden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orden</em>'.
	 * @see form.Orden
	 * @generated
	 */
	EClass getOrden();

	/**
	 * Returns the meta object for the reference '{@link form.Orden#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see form.Orden#getOrigen()
	 * @see #getOrden()
	 * @generated
	 */
	EReference getOrden_Origen();

	/**
	 * Returns the meta object for the reference '{@link form.Orden#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see form.Orden#getDestino()
	 * @see #getOrden()
	 * @generated
	 */
	EReference getOrden_Destino();

	/**
	 * Returns the meta object for class '{@link form.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see form.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link form.Element#getSalientes <em>Salientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Salientes</em>'.
	 * @see form.Element#getSalientes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Salientes();

	/**
	 * Returns the meta object for the reference '{@link form.Element#getEntrantes <em>Entrantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entrantes</em>'.
	 * @see form.Element#getEntrantes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Entrantes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormFactory getFormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link form.impl.FormularioImpl <em>Formulario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.FormularioImpl
		 * @see form.impl.FormPackageImpl#getFormulario()
		 * @generated
		 */
		EClass FORMULARIO = eINSTANCE.getFormulario();

		/**
		 * The meta object literal for the '<em><b>Has Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__HAS_ELEMENT = eINSTANCE.getFormulario_HasElement();

		/**
		 * The meta object literal for the '<em><b>Orden</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__ORDEN = eINSTANCE.getFormulario_Orden();

		/**
		 * The meta object literal for the '{@link form.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.LabelImpl
		 * @see form.impl.FormPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__CONTENT = eINSTANCE.getLabel_Content();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FOR = eINSTANCE.getLabel_For();

		/**
		 * The meta object literal for the '{@link form.impl.EditableImpl <em>Editable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.EditableImpl
		 * @see form.impl.FormPackageImpl#getEditable()
		 * @generated
		 */
		EClass EDITABLE = eINSTANCE.getEditable();

		/**
		 * The meta object literal for the '<em><b>Has Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITABLE__HAS_LABEL = eINSTANCE.getEditable_HasLabel();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLE__DISABLED = eINSTANCE.getEditable_Disabled();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLE__NAME = eINSTANCE.getEditable_Name();

		/**
		 * The meta object literal for the '{@link form.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.InputImpl
		 * @see form.impl.FormPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__CHECKED = eINSTANCE.getInput_Checked();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '{@link form.impl.SelectionListImpl <em>Selection List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.SelectionListImpl
		 * @see form.impl.FormPackageImpl#getSelectionList()
		 * @generated
		 */
		EClass SELECTION_LIST = eINSTANCE.getSelectionList();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_LIST__MULTIPLE = eINSTANCE.getSelectionList_Multiple();

		/**
		 * The meta object literal for the '<em><b>Has Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_LIST__HAS_OPTION = eINSTANCE.getSelectionList_HasOption();

		/**
		 * The meta object literal for the '{@link form.impl.textAreaImpl <em>text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.textAreaImpl
		 * @see form.impl.FormPackageImpl#gettextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.gettextArea();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__CONTENT = eINSTANCE.gettextArea_Content();

		/**
		 * The meta object literal for the '{@link form.impl.optionImpl <em>option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.optionImpl
		 * @see form.impl.FormPackageImpl#getoption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getoption();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__CONTENT = eINSTANCE.getoption_Content();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getoption_Value();

		/**
		 * The meta object literal for the '{@link form.impl.OrdenImpl <em>Orden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.OrdenImpl
		 * @see form.impl.FormPackageImpl#getOrden()
		 * @generated
		 */
		EClass ORDEN = eINSTANCE.getOrden();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDEN__ORIGEN = eINSTANCE.getOrden_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDEN__DESTINO = eINSTANCE.getOrden_Destino();

		/**
		 * The meta object literal for the '{@link form.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see form.impl.ElementImpl
		 * @see form.impl.FormPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Salientes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SALIENTES = eINSTANCE.getElement_Salientes();

		/**
		 * The meta object literal for the '<em><b>Entrantes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ENTRANTES = eINSTANCE.getElement_Entrantes();

	}

} //FormPackage
