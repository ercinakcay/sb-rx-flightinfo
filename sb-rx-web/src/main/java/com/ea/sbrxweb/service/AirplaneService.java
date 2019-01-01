package com.ea.sbrxweb.service;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

public abstract class AirplaneService extends AbstractRestService
{
    public abstract Observable<AirportDTO> getDestinationList(String from);

    public abstract Observable<FlightDTO> getFlightList(String from, String to);
}
