public class Rectangle {

    /**
     * A class to describe a rectangle with a length and width.
     */

    private double length, width;

    /**
     * A constructor for the class with no parameters. Sets the length to 4 and the width to 8.
     */

    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }

    /**
     * A constructor for the class with a length argument. Sets the length to some double and the width to 8.
     * 
     * @param length the length of the rectangle, as a double
     */

    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }

    /**
     * A constructor for the class that initializes it with both a length and width.
     * @param length the length of the rectangle, as a double
     * @param width the width of the rectangle, as a double
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets the length of the rectangle.
     * 
     * @return the length, as a double
     */

    public double getLength() {
        return this.length;
    }
    
    /**
     * Gets the width of the rectangle.
     * 
     * @return the width of the rectangle, as a double
     */

    public double getWidth() {
        return this.width;
    }

}