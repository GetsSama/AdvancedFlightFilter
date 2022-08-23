package edu.zhuravlev.flight;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Bean that represents a flight.
 */
class FlightImpl implements Flight {
    private final List<Segment> segments;

    FlightImpl(final List<Segment> segs) {
        segments = segs;
    }

    @Override
    public List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        return Objects.equals(segments, flight.getSegments());
    }

    @Override
    public int hashCode() {
        return segments != null ? segments.hashCode() : 0;
    }
}