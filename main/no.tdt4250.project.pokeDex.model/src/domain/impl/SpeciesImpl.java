/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Species;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link domain.impl.SpeciesImpl#getIcon <em>Icon</em>}</li>
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
	 * The cached value of the '{@link #getEvolvesTo() <em>Evolves To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesTo()
	 * @generated
	 * @ordered
	 */
	protected Species evolvesTo;

	/**
	 * The cached value of the '{@link #getEvolvesFrom() <em>Evolves From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesFrom()
	 * @generated
	 * @ordered
	 */
	protected Species evolvesFrom;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

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
	public Species getEvolvesTo() {
		if (evolvesTo != null && evolvesTo.eIsProxy()) {
			InternalEObject oldEvolvesTo = (InternalEObject)evolvesTo;
			evolvesTo = (Species)eResolveProxy(oldEvolvesTo);
			if (evolvesTo != oldEvolvesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SPECIES__EVOLVES_TO, oldEvolvesTo, evolvesTo));
			}
		}
		return evolvesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Species basicGetEvolvesTo() {
		return evolvesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvolvesTo(Species newEvolvesTo) {
		Species oldEvolvesTo = evolvesTo;
		evolvesTo = newEvolvesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SPECIES__EVOLVES_TO, oldEvolvesTo, evolvesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Species getEvolvesFrom() {
		if (evolvesFrom != null && evolvesFrom.eIsProxy()) {
			InternalEObject oldEvolvesFrom = (InternalEObject)evolvesFrom;
			evolvesFrom = (Species)eResolveProxy(oldEvolvesFrom);
			if (evolvesFrom != oldEvolvesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.SPECIES__EVOLVES_FROM, oldEvolvesFrom, evolvesFrom));
			}
		}
		return evolvesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Species basicGetEvolvesFrom() {
		return evolvesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvolvesFrom(Species newEvolvesFrom) {
		Species oldEvolvesFrom = evolvesFrom;
		evolvesFrom = newEvolvesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SPECIES__EVOLVES_FROM, oldEvolvesFrom, evolvesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.SPECIES__ICON, oldIcon, icon));
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
				if (resolve) return getEvolvesTo();
				return basicGetEvolvesTo();
			case DomainPackage.SPECIES__EVOLVES_FROM:
				if (resolve) return getEvolvesFrom();
				return basicGetEvolvesFrom();
			case DomainPackage.SPECIES__ICON:
				return getIcon();
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
				setEvolvesTo((Species)newValue);
				return;
			case DomainPackage.SPECIES__EVOLVES_FROM:
				setEvolvesFrom((Species)newValue);
				return;
			case DomainPackage.SPECIES__ICON:
				setIcon((String)newValue);
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
				setEvolvesTo((Species)null);
				return;
			case DomainPackage.SPECIES__EVOLVES_FROM:
				setEvolvesFrom((Species)null);
				return;
			case DomainPackage.SPECIES__ICON:
				setIcon(ICON_EDEFAULT);
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
				return evolvesTo != null;
			case DomainPackage.SPECIES__EVOLVES_FROM:
				return evolvesFrom != null;
			case DomainPackage.SPECIES__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //SpeciesImpl
