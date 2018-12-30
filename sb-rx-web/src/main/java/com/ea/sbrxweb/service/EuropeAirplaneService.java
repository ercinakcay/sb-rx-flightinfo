package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.DestinationDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class EuropeAirplaneService extends BaseService
{

    @Value("${eu.api.address}")
    private String basePath;

    @Override
    public Observable<DestinationDTO> getDestinationList(String from)
    {
        String path = basePath + "/destinations";

        Observable<DestinationDTO> result = Observable.fromArray(get(DestinationDTO[].class, path, from));
        return result;
    }

    @Override
    public Observable<FlightDTO> getFlightList(String from, String to)
    {
        return null;
    }
}
