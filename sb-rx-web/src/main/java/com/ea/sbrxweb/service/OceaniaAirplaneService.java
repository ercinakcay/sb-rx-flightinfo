package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class OceaniaAirplaneService extends AirplaneService
{
    @Value("${oc.api.address}")
    private String basePath;

    @Override
    public Observable<AirportDTO> getDestinationList(String from)
    {
        return null;
    }

    @Override
    public Observable<FlightDTO> getFlightList(String from, String to)
    {
        return null;
    }
}
