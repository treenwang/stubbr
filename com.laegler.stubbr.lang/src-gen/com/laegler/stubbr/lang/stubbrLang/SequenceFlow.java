/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getName <em>Name</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSequenceFlow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSequenceFlow_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Source Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Ref</em>' reference.
   * @see #setSourceRef(FlowNode)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSequenceFlow_SourceRef()
   * @model
   * @generated
   */
  FlowNode getSourceRef();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Ref</em>' reference.
   * @see #getSourceRef()
   * @generated
   */
  void setSourceRef(FlowNode value);

  /**
   * Returns the value of the '<em><b>Target Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Ref</em>' reference.
   * @see #setTargetRef(FlowNode)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSequenceFlow_TargetRef()
   * @model
   * @generated
   */
  FlowNode getTargetRef();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Ref</em>' reference.
   * @see #getTargetRef()
   * @generated
   */
  void setTargetRef(FlowNode value);

} // SequenceFlow