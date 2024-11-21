package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }

    //custom equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location that = (Location) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
