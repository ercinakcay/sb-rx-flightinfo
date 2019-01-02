package com.ea.sbrxweb.service.base;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class AbstractRestService
{
    @Autowired
    private RestTemplate restTemplate;

    protected URI encodeURI(String url, String... params) {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(url).build().expand(params).encode();
        return uriComponents.toUri();
    }

    protected <T> T get(Class<T> clazz, String path) {
        return get(clazz, path, "");
    }

    protected <T> T get(Class<T> clazz, String path, String... params) {
        return restTemplate.getForObject(encodeURI(path, params), clazz);
    }

    protected <T> T post(Class<T> clazz, String path,  Object object) {
        return restTemplate.postForObject(encodeURI(path, ""), object, clazz);
    }

    protected <T> T post(Class<T> clazz, String path,  Object object, String... params) {
        return restTemplate.postForObject(encodeURI(path, params), object, clazz);
    }

}
