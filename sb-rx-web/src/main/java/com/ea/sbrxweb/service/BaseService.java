package com.ea.sbrxweb.service;

import com.ea.sbrxweb.dto.DestinationDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

public abstract class BaseService extends AbstractRestService
{
    public abstract Observable<DestinationDTO> getDestinationList(String from);

    public abstract Observable<FlightDTO> getFlightList(String from, String to);
}
