/**
 */
package domain;

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
 *   <li>{@link domain.Species#getIcon <em>Icon</em>}</li>
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
	 * Returns the value of the '<em><b>Evolves To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves To</em>' reference.
	 * @see #setEvolvesTo(Species)
	 * @see domain.DomainPackage#getSpecies_EvolvesTo()
	 * @model
	 * @generated
	 */
	Species getEvolvesTo();

	/**
	 * Sets the value of the '{@link domain.Species#getEvolvesTo <em>Evolves To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolves To</em>' reference.
	 * @see #getEvolvesTo()
	 * @generated
	 */
	void setEvolvesTo(Species value);

	/**
	 * Returns the value of the '<em><b>Evolves From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves From</em>' reference.
	 * @see #setEvolvesFrom(Species)
	 * @see domain.DomainPackage#getSpecies_EvolvesFrom()
	 * @model
	 * @generated
	 */
	Species getEvolvesFrom();

	/**
	 * Sets the value of the '{@link domain.Species#getEvolvesFrom <em>Evolves From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolves From</em>' reference.
	 * @see #getEvolvesFrom()
	 * @generated
	 */
	void setEvolvesFrom(Species value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(byte[])
	 * @see domain.DomainPackage#getSpecies_Icon()
	 * @model
	 * @generated
	 */
	byte[] getIcon();

	/**
	 * Sets the value of the '{@link domain.Species#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(byte[] value);


} // Species
