package com.ea.sbrxweb.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class AbstractRestService
{
    @Autowired
    private RestTemplate restTemplate;

    private URI encodeURI(String url, String... params) {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(url).build().expand(params).encode();
        return uriComponents.toUri();
    }

    public <T> T get(Class<T> clazz, String path) {
        return get(clazz, path, "");
    }

    public <T> T get(Class<T> clazz, String path, String... params) {
        return restTemplate.getForObject(encodeURI(path, params), clazz);
    }
}
