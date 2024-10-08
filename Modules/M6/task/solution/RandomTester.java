// REPOBEE-SANITIZER-SHRED 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RandomTester {
    
    /**
     * Generate n random numbers.
     * @param n the number of random numbers to generate.
     * @return an ArrayList of n random numbers.
     */
    public static ArrayList<Integer> generateNumbers(int n) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    /**
     * Return a shuffled copy of a list, without modifying the original list.
     * @param list the list to shuffle.
     * @return a shuffled copy of the list.
     */
    public static ArrayList<Integer> shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> copy = new ArrayList<Integer>(list);
        ArrayList<Integer> shuffled = new ArrayList<Integer>();
        Random random = new Random();
        while (copy.size() > 0) {
            int index = random.nextInt(copy.size());
            shuffled.add(copy.remove(index));
        }
        return shuffled;
    }

    /**
     * Generate an ArrayList of n dice.
     * @param n the number of dice to generate.
     * @return an ArrayList of n dice.
     */
    public static ArrayList<Dice> sequenceOfDice(int n) {
        ArrayList<Dice> dice = new ArrayList<Dice>();
        for (int i = 0; i < n; i++) {
            dice.add(new Dice());
        }
        return dice;
    }

    /**
     * Return the sum of the two highest adjacent rolls in a list of dice.
     * @param sequence
     * @return the sum of the two highest adjacent rolls in a list of dice.
     */
    public static int highestAdjacentRolls(ArrayList<Dice> sequence) {
        int res = 0;
        for (int i = 0; i < sequence.size() - 1; i++) {
            if (sequence.get(i).getValue() + sequence.get(i + 1).getValue() > res) {
                res = sequence.get(i).getValue() + sequence.get(i + 1).getValue();
            }
        }
        return res;
    }

    /**
     * Return the sum of the two smallest adjacent rolls in a list of dice.
     * @param sequence the list of dice.
     * @return the sum of the two smallest adjacent rolls in a list of dice.
     */
    public static int smallestAdjacentRolls(ArrayList<Dice> sequence) {
        if (sequence.size() < 0) {
            return 0;
        }
        int res = sequence.get(0).getValue() + sequence.get(1).getValue();

        for (int i = 2; i < sequence.size() - 1; i++) {
            if (sequence.get(i).getValue() + sequence.get(i + 1).getValue() < res) {
                res = sequence.get(i).getValue() + sequence.get(i + 1).getValue();
            }
        }
        return res;
    }

    /**
     * Create a copy of a sequence of dice, with all occurences of a given value removed.
     * @param sequence the sequence of dice to copy.
     * @param n the value to remove.
     * @return a copy of the sequence of dice, with all occurences of a given value removed.
     */
    public static ArrayList<Dice> remove(ArrayList<Dice> sequence, int n) {
        ArrayList<Dice> res = new ArrayList<Dice>(sequence);
        Iterator<Dice> it = res.iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == n) {
                it.remove();
            }
        }
        return res;
    }
}