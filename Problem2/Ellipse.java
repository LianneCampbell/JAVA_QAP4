package Problem2;

// Ellipse class, which extends the Shape abstract class and implements Scalable interface
public class Ellipse extends Shape {
    // Instance variables for the major and minor axes
    private double a, b;

    // Constructor to initialize the ellipse with two axes
    public Ellipse(double axis1, double axis2) {
        // Call the constructor of the superclass (Shape) with the name "Ellipse"
        super("Ellipse");
        // Ensure that 'a' is the larger axis and 'b' is the smaller axis
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    // Override the method to compute the perimeter of the ellipse
    @Override
    public double computePerimeter() {
        // Approximation formula for the perimeter of an ellipse
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // Override the method to compute the area of the ellipse
    @Override
    public double computeArea() {
        // Formula for the area of an ellipse
        return Math.PI * a * b;
    }

    // Override the method to scale the ellipse by a given factor
    @Override
    public void scale(double factor) {
        // Scale both the major and minor axes by the given factor
        a *= factor;
        b *= factor;
    }
}