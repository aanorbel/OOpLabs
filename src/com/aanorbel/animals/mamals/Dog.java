package com.aanorbel.animals.mamals;

import com.aanorbel.animals.Animal;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals.mamals, project OOPLaps
 * class function
 */
public class Dog extends Animal {
    /**
     * The Family.
     */
    private String family = "mammal";

    /**
     * Instantiates a new Dog.
     *
     * @param name the name
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Gets family.
     *
     * @return the family
     */
    private String getFamily() {
        return "I am a "+family+". I am a Dog.";
    }

    /**
     * Gets type.
     *
     * @return
     * string representation of the type.
     */
    @Override
    public String getType() {
        return super.getType()+getFamily();
    }
}
