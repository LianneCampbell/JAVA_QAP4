package Problem2;

// Triangle class extending Shape and implementing Scalable interface
public class Triangle extends Shape {
    // Instance variables for the sides of the triangle
    protected double side1, side2, side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        // Check if the given sides can form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }
    }

    // Private method to check if sides can form a triangle
    private boolean isValidTriangle(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2;
    }

    // Method to compute the perimeter of the triangle
    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    // Method to compute the area of the triangle using Heron's formula
    @Override
    public double computeArea() {
        double s = computePerimeter() / 2; // Semi-perimeter of the triangle
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    // Method to scale the triangle by a factor
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}