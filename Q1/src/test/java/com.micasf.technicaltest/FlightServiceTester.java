


@InjectMocks
AirportAnnouncer announcer = new AirportAnnouncer();
Flight flight = new Flight();


@Test(expected = UnsupportedOperationException.class)
public void testUnsupportedOperationException(){
    verify(annoncer, times(1)).annonceTimeChanged(flight));
}

@Test
public void testDelayFlight(){
 assert(true,Flight.isDeparture)
}