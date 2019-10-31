/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Genus#getSpecies <em>Species</em>}</li>
 *   <li>{@link domain.Genus#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getGenus()
 * @model
 * @generated
 */
public interface Genus extends EObject {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference list.
	 * The list contents are of type {@link domain.Species}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference list.
	 * @see domain.DomainPackage#getGenus_Species()
	 * @model
	 * @generated
	 */
	EList<Species> getSpecies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getGenus_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Genus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Genus
