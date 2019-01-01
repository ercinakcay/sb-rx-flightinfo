package com.ea.sbrxapi.api;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ea.sbrxapi.domain.Continent;
import com.ea.sbrxapi.domain.entity.Airport;
import com.ea.sbrxapi.domain.entity.Flight;

@SpringBootApplication(scanBasePackages={"com.ea.sbrxapi"})
@RestController
@RequestMapping("/api/as")
public class AsiaAirplane extends ApiFactory {

    @RequestMapping(value = "/destinations")
    public List<Airport> getDestinationList() {
        return getAirportsByContinent(Continent.AS);
    }

    @RequestMapping(value = "/flights")
    public List<Flight> getFlightList() {
        return getFlights(Continent.AS);
    }
}