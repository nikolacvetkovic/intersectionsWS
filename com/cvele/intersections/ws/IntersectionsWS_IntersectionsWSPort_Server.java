
package com.cvele.intersections.ws;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-11-03T10:56:48.171+01:00
 * Generated source version: 3.1.12
 * 
 */
 
public class IntersectionsWS_IntersectionsWSPort_Server{

    protected IntersectionsWS_IntersectionsWSPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new IntersectionsWSPortImpl();
        String address = "http://localhost:8080/cxf/ws";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new IntersectionsWS_IntersectionsWSPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
