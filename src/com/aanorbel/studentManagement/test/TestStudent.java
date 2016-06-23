package com.aanorbel.studentManagement.test;

import com.aanorbel.studentManagement.DAO.StudentDao;
import com.aanorbel.studentManagement.entity.Student;

import java.util.ArrayList;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.studentManagement.test, project OOPLaps
 * class function
 */
public class TestStudent {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        Student student = new Student("Ct14A40", "Nfor mbunwe", 3, "male");
        Student result = studentDao.create(student);
        if (result != null) {
            System.out.println("student saved");
        } else {
            System.out.println("error adding student");
        }

        System.out.println("----------------------------------------------------------------");

        ArrayList<Student> students = studentDao.findAllStudents();
        displayList(students);

        System.out.println("----------------------------------------------------------------");
        student.setName("Norbel");
        student.setId(1);
        Student student1 = studentDao.update(student);
        if (student1 != null) {
            System.out.println("student Updated");
        } else {
            System.out.println("error updating student");

            ArrayList<Student> student2 = studentDao.findAllStudents();
            displayList(student2);
        }

    }

    public static void displayList(ArrayList<Student> students) {
        Student student;
        for (int i = 0; i < students.size(); i++) {
            student = students.get(i);
            System.out.println(student.getName());
        }
    }
}
