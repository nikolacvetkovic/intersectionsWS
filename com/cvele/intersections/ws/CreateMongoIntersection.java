
package com.cvele.intersections.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.cvele.intersections.ws.model.IntersectionMongo;


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
 *         &lt;element name="mongoIntersection" type="{http://www.cvele.com/intersections/ws/model}IntersectionMongo"/&gt;
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
    "mongoIntersection"
})
@XmlRootElement(name = "createMongoIntersection")
public class CreateMongoIntersection {

    @XmlElement(required = true)
    protected IntersectionMongo mongoIntersection;

    /**
     * Gets the value of the mongoIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionMongo }
     *     
     */
    public IntersectionMongo getMongoIntersection() {
        return mongoIntersection;
    }

    /**
     * Sets the value of the mongoIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionMongo }
     *     
     */
    public void setMongoIntersection(IntersectionMongo value) {
        this.mongoIntersection = value;
    }

}
