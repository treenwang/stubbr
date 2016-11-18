/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.CallActivity#getCalledElement <em>Called Element</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getCallActivity()
 * @model
 * @generated
 */
public interface CallActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Called Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Called Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called Element</em>' reference.
   * @see #setCalledElement(BusinessProcess)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getCallActivity_CalledElement()
   * @model
   * @generated
   */
  BusinessProcess getCalledElement();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.CallActivity#getCalledElement <em>Called Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called Element</em>' reference.
   * @see #getCalledElement()
   * @generated
   */
  void setCalledElement(BusinessProcess value);

} // CallActivity