package service;

import com.zachspiel.nasa.planet.explorer.Planet;
import com.zachspiel.nasa.planet.explorer.repository.PlanetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PlanetService implements IPlanetService {
    @Autowired
    private PlanetRepository planetsRepository;
    
    @Override
    public List<Planet> findAll() {
        return planetsRepository.findAll();
    }
    
    @Override
    public List<Planet> findByPlanetName(String planetName) {
        return planetsRepository.findByPlanetName(planetName);
    }
    
    @Override 
    public void save(Planet newPlanet) {
        planetsRepository.insert(newPlanet);
    }
}
