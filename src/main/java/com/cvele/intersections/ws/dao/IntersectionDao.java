/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvele.intersections.ws.dao;

import com.cvele.intersections.ws.model.Intersection;
import java.util.List;

/**
 *
 * @author Cvele
 */

public interface IntersectionDao {
    
    List<Intersection> getAll();
    Intersection getById(int id);
    int create(Intersection i);
    
}
