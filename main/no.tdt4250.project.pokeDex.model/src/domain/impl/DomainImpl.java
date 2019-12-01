/**
 */
package domain.impl;

import domain.Domain;
import domain.DomainPackage;
import domain.Genus;
import domain.Kingdom;

import domain.Phylum;
import domain.Species;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getKingdoms <em>Kingdoms</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getAllPhyla <em>All Phyla</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getAllGenera <em>All Genera</em>}</li>
 *   <li>{@link domain.impl.DomainImpl#getAllSpecies <em>All Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
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
	 * The cached value of the '{@link #getKingdoms() <em>Kingdoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKingdoms()
	 * @generated
	 * @ordered
	 */
	protected EList<Kingdom> kingdoms;

	/**
	 * The cached value of the '{@link #getAllPhyla() <em>All Phyla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllPhyla()
	 * @generated
	 * @ordered
	 */
	protected EList<Phylum> allPhyla;

	/**
	 * The cached value of the '{@link #getAllClasses() <em>All Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<domain.Class> allClasses;

	/**
	 * The cached value of the '{@link #getAllGenera() <em>All Genera</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllGenera()
	 * @generated
	 * @ordered
	 */
	protected EList<Genus> allGenera;

	/**
	 * The cached value of the '{@link #getAllSpecies() <em>All Species</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSpecies()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> allSpecies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kingdom> getKingdoms() {
		if (kingdoms == null) {
			kingdoms = new EObjectContainmentEList<Kingdom>(Kingdom.class, this, DomainPackage.DOMAIN__KINGDOMS);
		}
		return kingdoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phylum> getAllPhyla() {
		if (allPhyla == null) {
			allPhyla = new EObjectContainmentEList<Phylum>(Phylum.class, this, DomainPackage.DOMAIN__ALL_PHYLA);
		}
		return allPhyla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<domain.Class> getAllClasses() {
		if (allClasses == null) {
			allClasses = new EObjectContainmentEList<domain.Class>(domain.Class.class, this, DomainPackage.DOMAIN__ALL_CLASSES);
		}
		return allClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Genus> getAllGenera() {
		if (allGenera == null) {
			allGenera = new EObjectContainmentEList<Genus>(Genus.class, this, DomainPackage.DOMAIN__ALL_GENERA);
		}
		return allGenera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Species> getAllSpecies() {
		if (allSpecies == null) {
			allSpecies = new EObjectContainmentEList<Species>(Species.class, this, DomainPackage.DOMAIN__ALL_SPECIES);
		}
		return allSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__KINGDOMS:
				return ((InternalEList<?>)getKingdoms()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__ALL_PHYLA:
				return ((InternalEList<?>)getAllPhyla()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__ALL_CLASSES:
				return ((InternalEList<?>)getAllClasses()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__ALL_GENERA:
				return ((InternalEList<?>)getAllGenera()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__ALL_SPECIES:
				return ((InternalEList<?>)getAllSpecies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.DOMAIN__NAME:
				return getName();
			case DomainPackage.DOMAIN__KINGDOMS:
				return getKingdoms();
			case DomainPackage.DOMAIN__ALL_PHYLA:
				return getAllPhyla();
			case DomainPackage.DOMAIN__ALL_CLASSES:
				return getAllClasses();
			case DomainPackage.DOMAIN__ALL_GENERA:
				return getAllGenera();
			case DomainPackage.DOMAIN__ALL_SPECIES:
				return getAllSpecies();
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
			case DomainPackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN__KINGDOMS:
				getKingdoms().clear();
				getKingdoms().addAll((Collection<? extends Kingdom>)newValue);
				return;
			case DomainPackage.DOMAIN__ALL_PHYLA:
				getAllPhyla().clear();
				getAllPhyla().addAll((Collection<? extends Phylum>)newValue);
				return;
			case DomainPackage.DOMAIN__ALL_CLASSES:
				getAllClasses().clear();
				getAllClasses().addAll((Collection<? extends domain.Class>)newValue);
				return;
			case DomainPackage.DOMAIN__ALL_GENERA:
				getAllGenera().clear();
				getAllGenera().addAll((Collection<? extends Genus>)newValue);
				return;
			case DomainPackage.DOMAIN__ALL_SPECIES:
				getAllSpecies().clear();
				getAllSpecies().addAll((Collection<? extends Species>)newValue);
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
			case DomainPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__KINGDOMS:
				getKingdoms().clear();
				return;
			case DomainPackage.DOMAIN__ALL_PHYLA:
				getAllPhyla().clear();
				return;
			case DomainPackage.DOMAIN__ALL_CLASSES:
				getAllClasses().clear();
				return;
			case DomainPackage.DOMAIN__ALL_GENERA:
				getAllGenera().clear();
				return;
			case DomainPackage.DOMAIN__ALL_SPECIES:
				getAllSpecies().clear();
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
			case DomainPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN__KINGDOMS:
				return kingdoms != null && !kingdoms.isEmpty();
			case DomainPackage.DOMAIN__ALL_PHYLA:
				return allPhyla != null && !allPhyla.isEmpty();
			case DomainPackage.DOMAIN__ALL_CLASSES:
				return allClasses != null && !allClasses.isEmpty();
			case DomainPackage.DOMAIN__ALL_GENERA:
				return allGenera != null && !allGenera.isEmpty();
			case DomainPackage.DOMAIN__ALL_SPECIES:
				return allSpecies != null && !allSpecies.isEmpty();
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

} //DomainImpl
