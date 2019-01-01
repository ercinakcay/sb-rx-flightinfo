package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class EuropeAirplaneService extends AirplaneService
{
    @Value("${eu.api.address}")
    private String basePath;

    @Override
    public Observable<AirportDTO> getDestinationList(String from)
    {
        String path = basePath + "/destinations";

        Observable<AirportDTO> result = Observable.fromArray(get(AirportDTO[].class, path, from));
        return result;
    }

    @Override
    public Observable<FlightDTO> getFlightList(String from, String to)
    {
        return null;
    }
}
