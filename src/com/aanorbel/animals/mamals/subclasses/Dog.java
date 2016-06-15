package com.aanorbel.animals.mamals.subclasses;

import com.aanorbel.animals.mamals.Mammal;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals.mamals, project OOPLaps
 * class function
 */
public class Dog extends Mammal {
    /**
     * The Color.
     */
    private String color = " gray";

    /**
     * Instantiates a new Dog.
     *
     * @param name the name
     */
    public Dog(String name) {
        super(name,4);
    }

    /**
     * Gets type.
     *
     * @return
     * string representation of the type.
     */
    @Override
    public String getType() {
        return super.getType()+" I am a Dog. I am "+color;
    }
}
