package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    //tests the empty constructor
    @Test
    public void testSettingJobId() {
        Job temp1 = new Job();
        Job temp2 = new Job();
        assertNotEquals(temp1, temp2);
    }

    //jobs used in multiple tests
    private Job temp3;
    private Job temp4;
    private String temp3String;
    @Before
    public void jobsForTesting() {
        temp3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        temp4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        temp3String = temp3.toString();
    }

    //tests the full constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", temp3.getName());
        assertTrue(temp3 instanceof Job);
        assertEquals("ACME", temp3.getEmployer().getValue());
        assertTrue(temp3.getEmployer() instanceof Employer);
        assertEquals("Desert", temp3.getLocation().getValue());
        assertTrue(temp3.getLocation() instanceof Location);
        assertEquals("Quality control", temp3.getPositionType().getValue());
        assertTrue(temp3.getPositionType() instanceof PositionType);
        assertEquals("Persistence", temp3.getCoreCompetency().getValue());
        assertTrue(temp3.getCoreCompetency() instanceof CoreCompetency);
    }

    //2 jobs identical other than ID are NOT equal
    @Test
    public void testJobsForEquality(){
        assertFalse(temp3.equals(temp4));
    }

    //tests that toString starts and ends with new line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String newLine = System.lineSeparator();
        assertTrue(temp3String.startsWith(newLine));
        assertTrue(temp3String.endsWith(newLine));
    }

    //tests that toString labels and imports data correctly
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertTrue(temp3String.contains("ID: "));
        assertTrue(temp3String.contains("Name: Product tester"));
        assertTrue(temp3String.contains("Employer: ACME"));
        assertTrue(temp3String.contains("Location: Desert"));
        assertTrue(temp3String.contains("Position Type: Quality control"));
        assertTrue(temp3String.contains("Core Competency: Persistence"));
    }

    //tests that toString handles empty fields
    @Test
    public void testToStringHandlesEmptyField(){
        Job temp5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String temp5String = temp5.toString();

        assertTrue(temp5String.contains("ID: "));
        assertTrue(temp5String.contains("Name: Data not available"));
        assertTrue(temp5String.contains("Employer: Data not available"));
        assertTrue(temp5String.contains("Location: Data not available"));
        assertTrue(temp5String.contains("Position Type: Data not available"));
        assertTrue(temp5String.contains("Core Competency: Data not available"));
    }

}
