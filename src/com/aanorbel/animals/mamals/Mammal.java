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
     * @param numberOfMammaryGland the number of mammary gland
     */
    public Mammal(String name,int numberOfMammaryGland) {
        super(name);
        this.numberOfamaryGland = numberOfMammaryGland;

    }

    /**
     * Instantiates a new Mammal.
     *
     * @param numberOfMammaryGland the number of mammary gland
     */
    public Mammal(int numberOfMammaryGland) {
        this.numberOfamaryGland = numberOfMammaryGland;
    }

    @Override
    public String getType() {
        return super.getType()+". I am a mammal. I have "+numberOfamaryGland+" mammary Glands";
    }
}
