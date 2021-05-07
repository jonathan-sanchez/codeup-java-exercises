package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

        Student student1 = new Student("Jonathan");
        System.out.println("student1.getName() = " + student1.getName());
        student1.addGrade(98);
        student1.addGrade(90);
        student1.addGrade(85);
        System.out.println("student1.grades = " + student1.grades);
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());

        Student student2 = new Student("Kapena");
        System.out.println("student2.getName() = " + student2.getName());
        student2.addGrade(87);
        student2.addGrade(90);
        student2.addGrade(96);
        System.out.println("student2.grades = " + student2.grades);
        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());


    }

    private ArrayList<Integer> grades;
    private String name;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
    return name;
    }

    public void setName(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    int gradeAverage;
    public int getGradeAverage(){

        for (int i = 0; i < grades.size(); i++) {
            gradeAverage += grades.get(i);
        }
        return gradeAverage / grades.size();
    }


}
