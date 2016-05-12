package com.aanorbel.lab6;

/**
 * Create 3 new students – Chilongo, Gikandi and Amwayi Create 4 courses
 * Accounting, AITI, Information Systems, and Economics. Enroll each students in
 * at least 3 courses Assign points to each student. Call the addPoints method
 * more than once. Invoke the report method on all the courses Invoke
 * thetoString method on all the students Change the courses and grades Invoke
 * thereport method again
 *
 * @author anorbel
 */
public class GBProgram {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Create 3 new students – Chilongo, Gikandi and Amwayi
         */
        Student student1 = new Student("Chilongo");
        Student student2 = new Student("Gikamdi");
        Student student3 = new Student("Amwayi");

        /**
         * Create 4 courses – Accounting, AITI, Information Systems, and
         * Economics.
         */
        Course accCourse = new Course("Accounting");
        Course aiCourse = new Course("AITI");
        Course infoCourse = new Course("Information Systems");
        Course econsCourse = new Course("Economics");

        /**
         * Enroll each students in at least 3 courses
         */
        accCourse.addStudent(student1);
        accCourse.addPoints(45.0, "Chilongo");
        accCourse.addStudent(student2);
        accCourse.addPoints(55.0, "Gikamdi");
        accCourse.addStudent(student3);
        accCourse.addPoints(48.0, "Amwayi");

        aiCourse.addStudent(student1);
        aiCourse.addPoints(43.5, "Chilongo");
        aiCourse.addStudent(student2);
        aiCourse.addPoints(44.5, "Gikamdi");
        aiCourse.addStudent(student3);
        aiCourse.addPoints(33.5, "Amwayi");

        infoCourse.addStudent(student1);
        infoCourse.addPoints(46.4, "Chilongo");
        infoCourse.addStudent(student2);
        infoCourse.addPoints(56.4, "Gikamdi");
        infoCourse.addStudent(student3);
        infoCourse.addPoints(59.4, "Amwayi");

        econsCourse.addStudent(student1);
        econsCourse.addPoints(50, "Chilongo");
        econsCourse.addStudent(student2);
        econsCourse.addPoints(50.5, "Gikamdi");
        econsCourse.addStudent(student3);
        econsCourse.addPoints(55, "Amwayi");

        /**
         * Invoke the report method on all the courses
         */
        accCourse.report();
        aiCourse.report();
        infoCourse.report();
        econsCourse.report();

        System.out.println("=========================================================");

        /**
         * Invoke the toString method on all the students
         */
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("**********************************************************"
                + "\n----------------------------------------------------------"
                + "\n*********************************************************"
                + "\n                      NEW VALUES"
                + "\n");
        /**
         * create 3 new students idriss,Gavin,chanella
         */
        Student student4 = new Student("Idriss");
        Student student5 = new Student("Gavin");
        Student student6 = new Student("chanella");
        /**
         * creates 4 new courses mathematics,physics,DBMS,OOP
         */
        Course mathCourse = new Course("Mathematics");
        Course phyCourse = new Course("physics");
        Course dbmsCourse = new Course("DBMS");
        Course oopCourse = new Course("OOP");

        mathCourse.addStudent(student4);
        mathCourse.addPoints(45.0, "Idriss");
        mathCourse.addStudent(student5);
        mathCourse.addPoints(55.0, "Gavin");
        mathCourse.addStudent(student6);
        mathCourse.addPoints(48.0, "chanella");

        phyCourse.addStudent(student4);
        phyCourse.addPoints(43.5, "Idriss");
        phyCourse.addStudent(student5);
        phyCourse.addPoints(44.5, "Gavin");
        phyCourse.addStudent(student6);
        phyCourse.addPoints(33.5, "chanella");

        dbmsCourse.addStudent(student4);
        dbmsCourse.addPoints(46.4, "Idriss");
        dbmsCourse.addStudent(student5);
        dbmsCourse.addPoints(56.4, "Gavin");
        dbmsCourse.addStudent(student6);
        dbmsCourse.addPoints(59.4, "chanella");

        oopCourse.addStudent(student4);
        oopCourse.addPoints(50, "Idriss");
        oopCourse.addStudent(student5);
        oopCourse.addPoints(50.5, "Gavin");
        oopCourse.addStudent(student6);
        oopCourse.addPoints(55, "chanella");

        /**
         * Invoke the report method on all the courses
         */
        mathCourse.report();
        phyCourse.report();
        dbmsCourse.report();
        oopCourse.report();

        System.out.println("=========================================================");

        /**
         * Invoke the toString method on all the students
         */
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());

    }
}
