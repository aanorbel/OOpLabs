
package com.aanorbel.shapeMan.shapes;

import com.aanorbel.shapeMan.Shape;

/**
 * The type Rectangle.
 *
 * @author cressence
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Instantiates a new Rectangle.
     *
     * @param width  the width
     * @param height the height
     * @param abs    the abs
     * @param ord    the ord
     */
    public Rectangle(double width, double height, double abs, double ord) {
        super(abs, ord);
        this.width = width;
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * Area double.
     *
     * @return the double
     */
    public double area (){
        return width * height;
    }

    /**
     * Circunference double.
     *
     * @return the double
     */
    public double circunference (){
        return 2 * (width + height);
    }
    
    public void display(){
        super.display();
        System.out.println("Width : " + this.width + "and height : " + this.height);
    }
}
