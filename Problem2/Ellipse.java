package Problem2;

// Ellipse.java
public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}