package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EuropeAirplaneService extends BaseService
{

    @Value("${eu.api.address}")
    private String basePath;
}
