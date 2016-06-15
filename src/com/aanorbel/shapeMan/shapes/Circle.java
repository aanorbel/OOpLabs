
package com.aanorbel.shapeMan.shapes;

import com.aanorbel.shapeMan.Shape;

/**
 * The type CircleAb.
 *
 * @author cressence
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Instantiates a new CircleAb.
     *
     * @param radius the radius
     * @param abs    the abscissa
     * @param ord    the ordinate
     */
    public Circle(double radius, double abs, double ord) {
        super(abs, ord);
        this.radius = radius;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * Area double.
     *
     * @return the double
     */
    public double area(){
        return Math.PI* Math.pow(this.radius, 2);
    }

    /**
     * Circumference double.
     *
     * @return the double
     */
    public double circunference() {
     return 2 * Math.PI* this.radius;
 }
 
 @Override
 public void display(){
     super.display();
     System.out.println(" Radii : " + this.radius);
 }
    
}
