package edu.zhuravlev.flight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Bean that represents a flight segment.
 */
public class SegmentImpl implements Segment{
    private final LocalDateTime departureDate;

    private final LocalDateTime arrivalDate;

    SegmentImpl(final LocalDateTime dep, final LocalDateTime arr) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
    }

    @Override
    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    @Override
    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return '[' + departureDate.format(fmt) + '|' + arrivalDate.format(fmt)
                + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SegmentImpl)) return false;

        SegmentImpl segment = (SegmentImpl) o;

        return this.toString().equals(segment.toString());
    }

    @Override
    public int hashCode() {
        int result = departureDate != null ? departureDate.hashCode() : 0;
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        return result;
    }
}
