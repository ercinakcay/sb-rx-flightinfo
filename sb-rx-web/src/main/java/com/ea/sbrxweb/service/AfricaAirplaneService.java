package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class AfricaAirplaneService extends AirplaneService
{
    @Value("${af.api.address}")
    private String basePath;


    @Override
    public Observable<AirportDTO> getDestinationList()
    {
        return null;
    }

    @Override
    public Observable<FlightDTO> getFlightList()
    {
        return null;
    }
}
