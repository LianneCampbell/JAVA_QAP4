package Problem1;

// The Triangle class extends the abstract Shape class
public class Triangle extends Shape {
    // Private instance variables for the three sides of the triangle
    private double side1, side2, side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        // Call the constructor of the superclass Shape with the name "Triangle"
        super("Triangle");

        // Check if the given sides form a valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            // If valid, initialize the instance variables with the given sides
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            // If not valid, throw an IllegalArgumentException with an appropriate message
            throw new IllegalArgumentException("Invalid sides for a triangle");
        }
    }

    // Override the getPerimeter method to compute the perimeter of the triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Override the getArea method to compute the area of the triangle
    @Override
    public double getArea() {
        // Use Heron's formula to calculate the area
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
