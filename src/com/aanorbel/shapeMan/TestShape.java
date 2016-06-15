
package com.aanorbel.shapeMan;

import com.aanorbel.shapeMan.shapes.Circle;
import com.aanorbel.shapeMan.shapes.Rectangle;

import java.util.ArrayList;

/**
 * The type Test shape.
 *
 * @author cressence
 */
public class TestShape {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        ArrayList <Shape> shape = new ArrayList();
        shape.add(new Shape(2.0, 3.5));
        shape.add(new Circle(7.0, 6.2, 15));
        shape.add(new Rectangle(-2.0, 1.0, 4.8, 3.0));
        
        for(Shape s : shape ) {
            s.display();
            if(s instanceof Circle) {
                System.out.println("Area : " + ((Circle) s).circunference());
        }else if (s instanceof Rectangle) {
            System.out.println("Circonference : " + ((Rectangle)s).circunference());
            System.out.println("Area : " + ((Rectangle)s).area());
        }
        }
    }
}
