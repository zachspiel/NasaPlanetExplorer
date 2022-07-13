package com.zachspiel.nasa.planet.explorer.repository;

import com.zachspiel.nasa.planet.explorer.Planet;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface PlanetRepositoryCustom {
    public List<Planet> find(
        String hostname,
        String discoveryYear,
        String discoveryFacility,
        String discoveryMethod,
        Pageable page);
}
