package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
        Job temp3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job temp4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String temp3String = temp3.toString();

        System.out.println(temp3String);

        Job temp5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String temp5String = temp5.toString();

        System.out.println(temp5String);

//        Job temp1 = new Job();
//        String temp1String = temp1.getEmployer().getValue();
//
//        System.out.println(temp1String);

    }

}
