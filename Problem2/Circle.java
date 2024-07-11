package Problem2;

// Circle class extends the abstract Shape class and implements Scalable interface
public class Circle extends Shape {
    // Instance variable for the radius of the circle
    private double radius;

    // Constructor to initialize the Circle with a specified radius
    public Circle(double radius) {
        // Call to the superclass (Shape) constructor to set the shape's name
        super("Circle");
        // Set the radius of the circle
        this.radius = radius;
    }

    // Override the computePerimeter method to calculate the perimeter of the circle
    @Override
    public double computePerimeter() {
        // Perimeter (Circumference) of a circle = 2 * π * radius
        return 2 * Math.PI * radius;
    }

    // Override the computeArea method to calculate the area of the circle
    @Override
    public double computeArea() {
        // Area of a circle = π * radius^2
        return Math.PI * radius * radius;
    }

    // Override the scale method to scale the radius of the circle
    @Override
    public void scale(double factor) {
        // Multiply the radius by the scaling factor
        radius *= factor;
    }
}