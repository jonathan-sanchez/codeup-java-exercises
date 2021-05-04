package InheritanceAndPolymorphism;

import oopLecture.Person;

import java.util.Scanner;

public class InAndPolyTester {
    public static void main(String[] args) {
//        Person person = new Person("Douglas", "Hirsh");
//        //person.firstName = "Douglas";
//
//        System.out.println("person.joinsChat() = " + person.joinsChat());
//
//        System.out.println("person.sayHello() = " + person.sayHello());
//
//        Employee employee = new Employee("Kenneth", "Howell");
//        String greeting = employee.joinsChat();
//        //employee.firstName = "Douglas";
//
//        System.out.println("greeting = " + greeting);
//        employee.doWork();
//
//        System.out.println("employee.sayHello() = " + employee.sayHello());

        Vehicle genericVehicle = new Vehicle();
        genericVehicle.start();

        Bus bus = new Bus(80);
        bus.setHeadlightsOn(true);
        bus.start();
        bus.honkHorn();
        bus.setNumberOfOccupants(2);
        System.out.println("Zooming in a bus at " + bus.getMaxSpeed() + " MPH with" + bus.getNumberOfOccupants() + "occupants inside.");

        Jet fastJet = new Jet(2000);
        fastJet.setNumberOfOccupants(1);
        fastJet.start();
        System.out.println("Zooming in a fast jet at " + fastJet.getMaxSpeed() + " MPH with " + fastJet.getNumberOfOccupants() + " occupants inside.");
    }
}
