package com.cvele.intersections.ws.config;

import com.cvele.intersections.ws.IntersectionsWS;
import com.cvele.intersections.ws.impl.IntersectionsWSImpl;
import javax.servlet.ServletRegistration;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Cvele
 */

@Configuration

@ComponentScan
public class WebConfig{

    @Autowired
    private IntersectionsWS intersectionsWS;
        
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }
    
    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint = new EndpointImpl(springBus(), intersectionsWS);
        endpoint.publish("/ws");
        
        return endpoint;
    }
    
}
