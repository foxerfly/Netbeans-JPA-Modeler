//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.netbeans.jpa.modeler.spec.design.Diagram;
import org.netbeans.jpa.modeler.spec.extend.BaseElement;
import org.netbeans.jpa.modeler.spec.extend.JavaClass;
import org.netbeans.jpa.modeler.spec.extend.RelationAttribute;
import org.netbeans.modeler.core.exception.InvalidElmentException;
import org.netbeans.modeler.specification.model.document.IDefinitionElement;
import org.netbeans.modeler.specification.model.document.IRootElement;
import org.netbeans.modeler.specification.model.document.core.IBaseElement;

/**
 *
 *
 * The entity-mappings element is the root element of a mapping file. It
 * contains the following four types of elements:
 *
 * 1. The persistence-unit-metadata element contains metadata for the entire
 * persistence unit. It is undefined if this element occurs in multiple mapping
 * files within the same persistence unit.
 *
 * 2. The package, schema, catalog and access elements apply to all of the
 * entity, mapped-superclass and embeddable elements defined in the same file in
 * which they occur.
 *
 * 3. The sequence-generator, table-generator, named-query, named-native-query
 * and sql-result-set-mapping elements are global to the persistence unit. It is
 * undefined to have more than one sequence-generator or table-generator of the
 * same name in the same or different mapping files in a persistence unit. It is
 * also undefined to have more than one named-query, named-native-query, or
 * result-set-mapping of the same name in the same or different mapping files in
 * a persistence unit.
 *
 * 4. The entity, mapped-superclass and embeddable elements each define the
 * mapping information for a managed persistent class. The mapping information
 * contained in these elements may be complete or it may be partial.
 *
 *
 *
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistence-unit-metadata" type="{http://java.sun.com/xml/ns/persistence/orm}persistence-unit-metadata" minOccurs="0"/>
 *         &lt;element name="package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" minOccurs="0"/>
 *         &lt;element name="sequence-generator" type="{http://java.sun.com/xml/ns/persistence/orm}sequence-generator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="table-generator" type="{http://java.sun.com/xml/ns/persistence/orm}table-generator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="named-query" type="{http://java.sun.com/xml/ns/persistence/orm}named-query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="named-native-query" type="{http://java.sun.com/xml/ns/persistence/orm}named-native-query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sql-result-set-mapping" type="{http://java.sun.com/xml/ns/persistence/orm}sql-result-set-mapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mapped-superclass" type="{http://java.sun.com/xml/ns/persistence/orm}mapped-superclass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entity" type="{http://java.sun.com/xml/ns/persistence/orm}entity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="embeddable" type="{http://java.sun.com/xml/ns/persistence/orm}embeddable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://java.sun.com/xml/ns/persistence/orm}versionType" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "persistenceUnitMetadata",
    "_package",
    "schema",
    "catalog",
    "access",
    "sequenceGenerator",
    "tableGenerator",
    "namedQuery",
    "namedNativeQuery",
    "sqlResultSetMapping",
    "idClass",
    "embeddedIdClass",
    "mappedSuperclass",
    "entity",
    "embeddable",
    "jpaDiagram"
})
@XmlRootElement(name = "entity-mappings")
public class EntityMappings extends BaseElement implements IDefinitionElement, IRootElement {

    protected String description;
    @XmlElement(name = "persistence-unit-metadata")
    protected PersistenceUnitMetadata persistenceUnitMetadata;
    @XmlElement(name = "package")
    protected String _package;
    protected String schema;
    protected String catalog;
    protected AccessType access;
    @XmlElement(name = "sequence-generator")
    protected List<SequenceGenerator> sequenceGenerator;
    @XmlElement(name = "table-generator")
    protected List<TableGenerator> tableGenerator;
    @XmlElement(name = "named-query")
    protected List<NamedQuery> namedQuery;
    @XmlElement(name = "named-native-query")
    protected List<NamedNativeQuery> namedNativeQuery;
    @XmlElement(name = "sql-result-set-mapping")
    protected List<SqlResultSetMapping> sqlResultSetMapping;

    @XmlElement(name = "idclass")
    private List<DefaultClass> idClass;
    @XmlElement(name = "embeddedidclass")
    private List<DefaultClass> embeddedIdClass;
    @XmlElement(name = "mapped-superclass")
    protected List<MappedSuperclass> mappedSuperclass;
    protected List<Entity> entity;
    protected List<Embeddable> embeddable;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlElement(name = "diagram")
    private Diagram jpaDiagram;//Custom Added
    @XmlAttribute
    private String status;//GENERATED (DBRE,JCRE)

    @XmlAttribute
    private String persistenceUnitName;

    //UPDATE ELEMENT
    public boolean isClassExist(String _class) {
        if (mappedSuperclass != null) {
            for (MappedSuperclass mappedSuperclass_TMP : mappedSuperclass) {
                if (mappedSuperclass_TMP.getClazz() != null && mappedSuperclass_TMP.getClazz().equals(_class)) {
                    return true;
                }
            }
        }
        if (entity != null) {
            for (Entity entity_TMP : entity) {
                if (entity_TMP.getClazz() != null && entity_TMP.getClazz().equals(_class)) {
                    return true;
                }
            }
        }
        if (embeddable != null) {
            for (Embeddable embeddable_TMP : embeddable) {
                if (embeddable_TMP.getClazz() != null && embeddable_TMP.getClazz().equals(_class)) {
                    return true;
                }
            }
        }

        return false;
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
     * Gets the value of the persistenceUnitMetadata property.
     *
     * @return possible object is {@link PersistenceUnitMetadata }
     *
     */
    public PersistenceUnitMetadata getPersistenceUnitMetadata() {
        return persistenceUnitMetadata;
    }

    /**
     * Sets the value of the persistenceUnitMetadata property.
     *
     * @param value allowed object is {@link PersistenceUnitMetadata }
     *
     */
    public void setPersistenceUnitMetadata(PersistenceUnitMetadata value) {
        this.persistenceUnitMetadata = value;
    }

    /**
     * Gets the value of the package property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the schema property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the catalog property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCatalog(String value) {
        this.catalog = value;
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
     * Gets the value of the sequenceGenerator property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sequenceGenerator property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceGenerator().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceGenerator }
     *
     *
     */
    public List<SequenceGenerator> getSequenceGenerator() {
        if (sequenceGenerator == null) {
            sequenceGenerator = new ArrayList<SequenceGenerator>();
        }
        return this.sequenceGenerator;
    }

    /**
     * Gets the value of the tableGenerator property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the tableGenerator property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableGenerator().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableGenerator }
     *
     *
     */
    public List<TableGenerator> getTableGenerator() {
        if (tableGenerator == null) {
            tableGenerator = new ArrayList<TableGenerator>();
        }
        return this.tableGenerator;
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
     * Gets the value of the mappedSuperclass property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mappedSuperclass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappedSuperclass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MappedSuperclass }
     *
     *
     */
    public List<MappedSuperclass> getMappedSuperclass() {
        if (mappedSuperclass == null) {
            mappedSuperclass = new ArrayList<MappedSuperclass>();
        }
        return this.mappedSuperclass;
    }

    /**
     * Gets the value of the entity property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the entity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Entity }
     *
     *
     */
    public List<Entity> getEntity() {
        if (entity == null) {
            entity = new ArrayList<Entity>();
        }
        return this.entity;
    }

    /**
     * Gets the value of the embeddable property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the embeddable property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbeddable().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Embeddable }
     *
     *
     */
    public List<Embeddable> getEmbeddable() {
        if (embeddable == null) {
            embeddable = new ArrayList<Embeddable>();
        }
        return this.embeddable;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    ;
      @Override
    public void removeBaseElement(IBaseElement baseElement_In) {
        if (baseElement_In instanceof Entity) {
            this.removeEntity((Entity) baseElement_In);
        } else if (baseElement_In instanceof MappedSuperclass) {
            this.removeMappedSuperclass((MappedSuperclass) baseElement_In);
        } else if (baseElement_In instanceof Embeddable) {
            this.removeEmbeddable((Embeddable) baseElement_In);
        } else {
            throw new InvalidElmentException("Invalid JPA Element");
        }
    }

    @Override
    public void addBaseElement(IBaseElement baseElement_In) {
        if (baseElement_In instanceof Entity) {
            this.addEntity((Entity) baseElement_In);
        } else if (baseElement_In instanceof MappedSuperclass) {
            this.addMappedSuperclass((MappedSuperclass) baseElement_In);
        } else if (baseElement_In instanceof Embeddable) {
            this.addEmbeddable((Embeddable) baseElement_In);
        } else {
            throw new InvalidElmentException("Invalid JPA Element");
        }
    }

    public void removeEntity(Entity entity_In) {
        if (entity != null) {
            this.entity.remove(entity_In);
        }
    }

    public void addEntity(Entity entity_In) {
        if (entity == null) {
            entity = new ArrayList<Entity>();
        }
        this.entity.add(entity_In);
    }

    public Entity findEntity(String entityName) {
        if (entity != null) {
            for (Entity entity_In : entity) {
                if (entityName.equals(entity_In.getClazz())) {
                    return entity_In;
                }
            }
        }
        return null;
    }

    public List<Entity> findAllEntity(String entityName) {
        List<Entity> entities = new ArrayList<Entity>();
        if (entity != null) {
            for (Entity entity_In : entity) {
                if (entityName.equals(entity_In.getClazz())) {
                    entities.add(entity_In);
                }
            }
        }
        return entities;
    }

    public void removeMappedSuperclass(MappedSuperclass mappedSuperclass_In) {
        if (mappedSuperclass != null) {
            this.mappedSuperclass.remove(mappedSuperclass_In);
        }
    }

    public void addMappedSuperclass(MappedSuperclass mappedSuperclass_In) {
        if (mappedSuperclass == null) {
            mappedSuperclass = new ArrayList<MappedSuperclass>();
        }
        this.mappedSuperclass.add(mappedSuperclass_In);
    }

    public MappedSuperclass findMappedSuperclass(String mappedSuperclassName) {
        if (mappedSuperclass != null) {
            for (MappedSuperclass mappedSuperclass_In : mappedSuperclass) {
                if (mappedSuperclassName.equals(mappedSuperclass_In.getClazz())) {
                    return mappedSuperclass_In;
                }
            }
        }
        return null;
    }

    public void removeEmbeddable(Embeddable embeddable_In) {
        if (embeddable != null) {
            this.embeddable.remove(embeddable_In);
        }
    }

    public void addEmbeddable(Embeddable embeddable_In) {
        if (embeddable == null) {
            embeddable = new ArrayList<Embeddable>();
        }
        this.embeddable.add(embeddable_In);
    }

    public Embeddable findEmbeddable(String embeddableName) {
        if (embeddable != null) {
            for (Embeddable embeddable_In : embeddable) {
                if (embeddableName.equals(embeddable_In.getClazz())) {
                    return embeddable_In;
                }
            }
        }
        return null;
    }

    @Override
    public Map<String, String> getCustomAttributes() {
        return null;
    }

    @Override
    public void setCustomAttributes(Map<String, String> customAttributes) {

    }

    /**
     * @return the jpaDiagram
     */
    public Diagram getJPADiagram() {
        return jpaDiagram;
    }

    /**
     * @param jpaDiagram the jpaDiagram to set
     */
    public void setJPADiagram(Diagram jpaDiagram) {
        this.jpaDiagram = jpaDiagram;
    }

    /**
     * @return the persistenceUnitName
     */
    public String getPersistenceUnitName() {
        return persistenceUnitName;
    }

    /**
     * @param persistenceUnitName the persistenceUnitName to set
     */
    public void setPersistenceUnitName(String persistenceUnitName) {
        this.persistenceUnitName = persistenceUnitName;
    }

    /**
     * @return the idClass
     */
    public List<DefaultClass> getIdClass() {
        if (this.idClass == null) {
            this.idClass = new ArrayList<DefaultClass>();
        }
        return idClass;
    }

    /**
     * @param idClass the idClass to set
     */
    public void setIdClass(List<DefaultClass> idClass) {
        this.idClass = idClass;
    }

    public void addIdClass(DefaultClass idClass) {
        if (this.idClass == null) {
            this.idClass = new ArrayList<DefaultClass>();
        }
        this.idClass.add(idClass);
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public void setGenerated() {
        this.status = "GENERATED";
    }

    public boolean isGenerated() {
        if ("GENERATED".equals(this.status)) {
            return true;
        } else {
            return false;
        }
    }

//    public void manageSiblingAttribute(org.netbeans.jpa.modeler.spec.Entity targetEntity, RelationAttribute relationAttribute_Owner) {
//        org.netbeans.jpa.modeler.spec.Entity sourceEntity = this.findEntity(relationAttribute_Owner.getTargetEntity());
//        if (relationAttribute_Owner instanceof ManyToMany) {
//            ManyToMany targetAttribute = (ManyToMany) relationAttribute_Owner;
//            ManyToMany sourceAttribute = null;
//            String mappedBy = ((ManyToMany) relationAttribute_Owner).getMappedBy();
//            for (ManyToMany sourceManyToMany : sourceEntity.getAttributes().getManyToMany()) {
//                if (mappedBy.equals(sourceManyToMany.getName())) {
//                    sourceAttribute = sourceManyToMany;
//                    break;
//                }
//            }
//            targetAttribute.setConnectedEntityId(sourceEntity.getId());
//            targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
//            sourceAttribute.setConnectedEntityId(targetEntity.getId());
//            sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
//
//        } else if (relationAttribute_Owner instanceof OneToMany) {
//            OneToMany targetAttribute = (OneToMany) relationAttribute_Owner;
//            ManyToOne sourceAttribute = null;
//            String mappedBy = ((OneToMany) relationAttribute_Owner).getMappedBy();
//            for (ManyToOne sourceManyToOne : sourceEntity.getAttributes().getManyToOne()) {
//                if (mappedBy.equals(sourceManyToOne.getName())) {
//                    sourceAttribute = sourceManyToOne;
//                    break;
//                }
//            }
//            targetAttribute.setConnectedEntityId(sourceEntity.getId());
//            targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
//            sourceAttribute.setConnectedEntityId(targetEntity.getId());
//            sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
//
//        } //            else if (relationAttribute_Owner instanceof ManyToOne) {
//        //                ManyToOne targetAttribute = (ManyToOne) relationAttribute_Owner;
//        //                OneToMany sourceAttribute = null;
//        //                String mappedBy = ((ManyToOne) relationAttribute_Owner).getMappedBy();
//        //                for (OneToMany sourceOneToMany : sourceEntity.getAttributes().getOneToMany()) {
//        //                    if (mappedBy.equals(sourceOneToMany.getName())) {
//        //                        sourceAttribute = sourceOneToMany;
//        //                        break;
//        //                    }
//        //                }
//        //                targetAttribute.setConnectedEntityId(sourceEntity.getId());
//        //                targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
//        //                sourceAttribute.setConnectedEntityId(targetEntity.getId());
//        //                sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
//        //
//        //            }
//        else if (relationAttribute_Owner instanceof OneToOne) {
//            OneToOne targetAttribute = (OneToOne) relationAttribute_Owner;
//            OneToOne sourceAttribute = null;
//            String mappedBy = ((OneToOne) relationAttribute_Owner).getMappedBy();
//            for (OneToOne sourceOneToMany : sourceEntity.getAttributes().getOneToOne()) {
//                if (mappedBy.equals(sourceOneToMany.getName())) {
//                    sourceAttribute = sourceOneToMany;
//                    break;
//                }
//            }
//            targetAttribute.setConnectedEntityId(sourceEntity.getId());
//            targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
//            sourceAttribute.setConnectedEntityId(targetEntity.getId());
//            sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
//
//        }
//
//    }
    public void manageSiblingAttribute(JavaClass sourceJavaClass, RelationAttribute relationAttribute_Owner) {
        org.netbeans.jpa.modeler.spec.Entity targetEntity = this.findEntity(relationAttribute_Owner.getTargetEntity());
        if (targetEntity != null) {
            if (relationAttribute_Owner instanceof ManyToMany) {
                ManyToMany sourceAttribute = (ManyToMany) relationAttribute_Owner;
                ManyToMany targetAttribute = null;
                for (ManyToMany targetManyToMany : targetEntity.getAttributes().getManyToMany()) {
                    if (sourceAttribute.getName().equals(targetManyToMany.getMappedBy())) {
                        targetAttribute = targetManyToMany;
                        break;
                    }
                }
                if (targetAttribute != null) {
                    targetAttribute.setConnectedEntityId(sourceJavaClass.getId());
                    targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
                    sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
                }
                sourceAttribute.setConnectedEntityId(targetEntity.getId());
            } else if (relationAttribute_Owner instanceof OneToMany) {
                OneToMany sourceAttribute = (OneToMany) relationAttribute_Owner;
                sourceAttribute.setConnectedEntityId(targetEntity.getId());
            } else if (relationAttribute_Owner instanceof ManyToOne) {
                ManyToOne sourceAttribute = (ManyToOne) relationAttribute_Owner;
                OneToMany targetAttribute = null;
                for (OneToMany targetOneToMany : targetEntity.getAttributes().getOneToMany()) {
                    if (sourceAttribute.getName().equals(targetOneToMany.getMappedBy())) {
                        targetAttribute = targetOneToMany;
                        break;
                    }
                }
                if (targetAttribute != null) {
                    targetAttribute.setConnectedEntityId(sourceJavaClass.getId());
                    targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
                    sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
                }
                sourceAttribute.setConnectedEntityId(targetEntity.getId());

            } else if (relationAttribute_Owner instanceof OneToOne) {
                OneToOne sourceAttribute = (OneToOne) relationAttribute_Owner;
                OneToOne targetAttribute = null;
                for (OneToOne targetOneToOne : targetEntity.getAttributes().getOneToOne()) {
                    if (sourceAttribute.getName().equals(targetOneToOne.getMappedBy())) {
                        targetAttribute = targetOneToOne;
                        break;
                    }
                }
                if (targetAttribute != null) {
                    targetAttribute.setConnectedEntityId(sourceJavaClass.getId());
                    targetAttribute.setConnectedAttributeId(sourceAttribute.getId());
                    sourceAttribute.setConnectedAttributeId(targetAttribute.getId());
                }
                sourceAttribute.setConnectedEntityId(targetEntity.getId());

            }
        }
    }

    /**
     * @return the embeddedIdClass
     */
    public List<DefaultClass> getEmbeddedIdClass() {
        if (embeddedIdClass == null) {
            embeddedIdClass = new ArrayList<DefaultClass>();
        }
        return embeddedIdClass;
    }

    /**
     * @param embeddedIdClass the embeddedIdClass to set
     */
    public void setEmbeddedIdClass(List<DefaultClass> embeddedIdClass) {
        this.embeddedIdClass = embeddedIdClass;
    }

    public void addEmbeddedIdClass(DefaultClass embeddedIdClass) {
        if (this.embeddedIdClass == null) {
            this.embeddedIdClass = new ArrayList<DefaultClass>();
        }
        this.embeddedIdClass.add(embeddedIdClass);
    }

}
