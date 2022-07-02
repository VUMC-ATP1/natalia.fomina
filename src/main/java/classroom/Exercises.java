package classroom;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        // Exersise 1
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number!");
        int number = scanner.nextInt();
        if(number > 0) {
            System.out.println("Number" + number + " is greater then 0");
        } else {
            System.out.println("Number" + number + " is not greater then 0");
        }*/

        // Exercise 2
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number 1:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number 2:");
        double number2 = scanner.nextDouble();
        System.out.println("Enter number 3:");
        double number3 = scanner.nextDouble();
        System.out.println("Average is:" + (number1 + number2 + number3)/3);*/

        // Exercise 3
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3:");
        int number3 = scanner.nextInt();
        // Variant 1
        int minNumber = Math.min(Math.min(number1, number2), number3);
        System.out.println("Min is: " + minNumber);
        //Variant 2
        if(number1 < number2 && number1 < number3) {
            System.out.println("Min is: " + number1);
        } else if (number2 < number3) {
            System.out.println("Min is: " + number2);
        } else {
            System.out.println("Min is: " + number3);
        }*/

        // Exercise 4
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        if(number % 2 == 0) {
            System.out.println(number + " is even number!");
        } else {
            System.out.println(number + " is not even number!");
        }*/

        // Exercise 5
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 3, 4, 5:
                System.out.println("This is working day");
                break;
            case 6, 7:
                System.out.println("This is holiday");
                break;
            default:
                System.out.println("Incorrect day of the week");
        }*/

        // Exercise 6
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter month:");
        String month = scanner.nextLine().toLowerCase();
        switch (month) {
            case "january":
                System.out.println("January is the %d month" + month);
                break;
            default:
                System.out.println("Cannot recognize month" + month);
        }*/

        //Exercise 7
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number 1:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter operator:");
        String operator = scanner.next();
        System.out.println("Enter number 2:");
        double number2 = scanner.nextDouble();
        switch (operator) {
            case "+":
                System.out.println("Sum is: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Subtract is: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication is: " + (number1 * number2));
                break;
            case "/":
                System.out.println("Division is: " + (number1 / number2));
                break;
            default:
                System.out.println("Incorrect operator");
        }*/

    }
}
