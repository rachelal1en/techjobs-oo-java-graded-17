package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private static final String noData = "Data not available";
    private static final String emptyConst = "OOPS! This job does not seem to exist.";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        if (name.isEmpty()) {
            this.name = noData;
        }
            return name != null ? name : emptyConst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if (employer.getValue().isEmpty()) {
            employer.setValue(noData);
        }
        if (employer == null){
            throw new IllegalStateException(emptyConst);
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if (location.getValue().isEmpty()) {
            location.setValue(noData);
        }
        if (location == null){
            throw new IllegalStateException(emptyConst);
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (positionType.getValue().isEmpty()) {
            positionType.setValue(noData);
        }
        if (positionType == null){
            throw new IllegalStateException(emptyConst);
        }
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue(noData);
        }
        if (coreCompetency == null){
            throw new IllegalStateException(emptyConst);
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //custom toString method
    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        if (name.equals("")){
                this.name = noData;
        }
        if (employer.getValue().equals("")) {
            this.employer.setValue(noData);
        }
        if (location.getValue().equals("")) {
            this.location.setValue(noData);
        }
        if (positionType.getValue().equals("")) {
            this.positionType.setValue(noData);
        }
        if (coreCompetency.getValue().equals("")) {
            this.coreCompetency.setValue(noData);
        }
            return newLine + "ID: " + this.id + newLine
                    + "Name: " + this.name + newLine
                    + "Employer: " + this.employer + newLine
                    + "Location: " + this.location + newLine
                    + "Position Type: " + this.positionType + newLine
                    + "Core Competency: " + this.coreCompetency + newLine;

    }
}
