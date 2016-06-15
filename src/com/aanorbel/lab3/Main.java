package com.aanorbel.lab3;

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

        System.out.print("The Scores are : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");

        }

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;

        double max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("Average score: " + avg + " Maximum score: " + max);

        System.out.println("--------------------------------------------------------------------------");

        System.out.print("Letter grades : ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                System.out.print("A ");
            } else if (scores[i] >= 80 && scores[i] < 90) {
                System.out.print("B ");
            } else if (scores[i] >= 70 && scores[i] < 80) {
                System.out.print("C ");
            } else if (scores[i] >= 60 && scores[i] < 70) {
                System.out.print("D ");
            } else {
                System.out.print("F ");
            }

        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");

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
}
