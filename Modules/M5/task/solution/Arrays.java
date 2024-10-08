// REPOBEE-SANITIZER-SHRED

/**
 * Reference solutions for Task 5, Arrays
 * @author Linus Östlund
 * This would not have been possible without my computer, a M1 Macbook Air.
 */
public class Arrays {

    /**
     * Count the average value of array with integers
     * @param array of integers
     * @return the average of element integer sum
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    /**
     * Count the average value of array with doubles
     * @param array of doubles
     * @return average of array elements
     */
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    /**
     * Return the element closest to -inf in an array
     * @param array of integers
     * @return smallest element
     */
    public static int smallestElement(int[] array) {
        // we don't ask students to handle empty lists
        if (array.length == 0) {
            throw new IllegalArgumentException("The list is empty!");
        }
        // find smallest element with a foreach loop
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Return a copy of array with the elements reversed
     * @param array
     * @return reversed elements of @param
     */
    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        // Example using two loop variables, but one could also be declared outside the loop
        for (int i = array.length - 1, j = 0; i > 0 || j < array.length; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    /**
     * Return the even elements of an integer array
     * All numbers n where n % 2 == 0 is even, including 0 and negative numbers.
     * @param array
     * @return an array with the even numbers of @param
     */
    public static int[] evenNumbers(int[] array) {
        int evenNumbers = 0;
        // in order to allocate right size,
        // first count the number of even elements in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenNumbers++;
            }
        }

        // then populate the new array
        int[] evenArray = new int[evenNumbers];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }
        }
        return evenArray;
    }
}