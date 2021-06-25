
package com.me.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="par1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="par2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation2", propOrder = {
    "par1",
    "par2"
})
public class Operation2 {

    protected int par1;
    protected int par2;

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

}
