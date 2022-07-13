package com.zachspiel.nasa.planet.explorer.repository;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends MongoRepository<Planet, String>, PlanetRepositoryCustom {
    public List<Planet> findByPlanetName(String planetName);
}
