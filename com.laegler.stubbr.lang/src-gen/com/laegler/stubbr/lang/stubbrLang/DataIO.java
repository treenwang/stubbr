/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getDataIoType <em>Data Io Type</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getLabel <em>Label</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDataIO()
 * @model
 * @generated
 */
public interface DataIO extends Attachment
{
  /**
   * Returns the value of the '<em><b>Data Io Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.laegler.stubbr.lang.stubbrLang.DataIOType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Io Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Io Type</em>' attribute.
   * @see com.laegler.stubbr.lang.stubbrLang.DataIOType
   * @see #setDataIoType(DataIOType)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDataIO_DataIoType()
   * @model
   * @generated
   */
  DataIOType getDataIoType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getDataIoType <em>Data Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Io Type</em>' attribute.
   * @see com.laegler.stubbr.lang.stubbrLang.DataIOType
   * @see #getDataIoType()
   * @generated
   */
  void setDataIoType(DataIOType value);

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
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDataIO_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Java Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' containment reference.
   * @see #setJavaType(JvmTypeReference)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDataIO_JavaType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJavaType();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DataIO#getJavaType <em>Java Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' containment reference.
   * @see #getJavaType()
   * @generated
   */
  void setJavaType(JvmTypeReference value);

} // DataIO
