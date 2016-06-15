
package com.aanorbel.shapeMan.shapes;

import com.aanorbel.shapeMan.Shape;

/**
 * The type Circle.
 *
 * @author cressence
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     * @param abs    the abs
     * @param ord    the ord
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
     * Circonference double.
     *
     * @return the double
     */
    public double circonference(){
     return 2 * Math.PI* this.radius;
 }
 
 @Override
 public void display(){
     super.display();
     System.out.println(" Raduis : " + this.radius);
 }
    
}
