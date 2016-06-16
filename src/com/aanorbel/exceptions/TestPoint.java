package com.aanorbel.exceptions;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.exceptions, project OOPLaps
 * class function
 */
public class TestPoint {
    public static void main(String[] args) {
        try {

            Point point1 = new Point(-2.0, 7.3);
            point1.dispay();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Point point2 = new Point(2.2, 5.1);
            point2.dispay();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
