//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 01:52:08 PM MESZ 
//


package org.osm.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bound" type="{}Osm_bound" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="node" type="{}Osm_node" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="way" type="{}Osm_way" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relation" type="{}Osm_relation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changeset" type="{}Osm_changeset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{}Osm_user" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="0.6" />
 *       &lt;attribute name="generator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bound",
    "node",
    "way",
    "relation",
    "changeset",
    "user"
})
@XmlRootElement(name = "osm")
public class Osm {

    protected List<OsmBound> bound;
    protected List<OsmNode> node;
    protected List<OsmWay> way;
    protected List<OsmRelation> relation;
    protected List<OsmChangeset> changeset;
    protected OsmUser user;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "generator", required = true)
    protected String generator;

    /**
     * Gets the value of the bound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmBound }
     * 
     * 
     */
    public List<OsmBound> getBound() {
        if (bound == null) {
            bound = new ArrayList<OsmBound>();
        }
        return this.bound;
    }

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmNode }
     * 
     * 
     */
    public List<OsmNode> getNode() {
        if (node == null) {
            node = new ArrayList<OsmNode>();
        }
        return this.node;
    }

    /**
     * Gets the value of the way property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the way property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmWay }
     * 
     * 
     */
    public List<OsmWay> getWay() {
        if (way == null) {
            way = new ArrayList<OsmWay>();
        }
        return this.way;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmRelation }
     * 
     * 
     */
    public List<OsmRelation> getRelation() {
        if (relation == null) {
            relation = new ArrayList<OsmRelation>();
        }
        return this.relation;
    }

    /**
     * Gets the value of the changeset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsmChangeset }
     * 
     * 
     */
    public List<OsmChangeset> getChangeset() {
        if (changeset == null) {
            changeset = new ArrayList<OsmChangeset>();
        }
        return this.changeset;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link OsmUser }
     *     
     */
    public OsmUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsmUser }
     *     
     */
    public void setUser(OsmUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("0.6");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

}
