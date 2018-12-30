package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OceaniaAirplaneService extends BaseService
{

    @Value("${oc.api.address}")
    private String basePath;
}
