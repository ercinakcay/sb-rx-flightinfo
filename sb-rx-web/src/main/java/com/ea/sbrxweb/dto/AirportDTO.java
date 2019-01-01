package com.ea.sbrxweb.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirportDTO {

    private String iata;

    private String lon;

    private String lat;

    private String iso;

    private Integer status;

    private String name;

    private String continent;

    private String airport;

    private String size;

    private String type;

    public AirportDTO()
    {
    }

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

    @Override
    public String toString()
    {
        return "AirportDTO{" +
                "iata='" + iata + '\'' +
                ", lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", iso='" + iso + '\'' +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", airport='" + airport + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
