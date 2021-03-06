
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cvele.intersections.ws.impl;

import com.cvele.intersections.ws.IntersectionsWS;
import com.cvele.intersections.ws.model.Intersection;
import com.cvele.intersections.ws.model.IntersectionMongo;
import com.cvele.intersections.ws.service.IntersectionService;
import java.util.List;
import java.util.UUID;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-10-31T13:11:50.646+01:00
 * Generated source version: 3.1.12
 * 
 */
@Component
@javax.jws.WebService(
                      serviceName = "IntersectionsWSImpl",
                      portName = "IntersectionsWSPort",
                      targetNamespace = "http://www.cvele.com/intersections/ws",
                      //wsdlLocation = "file:intersections.wsdl",
                      endpointInterface = "com.cvele.intersections.ws.IntersectionsWS")
@InInterceptors(interceptors = {"com.cvele.intersections.ws.interceptor.LoggingInInterceptor"})
@OutInterceptors(interceptors = {"com.cvele.intersections.ws.interceptor.LoggingOutInterceptor"})
                      
public class IntersectionsWSImpl implements IntersectionsWS {

    private static final Logger LOG = LogManager.getLogger(IntersectionsWSImpl.class);
    
    @Autowired
    private IntersectionService intersectionService;

    /* (non-Javadoc)
     * @see com.cvele.intersections.ws.IntersectionsWS#createIntersection(com.cvele.intersections.ws.model.Intersection intersection)*
     */
    @Override
    public int createIntersection(Intersection intersection) {
//        ThreadContext.push(UUID.randomUUID().toString());
//        LOG.info("Executing operation createIntersection");
        
        try {
            
            int id = intersectionService.create(intersection);
            
//            LOG.info("Executing operation createIntersection is finished");
//            ThreadContext.clearAll();
            return id;
            
        } catch (Exception ex) {
            LOG.fatal(ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cvele.intersections.ws.IntersectionsWS#getIntersectionById(int id)*
     */
    @Override
    public Intersection getIntersectionById(int id) { 
        
        LOG.info("Executing operation getIntersectionById");
        
        try {
            Intersection i = intersectionService.getById(id);
            
            LOG.info("Executing operation getIntersectionById is finished");
            return i;
            
        } catch (Exception ex) {
            LOG.fatal(ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cvele.intersections.ws.IntersectionsWS#getAllIntersections()*
     */
    @Override
    public List<Intersection> getAllIntersections() { 
        ThreadContext.push(UUID.randomUUID().toString());
        LOG.info("Executing operation getAllIntersections");
        try {
            List<Intersection> _return = intersectionService.getAll();
            
            LOG.info("Executing operation getAllIntersections is finished");
            ThreadContext.clearAll();
            return _return;
            
        } catch (Exception ex) {
            LOG.fatal(ex.getMessage());
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public String createMongoIntersection(IntersectionMongo i){
//        ThreadContext.push(UUID.randomUUID().toString());
//        LOG.info("Executing operation createMongoIntersection");
        
        try {
            
            intersectionService.createMongo(i);
            
            //LOG.info("Executing operation createMongoIntersection is finished");
//            ThreadContext.clearAll();
            return "Kreiran";
            
        } catch (Exception ex) {
            LOG.fatal(ex.getMessage());
            throw new RuntimeException("Nije kreirana");
        }
  
    }

}
