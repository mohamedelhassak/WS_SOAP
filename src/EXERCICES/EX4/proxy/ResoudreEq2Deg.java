package EXERCICES.EX4.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resoudreEq2deg complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resoudreEq2deg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="B" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="C" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resoudreEq2deg", namespace = "myservice", propOrder = {
        "a",
        "b",
        "c"
})
public class ResoudreEq2Deg {

    @XmlElement(name = "A")
    protected double a;
    @XmlElement(name = "B")
    protected double b;
    @XmlElement(name = "C")
    protected double c;

    /**
     * Gets the value of the a property.
     */
    public double getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     */
    public double getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     */
    public void setB(double value) {
        this.b = value;
    }

    /**
     * Gets the value of the c property.
     */
    public double getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     */
    public void setC(double value) {
        this.c = value;
    }

}
