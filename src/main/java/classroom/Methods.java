package classroom;

public class Methods {
    public static void main(String[] args) {
        String myName = "Natalia";
        int age = 37;
        printNameAndAge(myName, age);

        printNameAndAge("Nikita", 27);

        /*//Variant 1, Exercise 1
        checkAge(22);
        //Variant 2
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();*/

        sumOfNumbers(10, 30, 40); // Exercise 2, atgriež ciparu, neko neizvada
        System.out.println(sumOfNumbers(10, 30, 40)); // izvada rezultātu
        int summa = sumOfNumbers(10,20,30); // mainīgajā summa saglabāts rezultāts

        printNameAndAge("Natalia", 16);

        //System.out.printf("Is adult? Answer: %b\n", isAdult(20)); // Exercise 3
    }

    public static void printNameAndAge(String name, int age) {
        System.out.printf("Your name is %s. Your age is %d\n", name, age);
    }

    public static void printHello(String name, int age) {
        System.out.println("Hello! %s (%d)");
    }

    // Exercise 1: jāizveido metode checkAge, metode neko neatgriež (void)
    // int age
    // if age < 0 - Are you alive?
    // if age >= 16 - Pagaidi, Hektoru varēsi pavisam drīz!
    // age = 17 - pieņemu, ka tev aug bārda
    //age >= 18 - skrien uz veikalu!
    public static void checkAge(int age) {
        if (age < 0) {
            System.out.printf("Are you alive?");
        } else if (age >= 14 && age <= 16) {
            System.out.printf("Wait!");
        } else if (age == 17) {
            System.out.printf("Aug barda");
        } else if (age >= 18) {
            System.out.printf("Go!");
        } else if (age == 0) {
            System.out.printf("Incorrect age");
        }
    }

    // Exercise 2: metode atgriež resultātu (divu skaitļu summu)
        public static int sumOfNumbers(int x, int y, int z) {
            return x + y + z;
        }

    /*// Exercise 3
        public static boolean isAdult(int age) {
        boolean isAdult = false;
        if(age > 18) {
            return isAdult = true;
        }
        return isAdult;

        // Vienā rindā
            // public static boolean isAdult(int age) {
            //        return = age >= 18;
            //}*/

    //Exercise 4; metodes kalkulatoram
            public static int sum(int number1, int number2) {
                return number1 + number2;
            }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static int calculator(int number1, String operator, int number2) {
        switch (operator) {
            case "+":
                return sum(number1, number2);
            case "-":
                return subtract(number1, number2);
            case "*":
                return multiplication(number1, number2);
            case "/":
                return division(number1, number2);
            default:
                return 0;
        }
    }
}





