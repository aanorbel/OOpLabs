
package com.aanorbel.abstractShapeMan;

import com.aanorbel.abstractShapeMan.shapes.CircleAb;
import com.aanorbel.abstractShapeMan.shapes.RectangleAb;

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
        ArrayList <ShapeAb> shape = new ArrayList();
        shape.add(new CircleAb(7.0, 6.2, 15));
        shape.add(new RectangleAb(-2.0, 1.0, 4.8, 3.0));

        for(ShapeAb s : shape ) {
            s.display();
            if(s instanceof CircleAb) {
                System.out.println("Area : " + s.circunference());
            }else if (s instanceof RectangleAb) {
                System.out.println("Circonference : " + s.circunference());
                System.out.println("Area : " + s.area());
            }
        }
    }
}
