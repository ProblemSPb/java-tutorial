import java.util.Scanner;
import java.util.InputMismatchException;

public class errorDemo {

    public static void main(String[] args) {

        int choice;

        Scanner input = new Scanner(System.in);

        int [] numbers = {10, 11, 12, 13, 14, 15};

        System.out.print("Enter the index of the array: ");

        try {
            choice = input.nextInt();
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is invalid.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: You did not enter an integer.");
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }


    }
}

// Java has classes that can handle specific errors.
// ArrayIndexOutOfBoundsException and InputMismatchExceptio