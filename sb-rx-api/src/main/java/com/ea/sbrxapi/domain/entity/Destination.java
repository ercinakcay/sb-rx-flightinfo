package com.ea.sbrxapi.domain.entity;

import java.io.Serializable;

public class Destination implements Serializable {

    private static final long serialVersionUID = -1774167247551120247L;

    private String to;

    private String from;

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
}
