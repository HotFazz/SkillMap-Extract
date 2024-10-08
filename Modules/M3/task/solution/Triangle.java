// REPOBEE-SANITIZER-SHRED

/**
 * A class representing a triangle with some common operations.
 * Example solution for exercises 3.1 - 3.3
 */
public class Triangle {
    // The side lengths of the triangles
    int a, b, c;

    /**
     * Construct a triangle with side lengths a, b, and c
     * @param a length of a side
     * @param b length of a side
     * @param c length of a side
     */
    public Triangle(int a, int b, int c) {
        if (validTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            // this end the program with an error
            throw new IllegalArgumentException();
        }
    }

    /**
     * Decides whether the side lenghts a, b, and c can form a valid triangle,
     * by checking if the conform to the triangle inequality.
     * @param a a side length of the triangle
     * @param b a side length of the triangle
     * @param c a side length of the triangle
     * @return true if the sides can form a valid triangle
     */
    private boolean validTriangle(int a, int b, int c) {
        if (a > (b+c)) {
            return false;
        } else if (b > (a+c)) {
            return false;
        } else if (c > (a+b)) {
            return false;
        } else {
            return true;
        }
        // or you can put this in a neat one-liner
        //return a < b + c && b < a + c && c < a + b;
    }

    /**
     * Returns a string giving the type of the triangle. A triangle can be
     * either "Equilateral", "Isosceles", or  "Scalene".
     * @return the type of the triangle.
     */
    String getTriangleType() {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    /**
     * Use Heron's formula to calculate the area.
     * @return the area of the triangle object
     */
    double getArea() {
        double s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    } 
}