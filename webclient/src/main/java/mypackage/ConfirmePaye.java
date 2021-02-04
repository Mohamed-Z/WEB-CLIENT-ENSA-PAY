
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmePaye complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété token.
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
     * Définit la valeur de la propriété token.
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
     * Obtient la valeur de la propriété codeCreancier.
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
     * Définit la valeur de la propriété codeCreancier.
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
     * Obtient la valeur de la propriété codeImpaye.
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
     * Définit la valeur de la propriété codeImpaye.
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
