/**
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kingdoms</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getKingdoms()
 * @model
 * @generated
 */
public enum Kingdoms implements Enumerator {
	/**
	 * The '<em><b>Plantae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANTAE_VALUE
	 * @generated
	 * @ordered
	 */
	PLANTAE(0, "Plantae", "Plantae"),

	/**
	 * The '<em><b>Animalia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMALIA_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMALIA(1, "Animalia", "Animalia"),

	/**
	 * The '<em><b>Mineralia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINERALIA_VALUE
	 * @generated
	 * @ordered
	 */
	MINERALIA(2, "Mineralia", "Mineralia");

	/**
	 * The '<em><b>Plantae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANTAE
	 * @model name="Plantae"
	 * @generated
	 * @ordered
	 */
	public static final int PLANTAE_VALUE = 0;

	/**
	 * The '<em><b>Animalia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMALIA
	 * @model name="Animalia"
	 * @generated
	 * @ordered
	 */
	public static final int ANIMALIA_VALUE = 1;

	/**
	 * The '<em><b>Mineralia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINERALIA
	 * @model name="Mineralia"
	 * @generated
	 * @ordered
	 */
	public static final int MINERALIA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Kingdoms</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kingdoms[] VALUES_ARRAY =
		new Kingdoms[] {
			PLANTAE,
			ANIMALIA,
			MINERALIA,
		};

	/**
	 * A public read-only list of all the '<em><b>Kingdoms</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kingdoms> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kingdoms</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kingdoms get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kingdoms result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kingdoms</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kingdoms getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kingdoms result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kingdoms</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kingdoms get(int value) {
		switch (value) {
			case PLANTAE_VALUE: return PLANTAE;
			case ANIMALIA_VALUE: return ANIMALIA;
			case MINERALIA_VALUE: return MINERALIA;
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
	private Kingdoms(int value, String name, String literal) {
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
	
} //Kingdoms
