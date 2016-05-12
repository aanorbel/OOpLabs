package com.aanorbel.lab5;

/**
 * Created by anorbel on 3/31/16.
 */
public class GBprogramTest {

    /**
     * @param args
     */
    public static void main(String args[]) {
        Student student1 = new Student("Alice");
        student1.addPoints(23.0);
        student1.addPoints(7.0);
        double point1 = student1.getPoint();
        System.out.println("the total of student1 is " + point1);

        Student student2 = new Student("emmanuel");
        student2.addPoints(17.0);
        System.out.println(student2.toString());

        Course course = new Course(new Student[]{student1, student2});
        course.report();
    }

}
