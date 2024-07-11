package Problem1;

// Demo class to test the Shape hierarchy and print details of various shapes
public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects with different shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5); // Create a Circle with radius 5
        shapes[1] = new Ellipse(7, 5); // Create an Ellipse with major axis 7 and minor axis 5
        shapes[2] = new Triangle(3, 4, 5); // Create a Triangle with sides 3, 4, and 5
        shapes[3] = new EquilateralTriangle(6); // Create an EquilateralTriangle with side length 6

        // Loop through each shape in the array and print its details
        for (Shape shape : shapes) {
            System.out.println(shape); // Print the shape details using the overridden toString method
        }
    }
}