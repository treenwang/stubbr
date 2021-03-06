/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Gateway#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.Gateway#getAttachments <em>Attachments</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends FlowNode
{
  /**
   * Returns the value of the '<em><b>Gateway Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.laegler.stubbr.lang.stubbrLang.GatewayType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gateway Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gateway Type</em>' attribute.
   * @see com.laegler.stubbr.lang.stubbrLang.GatewayType
   * @see #setGatewayType(GatewayType)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getGateway_GatewayType()
   * @model
   * @generated
   */
  GatewayType getGatewayType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.Gateway#getGatewayType <em>Gateway Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gateway Type</em>' attribute.
   * @see com.laegler.stubbr.lang.stubbrLang.GatewayType
   * @see #getGatewayType()
   * @generated
   */
  void setGatewayType(GatewayType value);

  /**
   * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.Attachment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attachments</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getGateway_Attachments()
   * @model containment="true"
   * @generated
   */
  EList<Attachment> getAttachments();

} // Gateway
