
package com.me.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="par1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="par2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="par3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation1", propOrder = {
    "par1",
    "par2",
    "par3"
})
public class Operation1 {

    protected int par1;
    protected int par2;
    protected String par3;

    /**
     * Gets the value of the par1 property.
     * 
     */
    public int getPar1() {
        return par1;
    }

    /**
     * Sets the value of the par1 property.
     * 
     */
    public void setPar1(int value) {
        this.par1 = value;
    }

    /**
     * Gets the value of the par2 property.
     * 
     */
    public int getPar2() {
        return par2;
    }

    /**
     * Sets the value of the par2 property.
     * 
     */
    public void setPar2(int value) {
        this.par2 = value;
    }

    /**
     * Gets the value of the par3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPar3() {
        return par3;
    }

    /**
     * Sets the value of the par3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPar3(String value) {
        this.par3 = value;
    }

}
