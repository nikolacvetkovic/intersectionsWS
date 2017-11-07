package com.cvele.intersections.ws.dao.impl;

import com.cvele.intersections.ws.dao.IntersectionDaoMongo;
import com.cvele.intersections.ws.model.Intersection;
import com.cvele.intersections.ws.model.IntersectionMongo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nikola Cvetkovic
 */

@Repository
public class IntersectionDaoMongoImpl implements IntersectionDaoMongo{

    @Autowired
    MongoOperations mongo;
    
    @Override
    public List<Intersection> getAll() {
        return mongo.findAll(Intersection.class);
    }

    @Override
    public Intersection getById(String id) {
        return mongo.findById(id, Intersection.class);
    }

    @Override
    public void create(IntersectionMongo i) {
        mongo.insert(i, "intersection");
    }

}
