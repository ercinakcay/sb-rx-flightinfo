package com.ea.sbrxapi.domain.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airport implements Serializable {

    private static final long serialVersionUID = 3254105653710267492L;

    @JsonProperty("iata")
    private String iata;

    @JsonProperty("lon")
    private String lon;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("iso")
    private String iso;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("name")
    private String name;

    @JsonProperty("continent")
    private String continent;

    @JsonProperty("airport")
    private String airport;

    @JsonProperty("size")
    private String size;

    @JsonProperty("type")
    private String type;

    public String getIata()
    {
        return iata;
    }

    public void setIata(String iata)
    {
        this.iata = iata;
    }

    public String getLon()
    {
        return lon;
    }

    public void setLon(String lon)
    {
        this.lon = lon;
    }

    public String getLat()
    {
        return lat;
    }

    public void setLat(String lat)
    {
        this.lat = lat;
    }

    public String getIso()
    {
        return iso;
    }

    public void setIso(String iso)
    {
        this.iso = iso;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public String getAirport()
    {
        return airport;
    }

    public void setAirport(String airport)
    {
        this.airport = airport;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
