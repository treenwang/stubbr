/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.FlowNode;
import com.laegler.stubbr.lang.stubbrLang.SequenceFlow;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SequenceFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SequenceFlowImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceFlowImpl extends MinimalEObjectImpl.Container implements SequenceFlow
{
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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceRef()
   * @generated
   * @ordered
   */
  protected FlowNode sourceRef;

  /**
   * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRef()
   * @generated
   * @ordered
   */
  protected FlowNode targetRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceFlowImpl()
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
    return StubbrLangPackage.eINSTANCE.getSequenceFlow();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEQUENCE_FLOW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEQUENCE_FLOW__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowNode getSourceRef()
  {
    if (sourceRef != null && sourceRef.eIsProxy())
    {
      InternalEObject oldSourceRef = (InternalEObject)sourceRef;
      sourceRef = (FlowNode)eResolveProxy(oldSourceRef);
      if (sourceRef != oldSourceRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, sourceRef));
      }
    }
    return sourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowNode basicGetSourceRef()
  {
    return sourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceRef(FlowNode newSourceRef)
  {
    FlowNode oldSourceRef = sourceRef;
    sourceRef = newSourceRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, sourceRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowNode getTargetRef()
  {
    if (targetRef != null && targetRef.eIsProxy())
    {
      InternalEObject oldTargetRef = (InternalEObject)targetRef;
      targetRef = (FlowNode)eResolveProxy(oldTargetRef);
      if (targetRef != oldTargetRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, targetRef));
      }
    }
    return targetRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowNode basicGetTargetRef()
  {
    return targetRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetRef(FlowNode newTargetRef)
  {
    FlowNode oldTargetRef = targetRef;
    targetRef = newTargetRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, targetRef));
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
      case StubbrLangPackage.SEQUENCE_FLOW__NAME:
        return getName();
      case StubbrLangPackage.SEQUENCE_FLOW__LABEL:
        return getLabel();
      case StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF:
        if (resolve) return getSourceRef();
        return basicGetSourceRef();
      case StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF:
        if (resolve) return getTargetRef();
        return basicGetTargetRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StubbrLangPackage.SEQUENCE_FLOW__NAME:
        setName((String)newValue);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__LABEL:
        setLabel((String)newValue);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF:
        setSourceRef((FlowNode)newValue);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF:
        setTargetRef((FlowNode)newValue);
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
      case StubbrLangPackage.SEQUENCE_FLOW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF:
        setSourceRef((FlowNode)null);
        return;
      case StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF:
        setTargetRef((FlowNode)null);
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
      case StubbrLangPackage.SEQUENCE_FLOW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StubbrLangPackage.SEQUENCE_FLOW__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case StubbrLangPackage.SEQUENCE_FLOW__SOURCE_REF:
        return sourceRef != null;
      case StubbrLangPackage.SEQUENCE_FLOW__TARGET_REF:
        return targetRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //SequenceFlowImpl
