package com.aanorbel.animals.mamals;

import com.aanorbel.animals.Animal;

/**
 * Created by anorbel on 6/15/16.
 * package com.aanorbel.animals, project OOPLaps
 * class function
 */
public class Mammal extends Animal {
    /**
     * The Number ofamary gland.
     */
    private int numberOfamaryGland;

    /**
     * Instantiates a new Mammal.
     *
     * @param name               the name
     * @param numberOfamaryGland the number ofamary gland
     */
    public Mammal(String name,int numberOfamaryGland) {
        super(name);
        this.numberOfamaryGland = numberOfamaryGland;

    }

    /**
     * Instantiates a new Mammal.
     *
     * @param numberOfamaryGland the number ofamary gland
     */
    public Mammal(int numberOfamaryGland) {
        this.numberOfamaryGland = numberOfamaryGland;
    }

    @Override
    public String getType() {
        return super.getType()+". I am a mammal. I have "+numberOfamaryGland+" mammary Glands";
    }
}
