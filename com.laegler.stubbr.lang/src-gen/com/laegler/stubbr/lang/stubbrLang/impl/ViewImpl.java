/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.Element;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Layout;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;
import com.laegler.stubbr.lang.stubbrLang.Styling;
import com.laegler.stubbr.lang.stubbrLang.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ViewImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ViewImpl#getStyling <em>Styling</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ViewImpl#getAssocEntities <em>Assoc Entities</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ViewImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends UiElementImpl implements View
{
  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected Layout layout;

  /**
   * The cached value of the '{@link #getStyling() <em>Styling</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyling()
   * @generated
   * @ordered
   */
  protected Styling styling;

  /**
   * The cached value of the '{@link #getAssocEntities() <em>Assoc Entities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssocEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> assocEntities;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StubbrLangPackage.eINSTANCE.getView();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout getLayout()
  {
    if (layout != null && layout.eIsProxy())
    {
      InternalEObject oldLayout = (InternalEObject)layout;
      layout = (Layout)eResolveProxy(oldLayout);
      if (layout != oldLayout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.VIEW__LAYOUT, oldLayout, layout));
      }
    }
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout basicGetLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(Layout newLayout)
  {
    Layout oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.VIEW__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styling getStyling()
  {
    if (styling != null && styling.eIsProxy())
    {
      InternalEObject oldStyling = (InternalEObject)styling;
      styling = (Styling)eResolveProxy(oldStyling);
      if (styling != oldStyling)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.VIEW__STYLING, oldStyling, styling));
      }
    }
    return styling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styling basicGetStyling()
  {
    return styling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyling(Styling newStyling)
  {
    Styling oldStyling = styling;
    styling = newStyling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.VIEW__STYLING, oldStyling, styling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getAssocEntities()
  {
    if (assocEntities == null)
    {
      assocEntities = new EObjectResolvingEList<Entity>(Entity.class, this, StubbrLangPackage.VIEW__ASSOC_ENTITIES);
    }
    return assocEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, StubbrLangPackage.VIEW__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StubbrLangPackage.VIEW__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StubbrLangPackage.VIEW__LAYOUT:
        if (resolve) return getLayout();
        return basicGetLayout();
      case StubbrLangPackage.VIEW__STYLING:
        if (resolve) return getStyling();
        return basicGetStyling();
      case StubbrLangPackage.VIEW__ASSOC_ENTITIES:
        return getAssocEntities();
      case StubbrLangPackage.VIEW__ELEMENTS:
        return getElements();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StubbrLangPackage.VIEW__LAYOUT:
        setLayout((Layout)newValue);
        return;
      case StubbrLangPackage.VIEW__STYLING:
        setStyling((Styling)newValue);
        return;
      case StubbrLangPackage.VIEW__ASSOC_ENTITIES:
        getAssocEntities().clear();
        getAssocEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case StubbrLangPackage.VIEW__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.VIEW__LAYOUT:
        setLayout((Layout)null);
        return;
      case StubbrLangPackage.VIEW__STYLING:
        setStyling((Styling)null);
        return;
      case StubbrLangPackage.VIEW__ASSOC_ENTITIES:
        getAssocEntities().clear();
        return;
      case StubbrLangPackage.VIEW__ELEMENTS:
        getElements().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.VIEW__LAYOUT:
        return layout != null;
      case StubbrLangPackage.VIEW__STYLING:
        return styling != null;
      case StubbrLangPackage.VIEW__ASSOC_ENTITIES:
        return assocEntities != null && !assocEntities.isEmpty();
      case StubbrLangPackage.VIEW__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewImpl
