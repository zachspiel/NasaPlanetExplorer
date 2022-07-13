package com.zachspiel.nasa.planet.explorer;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonPropertyOrder({
    "id",
    "planetName",
    "hostname",
    "defaultFlag",
    "sySnum",
    "syPnum",
    "discoverymethod",
    "discoveryYear",
    "discoveryFacility",
    "soltype",
    "plControvFlag",
    "plRefname",
    "plOrbper",
    "plOrbpererr1",
    "plOrbpererr2",
    "plOrbperlim",
    "plOrbsmax",
    "plOrbsmaxerr1",
    "plOrbsmaxerr2",
    "plOrbsmaxlim",
    "plRade",
    "plRadeerr1",
    "plRadeerr2",
    "plRadelim",
    "plRadj",
    "plRadjerr1",
    "plRadjerr2",
    "plRadjlim",
    "plBmasse",
    "plBmasseerr1",
    "plBmasseerr2",
    "plBmasselim",
    "plBmassj",
    "plBmassjerr1",
    "plBmassjerr2",
    "plBmassjlim",
    "plBmassprov",
    "plOrbeccen",
    "plOrbeccenerr1",
    "plOrbeccenerr2",
    "plOrbeccenlim",
    "plInsol",
    "plInsolerr1",
    "plInsolerr2",
    "plInsollim",
    "plEqt",
    "plEqterr1",
    "plEqterr2",
    "plEqtlim",
    "ttvFlag",
    "stRefname",
    "stSpectype",
    "stTeff",
    "stTefferr1",
    "stTefferr2",
    "stTefflim",
    "stRad",
    "stRaderr1",
    "stRaderr2",
    "stRadlim",
    "stMass",
    "stMasserr1",
    "stMasserr2",
    "stMasslim",
    "stMet",
    "stMeterr1",
    "stMeterr2",
    "stMetlim",
    "stMetratio",
    "stLogg",
    "stLoggerr1",
    "stLoggerr2",
    "stLogglim",
    "syRefname",
    "rastr",
    "ra",
    "decstr",
    "dec",
    "syDist",
    "syDisterr1",
    "syDisterr2",
    "syVmag",
    "syVmagerr1",
    "syVmagerr2",
    "syKmag",
    "syKmagerr1",
    "syKmagerr2",
    "syGaiamag",
    "syGaiamagerr1",
    "syGaiamagerr2",
    "rowupdate",
    "plPubdate",
    "releasedate"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="exoplanets")
public class Planet {
    // Row Id
    @Id
    private String id;
    // Planet Name
    private String planetName;
    // Host Name
    private String hostname;
    // Default Parameter Set
    private String defaultFlag;
    // Number of Stars
    private String sySnum;
    // Number of Planets
    private String syPnum;
    // Discovery Method
    private String discoverymethod;
    // Discovery Year
    private String discoveryYear;
    // Discovery Facility
    private String discoveryFacility;
    // Solution Type
    private String soltype;
    // Controversial Flag
    private String plControvFlag;
    // Planetary Parameter Reference
    private String plRefname;
    // Orbital Period [days]
    private String plOrbper;
    // Orbital Period Upper Unc. [days]
    private String plOrbpererr1;
    // Orbital Period Lower Unc. [days]
    private String plOrbpererr2;
    // Orbital Period Limit Flag
    private String plOrbperlim;
    // Orbit Semi-Major Axis [au])
    private String plOrbsmax;
    // Orbit Semi-Major Axis Upper Unc. [au]
    private String plOrbsmaxerr1;
    // Orbit Semi-Major Axis Lower Unc. [au]
    private String plOrbsmaxerr2;
    // Orbit Semi-Major Axis Limit Flag
    private String plOrbsmaxlim;
    // Planet Radius [Earth Radius]
    private String plRade;
    // Planet Radius Upper Unc. [Earth Radius]
    private String plRadeerr1;
    // Planet Radius Lower Unc. [Earth Radius]
    private String plRadeerr2;
    // Planet Radius Limit Flag
    private String plRadelim;
    // Planet Radius [Jupiter Radius]
    private String plRadj;
    // Planet Radius Upper Unc. [Jupiter Radius]
    private String plRadjerr1;
    // Planet Radius Lower Unc. [Jupiter Radius]
    private String plRadjerr2;
    // Planet Radius Limit Flag
    private String plRadjlim;
    // Planet Mass or Mass*sin(i) [Earth Mass]
    private String plBmasse;
    // Planet Mass or Mass*sin(i) [Earth Mass] Upper Unc.
    private String plBmasseerr1;
    // Planet Mass or Mass*sin(i) [Earth Mass] Lower Unc.
    private String plBmasseerr2;
    // Planet Mass or Mass*sin(i) [Earth Mass] Limit Flag
    private String plBmasselim;
    // Planet Mass or Mass*sin(i) [Jupiter Mass]
    private String plBmassj;
    // Planet Mass or Mass*sin(i) [Jupiter Mass] Upper Unc.
    private String plBmassjerr1;
    // Planet Mass or Mass*sin(i) [Jupiter Mass] Lower Unc.
    private String plBmassjerr2;
    // Planet Mass or Mass*sin(i) [Jupiter Mass] Limit Flag
    private String plBmassjlim;
    // Planet Mass or Mass*sin(i) [Jupiter Mass] Limit Flag
    private String plBmassprov;
    // Eccentricity
    private String plOrbeccen;
    // Eccentricity Upper Unc.
    private String plOrbeccenerr1;
    // Eccentricity Lower Unc.
    private String plOrbeccenerr2;
    // Eccentricity Limit Flag
    private String plOrbeccenlim;
    // Insolation Flux [Earth Flux]
    private String plInsol;
    // Insolation Flux Upper Unc. [Earth Flux]
    private String plInsolerr1;
    // Insolation Flux Lower Unc. [Earth Flux]
    private String plInsolerr2;
    // Insolation Flux Limit Flag
    private String plInsollim;
    // Equilibrium Temperature [K]
    private String plEqt;
    // Equilibrium Temperature Upper Unc. [K]
    private String plEqterr1;
    // Equilibrium Temperature Lower Unc. [K]
    private String plEqterr2;
    // Equilibrium Temperature Limit Flag
    private String plEqtlim;
    // Data show Transit Timing Variations
    private String ttvFlag;
    // Stellar Parameter Reference
    private String stRefname;
    // Spectral Type
    private String stSpectype;
    // Stellar Effective Temperature [K]
    private String stTeff;
    // Stellar Effective Temperature Upper Unc. [K]
    private String stTefferr1;
    // Stellar Effective Temperature Lower Unc. [K]
    private String stTefferr2;
    // Stellar Effective Temperature Limit Flag
    private String stTefflim;
    // Stellar Radius [Solar Radius]
    private String stRad;
    // Stellar Radius Upper Unc. [Solar Radius]
    private String stRaderr1;
    // Stellar Radius Lower Unc. [Solar Radius]
    private String stRaderr2;
    // Stellar Radius Limit Flag
    private String stRadlim;
    // Stellar Mass [Solar mass]
    private String stMass;
    // Stellar Mass Upper Unc. [Solar mass]
    private String stMasserr1;
    // Stellar Mass Lower Unc. [Solar mass]
    private String stMasserr2;
    // Stellar Mass Limit Flag
    private String stMasslim;
    // Stellar Metallicity [dex]
    private String stMet;
    // Stellar Metallicity Upper Unc. [dex]
    private String stMeterr1;
    // Stellar Metallicity Lower Unc. [dex]
    private String stMeterr2;
    // Stellar Metallicity Limit Flag
    private String stMetlim;
    // Stellar Metallicity Ratio
    private String stMetratio;
    // Stellar Surface Gravity [log10(cm/s**2)]
    private String stLogg;
    // Stellar Surface Gravity Upper Unc. [log10(cm/s**2)]
    private String stLoggerr1;
    // Stellar Surface Gravity Upper Unc. [log10(cm/s**2)]
    private String stLoggerr2;
    // Stellar Surface Gravity Limit Flag
    private String stLogglim;
    // System Parameter Reference
    private String syRefname;
    // RA [sexagesimal]
    private String rastr;
    // RA [deg]
    private String ra;
    // Dec [sexagesimal]
    private String decstr;
    // Dec [deg]
    private String dec;
    // Distance [pc]
    private String syDist;
    // Distance [pc] Upper Unc
    private String syDisterr1;
    // Distance [pc] Lower Unc
    private String syDisterr2;
    // V (Johnson) Magnitude
    private String syVmag;
    // V (Johnson) Magnitude Upper Unc
    private String syVmagerr1;
    // V (Johnson) Magnitude Lower Unc
    private String syVmagerr2;
    // Ks (2MASS) Magnitude
    private String syKmag;
    // Ks (2MASS) Magnitude Upper Unc
    private String syKmagerr1;
    // Ks (2MASS) Magnitude Lower Unc
    private String syKmagerr2;
    // Gaia Magnitude
    private String syGaiamag;
    // Gaia Magnitude Upper Unc
    private String syGaiamagerr1;
    // Gaia Magnitude Lower Unc
    private String syGaiamagerr2;
    // Date of Last Update
    private String rowupdate;
    // Planetary Parameter Reference Publication Date
    private String plPubdate;
    //  Release Date
    private String releasedate;
    /*
    public Planet() {};
    
    public Planet(String id, String planetName, String hostname, String defaultFlag, String sySnum, String syPnum, String discoverymethod, String discoveryYear, String discoveryFacility, String soltype, String plControvFlag, String plRefname, String plOrbper, String plOrbpererr1, String plOrbpererr2, String plOrbperlim, String plOrbsmax, String plOrbsmaxerr1, String plOrbsmaxerr2, String plOrbsmaxlim, String plRade, String plRadeerr1, String plRadeerr2, String plRadelim, String plRadj, String plRadjerr1, String plRadjerr2, String plRadjlim, String plBmasse, String plBmasseerr1, String plBmasseerr2, String plBmasselim, String plBmassj, String plBmassjerr1, String plBmassjerr2, String plBmassjlim, String plBmassprov, String plOrbeccen, String plOrbeccenerr1, String plOrbeccenerr2, String plOrbeccenlim, String plInsol, String plInsolerr1, String plInsolerr2, String plInsollim, String plEqt, String plEqterr1, String plEqterr2, String plEqtlim, String ttvFlag, String stRefname, String stSpectype, String stTeff, String stTefferr1, String stTefferr2, String stTefflim, String stRad, String stRaderr1, String stRaderr2, String stRadlim, String stMass, String stMasserr1, String stMasserr2, String stMasslim, String stMet, String stMeterr1, String stMeterr2, String stMetlim, String stMetratio, String stLogg, String stLoggerr1, String stLoggerr2, String stLogglim, String syRefname, String rastr, String ra, String decstr, String dec, String syDist, String syDisterr1, String syDisterr2, String syVmag, String syVmagerr1, String syVmagerr2, String syKmag, String syKmagerr1, String syKmagerr2, String syGaiamag, String syGaiamagerr1, String syGaiamagerr2, String rowupdate, String plPubdate, String releasedate) {
        this.id = id;
        this.planetName = planetName;
        this.hostname = hostname;
        this.defaultFlag = defaultFlag;
        this.sySnum = sySnum;
        this.syPnum = syPnum;
        this.discoverymethod = discoverymethod;
        this.discoveryYear = discoveryYear;
        this.discoveryFacility = discoveryFacility;
        this.soltype = soltype;
        this.plControvFlag = plControvFlag;
        this.plRefname = plRefname;
        this.plOrbper = plOrbper;
        this.plOrbpererr1 = plOrbpererr1;
        this.plOrbpererr2 = plOrbpererr2;
        this.plOrbperlim = plOrbperlim;
        this.plOrbsmax = plOrbsmax;
        this.plOrbsmaxerr1 = plOrbsmaxerr1;
        this.plOrbsmaxerr2 = plOrbsmaxerr2;
        this.plOrbsmaxlim = plOrbsmaxlim;
        this.plRade = plRade;
        this.plRadeerr1 = plRadeerr1;
        this.plRadeerr2 = plRadeerr2;
        this.plRadelim = plRadelim;
        this.plRadj = plRadj;
        this.plRadjerr1 = plRadjerr1;
        this.plRadjerr2 = plRadjerr2;
        this.plRadjlim = plRadjlim;
        this.plBmasse = plBmasse;
        this.plBmasseerr1 = plBmasseerr1;
        this.plBmasseerr2 = plBmasseerr2;
        this.plBmasselim = plBmasselim;
        this.plBmassj = plBmassj;
        this.plBmassjerr1 = plBmassjerr1;
        this.plBmassjerr2 = plBmassjerr2;
        this.plBmassjlim = plBmassjlim;
        this.plBmassprov = plBmassprov;
        this.plOrbeccen = plOrbeccen;
        this.plOrbeccenerr1 = plOrbeccenerr1;
        this.plOrbeccenerr2 = plOrbeccenerr2;
        this.plOrbeccenlim = plOrbeccenlim;
        this.plInsol = plInsol;
        this.plInsolerr1 = plInsolerr1;
        this.plInsolerr2 = plInsolerr2;
        this.plInsollim = plInsollim;
        this.plEqt = plEqt;
        this.plEqterr1 = plEqterr1;
        this.plEqterr2 = plEqterr2;
        this.plEqtlim = plEqtlim;
        this.ttvFlag = ttvFlag;
        this.stRefname = stRefname;
        this.stSpectype = stSpectype;
        this.stTeff = stTeff;
        this.stTefferr1 = stTefferr1;
        this.stTefferr2 = stTefferr2;
        this.stTefflim = stTefflim;
        this.stRad = stRad;
        this.stRaderr1 = stRaderr1;
        this.stRaderr2 = stRaderr2;
        this.stRadlim = stRadlim;
        this.stMass = stMass;
        this.stMasserr1 = stMasserr1;
        this.stMasserr2 = stMasserr2;
        this.stMasslim = stMasslim;
        this.stMet = stMet;
        this.stMeterr1 = stMeterr1;
        this.stMeterr2 = stMeterr2;
        this.stMetlim = stMetlim;
        this.stMetratio = stMetratio;
        this.stLogg = stLogg;
        this.stLoggerr1 = stLoggerr1;
        this.stLoggerr2 = stLoggerr2;
        this.stLogglim = stLogglim;
        this.syRefname = syRefname;
        this.rastr = rastr;
        this.ra = ra;
        this.decstr = decstr;
        this.dec = dec;
        this.syDist = syDist;
        this.syDisterr1 = syDisterr1;
        this.syDisterr2 = syDisterr2;
        this.syVmag = syVmag;
        this.syVmagerr1 = syVmagerr1;
        this.syVmagerr2 = syVmagerr2;
        this.syKmag = syKmag;
        this.syKmagerr1 = syKmagerr1;
        this.syKmagerr2 = syKmagerr2;
        this.syGaiamag = syGaiamag;
        this.syGaiamagerr1 = syGaiamagerr1;
        this.syGaiamagerr2 = syGaiamagerr2;
        this.rowupdate = rowupdate;
        this.plPubdate = plPubdate;
        this.releasedate = releasedate;
    }*/

    public String getId() {
        return id;
    }

    public String getplanetName() {
        return planetName;
    }

    public String getdiscoveryYear() {
        return discoveryYear;
    }

    public String getdiscoveryFacility() {
        return discoveryFacility;
    }
    
    public String getHostname() {
        return hostname;
    }

    public String getdefaultFlag() {
        return defaultFlag;
    }

    public String getsySnum() {
        return sySnum;
    }

    public String getsyPnum() {
        return syPnum;
    }

    public String getDiscoverymethod() {
        return discoverymethod;
    }

    public String getSoltype() {
        return soltype;
    }

    public String getplControvFlag() {
        return plControvFlag;
    }

    public String getplRefname() {
        return plRefname;
    }

    public String getplOrbper() {
        return plOrbper;
    }

    public String getplOrbpererr1() {
        return plOrbpererr1;
    }

    public String getplOrbpererr2() {
        return plOrbpererr2;
    }

    public String getplOrbperlim() {
        return plOrbperlim;
    }

    public String getPlOrbsmax() {
        return plOrbsmax;
    }

    public String getplOrbsmaxerr1() {
        return plOrbsmaxerr1;
    }

    public String getplOrbsmaxerr2() {
        return plOrbsmaxerr2;
    }

    public String getplOrbsmaxlim() {
        return plOrbsmaxlim;
    }

    public String getPlRade() {
        return plRade;
    }

    public String getplRadeerr1() {
        return plRadeerr1;
    }

    public String getplRadeerr2() {
        return plRadeerr2;
    }

    public String getplRadelim() {
        return plRadelim;
    }

    public String getPlRadj() {
        return plRadj;
    }

    public String getPlRadjerr1() {
        return plRadjerr1;
    }

    public String getPlRadjerr2() {
        return plRadjerr2;
    }

    public String getPlRadjlim() {
        return plRadjlim;
    }

    public String getPlBmasse() {
        return plBmasse;
    }

    public String getPlBmasseerr1() {
        return plBmasseerr1;
    }

    public String getPlBmasseerr2() {
        return plBmasseerr2;
    }

    public String getPlBmasselim() {
        return plBmasselim;
    }

    public String getPlBmassj() {
        return plBmassj;
    }

    public String getPlBmassjerr1() {
        return plBmassjerr1;
    }

    public String getPlBmassjerr2() {
        return plBmassjerr2;
    }

    public String getPlBmassjlim() {
        return plBmassjlim;
    }

    public String getPlBmassprov() {
        return plBmassprov;
    }

    public String getPlOrbeccen() {
        return plOrbeccen;
    }

    public String getPlOrbeccenerr1() {
        return plOrbeccenerr1;
    }

    public String getPlOrbeccenerr2() {
        return plOrbeccenerr2;
    }

    public String getPlOrbeccenlim() {
        return plOrbeccenlim;
    }

    public String getPlInsol() {
        return plInsol;
    }

    public String getPlInsolerr1() {
        return plInsolerr1;
    }

    public String getPlInsolerr2() {
        return plInsolerr2;
    }

    public String getPlInsollim() {
        return plInsollim;
    }

    public String getPlEqt() {
        return plEqt;
    }

    public String getPlEqterr1() {
        return plEqterr1;
    }

    public String getPlEqterr2() {
        return plEqterr2;
    }

    public String getPlEqtlim() {
        return plEqtlim;
    }

    public String getTtvFlag() {
        return ttvFlag;
    }

    public String getStRefname() {
        return stRefname;
    }

    public String getStSpectype() {
        return stSpectype;
    }

    public String getStTeff() {
        return stTeff;
    }

    public String getStTefferr1() {
        return stTefferr1;
    }

    public String getStTefferr2() {
        return stTefferr2;
    }

    public String getStTefflim() {
        return stTefflim;
    }

    public String getStRad() {
        return stRad;
    }

    public String getStRaderr1() {
        return stRaderr1;
    }

    public String getStRaderr2() {
        return stRaderr2;
    }

    public String getStRadlim() {
        return stRadlim;
    }

    public String getStMass() {
        return stMass;
    }

    public String getStMasserr1() {
        return stMasserr1;
    }

    public String getStMasserr2() {
        return stMasserr2;
    }

    public String getStMasslim() {
        return stMasslim;
    }

    public String getStMet() {
        return stMet;
    }

    public String getStMeterr1() {
        return stMeterr1;
    }

    public String getStMeterr2() {
        return stMeterr2;
    }

    public String getStMetlim() {
        return stMetlim;
    }

    public String getStMetratio() {
        return stMetratio;
    }

    public String getStLogg() {
        return stLogg;
    }

    public String getStLoggerr1() {
        return stLoggerr1;
    }

    public String getStLoggerr2() {
        return stLoggerr2;
    }

    public String getStLogglim() {
        return stLogglim;
    }

    public String getSyRefname() {
        return syRefname;
    }

    public String getRastr() {
        return rastr;
    }

    public String getRa() {
        return ra;
    }

    public String getDecstr() {
        return decstr;
    }

    public String getDec() {
        return dec;
    }

    public String getSyDist() {
        return syDist;
    }

    public String getSyDisterr1() {
        return syDisterr1;
    }

    public String getSyDisterr2() {
        return syDisterr2;
    }

    public String getSyVmag() {
        return syVmag;
    }

    public String getSyVmagerr1() {
        return syVmagerr1;
    }

    public String getSyVmagerr2() {
        return syVmagerr2;
    }

    public String getSyKmag() {
        return syKmag;
    }

    public String getSyKmagerr1() {
        return syKmagerr1;
    }

    public String getSyKmagerr2() {
        return syKmagerr2;
    }

    public String getSyGaiamag() {
        return syGaiamag;
    }

    public String getSyGaiamagerr1() {
        return syGaiamagerr1;
    }

    public String getSyGaiamagerr2() {
        return syGaiamagerr2;
    }

    public String getRowupdate() {
        return rowupdate;
    }

    public String getPlPubdate() {
        return plPubdate;
    }

    public String getReleasedate() {
        return releasedate;
    }
}
