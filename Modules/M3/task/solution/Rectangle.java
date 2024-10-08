// REPOBEE-SANITIZER-SHRED

/**
 * A class representing a rectangle with some common operations and properites.
 * Example solution for exercise 3.0
 */
public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Calculates the area of the rectangle
     * @return the area of the rectangle
     */
    public int area() {
        return width * height;
    }

    /**
    *  Get the diagonal length of the rectangle
    *  @return the diagonal length of the rectangle
    */
    public double diagonalLength() {
        return Math.sqrt(width * width + height * height);
    }

    /**
    *  Check wether this rectangle is a square
    *  @return true if the rectangle is a square, false otherwise
    */
    public boolean isSquare() {
        return width == height;
    }
}