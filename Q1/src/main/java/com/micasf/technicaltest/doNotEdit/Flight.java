package com.micasf.technicaltest.doNotEdit;

import java.lang.UnsupportedOperationException;
import java.time.OffsetDateTime;

public class Flight {

    public boolean isDeparture() {
        return false;
    }

    public void delay(OffsetDateTime dateTime) {
        throw new UnsupportedOperationException();
    }
}
