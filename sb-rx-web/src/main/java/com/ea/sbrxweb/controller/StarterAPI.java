package com.ea.sbrxweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ea.sbrxweb.dto.FlightDTO;
import com.ea.sbrxweb.service.AirplaneService;

import io.reactivex.Observable;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{
    @Value("${eu.api.address}")
    private String basePath;

    @Autowired
    private AirplaneService europeAirplaneService;

    @RequestMapping("/{from}")
    public String home(Map<String, Object> model, @PathVariable String from)
    {
        Observable<FlightDTO> result = europeAirplaneService.getFlightList(from, from);

        model.put("message", "docker is ready to start!" + result.subscribe(System.out::println).toString());
        return "index";
    }

}
