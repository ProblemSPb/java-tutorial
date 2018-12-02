import java.util.Scanner;

public class ternaryOperatorIf {

    public static void main(String[] args) {

        /*
        The ternary operator (?) is a simpler form of an if statement that is very convenient
        if you want to assign a value to a variable depending on the result of a condition.

        condition ? value to return if condition is true : value to return if condition is false;
         */

        Scanner userInput = new Scanner(System.in);
        System.out.print("Give us a number: ");
        int numCompared = userInput.nextInt();

        String resultComp = numCompared >= 10 ? "It's bigger or equal to 10" : "It's smaller than 10"; // here is the IF
        System.out.println(resultComp);

    }
}
