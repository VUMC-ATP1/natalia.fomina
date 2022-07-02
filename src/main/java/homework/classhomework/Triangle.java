package homework.classHomework;

// Exercise 1
public class Triangle {
    double a, b, c, areaOfTriangle;

    // Non-argument constructor
    public Triangle() {
        System.out.println("Triangle is created");
    }

    // Parametrized constructor
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.areaOfTriangle = Math.sqrt((a + b + c)/2 * (((a + b + c)/2)-a) * (((a + b + c)/2)-b) * (((a + b + c)/2)-c));
    }

    // The triangle is equilateral only if a = b = c
    public boolean isEquilateralTriangle() {
        return (a == b && b == c);
    }

    // The triangle is isosceles if either a = b or a = c or b = c
    public boolean isIsoscelesTriangle() {
        return (a == b || a == c || b == c);
    }
}