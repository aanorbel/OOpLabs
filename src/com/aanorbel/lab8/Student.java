package com.aanorbel.lab8;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.lab8, project OOPLaps
 * class function
 */
public abstract class Student {
    /**
     * The Name.
     */
    private String name;
    /**
     * The Courses.
     */
    private String[] courses;

    /**
     * Instantiates a new Student.
     *
     * @param name   the name
     * @param course the courses
     */
    public Student(String name, String[] course) {
        this.name = name;
        this.courses = course;
    }

    /**
     * Grade average char.
     *
     * @param grades the grades
     * @return the char
     */
    abstract char gradeAverage(double[] grades);

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets courses.
     *
     * @return the courses
     */
    public String getCourses() {
        return this.courses[0]+", "+this.courses[1]+", "+this.courses[2]+" ,"+this.courses[3];
    }
}
