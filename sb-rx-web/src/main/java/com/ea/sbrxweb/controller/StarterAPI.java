package com.ea.sbrxweb.controller;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.ea.sbrxweb.dto.DestinationDTO;

import io.reactivex.Observable;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{
    @Value("${eu.api.address}")
    private String basePath;

    @RequestMapping("/")
    public String home(Map<String, Object> model)
    {
        StringBuilder sb = new StringBuilder(basePath);
        sb.append("/destinations");

//        Observable<DestinationDTO> result = Observable.fromArray(get(DestinationDTO[].class, sb.toString(), "asd"));
//        model.put("message", "docker is ready to start!" + result.subscribe(System.out::println).toString());
        return "index";
    }
}
