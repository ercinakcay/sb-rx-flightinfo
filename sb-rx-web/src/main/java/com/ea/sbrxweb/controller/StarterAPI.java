package com.ea.sbrxweb.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StarterAPI extends BaseController
{

    @RequestMapping("/")
    public String home(Map<String, Object> model)
    {
        model.put("message", "docker is ready to start!");
        return "index";
    }

}
