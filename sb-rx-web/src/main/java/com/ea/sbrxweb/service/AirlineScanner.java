package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineScanner
{
    @Autowired
    private AirplaneService africaAirplaneService;

    @Autowired
    private AirplaneService antarcticaAirplaneService;

    @Autowired
    private AirplaneService asiaAirplaneService;

    @Autowired
    private AirplaneService europeAirplaneService;

    @Autowired
    private AirplaneService northAmericaAirplaneService;

    @Autowired
    private AirplaneService oceaniaAirplaneService;

    @Autowired
    private AirplaneService southAmericaAirplaneService;

}
