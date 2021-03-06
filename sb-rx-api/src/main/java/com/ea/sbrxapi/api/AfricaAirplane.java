package com.ea.sbrxapi.api;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ea.sbrxapi.domain.Continent;
import com.ea.sbrxapi.domain.entity.Airport;
import com.ea.sbrxapi.domain.entity.Flight;

@SpringBootApplication(scanBasePackages={"com.ea.sbrxapi"})
@RestController
@RequestMapping("/api/af")
public class AfricaAirplane extends ApiFactory {

    @RequestMapping(value = "/airports")
    public List<Airport> listAirports() {
        return getAirportsByContinent(Continent.AF);
    }

    @RequestMapping(value = "/arrival/{from}")
    public Airport getArrivalPoint(@PathVariable String from) {
        return getArrivalByPoint(from);
    }

    @RequestMapping(value = "/flights", method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> getFlightList(@RequestBody Airport airport) {
        return getFlights(Continent.AF, airport);
    }
}