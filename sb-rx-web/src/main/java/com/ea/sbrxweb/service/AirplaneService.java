package com.ea.sbrxweb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

public abstract class AirplaneService extends AbstractRestService
{
    Logger logger = LoggerFactory.getLogger(AirplaneService.class);

    public abstract Observable<AirportDTO> getDestinationList(String from);

    public abstract Observable<FlightDTO> getFlightList(String from, String to);
}
