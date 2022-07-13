package com.zachspiel.nasa.planet.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages="com.zachspiel.nasa.planet.explorer")
public class NasaPlanetExplorer {

    public static void main(String[] args) {
        SpringApplication.run(NasaPlanetExplorer.class, args);
    }
}
