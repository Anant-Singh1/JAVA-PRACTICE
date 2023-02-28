// Q1. We Need to create a Drawing Application.
// Shapes can be Circle, Square, Rectangle etc.
// And we have common features which will be in a parent class (Shape Class). Use Upcasting for Common Feature Access
// and Downcasting for Specific feature access, create Polymorphic method for common operations.
class Shape {
    int height;
    int width;

    Shape() {
        height = 0;
        width = 0;
    }

    Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void getArea() {
        System.out.println("The area of the Shape class");
    }

    void getPerimeter() {
        System.out.println("The perimeter of Shape class");
    }
}

class Circle extends Shape {
    int radius;

    Circle() {
        radius = 0;
    }

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        System.out.println("The area of circle is-:" + Math.PI * Math.pow(radius, 2));
    }

    @Override
    void getPerimeter() {
        System.out.println("The perimenter of circle is-:" + 2 * Math.PI * radius);
    }

}

class Square extends Shape {
    Square(int height) {
        super.height = height;
    }

    @Override
    void getArea() {
        System.out.println("The area of square-:" + Math.pow(super.height, 2));
    }

    @Override
    void getPerimeter() {
        System.out.println("The perimeter of perimeter-:" + 4 * super.height);
    }
}

class Rectangle extends Shape {
    Rectangle(int height, int width) {
        super.height = height;
        super.width = width;
    }

    @Override
    void getArea() {
        System.out.println("The area of rectangle-:" + super.height * super.width);
    }

    @Override
    void getPerimeter() {
        System.out.println("The perimeter of rectangle-:" + 2 * (super.height + super.width));
    }
}

class ShapeCaller {
    // Polymorphic Function.........
    void callShape(Shape sh) {
        // sh = new Shape(200, 200);
        sh.getArea();
        sh.getPerimeter();
        System.out.println();
        System.out.println("********************************");
        System.out.println();
    }

}

public class Draw {
    public static void main(String[] args) {
        // No dry principle
        // DRY Principle
        ShapeCaller sh = new ShapeCaller();
        // upcasting
        sh.callShape(new Circle(12));
        sh.callShape(new Square(5));
        sh.callShape(new Rectangle(20, 20));
    }
}
