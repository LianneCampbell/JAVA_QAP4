package Problem1;

// EquilateralTriangle class extends the Triangle class
public class EquilateralTriangle extends Triangle {

    // Constructor for EquilateralTriangle
    public EquilateralTriangle(double side) {
        super(side, side, side); // Call to the superclass constructor with all three sides equal
        this.name = "EquilateralTriangle"; // Set the name to "EquilateralTriangle"
    }
}