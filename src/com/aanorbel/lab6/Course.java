package com.aanorbel.lab6;

import java.util.ArrayList;

/**
 * store a list of pointers to each student in the course. hold a list of point
 * totals for each student in the course
 *
 * @author anorbel
 */
public class Course {

    /**
     * ArrayList of students registered for course
     */
    ArrayList<Student> students;
    /**
     * Stores student grades
     */
    ArrayList<Double> studentGrades;
    /**
     * Name of this course
     */
    String courseName;

    /**
     * Creates a new Course that the given students are taking. Initialize the
     * ArrayList of students. Initialize the ArrayList of student grades.
     *
     * @param courseName the course name
     */
    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
        studentGrades = new ArrayList<>();

    }

    /**
     * Returns the name of the course
     *
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Adds points to the correct running point total in the ‘studentGrade’
     * ArrayList.
     *
     * @param points the points
     * @param Name   the name
     */
    public void addPoints(double points, String Name) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).name.equals(Name)) {
                this.studentGrades.add(points);
            }
        }
    }

    /**
     * Returns the total points for the student in the course.
     *
     * @param studentName the student name
     * @return double
     */
    public double studentScore(Student studentName) {
        double total = 0.0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(studentName.name)) {
                total = studentName.total;
            }
        }
        return total;
    }

    /**
     * Adds a student to the course. Adds the course to the student as well
     *
     * @param stud the stud
     */
    public void addStudent(Student stud) {
        students.add(stud);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(stud.name)) {
                students.get(i).addCourse(this);
            }
        }
    }

    /**
     * Returns the average of the total points of all the students in the
     * course.
     *
     * @return double
     */
    public double averageAll() {
        double sum = 0.0;
        double average;
        for (int i = 0; i < this.studentGrades.size(); i++) {
            sum += this.studentGrades.get(i);
        }
        average = sum / students.size();
        return average;
    }

    /**
     * Prints the name of each Student in this Course, and whether they are
     * passing or failing.
     */
    public void report() {
        String remark;
        System.out.println(this.courseName);
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            if (this.studentGrades.get(i) >= this.averageAll()) {
                remark = "Pass";
            } else {
                remark = "Fail";
            }
            System.out.println(students.get(i).name + " " + remark);
        }
        System.out.println("");
    }
}
