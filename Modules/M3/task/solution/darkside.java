public class darkside {
    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        // b - a is *not* acceptable, since subtraction is non-commutative
        return a - b;
    }

    public double average(double a, double b) {
        return (a + b) / 2;
    }
}