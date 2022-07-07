package util;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.zachspiel.nasa.planet.explorer.Planet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSV {

    static final File PLANETS_FILE = new File("planets.csv");
    static final CsvMapper mapper = new CsvMapper();
    static final CsvSchema planetSchema = CsvSchema.builder()
            .addColumn("id")
            .addColumn("planetName")
            .addColumn("hostname")
            .addColumn("defaultFlag")
            .addColumn("sySnum")
            .addColumn("syPnum")
            .addColumn("discoverymethod")
            .addColumn("discoveryYear")
            .addColumn("discoveryFacility")
            .addColumn("soltype")
            .addColumn("plControvFlag")
            .addColumn("plRefname")
            .addColumn("plOrbper")
            .addColumn("plOrbpererr1")
            .addColumn("plOrbpererr2")
            .addColumn("plOrbperlim")
            .addColumn("plOrbsmax")
            .addColumn("plOrbsmaxerr1")
            .addColumn("plOrbsmaxerr2")
            .addColumn("plOrbsmaxlim")
            .addColumn("plRade")
            .addColumn("plRadeerr1")
            .addColumn("plRadeerr2")
            .addColumn("plRadelim")
            .addColumn("plRadj")
            .addColumn("plRadjerr1")
            .addColumn("plRadjerr2")
            .addColumn("plRadjlim")
            .addColumn("plBmasse")
            .addColumn("plBmasseerr1")
            .addColumn("plBmasseerr2")
            .addColumn("plBmasselim")
            .addColumn("plBmassj")
            .addColumn("plBmassjerr1")
            .addColumn("plBmassjerr2")
            .addColumn("plBmassjlim")
            .addColumn("plBmassprov")
            .addColumn("plOrbeccen")
            .addColumn("plOrbeccenerr1")
            .addColumn("plOrbeccenerr2")
            .addColumn("plOrbeccenlim")
            .addColumn("plInsol")
            .addColumn("plInsolerr1")
            .addColumn("plInsolerr2")
            .addColumn("plInsollim")
            .addColumn("plEqt")
            .addColumn("plEqterr1")
            .addColumn("plEqterr2")
            .addColumn("plEqtlim")
            .addColumn("ttvFlag")
            .addColumn("stRefname")
            .addColumn("stSpectype")
            .addColumn("stTeff")
            .addColumn("stTefferr1")
            .addColumn("stTefferr2")
            .addColumn("stTefflim")
            .addColumn("stRad")
            .addColumn("stRaderr1")
            .addColumn("stRaderr2")
            .addColumn("stRadlim")
            .addColumn("stMass")
            .addColumn("stMasserr1")
            .addColumn("stMasserr2")
            .addColumn("stMasslim")
            .addColumn("stMet")
            .addColumn("stMeterr1")
            .addColumn("stMeterr2")
            .addColumn("stMetlim")
            .addColumn("stMetratio")
            .addColumn("stLogg")
            .addColumn("stLoggerr1")
            .addColumn("stLoggerr2")
            .addColumn("stLogglim")
            .addColumn("syRefname")
            .addColumn("rastr")
            .addColumn("ra")
            .addColumn("decstr")
            .addColumn("dec")
            .addColumn("syDist")
            .addColumn("syDisterr1")
            .addColumn("syDisterr2")
            .addColumn("syVmag")
            .addColumn("syVmagerr1")
            .addColumn("syVmagerr2")
            .addColumn("syKmag")
            .addColumn("syKmagerr1")
            .addColumn("syKmagerr2")
            .addColumn("syGaiamag")
            .addColumn("syGaiamagerr1")
            .addColumn("syGaiamagerr2")
            .addColumn("rowupdate")
            .addColumn("plPubdate")
            .addColumn("releasedate")
            .build();

    public static List<Planet> parsePlanets() {
        try {
            MappingIterator<Planet> it = mapper
                    .readerFor(Planet.class)
                    .with(planetSchema)
                    .readValues(PLANETS_FILE);

            List<Planet> planets = it.readAll();

            saveFile(planets);

            return planets;
        } catch (IOException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Collections.emptyList();
    }

    private static void saveFile(List<Planet> planets) {
        Optional<File> jsonFile = createJsonFile();
        if (!jsonFile.isPresent()) {
            return;
        }

        try ( BufferedWriter writer = Files.newBufferedWriter(jsonFile.get().toPath(), StandardCharsets.UTF_8)) {
            writer.write(Json.toJson(planets));
        } catch (IOException ex) {
            System.out.println("Error saving JSON file.");
        }
    }

    private static Optional<File> createJsonFile() {
        try {
            File jsonFile = new File("planets.json");

            if (!jsonFile.exists()) {
                jsonFile.createNewFile();
            }

            return Optional.of(jsonFile);
        } catch (IOException ex) {
            System.out.println("Error creating planets.json file.");
        }

        return Optional.empty();
    }
}
