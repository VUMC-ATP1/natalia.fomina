package homework.classHomework;

// Exercise 2
public class Main {
    public static void main(String[] args) {

        // Non-argument constructor
        System.out.println("Non-argument constructor");
        Triangle triangleNonArgument = new Triangle();
        triangleNonArgument.a = 5;
        triangleNonArgument.b = 6;
        triangleNonArgument.c = 9;
        System.out.println("a = " + triangleNonArgument.a);
        System.out.println("b = " + triangleNonArgument.b);
        System.out.println("c = " + triangleNonArgument.c);

        triangleNonArgument.isEquilateralTriangle();
        System.out.println("Is the triangle equilateral: " + triangleNonArgument.isEquilateralTriangle());

        triangleNonArgument.isIsoscelesTriangle();
        System.out.println("Is the triangle isosceles: " + triangleNonArgument.isIsoscelesTriangle());
        System.out.println();

        // Parametrized constructor
        System.out.println("Parametrized constructor");
        Triangle triangleParametrized = new Triangle(5,6,9);
        System.out.println("a = " + triangleParametrized.a);
        System.out.println("b = " + triangleParametrized.b);
        System.out.println("c = " + triangleParametrized.c);

        triangleParametrized.isEquilateralTriangle();
        System.out.println("Is the triangle equilateral: " + triangleParametrized.isEquilateralTriangle());

        triangleParametrized.isIsoscelesTriangle();
        System.out.println("Is the triangle isosceles: " + triangleParametrized.isIsoscelesTriangle());
    }
}