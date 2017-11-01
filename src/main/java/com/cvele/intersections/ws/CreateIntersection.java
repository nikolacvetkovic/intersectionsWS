
package com.cvele.intersections.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.cvele.intersections.ws.model.Intersection;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersection" type="{http://www.cvele.com/intersections/ws/model}Intersection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intersection"
})
@XmlRootElement(name = "createIntersection")
public class CreateIntersection {

    @XmlElement(required = true)
    protected Intersection intersection;

    /**
     * Gets the value of the intersection property.
     * 
     * @return
     *     possible object is
     *     {@link Intersection }
     *     
     */
    public Intersection getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intersection }
     *     
     */
    public void setIntersection(Intersection value) {
        this.intersection = value;
    }

}
