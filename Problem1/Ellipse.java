package Problem1;

// Ellipse class extends the abstract Shape class
public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor for Ellipse, assigns the largest value to 'a' and smallest to 'b'
    public Ellipse(double a, double b) {
        super("Ellipse"); // Call to the superclass constructor with the name "Ellipse"
        if (a < b) {
            this.a = b; // If the first parameter is smaller, assign it to 'b'
            this.b = a; // and the second parameter to 'a'
        } else {
            this.a = a; // Otherwise, assign the first parameter to 'a'
            this.b = b; // and the second parameter to 'b'
        }
    }

    // Override the getPerimeter method to calculate the perimeter of the ellipse
    @Override
    public double getPerimeter() {
        // Approximation of the perimeter of an ellipse using Ramanujan's second
        // approximation
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // Override the getArea method to calculate the area of the ellipse
    @Override
    public double getArea() {
        // Area of an ellipse: π * a * b
        return Math.PI * a * b;
    }
}