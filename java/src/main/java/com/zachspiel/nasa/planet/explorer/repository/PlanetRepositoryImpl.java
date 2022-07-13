package com.zachspiel.nasa.planet.explorer.repository;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class PlanetRepositoryImpl implements PlanetRepositoryCustom {
    @Autowired
    MongoTemplate mongoTemplate;
    
    public List<Planet> find(
        String hostname,
        String discoveryYear,
        String discoveryFacility,
        String discoveryMethod,
        Pageable page) {
        
        Query query = new Query().with(page);
        
        addCriteria(query, "hostname", hostname);
        addCriteria(query, "discoveryYear", discoveryYear);
        addCriteria(query, "discoveryFacility", discoveryFacility);
        addCriteria(query, "discoverymethod", discoveryMethod);
        
        return mongoTemplate.find(query, Planet.class);
    }
    
    private void addCriteria(Query query, String property, String value) {
        if(property != null && value.length() > 0) {
            query.addCriteria(Criteria.where(property).is(value));
        }
    }
}
