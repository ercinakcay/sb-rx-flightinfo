package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AfricaAirplaneService extends BaseService
{

    @Value("${af.api.address}")
    private String basePath;


}
