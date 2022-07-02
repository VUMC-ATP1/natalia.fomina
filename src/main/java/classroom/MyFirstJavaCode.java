package classroom;

public class MyFirstJavaCode {

    /*
    Access modifiers:
    public, private, protected, default
     */

    public static void main(String[] args) {
        System.out.println("Hello World! My name is: Natalia!");
        System.out.println("First argument is:" + args[0]);
        System.out.println("Second argument is:" + args[1]);
        // System.out.println("Third argument is:" + args[2]); // Invalid array range

        // String[] args = {"Hello", "World"};
        // String[] twoWords = {"Hello", "World"};

        // Primitive data type (numbers)

        byte floorCount = 7;
        byte[] floors = {1, 2, 3, 4, 5, 6, 7};
        // My house consists of 7 floors
        // Concatenation

        System.out.println("My house consists of " + floorCount + " floors!");
        // New line after println
        System.out.printf("My house consists of %d floors!", floorCount);
        // No new line
        System.out.printf("My house consists of %d floors!\n", floorCount);
        // New line

        // %s = for strings (text)
        // %d = for number

        short juniorTesterSalaryInEur = 1000;
        short salariesInIt[] = {1000, 2000, 3000};
        short emptySalaryArray[] = new short[4];
        emptySalaryArray[0] = 1000;
        emptySalaryArray[1] = 2000;
        emptySalaryArray[2] = 3000;
        emptySalaryArray[3] = 4000;
        // emptySalaryArray[4] = 5000; // Index 4 out of bounds
        System.out.println(emptySalaryArray[2]);


        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China population %d people\n", chinaPopulation);

        long currentWorldPopulation = 794609700;
        System.out.printf("Current world population: %d\n", currentWorldPopulation);

        // Floating numbers

        float myCurrentWeight = 70.6f;
        // f - float
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        /*
        Logical boolean
        prefix: is, has
        Example: isSummer, hasItems
        Values: true / false (default: false)
         */

        boolean isSummer = false;
        if(isSummer) {
            System.out.printf("Now it is summer! And boolean value is: %b\n", isSummer);
        } else {
            System.out.printf("No, it is not! And boolean value is: %b\n", isSummer);
        }

        // Primitive: Text
        char firstNameLetter = 'N';
        // '\u0000'
        System.out.println(firstNameLetter);

        // Non-Primitive String

        String myNameSurname = "Natalia Fomina";
        System.out.println(myNameSurname);

        // Arithmetic Operators

        System.out.println(7 + 7); // 14
        System.out.println("7 + 7"); // text
        System.out.println("7" + 7); // 77

        int a = 10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThanB = a > b; // true
        System.out.printf("Is a greater than b: %b", isAGreaterThanB);
    }
}
