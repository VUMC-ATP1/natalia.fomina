package homework;

public class FirstClass {
    public static void main(String[] args) {

        String country = "Australia";
        int population = 25997700;
        int totalArea = 7617930;
        String capital = "Canberra";
        String nationalLanguage = "English";
        boolean isEuMember = false;
        char currency = '\u0024'; // $

        System.out.println("AUSTRALIA");
        System.out.println();
        System.out.printf("%s, ", country);
        System.out.printf("officially the Commonwealth of %s, is a country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.\n", country);
        System.out.printf("With an area of %d square kilometres ", totalArea);
        System.out.println(country + " is the largest country by area in Oceania and the world's sixth-largest country.");
        System.out.println();
        System.out.printf("The population of %s ", country);
        System.out.printf("is estimated to be %d as of 2022. ", population);
        System.out.println(country + " is the 55th most populous country in the world and the most populous Oceanian country.");
        System.out.println();
        System.out.printf("Although %s has no official language, ", country);
        System.out.println(nationalLanguage + " has always been entrenched as the de facto national language.");
        System.out.println();
        System.out.println(capital + " is the nation's capital.");
        System.out.println("The Australian dollar (" + currency + ") is the national currency. ");
        System.out.printf("%s is a member of the European Union:", country);
        if (isEuMember) {
            System.out.println(" " + isEuMember);
        } else {
            System.out.println(" " + isEuMember);
        }

        System.out.println();

        // Arithmetic operations
        // Initializing variables
        int numbersArray[] = {4, 2}, sum1 = 0, sub1 = 0, mult1 = 0, div1 = 0, mod1 = 0;
        double num2_1 = 5d, num2_2 = 2d, sum2 = 0, sub2 = 0, mult2 = 0, div2 = 0, mod2 = 0;
        float num3_1 = 1000f, num3_2 = 2.25f, sum3 = 0, sub3 = 0, mult3 = 0, div3 = 0, mod3 = 0;

        // Adding number 1 and number 2
        sum1 = numbersArray[0] + numbersArray[1];
        sum2 = num2_1 + num2_2;
        sum3 = num3_1 + num3_2;
        // Subtracting number 1 and number 2
        sub1 = numbersArray[0] - numbersArray[1];
        sub2 = num2_1 - num2_2;
        sub3 = num3_1 - num3_2;
        // Multiplying number 1 and number 2
        mult1 = numbersArray[0] * numbersArray[1];
        mult2 = num2_1 * num2_2;
        mult3 = num3_1 * num3_2;
        // Dividing number 1 and number 2
        div1 = numbersArray[0] / numbersArray[1];
        div2 = num2_1 / num2_2;
        div3 = num3_1 / num3_2;
        // Remaindering number 1 and number 2
        mod1 = numbersArray[0] % numbersArray[1];
        mod2 = num2_1 % num2_2;
        mod3 = num3_1 % num3_2;

        // Displaying operations
        System.out.println("ARITHMETIC OPERATIONS: ");
        System.out.println();

        System.out.println("Sum: ");
        System.out.println(numbersArray[0] + " + " + numbersArray[1] + " = " + sum1);
        System.out.println(num2_1 + " + " + num2_2 + " = " + sum2);
        System.out.println(num3_1 + " + " + num3_2 + " = " + sum3);
        System.out.println();

        System.out.println("Subtraction: ");
        System.out.println(numbersArray[0] + " - " + numbersArray[1] + " = " + sub1);
        System.out.println(num2_1 + " - " + num2_2 + " = " + sub2);
        System.out.println(num3_1 + " - " + num3_2 + " = " + sub3);
        System.out.println();

        System.out.println("Multiplication:");
        System.out.println(numbersArray[0] + " * " + numbersArray[1] + " = " + mult1);
        System.out.println(num2_1 + " * " + num2_2 + " = " + mult2);
        System.out.println(num3_1 + " * " + num3_2 + " = " + mult3);
        System.out.println();

        System.out.println("Division:");
        System.out.println(numbersArray[0] + " / " + numbersArray[1] + " = " + div1);
        System.out.println(num2_1 + " / " + num2_2 + " = " + div2);
        System.out.println(num3_1 + " / " + num3_2 + " = " + div3);
        System.out.println();

        System.out.println("Remainder:");
        System.out.println(numbersArray[0] + " % " + numbersArray[1] + " = " + mod1);
        System.out.println(num2_1 + " % " + num2_2 + " = " + mod2);
        System.out.println(num3_1 + " % " + num3_2 + " = " + mod3);
    }
}