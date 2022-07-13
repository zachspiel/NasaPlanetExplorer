package com.zachspiel.nasa.planet.explorer.controller;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.zachspiel.nasa.planet.explorer.service.PlanetService;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping("/planets")
    public Page<Planet> getAllPlanets(@RequestParam(value="limit", defaultValue="100") String limitParam) {
        Optional<Integer> limit = getIntFromString(limitParam);
        Pageable pageLimit = PageRequest.of(0, limit.orElse(100));
        return planetService.findAll(pageLimit);
    }

    @GetMapping("/planets/{name}")
    public List<Planet>getPlanetByName(@PathVariable String name) {
        return planetService.findByPlanetName(name);
    }
    
    @GetMapping("/filterPlanets")
    public List<Planet> filterPlanets(
            @RequestParam(required = false) String hostname, 
            @RequestParam(required = false) String discoveryYear, 
            @RequestParam(required = false) String discoveryFacility, 
            @RequestParam(required = false) String discoveryMethod,
            @RequestParam Integer page,
            @RequestParam Integer limit) 
    {
        Pageable pageable = PageRequest.of(page, limit);
        return planetService.filterPlanets(hostname, discoveryYear, discoveryFacility, discoveryMethod, pageable);
    }

    private Optional<Integer> getIntFromString(String string) {
         try {
             int value = Integer.parseInt(string);
            return Optional.of(value);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
