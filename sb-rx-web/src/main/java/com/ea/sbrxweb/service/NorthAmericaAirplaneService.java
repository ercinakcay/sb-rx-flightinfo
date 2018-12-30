package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NorthAmericaAirplaneService extends BaseService
{

    @Value("${na.api.address}")
    private String basePath;
}
