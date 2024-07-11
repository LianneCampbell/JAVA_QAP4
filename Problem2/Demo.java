package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(7, 5),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nScaling shapes by a factor of 2...\n");

        scaleShapes(shapes, 2);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            shape.scale(factor);
        }
    }
}