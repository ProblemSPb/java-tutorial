import java.util.Scanner;

public class ifScannerDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //System.in represents Standard Input Device (Keyboard)
        System.out.print("\nEnter your age: ");
        int userAge = input.nextInt();

        if (userAge < 0 || userAge > 100) {
            System.out.println("\nInvalid age");
            System.out.println("Age must be between 0 and 100.");
        }
        else if (userAge < 18){
            System.out.println("\nSorry you are underage.");
        }
        else if (userAge < 21){
            System.out.println("\nYou need parental consent.");

        }
        else {
            System.out.println("\nCongrats!");
            System.out.println("You may sign up for the event.");
        }


    }
}
