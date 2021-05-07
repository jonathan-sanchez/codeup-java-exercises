package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {

        Student student1 = new Student("Jonathan");
        Student student2 = new Student("Nathan");
        Student student3 = new Student("Salim");
        Student student4 = new Student("Mani");

        Map<String, Student> students = new HashMap<>();

        students.put("js@codeup", student1);
        students.put("na@codeup", student2);
        students.put("sal@codeup", student3);
        students.put("mani@codeup", student4);

    }
}
