package com.aanorbel.lab5;

/**
 *
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
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public double getPoint() {
        return total;
    }

    /**
     * @param point
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
