package com.cvele.intersections.ws.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;

/**
 *
 * @author Cvele
 */
public class AdditionalInitializer implements WebApplicationInitializer{
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        
        ServletRegistration.Dynamic cxfServlet = servletContext.addServlet("cxfServlet", new CXFServlet());
//        cxfServlet.setLoadOnStartup(1);
        cxfServlet.addMapping("/cxf/*");
        
    }
    
}
