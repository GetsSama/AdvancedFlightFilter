package edu.zhuravlev.flight;

import java.time.LocalDateTime;

public interface Segment {
    public LocalDateTime getDepartureDate();
    public LocalDateTime getArrivalDate();
}
