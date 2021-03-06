/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getReceivingElement <em>Receiving Element</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSendMessage()
 * @model
 * @generated
 */
public interface SendMessage extends Attachment
{
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
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSendMessage_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Receiving Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiving Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiving Element</em>' reference.
   * @see #setReceivingElement(InteractionNode)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSendMessage_ReceivingElement()
   * @model
   * @generated
   */
  InteractionNode getReceivingElement();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getReceivingElement <em>Receiving Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiving Element</em>' reference.
   * @see #getReceivingElement()
   * @generated
   */
  void setReceivingElement(InteractionNode value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(JvmTypeReference)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSendMessage_DataType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getDataType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SendMessage#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(JvmTypeReference value);

} // SendMessage
