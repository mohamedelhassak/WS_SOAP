package EXERCICES.EX1.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversionEuroToDh complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="conversionEuroToDh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionEuroToDh", namespace = "myservice", propOrder = {
        "montant"
})
public class ConversionEuroToDh {

    protected double montant;

    /**
     * Gets the value of the montant property.
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     */
    public void setMontant(double value) {
        this.montant = value;
    }

}
