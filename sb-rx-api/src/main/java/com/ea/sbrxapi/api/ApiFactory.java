package com.ea.sbrxapi.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ea.sbrxapi.domain.Continent;
import com.ea.sbrxapi.domain.entity.Airport;
import com.ea.sbrxapi.domain.entity.Flight;
import com.ea.sbrxapi.util.DateUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public abstract class ApiFactory
{
    static Logger logger = LoggerFactory.getLogger(ApiFactory.class);

    private final static List<Airport> airports = new ArrayList<>();

    static {
        File file = new File(ApiFactory.class.getClassLoader().getResource("airport_info.json").getFile());
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            airports.addAll(Arrays.stream(mapper.readValue(file, Airport[].class))
                    .collect(Collectors.toList()));
            airports.removeIf(x -> x.getName() == null || !x.getType().equals("airport"));

            logger.info("Airport list has been filled.");
        }
        catch (IOException e)
        {
            logger.error("Error while filling airpot list.");
            e.printStackTrace();
        }
    }

    public List<Airport> getAllAirports() {
        return new ArrayList<>(airports);
    }

    public List<Airport> getAirportsByContinent(Continent continent)
    {
        int limit = 20;
        String clazzName = this.getClass().getSimpleName().split("\\$\\$")[0];
        logger.info("{} - Airport list loaded for continent : {}.", clazzName, continent);
        logger.info("Loading list is limited with {}.", limit);

        return getAllAirports().stream()
                .filter(x -> continent.getName().equals(x.getContinent()))
                .collect(Collectors.toList())
                .subList(0, limit);
    }

    public Airport getArrivalPoint(String from) {
        return getAllAirports().stream().filter(x -> x.getIata().equals(from)).findAny().get();
    }

    public List<Flight> getFlights(Continent continent, Airport airport)
    {
        String clazzName = this.getClass().getSimpleName().split("\\$\\$")[0];
        logger.info("{} - flights will be arranged.", clazzName);

        List<Airport> airportList = getAirportsByContinent(continent);

        Collections.shuffle(airportList);
        return IntStream.rangeClosed(0, 3).boxed()
                .map(x -> new Flight(airport,
                        airportList.get(x),
                        DateUtils.getNowDate(),
                        DateUtils.generateRandomLocalTime(true),
                        DateUtils.generateRandomLocalTime(false),
                        (int) (Math.random() * 1000),
                        clazzName)
                ).collect(Collectors.toList());
    }


}

