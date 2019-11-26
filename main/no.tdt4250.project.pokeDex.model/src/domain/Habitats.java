/**
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Habitats</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getHabitats()
 * @model
 * @generated
 */
public enum Habitats implements Enumerator {
	/**
	 * The '<em><b>Cave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAVE_VALUE
	 * @generated
	 * @ordered
	 */
	CAVE(0, "Cave", "Cave"),

	/**
	 * The '<em><b>Forest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOREST_VALUE
	 * @generated
	 * @ordered
	 */
	FOREST(1, "Forest", "Forest"),

	/**
	 * The '<em><b>Grassland</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASSLAND_VALUE
	 * @generated
	 * @ordered
	 */
	GRASSLAND(2, "Grassland", "Grassland"),

	/**
	 * The '<em><b>Mountain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MOUNTAIN(3, "Mountain", "Mountain"),

	/**
	 * The '<em><b>Rare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RARE_VALUE
	 * @generated
	 * @ordered
	 */
	RARE(4, "Rare", "Rare"),

	/**
	 * The '<em><b>Rough Terrain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUGH_TERRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUGH_TERRAIN(5, "RoughTerrain", "RoughTerrain"),

	/**
	 * The '<em><b>Sea</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEA_VALUE
	 * @generated
	 * @ordered
	 */
	SEA(6, "Sea", "Sea"),

	/**
	 * The '<em><b>Urban</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URBAN_VALUE
	 * @generated
	 * @ordered
	 */
	URBAN(7, "Urban", "Urban"),

	/**
	 * The '<em><b>Waters Edge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERS_EDGE_VALUE
	 * @generated
	 * @ordered
	 */
	WATERS_EDGE(8, "WatersEdge", "WatersEdge");

	/**
	 * The '<em><b>Cave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAVE
	 * @model name="Cave"
	 * @generated
	 * @ordered
	 */
	public static final int CAVE_VALUE = 0;

	/**
	 * The '<em><b>Forest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOREST
	 * @model name="Forest"
	 * @generated
	 * @ordered
	 */
	public static final int FOREST_VALUE = 1;

	/**
	 * The '<em><b>Grassland</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASSLAND
	 * @model name="Grassland"
	 * @generated
	 * @ordered
	 */
	public static final int GRASSLAND_VALUE = 2;

	/**
	 * The '<em><b>Mountain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN
	 * @model name="Mountain"
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTAIN_VALUE = 3;

	/**
	 * The '<em><b>Rare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RARE
	 * @model name="Rare"
	 * @generated
	 * @ordered
	 */
	public static final int RARE_VALUE = 4;

	/**
	 * The '<em><b>Rough Terrain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUGH_TERRAIN
	 * @model name="RoughTerrain"
	 * @generated
	 * @ordered
	 */
	public static final int ROUGH_TERRAIN_VALUE = 5;

	/**
	 * The '<em><b>Sea</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEA
	 * @model name="Sea"
	 * @generated
	 * @ordered
	 */
	public static final int SEA_VALUE = 6;

	/**
	 * The '<em><b>Urban</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URBAN
	 * @model name="Urban"
	 * @generated
	 * @ordered
	 */
	public static final int URBAN_VALUE = 7;

	/**
	 * The '<em><b>Waters Edge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERS_EDGE
	 * @model name="WatersEdge"
	 * @generated
	 * @ordered
	 */
	public static final int WATERS_EDGE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Habitats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Habitats[] VALUES_ARRAY =
		new Habitats[] {
			CAVE,
			FOREST,
			GRASSLAND,
			MOUNTAIN,
			RARE,
			ROUGH_TERRAIN,
			SEA,
			URBAN,
			WATERS_EDGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Habitats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Habitats> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Habitats</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Habitats get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Habitats result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Habitats</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Habitats getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Habitats result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Habitats</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Habitats get(int value) {
		switch (value) {
			case CAVE_VALUE: return CAVE;
			case FOREST_VALUE: return FOREST;
			case GRASSLAND_VALUE: return GRASSLAND;
			case MOUNTAIN_VALUE: return MOUNTAIN;
			case RARE_VALUE: return RARE;
			case ROUGH_TERRAIN_VALUE: return ROUGH_TERRAIN;
			case SEA_VALUE: return SEA;
			case URBAN_VALUE: return URBAN;
			case WATERS_EDGE_VALUE: return WATERS_EDGE;
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
	private Habitats(int value, String name, String literal) {
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
	
} //Habitats
