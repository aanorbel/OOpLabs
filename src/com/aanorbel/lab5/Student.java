package com.aanorbel.lab5;

/**
 * Student
 */
public class Student {

    /**
     * Name of Student
     */
    String name;
    /**
     * total of students Marks
     */
    double total = 0.0;

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Gets point.
     *
     * @return point
     */
    public double getPoint() {
        return total;
    }

    /**
     * Add points.
     *
     * @param point the point
     */
    public void addPoints(double point) {
        total += point;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "StudentName : " + this.name
                + " StudentPoints : " + this.total;
    }
}
