package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

@Service
public class AirlineScanner
{
    @Autowired
    private AirplaneService africaAirplaneService;

    @Autowired
    private AirplaneService antarcticaAirplaneService;

    @Autowired
    private AirplaneService asiaAirplaneService;

    @Autowired
    private AirplaneService europeAirplaneService;

    @Autowired
    private AirplaneService northAmericaAirplaneService;

    @Autowired
    private AirplaneService oceaniaAirplaneService;

    @Autowired
    private AirplaneService southAmericaAirplaneService;

    public Observable<FlightDTO> getAllPossibleFlights(String searchFrom) {
        return europeAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> europeAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }
}
