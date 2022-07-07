/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zachspiel.nasa.planet.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import static util.CSV.parsePlanets;

@EnableCaching
@SpringBootApplication
@EnableMongoRepositories
public class NasaPlanetExplorer {

    public static void main(String[] args) {
        parsePlanets();
        SpringApplication.run(NasaPlanetExplorer.class, args);
    }
}
