/**
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getClasses()
 * @model
 * @generated
 */
public enum Classes implements Enumerator {
	/**
	 * The '<em><b>Bird</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRD_VALUE
	 * @generated
	 * @ordered
	 */
	BIRD(0, "Bird", "Bird"),

	/**
	 * The '<em><b>Fish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH_VALUE
	 * @generated
	 * @ordered
	 */
	FISH(1, "Fish", "Fish"),

	/**
	 * The '<em><b>Dragon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAGON_VALUE
	 * @generated
	 * @ordered
	 */
	DRAGON(2, "Dragon", "Dragon"),

	/**
	 * The '<em><b>Fairy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIRY_VALUE
	 * @generated
	 * @ordered
	 */
	FAIRY(3, "Fairy", "Fairy"),

	/**
	 * The '<em><b>Mammal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAMMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAMMAL(4, "Mammal", "Mammal");

	/**
	 * The '<em><b>Bird</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRD
	 * @model name="Bird"
	 * @generated
	 * @ordered
	 */
	public static final int BIRD_VALUE = 0;

	/**
	 * The '<em><b>Fish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH
	 * @model name="Fish"
	 * @generated
	 * @ordered
	 */
	public static final int FISH_VALUE = 1;

	/**
	 * The '<em><b>Dragon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAGON
	 * @model name="Dragon"
	 * @generated
	 * @ordered
	 */
	public static final int DRAGON_VALUE = 2;

	/**
	 * The '<em><b>Fairy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIRY
	 * @model name="Fairy"
	 * @generated
	 * @ordered
	 */
	public static final int FAIRY_VALUE = 3;

	/**
	 * The '<em><b>Mammal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAMMAL
	 * @model name="Mammal"
	 * @generated
	 * @ordered
	 */
	public static final int MAMMAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Classes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Classes[] VALUES_ARRAY =
		new Classes[] {
			BIRD,
			FISH,
			DRAGON,
			FAIRY,
			MAMMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Classes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Classes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classes get(int value) {
		switch (value) {
			case BIRD_VALUE: return BIRD;
			case FISH_VALUE: return FISH;
			case DRAGON_VALUE: return DRAGON;
			case FAIRY_VALUE: return FAIRY;
			case MAMMAL_VALUE: return MAMMAL;
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
	private Classes(int value, String name, String literal) {
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
	
} //Classes
