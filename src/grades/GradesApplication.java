package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        // Student 1
        Student student1 = new Student("Jonathan");
        student1.addGrade(90);
        student1.addGrade(87);
        student1.addGrade(98);
        System.out.println("student1.getGrade() = " + student1.getGrade());
        System.out.println("student1.getName() = " + student1.getName());

        //Student 2
        Student student2 = new Student("Nathan");
        student2.addGrade(80);
        student2.addGrade(75);
        student2.addGrade(90);
        System.out.println("student2.getGrade() = " + student2.getGrade());
        System.out.println("student2.getName() = " + student2.getName());

        //Student 3
        Student student3 = new Student("Salim");
        student3.addGrade(65);
        student3.addGrade(82);
        student3.addGrade(98);
        System.out.println("student3.getGrade() = " + student3.getGrade());
        System.out.println("student3.getName() = " + student3.getName());

        //Student 4
        Student student4 = new Student("Mani");
        student4.addGrade(76);
        student4.addGrade(89);
        student4.addGrade(93);
        System.out.println("student4.getGrade() = " + student4.getGrade());
        System.out.println("student4.getName() = " + student4.getName());

        //HashMap
        Map<String, Student> students = new HashMap<>();
        students.put("js-github", student1);
        students.put("na-github", student2);
        students.put("sal-github", student3);
        students.put("mani-github", student4);

        System.out.println(students);

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! \nHere are the github usernames of our students: ");
        for (String key : students.keySet()) {
            System.out.println( key );
        }
        System.out.println("What student would you like to see more information on?");

    }
}
