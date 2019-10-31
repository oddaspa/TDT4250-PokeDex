/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kingdom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Kingdom#getPhyla <em>Phyla</em>}</li>
 *   <li>{@link domain.Kingdom#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getKingdom()
 * @model
 * @generated
 */
public interface Kingdom extends EObject {
	/**
	 * Returns the value of the '<em><b>Phyla</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Species}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phyla</em>' containment reference list.
	 * @see domain.DomainPackage#getKingdom_Phyla()
	 * @model containment="true"
	 * @generated
	 */
	EList<Species> getPhyla();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getKingdom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Kingdom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Kingdom
