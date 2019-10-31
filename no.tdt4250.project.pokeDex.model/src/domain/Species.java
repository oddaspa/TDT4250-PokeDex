/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Species#getName <em>Name</em>}</li>
 *   <li>{@link domain.Species#getEvolvesTo <em>Evolves To</em>}</li>
 *   <li>{@link domain.Species#getEvolvesFrom <em>Evolves From</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getSpecies()
 * @model
 * @generated
 */
public interface Species extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getSpecies_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Species#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evolves To</b></em>' reference list.
	 * The list contents are of type {@link domain.Species}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves To</em>' reference list.
	 * @see domain.DomainPackage#getSpecies_EvolvesTo()
	 * @model
	 * @generated
	 */
	EList<Species> getEvolvesTo();

	/**
	 * Returns the value of the '<em><b>Evolves From</b></em>' reference list.
	 * The list contents are of type {@link domain.Species}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves From</em>' reference list.
	 * @see domain.DomainPackage#getSpecies_EvolvesFrom()
	 * @model
	 * @generated
	 */
	EList<Species> getEvolvesFrom();

} // Species
