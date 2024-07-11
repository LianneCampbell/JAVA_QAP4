package Problem1;

// Circle class extends Shape and represents a circle with a given radius
public class Circle extends Shape {
    // Instance variable for the radius of the circle
    private double radius;

    // Constructor that initializes the radius and sets the name of the shape to
    // "Circle"
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Overridden method to calculate the perimeter (circumference) of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overridden method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}