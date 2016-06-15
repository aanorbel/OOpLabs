package com.aanorbel.lab4;

/**
 * The type Main.
 *
 * @author anorbel
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        double[] scores = {82.4, 72.6, 90, 96.8, 86.1};

        printScores(scores);

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Average score: " + aveScore(scores) + " Maximum score: " + maxScore(scores));

        System.out.println("--------------------------------------------------------------------------");

        printGrades(scores);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");

        histogram(scores);
    }

    /**
     * Print grades.
     *
     * @param scores the scores
     */
    public static void printGrades(double[] scores) {
        System.out.println("Letter grades : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " = " + letterGrade(scores[i]));
        }
    }

    /**
     * Letter grade char.
     *
     * @param scores the scores
     * @return char
     */
    public static char letterGrade(double scores) {
        char val;
        if (scores >= 90) {
            val = 'A';
        } else if (scores >= 80 && scores < 90) {
            val = 'B';
        } else if (scores >= 70 && scores < 80) {
            val = 'C';
        } else if (scores >= 60 && scores < 70) {
            val = 'D';
        } else {
            val = 'F';
        }
        return val;
    }

    /**
     * Histogram.
     *
     * @param scores the scores
     */
    public static void histogram(double[] scores) {
        System.out.print("A : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                System.out.print("X");
            }
        }
        System.out.println(" ");

        System.out.print("B : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80 && scores[i] < 90) {
                System.out.print("X");
            }
        }
        System.out.println(" ");

        System.out.print("C : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 70 && scores[i] < 80) {
                System.out.print("X");
            }
        }
        System.out.println(" ");

        System.out.print("D : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 70 && scores[i] < 80) {
                System.out.print("X");
            }
        }
        System.out.println(" ");

        System.out.print("F : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                System.out.print("x");
            }
        }
        System.out.println(" ");
    }

    /**
     * Max score double.
     *
     * @param scores the scores
     * @return double
     */
    public static double maxScore(double[] scores) {
        double max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    /**
     * Ave score double.
     *
     * @param scores the scores
     * @return double
     */
    public static double aveScore(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    /**
     * Print scores.
     *
     * @param scores the scores
     */
    public static void printScores(double[] scores) {
        System.out.print("The Scores are : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");

        }
        System.out.println(" ");

    }
}
