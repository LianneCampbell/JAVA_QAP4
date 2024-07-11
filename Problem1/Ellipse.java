package Problem1;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
}