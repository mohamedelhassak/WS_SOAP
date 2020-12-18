package EXERCICES.EX3.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etudiant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="note2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", namespace = "myservice", propOrder = {
        "id",
        "nom",
        "note1",
        "note2",
        "prenom"
})
public class Etudiant {

    protected Long id;
    protected String nom;
    protected double note1;
    protected double note2;
    protected String prenom;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the note1 property.
     */
    public double getNote1() {
        return note1;
    }

    /**
     * Sets the value of the note1 property.
     */
    public void setNote1(double value) {
        this.note1 = value;
    }

    /**
     * Gets the value of the note2 property.
     */
    public double getNote2() {
        return note2;
    }

    /**
     * Sets the value of the note2 property.
     */
    public void setNote2(double value) {
        this.note2 = value;
    }

    /**
     * Gets the value of the prenom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the value of the prenom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

}
