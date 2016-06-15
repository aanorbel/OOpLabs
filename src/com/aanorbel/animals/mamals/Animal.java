package com.aanorbel.animals.mamals;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals, project OOPLaps
 * class function
 */
public class Animal {
    /**
     * The Name.
     */
    private String name;
    /**
     * The Type.
     */
    private String type;
    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     */
    public Animal(String name) {
        this.name=name;
        this.type = "I am an Animal. I am animal called "+this.name+".";
    }

    /**
     * Instantiates a new Animal.
     */
    public Animal() {
        this.type = "I am an Animal";
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
}
