//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 01:52:08 PM MESZ 
//


package org.osmtools.osc;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for osmChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osmChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bounds" type="{}bounds" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modify" type="{}modify" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="create" type="{}create" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delete" type="{}delete" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="generator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osmChange", propOrder = {
    "bounds",
    "modify",
    "create",
    "delete"
})
public class OsmChange {

    protected List<Bounds> bounds;
    protected List<Modify> modify;
    protected List<Create> create;
    protected List<Delete> delete;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "generator")
    protected String generator;

    /**
     * Gets the value of the bounds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bounds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBounds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bounds }
     * 
     * 
     */
    public List<Bounds> getBounds() {
        if (bounds == null) {
            bounds = new ArrayList<Bounds>();
        }
        return this.bounds;
    }

    /**
     * Gets the value of the modify property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modify property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModify().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modify }
     * 
     * 
     */
    public List<Modify> getModify() {
        if (modify == null) {
            modify = new ArrayList<Modify>();
        }
        return this.modify;
    }

    /**
     * Gets the value of the create property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the create property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Create }
     * 
     * 
     */
    public List<Create> getCreate() {
        if (create == null) {
            create = new ArrayList<Create>();
        }
        return this.create;
    }

    /**
     * Gets the value of the delete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delete }
     * 
     * 
     */
    public List<Delete> getDelete() {
        if (delete == null) {
            delete = new ArrayList<Delete>();
        }
        return this.delete;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
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
