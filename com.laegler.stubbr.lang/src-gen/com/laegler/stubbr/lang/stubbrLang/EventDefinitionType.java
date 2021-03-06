/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Definition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage#getEventDefinitionType()
 * @model
 * @generated
 */
public enum EventDefinitionType implements Enumerator
{
  /**
   * The '<em><b>BLANK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLANK_VALUE
   * @generated
   * @ordered
   */
  BLANK(0, "BLANK", "blank"),

  /**
   * The '<em><b>MESSAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MESSAGE_VALUE
   * @generated
   * @ordered
   */
  MESSAGE(1, "MESSAGE", "message"),

  /**
   * The '<em><b>TIMER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIMER_VALUE
   * @generated
   * @ordered
   */
  TIMER(2, "TIMER", "timer"),

  /**
   * The '<em><b>ERROR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ERROR_VALUE
   * @generated
   * @ordered
   */
  ERROR(3, "ERROR", "error"),

  /**
   * The '<em><b>ESCALATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ESCALATION_VALUE
   * @generated
   * @ordered
   */
  ESCALATION(4, "ESCALATION", "escalation"),

  /**
   * The '<em><b>CANCEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CANCEL_VALUE
   * @generated
   * @ordered
   */
  CANCEL(5, "CANCEL", "cancel"),

  /**
   * The '<em><b>COMPENSATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPENSATION_VALUE
   * @generated
   * @ordered
   */
  COMPENSATION(6, "COMPENSATION", "compensation"),

  /**
   * The '<em><b>CONDITIONAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONDITIONAL_VALUE
   * @generated
   * @ordered
   */
  CONDITIONAL(7, "CONDITIONAL", "conditional"),

  /**
   * The '<em><b>LINK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINK_VALUE
   * @generated
   * @ordered
   */
  LINK(8, "LINK", "link"),

  /**
   * The '<em><b>SIGNAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNAL_VALUE
   * @generated
   * @ordered
   */
  SIGNAL(9, "SIGNAL", "signal"),

  /**
   * The '<em><b>TERMINATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TERMINATE_VALUE
   * @generated
   * @ordered
   */
  TERMINATE(10, "TERMINATE", "terminate"),

  /**
   * The '<em><b>MULTIPLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLE_VALUE
   * @generated
   * @ordered
   */
  MULTIPLE(11, "MULTIPLE", "multiple"),

  /**
   * The '<em><b>PARALLEL MULTIPLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARALLEL_MULTIPLE_VALUE
   * @generated
   * @ordered
   */
  PARALLEL_MULTIPLE(12, "PARALLEL_MULTIPLE", "parallel multiple");

  /**
   * The '<em><b>BLANK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLANK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLANK
   * @model literal="blank"
   * @generated
   * @ordered
   */
  public static final int BLANK_VALUE = 0;

  /**
   * The '<em><b>MESSAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MESSAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MESSAGE
   * @model literal="message"
   * @generated
   * @ordered
   */
  public static final int MESSAGE_VALUE = 1;

  /**
   * The '<em><b>TIMER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIMER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIMER
   * @model literal="timer"
   * @generated
   * @ordered
   */
  public static final int TIMER_VALUE = 2;

  /**
   * The '<em><b>ERROR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ERROR
   * @model literal="error"
   * @generated
   * @ordered
   */
  public static final int ERROR_VALUE = 3;

  /**
   * The '<em><b>ESCALATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ESCALATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ESCALATION
   * @model literal="escalation"
   * @generated
   * @ordered
   */
  public static final int ESCALATION_VALUE = 4;

  /**
   * The '<em><b>CANCEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CANCEL
   * @model literal="cancel"
   * @generated
   * @ordered
   */
  public static final int CANCEL_VALUE = 5;

  /**
   * The '<em><b>COMPENSATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPENSATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPENSATION
   * @model literal="compensation"
   * @generated
   * @ordered
   */
  public static final int COMPENSATION_VALUE = 6;

  /**
   * The '<em><b>CONDITIONAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONDITIONAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONDITIONAL
   * @model literal="conditional"
   * @generated
   * @ordered
   */
  public static final int CONDITIONAL_VALUE = 7;

  /**
   * The '<em><b>LINK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINK
   * @model literal="link"
   * @generated
   * @ordered
   */
  public static final int LINK_VALUE = 8;

  /**
   * The '<em><b>SIGNAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIGNAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNAL
   * @model literal="signal"
   * @generated
   * @ordered
   */
  public static final int SIGNAL_VALUE = 9;

  /**
   * The '<em><b>TERMINATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TERMINATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TERMINATE
   * @model literal="terminate"
   * @generated
   * @ordered
   */
  public static final int TERMINATE_VALUE = 10;

  /**
   * The '<em><b>MULTIPLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MULTIPLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULTIPLE
   * @model literal="multiple"
   * @generated
   * @ordered
   */
  public static final int MULTIPLE_VALUE = 11;

  /**
   * The '<em><b>PARALLEL MULTIPLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PARALLEL MULTIPLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARALLEL_MULTIPLE
   * @model literal="parallel multiple"
   * @generated
   * @ordered
   */
  public static final int PARALLEL_MULTIPLE_VALUE = 12;

  /**
   * An array of all the '<em><b>Event Definition Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EventDefinitionType[] VALUES_ARRAY =
    new EventDefinitionType[]
    {
      BLANK,
      MESSAGE,
      TIMER,
      ERROR,
      ESCALATION,
      CANCEL,
      COMPENSATION,
      CONDITIONAL,
      LINK,
      SIGNAL,
      TERMINATE,
      MULTIPLE,
      PARALLEL_MULTIPLE,
    };

  /**
   * A public read-only list of all the '<em><b>Event Definition Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EventDefinitionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Event Definition Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventDefinitionType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventDefinitionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Definition Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventDefinitionType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventDefinitionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Definition Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EventDefinitionType get(int value)
  {
    switch (value)
    {
      case BLANK_VALUE: return BLANK;
      case MESSAGE_VALUE: return MESSAGE;
      case TIMER_VALUE: return TIMER;
      case ERROR_VALUE: return ERROR;
      case ESCALATION_VALUE: return ESCALATION;
      case CANCEL_VALUE: return CANCEL;
      case COMPENSATION_VALUE: return COMPENSATION;
      case CONDITIONAL_VALUE: return CONDITIONAL;
      case LINK_VALUE: return LINK;
      case SIGNAL_VALUE: return SIGNAL;
      case TERMINATE_VALUE: return TERMINATE;
      case MULTIPLE_VALUE: return MULTIPLE;
      case PARALLEL_MULTIPLE_VALUE: return PARALLEL_MULTIPLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EventDefinitionType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EventDefinitionType
