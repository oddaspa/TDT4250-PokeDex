/**
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phlya</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getPhlya()
 * @model
 * @generated
 */
public enum Phlya implements Enumerator {
	/**
	 * The '<em><b>Chordates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHORDATES_VALUE
	 * @generated
	 * @ordered
	 */
	CHORDATES(0, "Chordates", "Chordates"),

	/**
	 * The '<em><b>Arthropods</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHROPODS_VALUE
	 * @generated
	 * @ordered
	 */
	ARTHROPODS(1, "Arthropods", "Arthropods"),

	/**
	 * The '<em><b>Vertebrate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTEBRATE_VALUE
	 * @generated
	 * @ordered
	 */
	VERTEBRATE(2, "Vertebrate", "Vertebrate"), /**
	 * The '<em><b>Angiospermophyta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGIOSPERMOPHYTA_VALUE
	 * @generated
	 * @ordered
	 */
	ANGIOSPERMOPHYTA(3, "Angiospermophyta", "Angiospermophyta"), /**
	 * The '<em><b>Metamorphic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAMORPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	METAMORPHIC(4, "Metamorphic", "Metamorphic");

	/**
	 * The '<em><b>Chordates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHORDATES
	 * @model name="Chordates"
	 * @generated
	 * @ordered
	 */
	public static final int CHORDATES_VALUE = 0;

	/**
	 * The '<em><b>Arthropods</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHROPODS
	 * @model name="Arthropods"
	 * @generated
	 * @ordered
	 */
	public static final int ARTHROPODS_VALUE = 1;

	/**
	 * The '<em><b>Vertebrate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTEBRATE
	 * @model name="Vertebrate"
	 * @generated
	 * @ordered
	 */
	public static final int VERTEBRATE_VALUE = 2;

	/**
	 * The '<em><b>Angiospermophyta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGIOSPERMOPHYTA
	 * @model name="Angiospermophyta"
	 * @generated
	 * @ordered
	 */
	public static final int ANGIOSPERMOPHYTA_VALUE = 3;

	/**
	 * The '<em><b>Metamorphic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAMORPHIC
	 * @model name="Metamorphic"
	 * @generated
	 * @ordered
	 */
	public static final int METAMORPHIC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Phlya</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Phlya[] VALUES_ARRAY =
		new Phlya[] {
			CHORDATES,
			ARTHROPODS,
			VERTEBRATE,
			ANGIOSPERMOPHYTA,
			METAMORPHIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Phlya</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Phlya> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phlya</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phlya get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Phlya result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phlya</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phlya getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Phlya result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phlya</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phlya get(int value) {
		switch (value) {
			case CHORDATES_VALUE: return CHORDATES;
			case ARTHROPODS_VALUE: return ARTHROPODS;
			case VERTEBRATE_VALUE: return VERTEBRATE;
			case ANGIOSPERMOPHYTA_VALUE: return ANGIOSPERMOPHYTA;
			case METAMORPHIC_VALUE: return METAMORPHIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Phlya(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Phlya
