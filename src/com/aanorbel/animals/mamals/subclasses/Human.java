package com.aanorbel.animals.mamals.subclasses;

import com.aanorbel.animals.mamals.Mammal;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals.mamals, project OOPLaps
 * class function
 */
public class Human extends Mammal {
    /**
     * The Race.
     */
    private String race = "Black";

    /**
     * Instantiates a new Human.
     *
     * @param name the name
     */
    public Human(String name) {
        super(name,2);

    }

    /**
     * Instantiates a new Human.
     */
    public Human() {
        super(2);
    }

    /**
     * Gets type.
     *
     * @return
     * string representation of the type.
     */
    @Override
    public String getType() {
        return super.getType()+" I am a Human . I am a "+race;
    }
}
