package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

    //custom equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

}
