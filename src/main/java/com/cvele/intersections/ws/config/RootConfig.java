package com.cvele.intersections.ws.config;

import com.cvele.intersections.ws.service.IntersectionService;
import com.cvele.intersections.ws.dao.impl.IntersectionDaoImpl;
import com.cvele.intersections.ws.impl.IntersectionsWSImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Cvele
 */
@Configuration
@ComponentScan(basePackageClasses = {IntersectionDaoImpl.class, IntersectionService.class, WebConfig.class, IntersectionsWSImpl.class})
public class RootConfig {
    
}
