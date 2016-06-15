package com.aanorbel.lab5;

/**
 * The type Gb program.
 *
 * @author anorbel
 */
class GBProgram {

    /**
     * Main.
     *
     * @param args the args
     * @throws Exception the exception
     */
    public static void main(String args[]) throws Exception {
        Student[] students = {
            new Student("Alice"), new Student("Bob"), new Student("Carol"),
            new Student("David"), new Student("Eunice")};

        Course aiti = new Course(students);

        double[][] studentScores = {
            {25.5, 39, 99}, {29, 60, 10, 100}, {100.0},
            {40, 22.3, 44.1, 10.2, 33.2, 19.5}, {33.0, 67.9, 22}};

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < studentScores[i].length; j++) {
                aiti.checkOff(students[i], studentScores[i][j]);
            }
        }

        aiti.report();

        System.out.println("Got: " + aiti.average() + ", Expected: 150.94");

        Student alice = students[0];
        aiti.checkOff(alice, 50);
        System.out.println("Got: " + aiti.average() + ", Expected: 160.94");

        Student frank = new Student("Frank");
        if (!aiti.checkOff(frank, 100)) {
            System.out.println(frank + " not enrolled.");
        }
    }
}
