
package com.aanorbel.abstractShapeMan;

/**
 * The type ShapeAb.
 */
public abstract class ShapeAb {
    private double abs;
    private double ord;

    /**
     * Instantiates a new ShapeAb.
     *
     * @param abs the abs
     * @param ord the ord
     */
    public ShapeAb(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    public abstract double circunference();
    public abstract double area();

    /**
     * Gets abs.
     *
     * @return the abs
     */
    public double getAbs() {
        return abs;
    }

    /**
     * Sets abs.
     *
     * @param abs the abs
     */
    public void setAbs(double abs) {
        this.abs = abs;
    }

    /**
     * Gets ord.
     *
     * @return the ord
     */
    public double getOrd() {
        return ord;
    }

    /**
     * Sets ord.
     *
     * @param ord the ord
     */
    public void setOrd(double ord) {
        this.ord = ord;
    }

    /**
     * Display.
     */
    public void display(){
        System.out.println("Ceneter of grvity:");
         System.out.print("(" + this.abs + ","+this.ord+" + )");
    }
}
