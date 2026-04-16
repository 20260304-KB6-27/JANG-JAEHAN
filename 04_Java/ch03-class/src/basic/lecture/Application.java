package basic.lecture;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {

        Student student = new Student("bear",Grade.A);

        System.out.println(student.grade);
        System.out.println(student.grade.getDescription());

    }
}
