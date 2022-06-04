package classroom;

import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        // do
        // Exercise: print 0 - 4
        System.out.println("Start");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // i = i + 1;
        }
        System.out.println("End");

        i = 10;
        while (i > 0) {
            System.out.print(i);
            i--;
        }
        System.out.println("");

        // Exercise

        int[] array = {2, 4, 6, 10, 15};
        i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            i++;
        }
        System.out.println("");

        // Exercise: print even numbers from 0 to 10
        i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("");

        // Exercise: do while loop
        int num = 0;
        do {
            System.out.printf(num + ", ");
            num++;
        } while (num < 10);
        System.out.println("");

        // Exercise: print odd numbers from 0 to 10
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.printf(num + ", ");
            }
            num++;
        } while (num < 10);
        System.out.println("");
        System.out.println("");

        // Exercise
        System.out.println("Countries");
        String[] countries = new String[] {"LV", "USA", "UK", "CZ", "PL"};
        // if country = lv, print Latvia
        // if country = cz, print Checz
        // all other countries just print
        // do while
        num = 0;
        do {
            if (countries[num].equals("LV")) {
                System.out.println("Latvia");
            } else if (countries[num].equals("CZ")) {
                System.out.println("Chech");
            } else {
                System.out.println(countries[num]);
            }
            num++;
        } while (num < countries.length);
        System.out.println("");
        System.out.println("");

        // For loop
        for (int j = 0; j < countries.length; j++) {
            if(j == countries.length - 1) {
                System.out.print(countries[j]);
            } else {
                System.out.print(countries[j] + ", ");
            }

        }
        System.out.println("");

        // Print numbers using for loop 0 to 100
        for (int j = 0; j <= 100 ; j++) {
            if(j == 100) {
                System.out.print(j);
            } else {
                System.out.print(j + ", ");
            }
        }
        System.out.println("");

        // Create int[] array from 0 to 100
        // Print only even numbers
        int[] numbers = new int[100];
        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = k;
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j <= numbers.length; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
        }
        System.out.println("");
        System.out.println("");

        // For each loop
        for(String country : countries) {
            if(country.equals("LV")) {
                System.out.println(country);
            } else {
                System.out.println(country);
            }
        }
        System.out.println("");

        // !!! Create int[] with 0 to 100 (99)
        // Print all numbers with for each
        int[] numb = new int[100];
        for (int k = 0; k < numb.length; k++) {
            numb[k] = k;
        }
        for(int n : numb) {
            System.out.print(n + ", ");
        }
        System.out.println("");

        // Mājas numuri no 1 līdz 50
        // Pircējs nevelās māju ar numuru, kas dalās ar 3 vai 5
        // Cik māju atbilst prasībām?
        int houseCount = 0;
        for (int l = 0; l <= 50; l++) {
            if(l % 3 == 0 || l % 5 == 0) {
                System.out.println( "Don't meet the requirements: " + l);
            } else {
                System.out.println( "Meet the requirements: " + l);
                houseCount++;
            }
        }
        System.out.print("Meet the requirements: " + houseCount);
        System.out.println("");

        // Exercise: count how many i are in the sentence
        // sentence.char.At(2)
        String sentence = "Hello, my name is Nikita";
        int iCount = 0;
        for (int j = 0; j < sentence.length(); j++) {
            if(sentence.charAt(j) == 'i') {
                iCount++;
            }
        }
        System.out.println( "'I' count is: " + iCount);
        System.out.println("");
        System.out.println("");

        // Break and continue
        String[] countries1 = new String[] {"LV", "USA", "UK", "CZ", "PL", "RO", "LV", "UK", "PL", "RO"};
        for(String country1 : countries1) {
            if(country1.equals("RO")) {
                System.out.println("I found 'RO'. Stop!");
                break;
            }
        }

        // For loop 1 to 10
        // If value of i is between 4 and 9 continue
        for (int j = 0; j <= 10 ; j++) {
            if(j > 4 && j < 9) {
                continue;
            }
            System.out.print(j + ", ");
        }
    }
}
