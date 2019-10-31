/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Species;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.SpeciesImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.SpeciesImpl#getEvolvesTo <em>Evolves To</em>}</li>
 *   <li>{@link domain.impl.SpeciesImpl#getEvolvesFrom <em>Evolves From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeciesImpl extends MinimalEObjectImpl.Container implements Species {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvolvesTo() <em>Evolves To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> evolvesTo;

	/**
	 * The cached value of the '{@link #getEvolvesFrom() <em>Evolves From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> evolvesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.SPECIES;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SPECIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Species> getEvolvesTo() {
		if (evolvesTo == null) {
			evolvesTo = new EObjectResolvingEList<Species>(Species.class, this, DomainPackage.SPECIES__EVOLVES_TO);
		}
		return evolvesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Species> getEvolvesFrom() {
		if (evolvesFrom == null) {
			evolvesFrom = new EObjectResolvingEList<Species>(Species.class, this, DomainPackage.SPECIES__EVOLVES_FROM);
		}
		return evolvesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.SPECIES__NAME:
				return getName();
			case DomainPackage.SPECIES__EVOLVES_TO:
				return getEvolvesTo();
			case DomainPackage.SPECIES__EVOLVES_FROM:
				return getEvolvesFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.SPECIES__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.SPECIES__EVOLVES_TO:
				getEvolvesTo().clear();
				getEvolvesTo().addAll((Collection<? extends Species>)newValue);
				return;
			case DomainPackage.SPECIES__EVOLVES_FROM:
				getEvolvesFrom().clear();
				getEvolvesFrom().addAll((Collection<? extends Species>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.SPECIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.SPECIES__EVOLVES_TO:
				getEvolvesTo().clear();
				return;
			case DomainPackage.SPECIES__EVOLVES_FROM:
				getEvolvesFrom().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.SPECIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.SPECIES__EVOLVES_TO:
				return evolvesTo != null && !evolvesTo.isEmpty();
			case DomainPackage.SPECIES__EVOLVES_FROM:
				return evolvesFrom != null && !evolvesFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpeciesImpl
