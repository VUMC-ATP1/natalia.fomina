package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

        //Massive initialization
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dayOfTheWeek.length);
        System.out.println(dayOfTheWeek[0]);
        // 1 = [0]
        // 2 = [1]
        // System.out.println(dayOfTheWeek[7]); - error
        System.out.println(dayOfTheWeek.length - 1);

        String[] nameOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };
        System.out.println("Today is: " + nameOfTheWeek[1]);

        String[] fruits = new String[6];
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawberry";
        fruits[4] = "cherry";
        fruits[5] = "pineapple";

        fruits[2] = "grape";

        char[] myNameCharacters = {'N', 'a', 't', 'a', 'l', 'i', 'a'};
        System.out.println(myNameCharacters[2]);

        Random random = new Random();
        int[] randomNumbers = {random.nextInt(100),random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));
        // StringBuilder [ x, x, x ]

        // Collections (List, Map, Queue)
        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("apple");
        listOfFruits.add("kiwi");
        listOfFruits.add("cherry");
        listOfFruits.add("apple");

        System.out.println(listOfFruits.get(0));
        listOfFruits.remove(0);
        System.out.println(listOfFruits.get(0));
    }
}
