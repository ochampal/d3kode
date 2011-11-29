//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.08 at 10:30:17 AM CEST 
//


package org.liris.mTrace.jaxb.base;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="line" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="src" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dest" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "line"
})
@XmlRootElement(name = "lines")
public class Lines {

    @XmlElement(required = true)
    protected List<Lines.Line> line;

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lines.Line }
     * 
     * 
     */
    public List<Lines.Line> getLine() {
        if (line == null) {
            line = new ArrayList<Lines.Line>();
        }
        return this.line;
    }


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
     *         &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *       &lt;attribute name="src" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dest" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "begin",
        "end"
    })
    public static class Line {

        @XmlElement(required = true)
        protected BigInteger begin;
        @XmlElement(required = true)
        protected BigInteger end;
        @XmlAttribute(name = "src", required = true)
        protected String src;
        @XmlAttribute(name = "dest", required = true)
        protected String dest;

        /**
         * Gets the value of the begin property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBegin() {
            return begin;
        }

        /**
         * Sets the value of the begin property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBegin(BigInteger value) {
            this.begin = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEnd(BigInteger value) {
            this.end = value;
        }

        /**
         * Gets the value of the src property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrc() {
            return src;
        }

        /**
         * Sets the value of the src property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrc(String value) {
            this.src = value;
        }

        /**
         * Gets the value of the dest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDest() {
            return dest;
        }

        /**
         * Sets the value of the dest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDest(String value) {
            this.dest = value;
        }

    }

}
