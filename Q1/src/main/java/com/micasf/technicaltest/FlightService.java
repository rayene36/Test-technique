package com.micasf.technicaltest;

import java.time.OffsetDateTime;

import com.micasf.technicaltest.doNotEdit.*;

public class FlightService {
    public FlightService() {
    }

    public void delayFlight(Flight flight, OffsetDateTime newTime) {
        flight.delay(newTime);

        FlightRepository flightRepository = new FlightRepository();
        flightRepository.persist(flight);

        if (flight.isDeparture()) {
            AirportAnnouncer announcer = new AirportAnnouncer();
            announcer.announceTimeChanged(flight);
        }
    }
}
