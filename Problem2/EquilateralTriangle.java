package Problem2;

// EquilateralTriangle class, which extends the Triangle class
public class EquilateralTriangle extends Triangle {

    // Constructor to create an equilateral triangle with equal sides
    public EquilateralTriangle(double side) {
        // Call the constructor of the superclass (Triangle) with equal sides
        super(side, side, side);
        // Set the name of the shape
        this.name = "EquilateralTriangle";
    }

    // Override the scale method to scale all sides by a given factor
    @Override
    public void scale(double factor) {
        // Scale all three sides of the triangle by the given factor
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}