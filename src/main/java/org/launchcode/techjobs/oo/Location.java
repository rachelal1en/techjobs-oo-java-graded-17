package org.launchcode.techjobs.oo;

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

}
