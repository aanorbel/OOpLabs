package com.aanorbel.animals.mamals;

import com.aanorbel.animals.Animal;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals.mamals, project OOPLaps
 * class function
 */
public class Human extends Animal {
    /**
     * The Family.
     */
    String family = "mammal";

    /**
     * Instantiates a new Human.
     *
     * @param name the name
     */
    public Human(String name) {
        super(name);

    }

    /**
     * Instantiates a new Human.
     */
    public Human() {
        super();
    }

    /**
     * Gets family.
     *
     * @return the family
     */
    public String getFamily() {
        return "I am a "+family+". I am a Human.";
    }

    /**
     * Gets type.
     *
     * @return
     */
    @Override
    public String getType() {
        return super.getType()+getFamily();
    }
}
