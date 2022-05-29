package homework;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        // Exercise 1: Conditions
        // a: vai x ir pozitīvs, iegūt rezultātu true
        // b: vai x ir negatīvs, iegūt rezultātu false
        // c: vai x ir lielāks par 5 un ir mazāks vai vienāds par 10, iegūt rezultātu true
        // d: vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10, iegūt rezultātu true
        // e: vai x ir vienāds 0 vai x ir vienāds 10, rezultāts false
        // f: vai x * x (reizinājums) ir lielāks par 10, rezultāts true

        System.out.println("Exercise 1:");
        int x = 1;
        System.out.printf("a. %d is positive: %b\n", x, x > 0);
        System.out.printf("b. %d is negative: %b\n", x, x < 0);
        x = 6;
        System.out.printf("c. %d is greater than 5 and equal or less than 10: %b\n", x, (x > 5 && x <= 10));
        System.out.printf("d. %d is not less or equal than 5 and is less than 10: %b\n", x, !(x <= 5) && x < 10);
        System.out.printf("e. %d is equal to 0 or equal to 10: %b\n", x, (x == 0 || x == 10));
        System.out.printf("f. %d^2 is greater than 10: %b\n", x, (x * x) > 10);
        System.out.println();

        // Exercise 2: The number of month converts to month name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 2:");
        System.out.println("Enter the number of month:");
        int numberOfMonth = scanner.nextInt();
        switch (numberOfMonth) {
            case 1:
                System.out.printf("%d is January\n", numberOfMonth);
                break;
            case 2:
                System.out.printf("%d is February\n", numberOfMonth);
                break;
            case 3:
                System.out.printf("%d is March\n", numberOfMonth);
                break;
            case 4:
                System.out.printf("%d is April\n", numberOfMonth);
                break;
            case 5:
                System.out.printf("%d is May\n", numberOfMonth);
                break;
            case 6:
                System.out.printf("%d is June\n", numberOfMonth);
                break;
            case 7:
                System.out.printf("%d is July\n", numberOfMonth);
                break;
            case 8:
                System.out.printf("%d is August\n", numberOfMonth);
                break;
            case 9:
                System.out.printf("%d is September\n", numberOfMonth);
                break;
            case 10:
                System.out.printf("%d is October\n", numberOfMonth);
                break;
            case 11:
                System.out.printf("%d is November\n", numberOfMonth);
                break;
            case 12:
                System.out.printf("%d is December\n", numberOfMonth);
                break;
            default:
                System.out.println("Incorrect input value. The number of month can be from 1 to 12");
        }
        System.out.println();

        // Exercise 3: The max number out of three input numbers
        System.out.println("Exercise 3:");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        System.out.println("The max number is: " + Math.max(Math.max(a, b), c));
        System.out.println();

        // Exercise 4: Traffic lights
        Scanner scannerColor = new Scanner(System.in);
        System.out.println("Exercise 4:");
        System.out.println("Enter the color of traffic lights (green, yellow or red):");
        String color = scannerColor.nextLine();

        if (color.equals("green")) {
            System.out.println("Start or keep driving!");
        } else if (color.equals("yellow")) {
            System.out.println("Stop when it is safe to, because the light is about to turn red!");
        } else if (color.equals("red")) {
            System.out.println("Stop driving!");
        } else {
            System.out.println("Incorrect traffic light");
        }
        System.out.println();

        // Exercise 5: Business card
        System.out.println("Exercise 5:");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        System.out.println();

        // Exercise 6: Business card 2
        System.out.println("Exercise 6:");
        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);
        System.out.println();

        // Exercise 7: Sum
        System.out.println("Exercise 7:");
        int summa = sum(10,20);
        System.out.println("10 + 20 = " + summa);
        System.out.println();

        // Exercise 8: Average
        System.out.println("Exercise 8:");
        System.out.println(average(10,2,4));
    }

    // Exercise 5: Business card (method)
    public static void printBusinessCard() {
        System.out.println("Business card");
        System.out.println("#############");
        System.out.println("Name: Jānis");
        System.out.println("Surname: Bērziņš");
        System.out.println("Telephone number: +371 12345678");
        System.out.println("Year of birth: 1990");
        System.out.println("#############");
    }

    // Exercise 6; Business card 2 (method)
    public static void printBusinessCardTwo(String name, String surname, String telephone, int yearOfBirth) {
        System.out.println("Business card");
        System.out.println("#############");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Surname: %s\n", surname);
        System.out.printf("Telephone number: %s\n", telephone);
        System.out.printf("Year of birth: %d\n", yearOfBirth);
        System.out.println("#############");
    }

    // Exercise 7: Sum (method)
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    // Exercise 8: Average (method)
    public static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3)/3;
    }
}