package com.ea.sbrxapi.domain.entity;

import java.io.Serializable;

public class Flight implements Serializable {

    private static final long serialVersionUID = -8719918556106245278L;

    private String from;
    private String destination;
    private String flightDay;
    private String timeOfDeparture;
    private String timeOfArrival;
    private Integer price;

    public Flight(String from, String destination, String flightDay, String timeOfDeparture, String timeOfArrival,
                  Integer price)
    {
        this.from = from;
        this.destination = destination;
        this.flightDay = flightDay;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.price = price;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public String getFlightDay()
    {
        return flightDay;
    }

    public void setFlightDay(String flightDay)
    {
        this.flightDay = flightDay;
    }

    public String getTimeOfDeparture()
    {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture)
    {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTimeOfArrival()
    {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival)
    {
        this.timeOfArrival = timeOfArrival;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
}
