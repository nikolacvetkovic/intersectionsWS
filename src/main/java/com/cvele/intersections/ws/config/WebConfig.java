package com.cvele.intersections.ws.config;

import javax.xml.ws.Endpoint;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
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
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter{

    @Bean
    public SpringBus springBus(){
        return new SpringBus();
    }
    
    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint = new EndpointImpl(springBus(), new IntersectionsImpl());
        endpoint.publish("/ws");
        
        return endpoint;
    }
    
}
