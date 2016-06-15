package com.aanorbel.animals;

import com.aanorbel.animals.mamals.Dog;
import com.aanorbel.animals.mamals.Human;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals, project OOPLaps
 * class function
 */
public class TestClass {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Tuc");
        animals[1] = new Animal();
        animals[2] = new Dog("Medor");
        animals[3] = new Human();
        animals[4] = new Human("Robert");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getType());
        }
    }
}
