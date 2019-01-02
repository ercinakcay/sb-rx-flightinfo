package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.dto.FlightDTO;

import io.reactivex.Observable;

@Service
public class NorthAmericaAirplaneService extends AirplaneService
{
    @Value("${na.api.address}")
    private String basePath;

    @Override
    public Observable<AirportDTO> getArrivalPoint(String searchFrom) {
        String path = basePath + "/arrival/{searchFrom}";
        Observable<AirportDTO> result = Observable.empty();
        try {
            result = Observable.fromArray(get(AirportDTO.class, path, searchFrom));
        } catch (Exception e) {
            logger.error("Error at getting arrival point list : {}", e.getMessage());
        }
        return result;
    }

    @Override
    public Observable<FlightDTO> getFlightList(AirportDTO airport) {
        String path = basePath + "/flights";

        try {
            FlightDTO[] resultArray = post(FlightDTO[].class, path, airport);
            return Observable.fromArray(resultArray);
        } catch (Exception e) {
            logger.error("Error at getting flight list : {}", e.getMessage());
        }
        return Observable.empty();
    }
}
