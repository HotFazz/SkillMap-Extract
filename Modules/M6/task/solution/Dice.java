// REPOBEE-SANITIZER-SHRED 

import java.util.Random;

/**
 * A class that represents a dice.
 */
public class Dice {
    int value;
    Random random;

    /**
     * Create a new dice, and roll it. The resulting value can be retrieved with
     * the getValue method.
     */
    public Dice() {
        random = new Random();
        value = random.nextInt(6) + 1;
    }

    /**
     * Gets the value of the dice.
     * @return the value of the dice.
     */
    public int getValue() {
        return value;
    }

    /**
     * A string representation of the dice.
     */
    public String toString() {
        return Integer.toString(value);
    }
}