package com.micasf.technicaltest;

import java.time.OffsetDateTime;

import com.micasf.technicaltest.doNotEdit.*;


public class FlightService {

    private Flight flight;
    private FlightRepository flightRepository;

    public FlightService(Flight flight) {
        this.flight = flight;
        this.flightRepository = FlightRepositoryFactory.getFlightRepository();
    }

    public void delayFlight(OffsetDateTime newTime) {

        flight.delay(newTime);
        flightRepository.persist(flight);

        if (flight.isDeparture()) {
            AirportAnnouncer announcer = new AirportAnnouncer();
            announcer.announceTimeChanged(flight);
        }
    }
}


public class FlightRepositoryFactory {
    public static FlightRepository getFlightRepository() {
        return new FlightRepository();
    }
}
