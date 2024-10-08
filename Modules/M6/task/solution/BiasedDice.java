// REPOBEE-SANITIZER-SHRED 

import java.util.Random;

/**
 * A class representing a biased dice.
 */
public class BiasedDice extends Dice {

    /**
     * Create a new biased dice, and roll it. The resulting value can be retrieved with
     * the getValue method.
     * The dice has a 50% chance of rolling a 6, and is otherwise fair.
     */
    public BiasedDice() {
        random = new Random();
        value = random.nextInt(10) + 1;
        if (value > 5) {
            value = 6;
        }
    } 
}