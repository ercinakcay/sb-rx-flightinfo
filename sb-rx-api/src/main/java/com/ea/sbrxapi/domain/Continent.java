package com.ea.sbrxapi.domain;

public enum Continent {

    AF("Africa"),
    NA("North America"),
    OC("Oceania"),
    AN("Antarctica"),
    AS("Asia"),
    EU("Europe"),
    SA("South America");

    private String name;

    Continent(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
