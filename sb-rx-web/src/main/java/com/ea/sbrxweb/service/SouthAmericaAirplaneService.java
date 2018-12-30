package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.DestinationDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class SouthAmericaAirplaneService extends BaseService
{
    @Value("${sa.api.address}")
    private String basePath;

    @Override
    public Observable<DestinationDTO> getDestinationList(String from)
    {
        return null;
    }

    @Override
    public Observable<FlightDTO> getFlightList(String from, String to)
    {
        return null;
    }
}
