//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.source.JavaSourceParserUtil;

/**
 * <p>
 * Java class for access-type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="access-type"> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}token"> &lt;enumeration
 * value="PROPERTY"/> &lt;enumeration value="FIELD"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "access-type")
@XmlEnum
public enum AccessType {

    PROPERTY,
    FIELD;

    public String value() {
        return name();
    }

    public static AccessType fromValue(String v) {
        return valueOf(v);
    }

    public static AccessType getDefault() {
        return FIELD;
    }

    public static AccessType load(Element element) {
        AnnotationMirror annotationMirror = JavaSourceParserUtil.findAnnotation(element, "javax.persistence.Access");
        AccessType accessType = null;
        if (annotationMirror != null) {
            Object value = JavaSourceParserUtil.findAnnotationValue(annotationMirror, "value");
            if (value != null) {
                accessType = AccessType.valueOf(value.toString());
            }
        }
        return accessType;

    }

}
