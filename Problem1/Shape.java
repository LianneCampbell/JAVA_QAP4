package Problem1;

// Abstract class Shape
public abstract class Shape {
    // Protected instance variable to store the name of the shape
    protected String name;

    // Constructor to initialize the name of the shape
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to compute the perimeter of the shape
    // Must be implemented by subclasses
    public abstract double getPerimeter();

    // Abstract method to compute the area of the shape
    // Must be implemented by subclasses
    public abstract double getArea();

    // Overridden toString method to provide a string representation of the shape
    @Override
    public String toString() {
        return name + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}