/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Di Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getSourceDiagramShape <em>Source Diagram Shape</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getTargetDiagramShape <em>Target Diagram Shape</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDiEdge()
 * @model
 * @generated
 */
public interface DiEdge extends DiPlaneElement
{
  /**
   * Returns the value of the '<em><b>Sequence Flow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Flow</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Flow</em>' reference.
   * @see #setSequenceFlow(SequenceFlow)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDiEdge_SequenceFlow()
   * @model
   * @generated
   */
  SequenceFlow getSequenceFlow();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getSequenceFlow <em>Sequence Flow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Flow</em>' reference.
   * @see #getSequenceFlow()
   * @generated
   */
  void setSequenceFlow(SequenceFlow value);

  /**
   * Returns the value of the '<em><b>Source Diagram Shape</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Diagram Shape</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Diagram Shape</em>' reference.
   * @see #setSourceDiagramShape(DiShape)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDiEdge_SourceDiagramShape()
   * @model
   * @generated
   */
  DiShape getSourceDiagramShape();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getSourceDiagramShape <em>Source Diagram Shape</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Diagram Shape</em>' reference.
   * @see #getSourceDiagramShape()
   * @generated
   */
  void setSourceDiagramShape(DiShape value);

  /**
   * Returns the value of the '<em><b>Target Diagram Shape</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Diagram Shape</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Diagram Shape</em>' reference.
   * @see #setTargetDiagramShape(DiShape)
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDiEdge_TargetDiagramShape()
   * @model
   * @generated
   */
  DiShape getTargetDiagramShape();

  /**
   * Sets the value of the '{@link com.laegler.stubbr.lang.stubbrLang.DiEdge#getTargetDiagramShape <em>Target Diagram Shape</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Diagram Shape</em>' reference.
   * @see #getTargetDiagramShape()
   * @generated
   */
  void setTargetDiagramShape(DiShape value);

  /**
   * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
   * The list contents are of type {@link com.laegler.stubbr.lang.stubbrLang.DiWaypoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Waypoints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Waypoints</em>' containment reference list.
   * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getDiEdge_Waypoints()
   * @model containment="true"
   * @generated
   */
  EList<DiWaypoint> getWaypoints();

} // DiEdge
