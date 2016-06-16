package com.aanorbel.lab8;

import com.aanorbel.lab8.empInterface.Employee;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.lab8, project OOPLaps
 * class function
 */
public class AttachmentStudent extends Student implements Employee {
    private double average;
    private int hours = 8;
    private int overtimeHours;
    private int wage;

    /**
     * Get hours int [ ].
     *
     * @return the int [ ]
     */
    public int[] getHours() {
        int[] hoursArray = {this.hours, this.overtimeHours};
        return hoursArray;
    }

    /**
     * Sets hours.
     *
     * @param hours the hours
     */
    public void setHours(int hours) {
        if (this.hired()) {
            this.hours = 8;
            this.overtimeHours = 8-hours;
        } else {
            System.out.println("Student has not been hired. Student does not have the requisite grades.");
        }
    }

    /**
     * Instantiates a new Attachment student.
     *
     * @param name    the name
     * @param courses the courses
     * @param grades  the grades
     */
    public AttachmentStudent(String name,String[] courses,double[] grades) {
        super(name,courses);
        this.average = gradeAverage(grades);
    }

    /**
     * Hired boolean.
     *
     * @return the boolean
     */
    public boolean hired() {
        if (this.average =='A') {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getWage() {
        return this.wage;
    }

    @Override
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public int getOvertimeWage() {
        return (3 / 2) * this.getWage();
    }

    @Override
    public int totalDailyPay() {
        int dailyPay;
        dailyPay = this.getWage() * this.getHours()[0] + this.getOvertimeWage() * this.getHours()[1];
        return dailyPay;
    }

    @Override
    public char gradeAverage(double[] grades) {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum/grades.length;
        if (average>=85){
            return 'A';
        }else {
            return 'B';
        }
    }

    @Override
    public String toString() {
        return  "Name:" +super.getName()+
                "\nCourse : "+super.getCourses()+
                "\nHired :"+this.hired()+
                "\nwage " + this.getWage()+
                "\nTotal Pay "+ this.totalDailyPay();
    }
}
