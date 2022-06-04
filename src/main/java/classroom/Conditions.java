package classroom;

public class Conditions {
    public static void main(String[] args) {

        if (20 > 18) {
            System.out.println("Yes, 20 > 18");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }
        System.out.println("Thank you!");

        int currentTime = 10;
        if (currentTime <= 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("You can't vote!");
        }

        int max;
        int a = 10;
        int b = 20;
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        max = (a > b) ? a : b;
        System.out.println(max);
        System.out.println(Math.max(a, b));

        int number = 5;
        if(number <= 0) {
            System.out.println("Number is less or equals then 0");
        } else if (number > 3) {
            System.out.println("Number is grater then 3");
        } else {
            System.out.println("...");
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Saturday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Thursday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect day of the week");
        }
    }
}
