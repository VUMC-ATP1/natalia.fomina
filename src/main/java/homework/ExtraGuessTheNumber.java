package homework;

import java.util.Random;
import java.util.Scanner;

public class ExtraGuessTheNumber {
    public static void main(String[] args) {
        /*
        Uzrakstīt JAVA programmu, kas uzģenerē random skaitli no 0-50.
        Likt lietotājam minēt šo skaitli ievadot savu variantu, kamēr skaitlis netiks
        uzminēts vai netiks sasniegtas 10 minējumu reizes.
        Ja lietotāja skaitlis nav pareizs, izvadīt informāciju vai ievadītais skaitlis
        bija zemāks vai augstāks par uzģenerēto skaitli.
        Ja lietotājs atmin skaitli, izvadīt uz ekrāna, ka cilvēks atminēja skaitli,
        izvadīt pašu skaitli un minējumu skaitu.
        Ja skaitlis netiek uzminēts 10 reizēs, izvadīt uz ekrāna, ka lietotājs ir
        zaudējis.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 10;
        int guess, i;
        // Generates random integers 0 to 50
        int x = random.nextInt(51);
        System.out.println("Generated random number: " + x);
        System.out.println("Guess the number in 10 attempts.");

        for (i = 0; i < attempts; i++) {
            System.out.print("Enter your number between 1 and 50: ");
            guess = scanner.nextInt();
            if (x == guess) {
                System.out.println("You guessed the number!");
                System.out.println("Generated number: " + x);
                System.out.println("Your number: " + guess);
                break;
            }
            else if (x > guess && i != attempts - 1) {
                System.out.println("Your number " + guess + " is less than generated.");
            }
            else if (x < guess && i != attempts - 1) {
                System.out.println("Your number " + guess + " is greater than generated.");
            }
        }
        if (i == attempts) {
            System.out.println("You loose! It was your last attempt.");
        }
    }
}