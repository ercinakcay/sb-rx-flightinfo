package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AsiaAirplaneService extends BaseService
{

    @Value("${as.api.address}")
    private String basePath;
}
