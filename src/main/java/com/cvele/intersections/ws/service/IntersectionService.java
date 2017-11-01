/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvele.intersections.ws.service;

import com.cvele.intersections.ws.dao.IntersectionDao;
import com.cvele.intersections.ws.model.Intersection;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cvele
 */

@Service
@Transactional
public class IntersectionService {
    
    @Autowired
    private IntersectionDao intersectionDao;
    
    public int create(Intersection i){
        return intersectionDao.create(i);
    }
    
    public Intersection getById(int id){
        return intersectionDao.getById(id);
    }
    
    public List<Intersection> getAll(){
        return intersectionDao.getAll();
    }
    
}
