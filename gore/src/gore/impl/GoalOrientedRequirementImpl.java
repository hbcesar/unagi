/**
 */
package gore.impl;

import gore.DomainAssumption;
import gore.GoalOrientedRequirement;
import gore.GorePackage;
import gore.RefinementType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Oriented Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gore.impl.GoalOrientedRequirementImpl#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link gore.impl.GoalOrientedRequirementImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link gore.impl.GoalOrientedRequirementImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link gore.impl.GoalOrientedRequirementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalOrientedRequirementImpl extends GOREElementImpl implements GoalOrientedRequirement {
	/**
	 * The default value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementType()
	 * @generated
	 * @ordered
	 */
	protected static final RefinementType REFINEMENT_TYPE_EDEFAULT = RefinementType.AND;

	/**
	 * The cached value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementType()
	 * @generated
	 * @ordered
	 */
	protected RefinementType refinementType = REFINEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAssumption> assumptions;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalOrientedRequirement> refinements;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected GoalOrientedRequirement parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalOrientedRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.GOAL_ORIENTED_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType getRefinementType() {
		return refinementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinementType(RefinementType newRefinementType) {
		RefinementType oldRefinementType = refinementType;
		refinementType = newRefinementType == null ? REFINEMENT_TYPE_EDEFAULT : newRefinementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE, oldRefinementType, refinementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAssumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectWithInverseResolvingEList<DomainAssumption>(DomainAssumption.class, this, GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS, GorePackage.DOMAIN_ASSUMPTION__PARENT);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalOrientedRequirement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectWithInverseResolvingEList<GoalOrientedRequirement>(GoalOrientedRequirement.class, this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOrientedRequirement getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (GoalOrientedRequirement)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOrientedRequirement basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(GoalOrientedRequirement newParent, NotificationChain msgs) {
		GoalOrientedRequirement oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(GoalOrientedRequirement newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GoalOrientedRequirement.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GoalOrientedRequirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssumptions()).basicAdd(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinements()).basicAdd(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS, GoalOrientedRequirement.class, msgs);
				return basicSetParent((GoalOrientedRequirement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				return getRefinementType();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return getAssumptions();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return getRefinements();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType((RefinementType)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends DomainAssumption>)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends GoalOrientedRequirement>)newValue);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				setParent((GoalOrientedRequirement)newValue);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				setRefinementType(REFINEMENT_TYPE_EDEFAULT);
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				getRefinements().clear();
				return;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				setParent((GoalOrientedRequirement)null);
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
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENT_TYPE:
				return refinementType != REFINEMENT_TYPE_EDEFAULT;
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case GorePackage.GOAL_ORIENTED_REQUIREMENT__PARENT:
				return parent != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (refinementType: ");
		result.append(refinementType);
		result.append(')');
		return result.toString();
	}

} //GoalOrientedRequirementImpl
