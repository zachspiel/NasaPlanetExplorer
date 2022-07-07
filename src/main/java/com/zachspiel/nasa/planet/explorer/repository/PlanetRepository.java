package com.zachspiel.nasa.planet.explorer.repository;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetRepository extends MongoRepository<Planet, String> {
    public List<Planet> findByPlanetName(String planetName);
}
