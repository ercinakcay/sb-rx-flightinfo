package com.ea.sbrxapi.api;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ea.sbrxapi.domain.Continent;
import com.ea.sbrxapi.domain.entity.Airport;
import com.ea.sbrxapi.domain.entity.Flight;

@SpringBootApplication(scanBasePackages={"com.ea.sbrxapi"})
@RestController
@RequestMapping("api/an")
public class AntarcticaAirplane extends ApiFactory {

    @RequestMapping(value = "destinations")
    public List<Airport> getDestinations() {
        return getAirportsByContinent(Continent.AN);
    }
}