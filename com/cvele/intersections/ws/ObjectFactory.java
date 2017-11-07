
package com.cvele.intersections.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cvele.intersections.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cvele.intersections.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIntersectionById }
     * 
     */
    public GetIntersectionById createGetIntersectionById() {
        return new GetIntersectionById();
    }

    /**
     * Create an instance of {@link GetIntersectionByIdResponse }
     * 
     */
    public GetIntersectionByIdResponse createGetIntersectionByIdResponse() {
        return new GetIntersectionByIdResponse();
    }

    /**
     * Create an instance of {@link CreateIntersection }
     * 
     */
    public CreateIntersection createCreateIntersection() {
        return new CreateIntersection();
    }

    /**
     * Create an instance of {@link CreateIntersectionResponse }
     * 
     */
    public CreateIntersectionResponse createCreateIntersectionResponse() {
        return new CreateIntersectionResponse();
    }

    /**
     * Create an instance of {@link GetAllIntersections }
     * 
     */
    public GetAllIntersections createGetAllIntersections() {
        return new GetAllIntersections();
    }

    /**
     * Create an instance of {@link GetAllIntersectionsResponse }
     * 
     */
    public GetAllIntersectionsResponse createGetAllIntersectionsResponse() {
        return new GetAllIntersectionsResponse();
    }

    /**
     * Create an instance of {@link CreateMongoIntersection }
     * 
     */
    public CreateMongoIntersection createCreateMongoIntersection() {
        return new CreateMongoIntersection();
    }

    /**
     * Create an instance of {@link CreateMongoIntersectionResponse }
     * 
     */
    public CreateMongoIntersectionResponse createCreateMongoIntersectionResponse() {
        return new CreateMongoIntersectionResponse();
    }

}
