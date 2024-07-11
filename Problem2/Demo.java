package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Creating an array of Shape objects with different shapes
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(7, 5),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        // Printing the details of each shape before scaling
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nScaling shapes by a factor of 2...\n");

        // Scaling all shapes in the array by a factor of 2
        scaleShapes(shapes, 2);

        // Printing the details of each shape after scaling
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // Method to scale all shapes in the given array by a specified factor
    public static void scaleShapes(Shape[] shapes, double factor) {
        // Iterate through each shape in the array
        for (Shape shape : shapes) {
            // Scale the shape by the given factor
            shape.scale(factor);
        }
    }
}