/**
 */
package domain;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://no/tdt4250/project/pokeDex/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "no.tdt4250.project.pokeDex.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainImpl
	 * @see domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kingdoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__KINGDOMS = 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.impl.KingdomImpl <em>Kingdom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.KingdomImpl
	 * @see domain.impl.DomainPackageImpl#getKingdom()
	 * @generated
	 */
	int KINGDOM = 1;

	/**
	 * The feature id for the '<em><b>Phyla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINGDOM__PHYLA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINGDOM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Kingdom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINGDOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kingdom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINGDOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.impl.PhylumImpl <em>Phylum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.PhylumImpl
	 * @see domain.impl.DomainPackageImpl#getPhylum()
	 * @generated
	 */
	int PHYLUM = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYLUM__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYLUM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Phylum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYLUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Phylum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYLUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.ClassImpl
	 * @see domain.impl.DomainPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Genera</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.impl.GenusImpl <em>Genus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.GenusImpl
	 * @see domain.impl.DomainPackageImpl#getGenus()
	 * @generated
	 */
	int GENUS = 4;

	/**
	 * The feature id for the '<em><b>Species</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__SPECIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Habitat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__HABITAT = 2;

	/**
	 * The feature id for the '<em><b>Same Anatomy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__SAME_ANATOMY = 3;

	/**
	 * The feature id for the '<em><b>Anatomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__ANATOMY = 4;

	/**
	 * The number of structural features of the '<em>Genus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Genus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.impl.SpeciesImpl <em>Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.SpeciesImpl
	 * @see domain.impl.DomainPackageImpl#getSpecies()
	 * @generated
	 */
	int SPECIES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evolves To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EVOLVES_TO = 1;

	/**
	 * The feature id for the '<em><b>Evolves From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EVOLVES_FROM = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__ICON = 3;

	/**
	 * The number of structural features of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link domain.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Domain#getKingdoms <em>Kingdoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kingdoms</em>'.
	 * @see domain.Domain#getKingdoms()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Kingdoms();

	/**
	 * Returns the meta object for class '{@link domain.Kingdom <em>Kingdom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kingdom</em>'.
	 * @see domain.Kingdom
	 * @generated
	 */
	EClass getKingdom();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Kingdom#getPhyla <em>Phyla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phyla</em>'.
	 * @see domain.Kingdom#getPhyla()
	 * @see #getKingdom()
	 * @generated
	 */
	EReference getKingdom_Phyla();

	/**
	 * Returns the meta object for the attribute '{@link domain.Kingdom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Kingdom#getName()
	 * @see #getKingdom()
	 * @generated
	 */
	EAttribute getKingdom_Name();

	/**
	 * Returns the meta object for class '{@link domain.Phylum <em>Phylum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phylum</em>'.
	 * @see domain.Phylum
	 * @generated
	 */
	EClass getPhylum();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Phylum#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see domain.Phylum#getClasses()
	 * @see #getPhylum()
	 * @generated
	 */
	EReference getPhylum_Classes();

	/**
	 * Returns the meta object for the attribute '{@link domain.Phylum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Phylum#getName()
	 * @see #getPhylum()
	 * @generated
	 */
	EAttribute getPhylum_Name();

	/**
	 * Returns the meta object for class '{@link domain.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see domain.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Class#getGenera <em>Genera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genera</em>'.
	 * @see domain.Class#getGenera()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Genera();

	/**
	 * Returns the meta object for the attribute '{@link domain.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link domain.Genus <em>Genus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genus</em>'.
	 * @see domain.Genus
	 * @generated
	 */
	EClass getGenus();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Genus#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Species</em>'.
	 * @see domain.Genus#getSpecies()
	 * @see #getGenus()
	 * @generated
	 */
	EReference getGenus_Species();

	/**
	 * Returns the meta object for the attribute '{@link domain.Genus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Genus#getName()
	 * @see #getGenus()
	 * @generated
	 */
	EAttribute getGenus_Name();

	/**
	 * Returns the meta object for the attribute '{@link domain.Genus#getHabitat <em>Habitat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Habitat</em>'.
	 * @see domain.Genus#getHabitat()
	 * @see #getGenus()
	 * @generated
	 */
	EAttribute getGenus_Habitat();

	/**
	 * Returns the meta object for the reference list '{@link domain.Genus#getSameAnatomy <em>Same Anatomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Same Anatomy</em>'.
	 * @see domain.Genus#getSameAnatomy()
	 * @see #getGenus()
	 * @generated
	 */
	EReference getGenus_SameAnatomy();

	/**
	 * Returns the meta object for the attribute '{@link domain.Genus#getAnatomy <em>Anatomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anatomy</em>'.
	 * @see domain.Genus#getAnatomy()
	 * @see #getGenus()
	 * @generated
	 */
	EAttribute getGenus_Anatomy();

	/**
	 * Returns the meta object for class '{@link domain.Species <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Species</em>'.
	 * @see domain.Species
	 * @generated
	 */
	EClass getSpecies();

	/**
	 * Returns the meta object for the attribute '{@link domain.Species#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Species#getName()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Name();

	/**
	 * Returns the meta object for the reference '{@link domain.Species#getEvolvesTo <em>Evolves To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolves To</em>'.
	 * @see domain.Species#getEvolvesTo()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_EvolvesTo();

	/**
	 * Returns the meta object for the reference '{@link domain.Species#getEvolvesFrom <em>Evolves From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolves From</em>'.
	 * @see domain.Species#getEvolvesFrom()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_EvolvesFrom();

	/**
	 * Returns the meta object for the attribute '{@link domain.Species#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see domain.Species#getIcon()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Icon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainImpl
		 * @see domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Kingdoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__KINGDOMS = eINSTANCE.getDomain_Kingdoms();

		/**
		 * The meta object literal for the '{@link domain.impl.KingdomImpl <em>Kingdom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.KingdomImpl
		 * @see domain.impl.DomainPackageImpl#getKingdom()
		 * @generated
		 */
		EClass KINGDOM = eINSTANCE.getKingdom();

		/**
		 * The meta object literal for the '<em><b>Phyla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINGDOM__PHYLA = eINSTANCE.getKingdom_Phyla();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINGDOM__NAME = eINSTANCE.getKingdom_Name();

		/**
		 * The meta object literal for the '{@link domain.impl.PhylumImpl <em>Phylum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.PhylumImpl
		 * @see domain.impl.DomainPackageImpl#getPhylum()
		 * @generated
		 */
		EClass PHYLUM = eINSTANCE.getPhylum();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYLUM__CLASSES = eINSTANCE.getPhylum_Classes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYLUM__NAME = eINSTANCE.getPhylum_Name();

		/**
		 * The meta object literal for the '{@link domain.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.ClassImpl
		 * @see domain.impl.DomainPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Genera</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GENERA = eINSTANCE.getClass_Genera();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link domain.impl.GenusImpl <em>Genus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.GenusImpl
		 * @see domain.impl.DomainPackageImpl#getGenus()
		 * @generated
		 */
		EClass GENUS = eINSTANCE.getGenus();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUS__SPECIES = eINSTANCE.getGenus_Species();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENUS__NAME = eINSTANCE.getGenus_Name();

		/**
		 * The meta object literal for the '<em><b>Habitat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENUS__HABITAT = eINSTANCE.getGenus_Habitat();

		/**
		 * The meta object literal for the '<em><b>Same Anatomy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUS__SAME_ANATOMY = eINSTANCE.getGenus_SameAnatomy();

		/**
		 * The meta object literal for the '<em><b>Anatomy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENUS__ANATOMY = eINSTANCE.getGenus_Anatomy();

		/**
		 * The meta object literal for the '{@link domain.impl.SpeciesImpl <em>Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.SpeciesImpl
		 * @see domain.impl.DomainPackageImpl#getSpecies()
		 * @generated
		 */
		EClass SPECIES = eINSTANCE.getSpecies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__NAME = eINSTANCE.getSpecies_Name();

		/**
		 * The meta object literal for the '<em><b>Evolves To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__EVOLVES_TO = eINSTANCE.getSpecies_EvolvesTo();

		/**
		 * The meta object literal for the '<em><b>Evolves From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__EVOLVES_FROM = eINSTANCE.getSpecies_EvolvesFrom();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__ICON = eINSTANCE.getSpecies_Icon();

	}

} //DomainPackage
