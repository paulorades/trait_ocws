
package org.openclinica.ws.event.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDefinitionOID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studySubjectOID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studyEventOrdinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="warning" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "eventDefinitionOID",
    "studySubjectOID",
    "studyEventOrdinal",
    "warning",
    "error"
})
@XmlRootElement(name = "scheduleResponse")
@SuppressWarnings("javadoc")
public class ScheduleResponse {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected String eventDefinitionOID;
    @XmlElement(required = true)
    protected String studySubjectOID;
    @XmlElement(required = true)
    protected String studyEventOrdinal;
    protected List<String> warning;
    protected List<String> error;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the eventDefinitionOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDefinitionOID() {
        return eventDefinitionOID;
    }

    /**
     * Sets the value of the eventDefinitionOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDefinitionOID(String value) {
        this.eventDefinitionOID = value;
    }

    /**
     * Gets the value of the studySubjectOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudySubjectOID() {
        return studySubjectOID;
    }

    /**
     * Sets the value of the studySubjectOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudySubjectOID(String value) {
        this.studySubjectOID = value;
    }

    /**
     * Gets the value of the studyEventOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOrdinal() {
        return studyEventOrdinal;
    }

    /**
     * Sets the value of the studyEventOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOrdinal(String value) {
        this.studyEventOrdinal = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarning() {
        if (warning == null) {
            warning = new ArrayList<String>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getError() {
        if (error == null) {
            error = new ArrayList<String>();
        }
        return this.error;
    }

}
