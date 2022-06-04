package classroom;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;
        //String value;
        //value = scanner.nextLine();
        //System.out.println("Your name is: " + value);
        // + - / *
        char operator;
        System.out.println("Enter first number!");
        a = scanner.nextInt();
        System.out.println("Enter operator!");
        operator = scanner.next().charAt(0);
        System.out.println("Enter second number!");
        b = scanner.nextInt();

        if(operator == '+') {
            System.out.println("Result:" + (a + b));
        } else if(operator == '-') {
            System.out.println("Result:" + (a - b));
        } else if(operator == '*') {
            System.out.println("Result:" + (a * b));
        } else if(operator == '/') {
            System.out.println("Result:" + (a / b));
        } else {
            System.out.println("Unknown operator!");
        }
    }
}
