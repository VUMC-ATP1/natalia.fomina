package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        // Program generates number from 1 to 10
        // User enters value from 1 to 10
        // If value is not in range, write error and start again
        // If value is in range and is not the same as generated, stop the program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = (random.nextInt(9) + 1);
        System.out.println("Random number is: " + randomNumber);

        boolean isGuessed = false;

        do {
            System.out.println("Enter the number from 1 to 10:");
            int number = scanner.nextInt();
            if (number < 1 || number > 10) {
                isGuessed = false;
                System.out.println("Number is out of the range, try again!");
            } else if (number > 1 && number < 10 && number != randomNumber) {
                System.out.println("Number is not the same as generated, stop!");
                break;
            } else if (number == randomNumber) {
                System.out.println("Number is the same as generated. Hurray!");
                isGuessed = true;
                break;
            }
        } while (isGuessed = true);

            }
        }

        /* Nikitas variants
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Please enter number:");
            int answer = scanner.nextInt();
            if (answer < 1 || answer > 10) {
                System.out.println("Number is not correct, try again!");
            } else if (answer == randomNumber) {
                System.out.println("Number is guessed! Number: " + answer);
                isGuessed = true;
            } else {
                System.out.println("Number is not guessed! Try again");
            }
        }
    }
}*/

        /* Artjoma variants
        int randomNum = (int) (Math.random() * 10);
        System.out.println("Random number is: " + randomNum);

        Scanner scan = new Scanner(System.in);
        int guesss = scan.nextInt();

        while(guesss != randomNum){
            if(guesss <= 0 || guesss > 10){
                System.out.println("Wrong input");
                guesss = scan.nextInt();
                continue;
            }
                System.out.println("Wrong");
                 guesss = scan.nextInt();
            }
            System.out.println("You win!");
        }
    }
 */
