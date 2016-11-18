/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soap Webservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.SoapWebservice#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSoapWebservice()
 * @model
 * @generated
 */
public interface SoapWebservice extends Webservice
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' attribute.
   * @see #setNamespace(String)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getSoapWebservice_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.SoapWebservice#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

} // SoapWebservice