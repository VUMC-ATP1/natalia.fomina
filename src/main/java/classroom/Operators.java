package classroom;

public class Operators {
    public static void main(String[] args) {

        // Equal to ==
        int a = 10;
        int b = 10;
        System.out.println(a == b); // true

        // Not equal to
        System.out.println(a != b); // false

        // Less than <
        int x = 30;
        int y = 50;
        System.out.println(x < y); // true

        // Greater than <
        x = 100;
        y = 101;
        System.out.println(x > y); // false

        boolean isGreater = 20 >10;
        System.out.println(isGreater); // true

        // Less than or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        // Greater than or equal to
        a = 200;
        b = 100;
        System.out.println(a >= b); // true

        String name = "Nikita";
        String name2 = "Nikita";
        System.out.println(name.equals(name2)); // true

        String name3 = new String("Nikita");
        String name4 = "Nikita";
        System.out.println(name3.equals(name4)); // value (true)
        System.out.println(name3 == name4); // compare objects === (false)

        // Logical operators
        x =11;
        boolean result = x < 5 && x < 10;
        System.out.println(result); // true

        result = 3 < 5 || 4 > 5; // true

        a = 10;
        b = 20;
        result =!(a < b); // false (inversion)


    }
}
