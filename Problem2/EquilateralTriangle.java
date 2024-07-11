package Problem2;

// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "EquilateralTriangle";
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}