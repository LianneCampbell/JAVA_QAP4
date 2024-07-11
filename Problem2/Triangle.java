package Problem2;

// Triangle.java
public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }
    }

    private boolean isValidTriangle(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2;
    }

    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double computeArea() {
        double s = computePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}