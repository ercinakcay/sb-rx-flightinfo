package com.ea.sbrxapi.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

            logger.info("Airpot list has been filled.");
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
        logger.info("{} - Airport list loaded for continent : {}.", this.getClass().getSimpleName(), continent);
        logger.info("Loading list is limited with 10.");

        return airports.stream()
                .filter(x -> continent.getName().equals(x.getContinent()))
                .collect(Collectors.toList())
                .subList(0, 10);
    }

    @RequestMapping(value = "/flights/{from}/{to}")
    public List<Flight> getFlightList(@PathVariable String from, @PathVariable String to) {

        String clazzName = this.getClass().getSimpleName().split("\\$\\$")[0];
        logger.info("{} - flights will be arranged. From : {} and to : {}", clazzName, from, to);

        return IntStream.rangeClosed(0, 3).boxed()
                .map(x -> new Flight(from, to,
                        DateUtils.getNowDate(),
                        DateUtils.generateRandomLocalTime(true),
                        DateUtils.generateRandomLocalTime(false),
                        (int) (Math.random() * 1000),
                        clazzName)
                ).collect(Collectors.toList());
    }
}

