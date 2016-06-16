package com.aanorbel.exceptions;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.exceptions, project OOPLaps
 * class function
 */
public class Point implements Displayable {
    private double x;
    private double y;

    /**
     * Instantiates a new Point.
     *
     * @param x the x
     * @param y the y
     * @throws Exception the exception
     */
    public Point(double x, double y) throws Exception {
        if (x < 0 || y < 0) throw new Exception("Error : Negative arguments");
        this.x = x;
        this.y = y;
    }

    @Override
    public void dispay() {
        System.out.println("Point (" + this.x + ", " + this.y + ")");
    }
}
