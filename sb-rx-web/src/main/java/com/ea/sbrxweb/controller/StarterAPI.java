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

import com.ea.sbrxweb.dto.AirportDTO;

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

//        Observable<AirportDTO> result = Observable.fromArray(get(AirportDTO[].class, sb.toString(), "asd"));
//        model.put("message", "docker is ready to start!" + result.subscribe(System.out::println).toString());
        return "index";
    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    private URI encodeURI(String url, String... params) {
//        UriComponents uriComponents = UriComponentsBuilder.fromUriString(url).build().expand(params).encode();
//        return uriComponents.toUri();
//    }
//
//    public <T> T get(Class<T> clazz, String path) {
//        return get(clazz, path, "");
//    }
//
//    public <T> T get(Class<T> clazz, String path, String... params) {
//        return restTemplate.getForObject(encodeURI(path, params), clazz);
//    }
}
