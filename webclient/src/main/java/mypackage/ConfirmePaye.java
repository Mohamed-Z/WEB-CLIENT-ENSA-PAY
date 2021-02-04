
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmePaye complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="confirmePaye">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeCreancier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeImpaye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmePaye", propOrder = {
    "token",
    "codeCreancier",
    "codeImpaye"
})
public class ConfirmePaye {

    protected String token;
    protected String codeCreancier;
    protected String codeImpaye;

    /**
     * Obtient la valeur de la propri�t� token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * D�finit la valeur de la propri�t� token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

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
     * Obtient la valeur de la propri�t� codeImpaye.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeImpaye() {
        return codeImpaye;
    }

    /**
     * D�finit la valeur de la propri�t� codeImpaye.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeImpaye(String value) {
        this.codeImpaye = value;
    }

}
