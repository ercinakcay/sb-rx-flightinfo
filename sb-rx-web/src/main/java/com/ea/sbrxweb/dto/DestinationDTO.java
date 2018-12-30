package com.ea.sbrxweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DestinationDTO {

    private String to;

    private String from;

    public DestinationDTO()
    {
    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    @Override
    public String toString()
    {
        return "DestinationDTO{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
