/**
 */
package domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link domain.impl.KingdomImpl <em>Kingdom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.KingdomImpl
	 * @see domain.impl.DomainPackageImpl#getKingdom()
	 * @generated
	 */
	int KINGDOM = 0;

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
	int PHYLUM = 1;

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
	int CLASS = 2;

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
	int GENUS = 3;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference list.
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
	 * The number of structural features of the '<em>Genus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS_FEATURE_COUNT = 2;

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
	int SPECIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evolves To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EVOLVES_TO = 1;

	/**
	 * The feature id for the '<em><b>Evolves From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EVOLVES_FROM = 2;

	/**
	 * The number of structural features of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domain.Kingdoms <em>Kingdoms</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.Kingdoms
	 * @see domain.impl.DomainPackageImpl#getKingdoms()
	 * @generated
	 */
	int KINGDOMS = 5;

	/**
	 * The meta object id for the '{@link domain.Phlya <em>Phlya</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.Phlya
	 * @see domain.impl.DomainPackageImpl#getPhlya()
	 * @generated
	 */
	int PHLYA = 6;

	/**
	 * The meta object id for the '{@link domain.Classes <em>Classes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.Classes
	 * @see domain.impl.DomainPackageImpl#getClasses()
	 * @generated
	 */
	int CLASSES = 7;


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
	 * Returns the meta object for the reference list '{@link domain.Genus#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Species</em>'.
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
	 * Returns the meta object for the reference list '{@link domain.Species#getEvolvesTo <em>Evolves To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evolves To</em>'.
	 * @see domain.Species#getEvolvesTo()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_EvolvesTo();

	/**
	 * Returns the meta object for the reference list '{@link domain.Species#getEvolvesFrom <em>Evolves From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evolves From</em>'.
	 * @see domain.Species#getEvolvesFrom()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_EvolvesFrom();

	/**
	 * Returns the meta object for enum '{@link domain.Kingdoms <em>Kingdoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kingdoms</em>'.
	 * @see domain.Kingdoms
	 * @generated
	 */
	EEnum getKingdoms();

	/**
	 * Returns the meta object for enum '{@link domain.Phlya <em>Phlya</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phlya</em>'.
	 * @see domain.Phlya
	 * @generated
	 */
	EEnum getPhlya();

	/**
	 * Returns the meta object for enum '{@link domain.Classes <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classes</em>'.
	 * @see domain.Classes
	 * @generated
	 */
	EEnum getClasses();

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
		 * The meta object literal for the '<em><b>Species</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Evolves To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__EVOLVES_TO = eINSTANCE.getSpecies_EvolvesTo();

		/**
		 * The meta object literal for the '<em><b>Evolves From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__EVOLVES_FROM = eINSTANCE.getSpecies_EvolvesFrom();

		/**
		 * The meta object literal for the '{@link domain.Kingdoms <em>Kingdoms</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.Kingdoms
		 * @see domain.impl.DomainPackageImpl#getKingdoms()
		 * @generated
		 */
		EEnum KINGDOMS = eINSTANCE.getKingdoms();

		/**
		 * The meta object literal for the '{@link domain.Phlya <em>Phlya</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.Phlya
		 * @see domain.impl.DomainPackageImpl#getPhlya()
		 * @generated
		 */
		EEnum PHLYA = eINSTANCE.getPhlya();

		/**
		 * The meta object literal for the '{@link domain.Classes <em>Classes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.Classes
		 * @see domain.impl.DomainPackageImpl#getClasses()
		 * @generated
		 */
		EEnum CLASSES = eINSTANCE.getClasses();

	}

} //DomainPackage
