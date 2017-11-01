/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvele.intersections.ws.dao.impl;

import com.cvele.intersections.ws.dao.IntersectionDao;
import com.cvele.intersections.ws.model.Intersection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cvele
 */

@Repository
public class IntersectionDaoImpl implements IntersectionDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Intersection> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Intersection> query = builder.createQuery(Intersection.class);
        Root<Intersection> root = query.from(Intersection.class);
        query.select(root);
        Query<Intersection> q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public Intersection getById(int id) {
        Session session = sessionFactory.getCurrentSession(); 
        Intersection i = session.get(Intersection.class, id);
        
        return i;
    }

    @Override
    public int create(Intersection i) {
        Session session = sessionFactory.getCurrentSession();
        int id = (int) session.save(i);
        
        return id;
    }
    
}
