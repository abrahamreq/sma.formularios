/**
 */
package BD.impl;

import BD.BDFactory;
import BD.BDPackage;
import BD.ClaveAjena;
import BD.Columna;
import BD.ElementoNombrado;
import BD.EsquemaBD;
import BD.Tabla;
import BD.TipoPrimitivo;

import BD.util.BDValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BDPackageImpl extends EPackageImpl implements BDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esquemaBDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoNombradoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claveAjenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPrimitivoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BD.BDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BDPackageImpl() {
		super(eNS_URI, BDFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BDPackage init() {
		if (isInited) return (BDPackage)EPackage.Registry.INSTANCE.getEPackage(BDPackage.eNS_URI);

		// Obtain or create and register package
		BDPackageImpl theBDPackage = (BDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBDPackage.createPackageContents();

		// Initialize created meta-data
		theBDPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBDPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BDValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BDPackage.eNS_URI, theBDPackage);
		return theBDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsquemaBD() {
		return esquemaBDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsquemaBD_Tablas() {
		return (EReference)esquemaBDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabla() {
		return tablaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_Columnas() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_ClavePrimaria() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_ClavesAjenas() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumna() {
		return columnaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_Tipo() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoNombrado() {
		return elementoNombradoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoNombrado_Nombre() {
		return (EAttribute)elementoNombradoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaveAjena() {
		return claveAjenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaveAjena_Columna() {
		return (EReference)claveAjenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaveAjena_Referencia() {
		return (EReference)claveAjenaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPrimitivo() {
		return tipoPrimitivoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDFactory getBDFactory() {
		return (BDFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		esquemaBDEClass = createEClass(ESQUEMA_BD);
		createEReference(esquemaBDEClass, ESQUEMA_BD__TABLAS);

		tablaEClass = createEClass(TABLA);
		createEReference(tablaEClass, TABLA__COLUMNAS);
		createEReference(tablaEClass, TABLA__CLAVE_PRIMARIA);
		createEReference(tablaEClass, TABLA__CLAVES_AJENAS);

		columnaEClass = createEClass(COLUMNA);
		createEAttribute(columnaEClass, COLUMNA__TIPO);

		elementoNombradoEClass = createEClass(ELEMENTO_NOMBRADO);
		createEAttribute(elementoNombradoEClass, ELEMENTO_NOMBRADO__NOMBRE);

		claveAjenaEClass = createEClass(CLAVE_AJENA);
		createEReference(claveAjenaEClass, CLAVE_AJENA__COLUMNA);
		createEReference(claveAjenaEClass, CLAVE_AJENA__REFERENCIA);

		// Create enums
		tipoPrimitivoEEnum = createEEnum(TIPO_PRIMITIVO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		esquemaBDEClass.getESuperTypes().add(this.getElementoNombrado());
		tablaEClass.getESuperTypes().add(this.getElementoNombrado());
		columnaEClass.getESuperTypes().add(this.getElementoNombrado());

		// Initialize classes and features; add operations and parameters
		initEClass(esquemaBDEClass, EsquemaBD.class, "EsquemaBD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsquemaBD_Tablas(), this.getTabla(), null, "tablas", null, 0, -1, EsquemaBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabla_Columnas(), this.getColumna(), null, "columnas", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ClavePrimaria(), this.getColumna(), null, "clavePrimaria", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_ClavesAjenas(), this.getClaveAjena(), null, "clavesAjenas", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnaEClass, Columna.class, "Columna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumna_Tipo(), this.getTipoPrimitivo(), "tipo", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoNombradoEClass, ElementoNombrado.class, "ElementoNombrado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoNombrado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ElementoNombrado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claveAjenaEClass, ClaveAjena.class, "ClaveAjena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaveAjena_Columna(), this.getColumna(), null, "columna", null, 1, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaveAjena_Referencia(), this.getTabla(), null, "referencia", null, 1, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoPrimitivoEEnum, TipoPrimitivo.class, "TipoPrimitivo");
		addEEnumLiteral(tipoPrimitivoEEnum, TipoPrimitivo.STRING);
		addEEnumLiteral(tipoPrimitivoEEnum, TipoPrimitivo.INTEGER);
		addEEnumLiteral(tipoPrimitivoEEnum, TipoPrimitivo.DOUBLE);
		addEEnumLiteral(tipoPrimitivoEEnum, TipoPrimitivo.DATE);
		addEEnumLiteral(tipoPrimitivoEEnum, TipoPrimitivo.BOOLEAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (esquemaBDEClass, 
		   source, 
		   new String[] {
			 "constraints", "TablaNoDuplicado"
		   });	
		addAnnotation
		  (tablaEClass, 
		   source, 
		   new String[] {
			 "constraints", "ColumnaNoDuplicada NombreMayuscula"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (esquemaBDEClass, 
		   source, 
		   new String[] {
			 "TablaNoDuplicado", "\n\t\t\ttablas->isUnique(nombre)"
		   });	
		addAnnotation
		  (tablaEClass, 
		   source, 
		   new String[] {
			 "ColumnaNoDuplicada", "\n\t\t\tcolumnas->isUnique(nombre)",
			 "NombreMayuscula", "\n\t\t\tnombre.toUpperCase() = nombre"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (esquemaBDEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (tablaEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "label.placement", "internal",
			 "figure", "rectangle",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (columnaEClass, 
		   source, 
		   new String[] {
			 "label", "nombre,tipo",
			 "label.placement", "internal",
			 "figure", "rectangle",
			 "label.icon", "false",
			 "label.pattern", "{0}:{1}"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getTabla_Columnas(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (claveAjenaEClass, 
		   source, 
		   new String[] {
			 "source", "columna",
			 "target", "referencia",
			 "style", "solid",
			 "width", "2",
			 "target.decoration", "arrow"
		   });
	}

} //BDPackageImpl
