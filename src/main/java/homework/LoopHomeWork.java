package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {

    public final int PIN_CODE = 123456; // Exercise 6

    public static void main(String[] args) {

        // Exercise 1:
        /*
        Uzrakstiet programmu, kas no lietotāja nolasa veselus skaitļus un apstājas,
        izvadot uz ekrānu tekstu “Gatavs”, kad šo vērtību summa pārsniedz 100.
        Ir nepieciešams izmantot while ciklu
         */
        System.out.println("Excercise 1:");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            sum = sum + number;
            //System.out.println("The sum is: " + sum);
        }
        while (sum < 100);
        System.out.println("Ready!");
        System.out.println("");

        // Exercise 2: Prime number
        /*
        Uzrakstīt programmu, kas nolasa veselu skaitli un izvada uz ekrāna,
        vai šis skaitlis ir pirmskaitlis vai nē.
        (Pirmskaitlis ir tāds naturāls skaitlis, kas lielāks par 1 un
         kam ir tikai divi dalītāji: 1 un pats skaitlis)
         */
        System.out.println("Exercise 2: Prime number ");
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        boolean isPrimeNumber = false;
        if (number <= 1)
            isPrimeNumber = false;
        for (int j = 2; j < number; ++j) {
            if (number % j == 0) {
                isPrimeNumber = true;
                break;
            }
        }
        if (!isPrimeNumber) {
            System.out.println(+ number + " is a prime number");
        } else {
            System.out.println(+ number + " is not a prime number");
        }
        System.out.println("");

        // Exercise 3:
        /*
        Definēt trīs masīvus ar datu tipiem: int, String, char un jāizvada uz ekrāna visas vērtības,
        izmantojot:
        a.	while;
        b.	do while;
        c.	for loop;
        d.	for each.
         */
        System.out.println("Exercise 3:");
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrayString = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        char[] arrayChar = {'J', 'u', 'l', 'y'};

        int index = 0;
        System.out.print("While loop: ");
        while (index < arrayInt.length) {
            int arrayNumber = arrayInt[index];
            System.out.print(arrayNumber + ", ");
            index++;
            }
        System.out.println("");

        index = 0;
        System.out.print("Do while loop: ");
        do {
            System.out.print(arrayString[index] + ", ");
            index++;
        } while (index < arrayString.length);
        System.out.println("");

        index = 0;
        System.out.print("For loop: ");
        for (index = 0; index < arrayChar.length; index++) {
            System.out.print(arrayChar[index]);
        }
        System.out.println("");

        System.out.print("For each loop: ");
        for(String planet : arrayString) {
            System.out.print(planet + ", ");
        }
        System.out.println("");
        System.out.println("");

        // Exercise 4:
        /*
        Definēt veselu skaitļu masīvu ar izmēru 100, un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem.
        Visas vērtības, kas ir iekšā masīva, ir nepieciešams izvest uz ekrāna vienā līnijā.
         */
        System.out.println("Exercise 4:");
        int[] arrayNumbers = new int[100];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i;
        }
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("");

        // Exercise 5:
        /*
        Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību.
        a.	Tā ir metode, kura kā parametru pieņem veselu skaitli.
        b.	Piemērs: Faktoriāls 4 = 4 * 3 * 2 * 1 = 24.
         */
        int factorial = 1;
        System.out.println("Exercise 5: Factorial");
        System.out.print("Enter the number: ");
        int numberForFactorial = scanner.nextInt();
        for (int i = 1; i <= numberForFactorial; i++) {
            factorial = factorial * i;
        }
        System.out.println(numberForFactorial + "! = " + factorial);
        System.out.println("");

        // Exercise 6:
        /*
        Izstrādāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu.
        Jāizveido int konstanti, kur tiks saglabāts PIN (public final int VARIABLE_NAME).
        Ja parole ir ievadīta pareizi, jāizvada uz ekrāna: “PIN ir pieņemts, laipni lūdzam atpakaļ”.
        Ja parole nav pareiza, jāizvada uz ekrāna: “Nepareizs PIN, mēģiniet vēlreiz.”.
        Kad mēģinājumi beigušies, uz ekrāna jāizvada: “Atvainojiet, bet jūs esat bloķēts”.
         */
        System.out.println("Exercise 6: PIN code");
        Scanner scannerForPinCode = new Scanner(System.in);
        int attempts = 1;
        int PIN_CODE = 123456;
        int enteredPinCode = 0;
        boolean isCorrectPin = false;
        System.out.println("The correct PIN code: " + PIN_CODE);
        System.out.print("Enter the PIN code: ");

        while (!isCorrectPin) {
            enteredPinCode = scannerForPinCode.nextInt();
            if (enteredPinCode == PIN_CODE) {
                System.out.println("PIN is accepted, welcome back.");
                isCorrectPin = true;
            }
            else if (attempts < 3) {
                attempts++;
                System.out.println("Incorrect PIN, try again.");
                System.out.print("Enter the PIN code: ");
                }
            else if (attempts >= 3) {
                System.out.println("Sorry, but you are blocked.");
                break;
            }
        }
    }
}