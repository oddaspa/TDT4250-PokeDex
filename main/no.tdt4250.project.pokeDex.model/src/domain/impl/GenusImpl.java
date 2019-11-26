/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Genus;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.impl.GenusImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link domain.impl.GenusImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.GenusImpl#getHabitat <em>Habitat</em>}</li>
 *   <li>{@link domain.impl.GenusImpl#getSameAnatomy <em>Same Anatomy</em>}</li>
 *   <li>{@link domain.impl.GenusImpl#getAnatomy <em>Anatomy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenusImpl extends MinimalEObjectImpl.Container implements Genus {
	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> species;

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
	 * The default value of the '{@link #getHabitat() <em>Habitat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHabitat()
	 * @generated
	 * @ordered
	 */
	protected static final String HABITAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHabitat() <em>Habitat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHabitat()
	 * @generated
	 * @ordered
	 */
	protected String habitat = HABITAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSameAnatomy() <em>Same Anatomy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameAnatomy()
	 * @generated
	 * @ordered
	 */
	protected EList<Genus> sameAnatomy;

	/**
	 * The default value of the '{@link #getAnatomy() <em>Anatomy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnatomy()
	 * @generated
	 * @ordered
	 */
	protected static final String ANATOMY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnatomy() <em>Anatomy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnatomy()
	 * @generated
	 * @ordered
	 */
	protected String anatomy = ANATOMY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.GENUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Species> getSpecies() {
		if (species == null) {
			species = new EObjectContainmentEList<Species>(Species.class, this, DomainPackage.GENUS__SPECIES);
		}
		return species;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENUS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHabitat() {
		return habitat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHabitat(String newHabitat) {
		String oldHabitat = habitat;
		habitat = newHabitat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENUS__HABITAT, oldHabitat, habitat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Genus> getSameAnatomy() {
		if (sameAnatomy == null) {
			sameAnatomy = new EObjectResolvingEList<Genus>(Genus.class, this, DomainPackage.GENUS__SAME_ANATOMY);
		}
		return sameAnatomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnatomy() {
		return anatomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnatomy(String newAnatomy) {
		String oldAnatomy = anatomy;
		anatomy = newAnatomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENUS__ANATOMY, oldAnatomy, anatomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.GENUS__SPECIES:
				return ((InternalEList<?>)getSpecies()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.GENUS__SPECIES:
				return getSpecies();
			case DomainPackage.GENUS__NAME:
				return getName();
			case DomainPackage.GENUS__HABITAT:
				return getHabitat();
			case DomainPackage.GENUS__SAME_ANATOMY:
				return getSameAnatomy();
			case DomainPackage.GENUS__ANATOMY:
				return getAnatomy();
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
			case DomainPackage.GENUS__SPECIES:
				getSpecies().clear();
				getSpecies().addAll((Collection<? extends Species>)newValue);
				return;
			case DomainPackage.GENUS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.GENUS__HABITAT:
				setHabitat((String)newValue);
				return;
			case DomainPackage.GENUS__SAME_ANATOMY:
				getSameAnatomy().clear();
				getSameAnatomy().addAll((Collection<? extends Genus>)newValue);
				return;
			case DomainPackage.GENUS__ANATOMY:
				setAnatomy((String)newValue);
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
			case DomainPackage.GENUS__SPECIES:
				getSpecies().clear();
				return;
			case DomainPackage.GENUS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.GENUS__HABITAT:
				setHabitat(HABITAT_EDEFAULT);
				return;
			case DomainPackage.GENUS__SAME_ANATOMY:
				getSameAnatomy().clear();
				return;
			case DomainPackage.GENUS__ANATOMY:
				setAnatomy(ANATOMY_EDEFAULT);
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
			case DomainPackage.GENUS__SPECIES:
				return species != null && !species.isEmpty();
			case DomainPackage.GENUS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.GENUS__HABITAT:
				return HABITAT_EDEFAULT == null ? habitat != null : !HABITAT_EDEFAULT.equals(habitat);
			case DomainPackage.GENUS__SAME_ANATOMY:
				return sameAnatomy != null && !sameAnatomy.isEmpty();
			case DomainPackage.GENUS__ANATOMY:
				return ANATOMY_EDEFAULT == null ? anatomy != null : !ANATOMY_EDEFAULT.equals(anatomy);
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
		result.append(", habitat: ");
		result.append(habitat);
		result.append(", anatomy: ");
		result.append(anatomy);
		result.append(')');
		return result.toString();
	}

} //GenusImpl
