package com.ea.sbrxweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ea.sbrxweb.service.AirlineScanner;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{

    @Autowired
    private AirlineScanner airlineScanner;

    @RequestMapping("/")
    public String home(Map<String, Object> model)
    {
        model.put("message", "docker is ready to start!" + airlineScanner.getAllPossibleFlights().subscribe(System.out::println));
        return "index";
    }

}
