// REPOBEE-SANITIZER-SHRED

/**
 * A simple class for showing the usefulness of loops
 *
 * @author Linus Östlund
 * @author Gabriel Skoglund
 */
public class Loops {

    /**
     * Print all multiples of seven between 0 and 100
     */
    public void multiplesOfSeven() {
        int multipleOfSeven = 0;
        while(multipleOfSeven < 100) {
            System.out.println(multipleOfSeven);
            multipleOfSeven += 7;
        }
    }

    /**
     * Sum integers between 0 and an upper bound
     * @param max the value to sum up to (inclusive)
     * @return the sum of all integers between 0 and the maximum
     */
    public int sumUpTo(int max) {
        if (max <= 0)
            return 0;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        return sum;
    }

    /**
     * Sum a range of integers
     * @param min the value to start the sum at (inclusive)
     * @param max the value to end the sum at (inclusive)
     * @return the sum of all integers in the range min-max
     */
    public int sumBetween(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sum all squares between 0 and a maximum
     * @param max the value to end the sum at (inclusive)
     * @return the sum of all squares between 0 and max
     */
    public int sumSquares(int max) {
        int sum = 0;
        for (int i = 0; i <= max; i++)
            sum += i * i;
        return sum;
    }

    /**
     * Sum reciprocals (1/n) for all integers n between 0 and a maximum
     * @param max the value to end the sum at (inclusive)
     * @return the sum of all reciprocals between 0 and max
     */
    public double sumReciprocals(int max) {
        double sum = 0;
        for (int i = 1; i <= max; i++)
            sum += 1.0 / i;
        return sum;
    }
}