package com.zachspiel.nasa.planet.explorer.service;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.zachspiel.nasa.planet.explorer.repository.PlanetRepository;

@Service
public class PlanetService {
    @Autowired
    private PlanetRepository planetsRepository;
    
    public List<Planet> findAll() {
        return planetsRepository.findAll();
    }
    
    public List<Planet> filterPlanets(
        String hostname,
        String discoveryYear,
        String discoveryFacility,
        String discoveryMethod,
        Pageable pageable) 
    {
        return planetsRepository.find(
                hostname, discoveryYear, discoveryFacility, discoveryMethod, pageable
            );
    }
    
    public List<Planet> findByPlanetName(String planetName) {
        return planetsRepository.findByPlanetName(planetName);
    }

    public Page<Planet> findAll(Pageable limit) {
        return planetsRepository.findAll(limit);
    }
}
