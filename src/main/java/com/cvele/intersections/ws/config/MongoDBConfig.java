package com.cvele.intersections.ws.config;

import com.cvele.intersections.ws.model.Intersection;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author Nikola Cvetkovic
 */

@Configuration
@EnableMongoRepositories(basePackageClasses = Intersection.class)
public class MongoDBConfig extends AbstractMongoConfiguration{

    @Override
    public MongoClient mongoClient() {
        return new MongoClient();
    }

    @Override
    protected String getDatabaseName() {
        return "intersectionsWS";
    }

}
