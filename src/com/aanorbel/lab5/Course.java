package com.aanorbel.lab5;

/**
 * Created by anorbel on 3/31/16.
 */
public class Course {

    /**
     * Array of Students
     */
    Student[] students;

    /**
     * Constructor
     *
     * @param students
     */
    public Course(Student[] students) {
        this.students = students;
    }

    /**
     *
     * @return
     */
    public double average() {
        /**
         * Average of marks
         */
        double average = 0.0;
        /**
         * total marks
         */
        double total = 0.0;
        for (Student student : students) {
            total += student.getPoint();
        }
        average = total / students.length;
        return average;
    }

    /**
     *
     * @param student
     * @param point
     * @return
     */
    public boolean checkOff(Student student, double point) {
        for (Student student1 : students) {
            if (student.equals(student1)) {
                student1.addPoints(point);
                return true;
            }
        }
        return false;
    }

    /**
     * generates report
     */
    public void report() {
        /**
         * average mark of studets
         */
        double average = average();
        for (Student student : students) {
            if (student.getPoint() < average) {
                System.out.println(student + " and failed");
            } else {
                System.out.println(student + " and Passed");
            }
        }
    }
}
