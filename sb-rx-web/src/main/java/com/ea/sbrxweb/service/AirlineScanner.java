package com.ea.sbrxweb.service;

import java.util.Comparator;

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
        return Observable.mergeArray(getAfricaAirplaneFlights(searchFrom),
                    getAntarcticaAirplaneFlights(searchFrom),
                    getAsiaAirplaneFlights(searchFrom),
                    getEuropeAirplaneFlights(searchFrom),
                    getNorthAmericaAirplaneFlights(searchFrom),
                    getOceaniaAirplaneFlights(searchFrom),
                    getSouthAmericaAirplaneFlights(searchFrom)
                )
                .subscribeOn(Schedulers.io())
                .sorted(Comparator.comparing(o -> o.getPrice()));
    }

    private Observable<FlightDTO> getAfricaAirplaneFlights(String searchFrom) {
        return africaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> africaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getAntarcticaAirplaneFlights(String searchFrom) {
        return antarcticaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> antarcticaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getAsiaAirplaneFlights(String searchFrom) {
        return asiaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> asiaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getEuropeAirplaneFlights(String searchFrom) {
        return europeAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> europeAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getNorthAmericaAirplaneFlights(String searchFrom) {
        return northAmericaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> northAmericaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getOceaniaAirplaneFlights(String searchFrom) {
        return oceaniaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> oceaniaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

    private Observable<FlightDTO> getSouthAmericaAirplaneFlights(String searchFrom) {
        return southAmericaAirplaneService.getArrivalPoint(searchFrom)
                .subscribeOn(Schedulers.io())
                .flatMap(arrival -> southAmericaAirplaneService.getFlightList(arrival))
                .map(f -> new FlightDTO(f.getFrom(), f.getDestination(), f.getFlightDay(), f.getTimeOfDeparture(),
                        f.getTimeOfArrival(), f.getPrice(), f.getAirline()));
    }

}
