package Problem2;

// Shape class, which is abstract and implements Scalable interface
public abstract class Shape implements Scalable {
    // Instance variable to store the name of the shape
    protected String name;

    // Constructor to initialize the name of the shape
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to compute perimeter and area, to be implemented by
    // subclasses
    public abstract double computePerimeter();

    public abstract double computeArea();

    // Override toString method to provide a string representation of the shape
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}