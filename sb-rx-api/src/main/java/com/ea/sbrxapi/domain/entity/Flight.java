package com.ea.sbrxapi.domain.entity;

import java.io.Serializable;

public class Flight implements Serializable {

    private static final long serialVersionUID = -8719918556106245278L;

    private Airport from;
    private Airport destination;
    private String flightDay;
    private String timeOfDeparture;
    private String timeOfArrival;
    private Integer price;
    private String airline;

    public Flight(Airport from, Airport destination, String flightDay, String timeOfDeparture, String timeOfArrival,
                  Integer price, String airline)
    {
        this.from = from;
        this.destination = destination;
        this.flightDay = flightDay;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.price = price;
        this.airline = airline;
    }

    public Airport getFrom()
    {
        return from;
    }

    public void setFrom(Airport from)
    {
        this.from = from;
    }

    public Airport getDestination()
    {
        return destination;
    }

    public void setDestination(Airport destination)
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

    public String getAirline()
    {
        return airline;
    }

    public void setAirline(String airline)
    {
        this.airline = airline;
    }
}
