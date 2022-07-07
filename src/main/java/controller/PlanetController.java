package controller;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.PlanetService;

@RestController
@RequestMapping("/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping("/")
    public List<Planet> getAllPlanets() {
        return planetService.findAll();
    }

    @GetMapping("/getPlanetByName/{name}")
    public List<Planet> getPlanetByName(@RequestParam(value="name", defaultValue="") String planetName) {
        return planetService.findByPlanetName(planetName);
    }
}
