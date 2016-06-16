package com.aanorbel.lab8;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.lab8, project OOPLaps
 * class function
 */
public class TestAtStudent {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AttachmentStudent attachmentStudent1,attachmentStudent2,attachmentStudent3;

        double[] grades = {90.0,95,86,82};
        double[] gradesFail = {80.0,85,80,82};
        String[] courses = {"maths","OOP","DBMS","cryptology"};

        System.out.println("---------------------------------------------------------------------");

        attachmentStudent1 = new AttachmentStudent("Norbel",courses,grades);
        attachmentStudent1.setHours(9);
        attachmentStudent1.setWage(300);

        System.out.println(attachmentStudent1);

        System.out.println("---------------------------------------------------------------------");
        attachmentStudent2 = new AttachmentStudent("Carlton Nfor",courses,grades);
        attachmentStudent2.setHours(9);
        attachmentStudent2.setWage(350);

        System.out.println(attachmentStudent2);

        System.out.println("---------------------------------------------------------------------");

        attachmentStudent3 = new AttachmentStudent("Mbu Divine",courses,gradesFail);
        attachmentStudent3.setHours(9);
        attachmentStudent3.setWage(300);

        System.out.println(attachmentStudent3);

        System.out.println("---------------------------------------------------------------------");

    }
}
