// Scanner object

import java.util.Scanner;

public class inputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // we create a Scanner object and name it input.

        System.out.print("Enter an integer: "); // We then use the nextInt() method to read the integer.
        int myInt = input.nextInt(); // We then use the nextInt() method to read the integer.
        System.out.printf("You entered %d.%n%n", myInt); // we display the user’s input using the printf() method.
                                                        // where %d - placeholder and %n - new line

        System.out.print("Enter a double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);

        System.out.print("Enter a string: ");
        input.nextLine(); // We need the nextLine() method on this line to consume this newline character from the previous input.
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);


        /*
        input.nextLine()
        Whenever you use the nextLine() method after the nextDouble() method,
        you should always have an additional nextLine() method to consume the previous newline character.
        The same applies to the nextInt() method.
         */

    }
}
