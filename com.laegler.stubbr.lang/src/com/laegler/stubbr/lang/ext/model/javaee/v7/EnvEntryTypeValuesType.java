//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.09.10 um 03:14:29 AM CEST 
//


package com.laegler.stubbr.lang.ext.model.javaee.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         [
 *         This type contains the fully-qualified Java type of the
 *         environment entry value that is expected by the
 *         application's code.
 *         
 *         The following are the legal values of env-entry-type-valuesType:
 *         
 *         java.lang.Boolean
 *         java.lang.Byte
 *         java.lang.Character
 *         java.lang.String
 *         java.lang.Short
 *         java.lang.Integer
 *         java.lang.Long
 *         java.lang.Float
 *         java.lang.Double
 *         		  java.lang.Class
 *         		  any enumeration type (i.e. a subclass of java.lang.Enum)
 *         
 *         Examples:
 *         
 *         <env-entry-type>java.lang.Boolean</env-entry-type>
 *         <env-entry-type>java.lang.Class</env-entry-type>
 *         <env-entry-type>com.example.Color</env-entry-type>
 *         
 *         
 *       
 * 
 * <p>Java-Klasse für env-entry-type-valuesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="env-entry-type-valuesType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://xmlns.jcp.org/xml/ns/javaee>fully-qualified-classType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "env-entry-type-valuesType")
public class EnvEntryTypeValuesType
    extends FullyQualifiedClassType
{


}
