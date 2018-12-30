package com.ea.sbrxweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDTO {

    private String from;
    private String destination;
    private String flightDay;
    private String timeOfDeparture;
    private String timeOfArrival;
    private Integer price;
    private String airline;

    public FlightDTO()
    {
    }

    public FlightDTO(String from, String destination, String flightDay, String timeOfDeparture, String timeOfArrival,
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

    public String getAirline()
    {
        return airline;
    }

    public void setAirline(String airline)
    {
        this.airline = airline;
    }

    @Override
    public String toString()
    {
        return "FlightDTO{" +
                "from='" + from + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDay='" + flightDay + '\'' +
                ", timeOfDeparture='" + timeOfDeparture + '\'' +
                ", timeOfArrival='" + timeOfArrival + '\'' +
                ", price=" + price +
                ", airline='" + airline + '\'' +
                '}';
    }
}
