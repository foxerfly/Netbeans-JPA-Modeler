//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.TypeElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.AccessTypeHandler;
import org.netbeans.jpa.modeler.spec.extend.CompositePrimaryKeyType;
import org.netbeans.jpa.modeler.spec.extend.IAttributes;
import org.netbeans.jpa.modeler.spec.extend.InheritenceHandler;
import org.netbeans.jpa.modeler.spec.extend.JavaClass;
import org.netbeans.jpa.modeler.spec.extend.PrimaryKeyContainer;
import org.netbeans.jpa.source.JavaSourceParserUtil;
import org.netbeans.modeler.core.NBModelerUtil;

/**
 *
 *
 * Defines the settings and mappings for an entity. Is allowed to be sparsely
 * populated and used in conjunction with the annotations. Alternatively, the
 * metadata-complete attribute can be used to indicate that no annotations on
 * the entity class (and its fields or properties) are to be processed. If this
 * is the case then the defaulting rules for the entity and its subelements will
 * be recursively applied.
 *
 * @Target(TYPE) @Retention(RUNTIME) public @interface Entity { String name()
 * default ""; }
 *
 *
 *
 * <p>
 * Java class for entity complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="table" type="{http://java.sun.com/xml/ns/persistence/orm}table" minOccurs="0"/>
 *         &lt;element name="secondary-table" type="{http://java.sun.com/xml/ns/persistence/orm}secondary-table" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primary-key-join-column" type="{http://java.sun.com/xml/ns/persistence/orm}primary-key-join-column" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id-class" type="{http://java.sun.com/xml/ns/persistence/orm}id-class" minOccurs="0"/>
 *         &lt;element name="inheritance" type="{http://java.sun.com/xml/ns/persistence/orm}inheritance" minOccurs="0"/>
 *         &lt;element name="discriminator-value" type="{http://java.sun.com/xml/ns/persistence/orm}discriminator-value" minOccurs="0"/>
 *         &lt;element name="discriminator-column" type="{http://java.sun.com/xml/ns/persistence/orm}discriminator-column" minOccurs="0"/>
 *         &lt;element name="sequence-generator" type="{http://java.sun.com/xml/ns/persistence/orm}sequence-generator" minOccurs="0"/>
 *         &lt;element name="table-generator" type="{http://java.sun.com/xml/ns/persistence/orm}table-generator" minOccurs="0"/>
 *         &lt;element name="named-query" type="{http://java.sun.com/xml/ns/persistence/orm}named-query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="named-native-query" type="{http://java.sun.com/xml/ns/persistence/orm}named-native-query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sql-result-set-mapping" type="{http://java.sun.com/xml/ns/persistence/orm}sql-result-set-mapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude-default-listeners" type="{http://java.sun.com/xml/ns/persistence/orm}emptyType" minOccurs="0"/>
 *         &lt;element name="exclude-superclass-listeners" type="{http://java.sun.com/xml/ns/persistence/orm}emptyType" minOccurs="0"/>
 *         &lt;element name="entity-listeners" type="{http://java.sun.com/xml/ns/persistence/orm}entity-listeners" minOccurs="0"/>
 *         &lt;element name="pre-persist" type="{http://java.sun.com/xml/ns/persistence/orm}pre-persist" minOccurs="0"/>
 *         &lt;element name="post-persist" type="{http://java.sun.com/xml/ns/persistence/orm}post-persist" minOccurs="0"/>
 *         &lt;element name="pre-remove" type="{http://java.sun.com/xml/ns/persistence/orm}pre-remove" minOccurs="0"/>
 *         &lt;element name="post-remove" type="{http://java.sun.com/xml/ns/persistence/orm}post-remove" minOccurs="0"/>
 *         &lt;element name="pre-update" type="{http://java.sun.com/xml/ns/persistence/orm}pre-update" minOccurs="0"/>
 *         &lt;element name="post-update" type="{http://java.sun.com/xml/ns/persistence/orm}post-update" minOccurs="0"/>
 *         &lt;element name="post-load" type="{http://java.sun.com/xml/ns/persistence/orm}post-load" minOccurs="0"/>
 *         &lt;element name="attribute-override" type="{http://java.sun.com/xml/ns/persistence/orm}attribute-override" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="association-override" type="{http://java.sun.com/xml/ns/persistence/orm}association-override" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://java.sun.com/xml/ns/persistence/orm}attributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" />
 *       &lt;attribute name="cacheable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="metadata-complete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity", propOrder = {
    "description",
    "table",
    "secondaryTable",
    "primaryKeyJoinColumn",
    "idClass",
    "inheritance",
    "discriminatorValue",
    "discriminatorColumn",
    "sequenceGenerator",
    "tableGenerator",
    "namedQuery",
    "namedNativeQuery",
    "sqlResultSetMapping",
    "excludeDefaultListeners",
    "excludeSuperclassListeners",
    "entityListeners",
    "prePersist",
    "postPersist",
    "preRemove",
    "postRemove",
    "preUpdate",
    "postUpdate",
    "postLoad",
    "attributeOverride",
    "associationOverride",
    "attributes"
})
public class Entity extends JavaClass implements AccessTypeHandler, InheritenceHandler, PrimaryKeyContainer {

    protected String description;
    protected Table table;
    @XmlElement(name = "secondary-table")
    protected List<SecondaryTable> secondaryTable;//RENENG PENDING
    @XmlElement(name = "primary-key-join-column")
    protected List<PrimaryKeyJoinColumn> primaryKeyJoinColumn;//RENENG PENDING
    @XmlElement(name = "id-class")
    protected IdClass idClass;
    protected Inheritance inheritance;
    @XmlElement(name = "discriminator-value")
    protected String discriminatorValue;
    @XmlElement(name = "discriminator-column")
    protected DiscriminatorColumn discriminatorColumn;
    @XmlElement(name = "sequence-generator")
    protected SequenceGenerator sequenceGenerator;
    @XmlElement(name = "table-generator")
    protected TableGenerator tableGenerator;
    @XmlElement(name = "named-query")
    protected List<NamedQuery> namedQuery;//RENENG PENDING
    @XmlElement(name = "named-native-query")
    protected List<NamedNativeQuery> namedNativeQuery;//RENENG PENDING
    @XmlElement(name = "sql-result-set-mapping")
    protected List<SqlResultSetMapping> sqlResultSetMapping;//RENENG PENDING
    @XmlElement(name = "exclude-default-listeners")
    protected EmptyType excludeDefaultListeners;//RENENG PENDING
    @XmlElement(name = "exclude-superclass-listeners")
    protected EmptyType excludeSuperclassListeners;//RENENG PENDING
    @XmlElement(name = "entity-listeners")
    protected EntityListeners entityListeners;//RENENG PENDING
    @XmlElement(name = "pre-persist")
    protected PrePersist prePersist;//RENENG PENDING
    @XmlElement(name = "post-persist")
    protected PostPersist postPersist;//RENENG PENDING
    @XmlElement(name = "pre-remove")
    protected PreRemove preRemove;//RENENG PENDING
    @XmlElement(name = "post-remove")
    protected PostRemove postRemove;//RENENG PENDING
    @XmlElement(name = "pre-update")
    protected PreUpdate preUpdate;//RENENG PENDING
    @XmlElement(name = "post-update")
    protected PostUpdate postUpdate;//RENENG PENDING
    @XmlElement(name = "post-load")
    protected PostLoad postLoad;//RENENG PENDING
    @XmlElement(name = "attribute-override")
    protected List<AttributeOverride> attributeOverride;//RENENG PENDING
    @XmlElement(name = "association-override")
    protected List<AssociationOverride> associationOverride;//RENENG PENDING
    protected Attributes attributes;
    @XmlAttribute
    protected String name;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute
    protected AccessType access;
    @XmlAttribute
    protected Boolean cacheable;//RENENG PENDING
    @XmlAttribute(name = "metadata-complete")
    protected Boolean metadataComplete;//RENENG PENDING
    @XmlAttribute
    private CompositePrimaryKeyType compositePrimaryKeyType;//custom added
    @XmlAttribute
    private String compositePrimaryKeyClass;//custom added

    public void load(EntityMappings entityMappings, TypeElement element, boolean fieldAccess) {
        AnnotationMirror annotationMirror = JavaSourceParserUtil.getAnnotation(element, "javax.persistence.Entity");
        if (entityMappings.findEntity(element.getSimpleName().toString()) == null) {
            TypeElement superClassElement = JavaSourceParserUtil.getSuperclassTypeElement(element);
            if (!superClassElement.getQualifiedName().toString().equals("java.lang.Object")) {
                if (JavaSourceParserUtil.isEntityClass(superClassElement)) {
                    org.netbeans.jpa.modeler.spec.Entity entitySuperclassSpec = new org.netbeans.jpa.modeler.spec.Entity();
                    entitySuperclassSpec.load(entityMappings, superClassElement, fieldAccess);
                    super.setSuperclass(entitySuperclassSpec.getClazz());
                    super.setSuperclassId(entitySuperclassSpec.getId());
                    entityMappings.addEntity(entitySuperclassSpec);
                } else if (JavaSourceParserUtil.isMappedSuperClass(superClassElement)) {
                    org.netbeans.jpa.modeler.spec.MappedSuperclass mappedSuperclassSpec = new org.netbeans.jpa.modeler.spec.MappedSuperclass();
                    mappedSuperclassSpec.load(entityMappings, superClassElement, fieldAccess);
                    super.setSuperclass(mappedSuperclassSpec.getClazz());
                    super.setSuperclassId(mappedSuperclassSpec.getId());
                    entityMappings.addMappedSuperclass(mappedSuperclassSpec);
                } else {
                    //Skip
                }
            }
            this.setId(NBModelerUtil.getAutoGeneratedStringId());
            this.table = Table.load(element);
            this.idClass = IdClass.load(element);
            this.inheritance = Inheritance.load(element);
            AnnotationMirror annotDiscrValue = JavaSourceParserUtil.findAnnotation(element, "javax.persistence.DiscriminatorValue");
            if (annotDiscrValue != null) {
                Object value = JavaSourceParserUtil.findAnnotationValue(annotationMirror, "value");
                if (value != null) {
                    discriminatorValue = value.toString();
                }
            }
            this.discriminatorColumn = DiscriminatorColumn.load(element);
            this.tableGenerator = TableGenerator.load(element);
            this.sequenceGenerator = SequenceGenerator.load(element);
            this.getAttributes().load(entityMappings, element, fieldAccess);
            if (annotationMirror != null) {
                this.name = (String) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "name");
            }
            this.clazz = element.getSimpleName().toString();
            this.access = AccessType.load(element);

            if (this.getAttributes().getEmbeddedId() != null) {
                this.setCompositePrimaryKeyClass(this.getAttributes().getEmbeddedId().getAttributeType());
                this.setCompositePrimaryKeyType(CompositePrimaryKeyType.EMBEDDEDID);
            } else if (idClass != null) {
                this.setCompositePrimaryKeyClass(this.getIdClass().getClazz());
                this.setCompositePrimaryKeyType(CompositePrimaryKeyType.IDCLASS);
            } else {
                this.setCompositePrimaryKeyClass(null);
                this.setCompositePrimaryKeyType(null);
            }

        }
    }

    void beforeMarshal(Marshaller marshaller) {
        if (NBModelerUtil.isEmptyObject(table)) {
            table = null;
        }
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the table property.
     *
     * @return possible object is {@link Table }
     *
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     *
     * @param value allowed object is {@link Table }
     *
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the secondaryTable property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the secondaryTable property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryTable().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryTable }
     *
     *
     */
    public List<SecondaryTable> getSecondaryTable() {
        if (secondaryTable == null) {
            secondaryTable = new ArrayList<SecondaryTable>();
        }
        return this.secondaryTable;
    }

    /**
     * Gets the value of the primaryKeyJoinColumn property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the primaryKeyJoinColumn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryKeyJoinColumn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryKeyJoinColumn }
     *
     *
     */
    public List<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
        if (primaryKeyJoinColumn == null) {
            primaryKeyJoinColumn = new ArrayList<PrimaryKeyJoinColumn>();
        }
        return this.primaryKeyJoinColumn;
    }

    /**
     * Gets the value of the idClass property.
     *
     * @return possible object is {@link IdClass }
     *
     */
    public IdClass getIdClass() {
        return idClass;
    }

    /**
     * Sets the value of the idClass property.
     *
     * @param value allowed object is {@link IdClass }
     *
     */
    public void setIdClass(IdClass value) {
        this.idClass = value;
    }

    /**
     * Gets the value of the inheritance property.
     *
     * @return possible object is {@link Inheritance }
     *
     */
    public Inheritance getInheritance() {
        return inheritance;
    }

    /**
     * Sets the value of the inheritance property.
     *
     * @param value allowed object is {@link Inheritance }
     *
     */
    public void setInheritance(Inheritance value) {
        this.inheritance = value;
    }

    /**
     * Gets the value of the discriminatorValue property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDiscriminatorValue() {
        return discriminatorValue;
    }

    /**
     * Sets the value of the discriminatorValue property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDiscriminatorValue(String value) {
        this.discriminatorValue = value;
    }

    /**
     * Gets the value of the discriminatorColumn property.
     *
     * @return possible object is {@link DiscriminatorColumn }
     *
     */
    public DiscriminatorColumn getDiscriminatorColumn() {
        return discriminatorColumn;
    }

    /**
     * Sets the value of the discriminatorColumn property.
     *
     * @param value allowed object is {@link DiscriminatorColumn }
     *
     */
    public void setDiscriminatorColumn(DiscriminatorColumn value) {
        this.discriminatorColumn = value;
    }

    /**
     * Gets the value of the sequenceGenerator property.
     *
     * @return possible object is {@link SequenceGenerator }
     *
     */
    public SequenceGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }

    /**
     * Sets the value of the sequenceGenerator property.
     *
     * @param value allowed object is {@link SequenceGenerator }
     *
     */
    public void setSequenceGenerator(SequenceGenerator value) {
        this.sequenceGenerator = value;
    }

    /**
     * Gets the value of the tableGenerator property.
     *
     * @return possible object is {@link TableGenerator }
     *
     */
    public TableGenerator getTableGenerator() {
        return tableGenerator;
    }

    /**
     * Sets the value of the tableGenerator property.
     *
     * @param value allowed object is {@link TableGenerator }
     *
     */
    public void setTableGenerator(TableGenerator value) {
        this.tableGenerator = value;
    }

    /**
     * Gets the value of the namedQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the namedQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedQuery }
     *
     *
     */
    public List<NamedQuery> getNamedQuery() {
        if (namedQuery == null) {
            namedQuery = new ArrayList<NamedQuery>();
        }
        return this.namedQuery;
    }

    /**
     * Gets the value of the namedNativeQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the namedNativeQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedNativeQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedNativeQuery }
     *
     *
     */
    public List<NamedNativeQuery> getNamedNativeQuery() {
        if (namedNativeQuery == null) {
            namedNativeQuery = new ArrayList<NamedNativeQuery>();
        }
        return this.namedNativeQuery;
    }

    /**
     * Gets the value of the sqlResultSetMapping property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sqlResultSetMapping property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSqlResultSetMapping().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqlResultSetMapping }
     *
     *
     */
    public List<SqlResultSetMapping> getSqlResultSetMapping() {
        if (sqlResultSetMapping == null) {
            sqlResultSetMapping = new ArrayList<SqlResultSetMapping>();
        }
        return this.sqlResultSetMapping;
    }

    /**
     * Gets the value of the excludeDefaultListeners property.
     *
     * @return possible object is {@link EmptyType }
     *
     */
    public EmptyType getExcludeDefaultListeners() {
        return excludeDefaultListeners;
    }

    /**
     * Sets the value of the excludeDefaultListeners property.
     *
     * @param value allowed object is {@link EmptyType }
     *
     */
    public void setExcludeDefaultListeners(EmptyType value) {
        this.excludeDefaultListeners = value;
    }

    /**
     * Gets the value of the excludeSuperclassListeners property.
     *
     * @return possible object is {@link EmptyType }
     *
     */
    public EmptyType getExcludeSuperclassListeners() {
        return excludeSuperclassListeners;
    }

    /**
     * Sets the value of the excludeSuperclassListeners property.
     *
     * @param value allowed object is {@link EmptyType }
     *
     */
    public void setExcludeSuperclassListeners(EmptyType value) {
        this.excludeSuperclassListeners = value;
    }

    /**
     * Gets the value of the entityListeners property.
     *
     * @return possible object is {@link EntityListeners }
     *
     */
    public EntityListeners getEntityListeners() {
        return entityListeners;
    }

    /**
     * Sets the value of the entityListeners property.
     *
     * @param value allowed object is {@link EntityListeners }
     *
     */
    public void setEntityListeners(EntityListeners value) {
        this.entityListeners = value;
    }

    /**
     * Gets the value of the prePersist property.
     *
     * @return possible object is {@link PrePersist }
     *
     */
    public PrePersist getPrePersist() {
        return prePersist;
    }

    /**
     * Sets the value of the prePersist property.
     *
     * @param value allowed object is {@link PrePersist }
     *
     */
    public void setPrePersist(PrePersist value) {
        this.prePersist = value;
    }

    /**
     * Gets the value of the postPersist property.
     *
     * @return possible object is {@link PostPersist }
     *
     */
    public PostPersist getPostPersist() {
        return postPersist;
    }

    /**
     * Sets the value of the postPersist property.
     *
     * @param value allowed object is {@link PostPersist }
     *
     */
    public void setPostPersist(PostPersist value) {
        this.postPersist = value;
    }

    /**
     * Gets the value of the preRemove property.
     *
     * @return possible object is {@link PreRemove }
     *
     */
    public PreRemove getPreRemove() {
        return preRemove;
    }

    /**
     * Sets the value of the preRemove property.
     *
     * @param value allowed object is {@link PreRemove }
     *
     */
    public void setPreRemove(PreRemove value) {
        this.preRemove = value;
    }

    /**
     * Gets the value of the postRemove property.
     *
     * @return possible object is {@link PostRemove }
     *
     */
    public PostRemove getPostRemove() {
        return postRemove;
    }

    /**
     * Sets the value of the postRemove property.
     *
     * @param value allowed object is {@link PostRemove }
     *
     */
    public void setPostRemove(PostRemove value) {
        this.postRemove = value;
    }

    /**
     * Gets the value of the preUpdate property.
     *
     * @return possible object is {@link PreUpdate }
     *
     */
    public PreUpdate getPreUpdate() {
        return preUpdate;
    }

    /**
     * Sets the value of the preUpdate property.
     *
     * @param value allowed object is {@link PreUpdate }
     *
     */
    public void setPreUpdate(PreUpdate value) {
        this.preUpdate = value;
    }

    /**
     * Gets the value of the postUpdate property.
     *
     * @return possible object is {@link PostUpdate }
     *
     */
    public PostUpdate getPostUpdate() {
        return postUpdate;
    }

    /**
     * Sets the value of the postUpdate property.
     *
     * @param value allowed object is {@link PostUpdate }
     *
     */
    public void setPostUpdate(PostUpdate value) {
        this.postUpdate = value;
    }

    /**
     * Gets the value of the postLoad property.
     *
     * @return possible object is {@link PostLoad }
     *
     */
    public PostLoad getPostLoad() {
        return postLoad;
    }

    /**
     * Sets the value of the postLoad property.
     *
     * @param value allowed object is {@link PostLoad }
     *
     */
    public void setPostLoad(PostLoad value) {
        this.postLoad = value;
    }

    /**
     * Gets the value of the attributeOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attributeOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeOverride }
     *
     *
     */
    public List<AttributeOverride> getAttributeOverride() {
        if (attributeOverride == null) {
            attributeOverride = new ArrayList<AttributeOverride>();
        }
        return this.attributeOverride;
    }

    /**
     * Gets the value of the associationOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the associationOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationOverride }
     *
     *
     */
    public List<AssociationOverride> getAssociationOverride() {
        if (associationOverride == null) {
            associationOverride = new ArrayList<AssociationOverride>();
        }
        return this.associationOverride;
    }

    /**
     * Gets the value of the attributes property.
     *
     * @return possible object is {@link Attributes }
     *
     */
    public Attributes getAttributes() {
        if (attributes == null) {
            attributes = new Attributes();
        }
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value allowed object is {@link Attributes }
     *
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the access property.
     *
     * @return possible object is {@link AccessType }
     *
     */
    public AccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     *
     * @param value allowed object is {@link AccessType }
     *
     */
    public void setAccess(AccessType value) {
        this.access = value;
    }

    /**
     * Gets the value of the cacheable property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean getCacheable() {//isCacheable()
        return cacheable;
    }

    /**
     * Sets the value of the cacheable property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setCacheable(Boolean value) {
        this.cacheable = value;
    }

    /**
     * Gets the value of the metadataComplete property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean getMetadataComplete() {//isMetadataComplete()
        return metadataComplete;
    }

    /**
     * Sets the value of the metadataComplete property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMetadataComplete(Boolean value) {
        this.metadataComplete = value;
    }

    @Override
    public void setAttributes(IAttributes attributes) {
        this.attributes = (Attributes) attributes;
    }

    @Override
    public String toString() {
        return "Entity{" + "description=" + description + ", table=" + table + ", secondaryTable=" + secondaryTable + ", primaryKeyJoinColumn=" + primaryKeyJoinColumn + ", idClass=" + idClass + ", inheritance=" + inheritance + ", discriminatorValue=" + discriminatorValue + ", discriminatorColumn=" + discriminatorColumn + ", sequenceGenerator=" + sequenceGenerator + ", tableGenerator=" + tableGenerator + ", namedQuery=" + namedQuery + ", namedNativeQuery=" + namedNativeQuery + ", sqlResultSetMapping=" + sqlResultSetMapping + ", excludeDefaultListeners=" + excludeDefaultListeners + ", excludeSuperclassListeners=" + excludeSuperclassListeners + ", entityListeners=" + entityListeners + ", prePersist=" + prePersist + ", postPersist=" + postPersist + ", preRemove=" + preRemove + ", postRemove=" + postRemove + ", preUpdate=" + preUpdate + ", postUpdate=" + postUpdate + ", postLoad=" + postLoad + ", attributeOverride=" + attributeOverride + ", associationOverride=" + associationOverride + ", attributes=" + attributes + ", name=" + name + ", clazz=" + clazz + ", access=" + access + ", cacheable=" + cacheable + ", metadataComplete=" + metadataComplete + '}';
    }

    /**
     * @return the compositePrimaryKeyType
     */
    public CompositePrimaryKeyType getCompositePrimaryKeyType() {
        return compositePrimaryKeyType;
    }

    /**
     * @param compositePrimaryKeyType the compositePrimaryKeyType to set
     */
    public void setCompositePrimaryKeyType(CompositePrimaryKeyType compositePrimaryKeyType) {
        this.compositePrimaryKeyType = compositePrimaryKeyType;
        manageCompositePrimaryKeyClass();
    }

    /**
     * @return the compositePrimaryKeyClass
     */
    public String getCompositePrimaryKeyClass() {
        return compositePrimaryKeyClass;
    }

    /**
     * @param compositePrimaryKeyClass the compositePrimaryKeyClass to set
     */
    public void setCompositePrimaryKeyClass(String compositePrimaryKeyClass) {
        this.compositePrimaryKeyClass = compositePrimaryKeyClass;
        manageCompositePrimaryKeyClass();
    }

    public void manageCompositePrimaryKeyClass() {
        if (compositePrimaryKeyClass == null || compositePrimaryKeyClass.trim().isEmpty()) {
            compositePrimaryKeyClass = this.getClazz() + "PK";
        }
        if (this.getCompositePrimaryKeyType() == CompositePrimaryKeyType.EMBEDDEDID) {
            this.getAttributes().getEmbeddedId().setAttributeType(compositePrimaryKeyClass);
            this.idClass = null;
        } else if (this.getCompositePrimaryKeyType() == CompositePrimaryKeyType.IDCLASS) {
            this.idClass = new IdClass(compositePrimaryKeyClass);
        } else {
            this.idClass = null;
            compositePrimaryKeyClass = null;
            if (getCompositePrimaryKeyType() == null) {
                setCompositePrimaryKeyType(CompositePrimaryKeyType.NONE);
            }
        }
    }

}
