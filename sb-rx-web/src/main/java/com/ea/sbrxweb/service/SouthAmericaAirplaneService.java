package com.ea.sbrxweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SouthAmericaAirplaneService extends BaseService
{
    @Value("${sa.api.address}")
    private String basePath;
}
