
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour resultImpaye complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="resultImpaye">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creancier" type="{http://controllers.cmi.api.ensas.com/}creancier" minOccurs="0"/>
 *         &lt;element name="impayeList" type="{http://controllers.cmi.api.ensas.com/}impaye" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultImpaye", propOrder = {
    "creancier",
    "impayeList"
})
public class ResultImpaye {

    protected Creancier creancier;
    @XmlElement(nillable = true)
    protected List<Impaye> impayeList;

    /**
     * Obtient la valeur de la propriété creancier.
     * 
     * @return
     *     possible object is
     *     {@link Creancier }
     *     
     */
    public Creancier getCreancier() {
        return creancier;
    }

    /**
     * Définit la valeur de la propriété creancier.
     * 
     * @param value
     *     allowed object is
     *     {@link Creancier }
     *     
     */
    public void setCreancier(Creancier value) {
        this.creancier = value;
    }

    /**
     * Gets the value of the impayeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impayeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpayeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Impaye }
     * 
     * 
     */
    public List<Impaye> getImpayeList() {
        if (impayeList == null) {
            impayeList = new ArrayList<Impaye>();
        }
        return this.impayeList;
    }

}
