package EXERCICES.EX1.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversionEuroToDhResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="conversionEuroToDhResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionEuroToDhResponse", namespace = "myservice", propOrder = {
        "_return"
})
public class ConversionEuroToDhResponse {

    @XmlElement(name = "return")
    protected double _return;

    /**
     * Gets the value of the return property.
     */
    public double getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     */
    public void setReturn(double value) {
        this._return = value;
    }

}
