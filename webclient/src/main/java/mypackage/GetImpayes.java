
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getImpayes complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getImpayes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCreancier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeCreance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImpayes", propOrder = {
    "codeCreancier",
    "codeCreance"
})
public class GetImpayes {

    protected String codeCreancier;
    protected String codeCreance;

    /**
     * Obtient la valeur de la propri�t� codeCreancier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCreancier() {
        return codeCreancier;
    }

    /**
     * D�finit la valeur de la propri�t� codeCreancier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCreancier(String value) {
        this.codeCreancier = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeCreance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCreance() {
        return codeCreance;
    }

    /**
     * D�finit la valeur de la propri�t� codeCreance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCreance(String value) {
        this.codeCreance = value;
    }

}
