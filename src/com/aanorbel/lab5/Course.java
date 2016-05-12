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
        for (int i = 0; i < students.length; i++) {
            total += students[i].getPoint();
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
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                students[i].addPoints(point);
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
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() < average) {
                System.out.println(students[i] + " and failed");
            } else {
                System.out.println(students[i] + " and Passed");
            }
        }
    }
}
