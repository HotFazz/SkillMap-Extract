// REPOBEE-SANITIZER-SHRED

import java.util.ArrayList;

public class SetTheory {

    // The maximum threshold
    private static final int MAX = 100;

    /**
     * Generate an ArrayList between min and max
     * @param min lower bound, inclusive
     * @param max upper bound, non-inclusive
     * @return an ArrayList with all integers in [min, max - 1]
     */
    public static ArrayList<Integer> generateSet(int min, int max) {
        ArrayList<Integer> set = new ArrayList<>();
        if (min >= max) {
            // return empty list
            return set;
        } else {
            // Ternary operator to see if max > 100
            for (int i = Math.max(min, 0); i < Math.min(max, MAX); i++) {
                set.add(i);
            }
            return set;
        }
    }

    /**
     * Return an ArrayList with the unique elements of a and b combined
     * @param a ArrayList A
     * @param b ArrayList B
     * @return the union of A and B
     */
    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        // make a copy of 'a' by feeding it into the ArrayList constructor
        ArrayList<Integer> union = new ArrayList<>(a);
        for (Integer i : b) {
            if (!union.contains(i)) {
                union.add(i);
            }
        }
        return union;
    }

    /**
     * Return the intersection of two ArrayList
     * @param a ArrayList A
     * @param b ArrayList B
     * @return the intersection of A and B
     */
    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * Return the complement of an ArrayList
     * @param a
     * @return the complement of set
     */
    public static ArrayList<Integer> complement(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < MAX; i++)
            if (!a.contains(i))
                res.add(i);
        return res;
    }

    /**
     * Return the cardinality of an ArrayList
     * @param a
     * @return set.size() :-)
     */
    public static int cardinality(ArrayList<Integer> a) {
        return a.size();
    }

    /**
     * Return the cardinality of the union of two sets
     * @param a
     * @param b
     * @return |A| + |B| - |A∩B|
     */
    public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        return cardinality(union(a, b));
    }
}