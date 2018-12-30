package com.ea.sbrxapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.ea.sbrxapi.api.AfricaAirplane;
import com.ea.sbrxapi.api.AntarcticaAirplane;
import com.ea.sbrxapi.api.AsiaAirplane;
import com.ea.sbrxapi.api.EuropeAirplane;
import com.ea.sbrxapi.api.NorthAmericaAirplane;
import com.ea.sbrxapi.api.OceaniaAirplane;
import com.ea.sbrxapi.api.SouthAmericaAirplane;

@SpringBootApplication
public class ApplicationContainer
{
    public static void main(String[] args)
    {
        startBasicAPIs();

        // ----

        // startAfterExperimentalEnds();

        // ----
    }

    private static void startBasicAPIs()
    {
        new SpringApplicationBuilder(EuropeAirplane.class)
                .properties("server.port=${eu.api.port}").run();

        new SpringApplicationBuilder(AfricaAirplane.class)
                .properties("server.port=${af.api.port}").run();
    }

    private static void startAfterExperimentalEnds()
    {
        new SpringApplicationBuilder(NorthAmericaAirplane.class)
                .properties("server.port=${na.api.port}").run();

        new SpringApplicationBuilder(OceaniaAirplane.class)
                .properties("server.port=${oc.api.port}").run();

        new SpringApplicationBuilder(AntarcticaAirplane.class)
                .properties("server.port=${an.api.port}").run();

        new SpringApplicationBuilder(AsiaAirplane.class)
                .properties("server.port=${as.api.port}").run();

        new SpringApplicationBuilder(SouthAmericaAirplane.class)
                .properties("server.port=${sa.api.port}").run();
    }
}

