package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AntarcticaAirplaneService extends BaseService
{

    @Value("${an.api.address}")
    private String basePath;

}
