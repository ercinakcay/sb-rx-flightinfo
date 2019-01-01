package com.ea.sbrxweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ea.sbrxweb.dto.AirportDTO;
import com.ea.sbrxweb.service.AirplaneService;

import io.reactivex.Observable;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{
    @Value("${eu.api.address}")
    private String basePath;

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

    @RequestMapping("/{from}")
    public String home(Map<String, Object> model, @PathVariable String from)
    {
        Observable<AirportDTO> result = europeAirplaneService.getDestinationList();

        model.put("message", "docker is ready to start!" + result.subscribe(System.out::println).toString());
        return "index";
    }

}
