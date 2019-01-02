package com.ea.sbrxweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.ea.sbrxweb.service.AirlineScanner;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{

    @Autowired
    private AirlineScanner airlineScanner;

//    @RequestMapping("/")
//    public String home(Map<String, Object> model)
//    {
//        model.put("message", "it is ready to start!" + airlineScanner.getAllPossibleFlights("HKV").subscribe(System.out::println));
//        return "index";
//    }

    @RequestMapping("/{from}")
    public SseEmitter home(@PathVariable String from)
    {
        SseEmitter sseEmitter = new SseEmitter();
        airlineScanner.getAllPossibleFlights(from).subscribe(a -> {
            sseEmitter.send(a);
        },sseEmitter::completeWithError,sseEmitter::complete);

        return sseEmitter;
    }
}
