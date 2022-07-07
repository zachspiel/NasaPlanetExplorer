package service;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;

public interface IPlanetService {
    List<Planet> findAll();
    List<Planet> findByPlanetName(String planetName);
    //List<Planet> findByDiscoveryYear();
    //List<Planet> findByDiscoveryFacility();
    //List<Planet> findByHostName();
    //List<Planet> findByDiscoveryMethod();
    
    void save(Planet planet);
}
