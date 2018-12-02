import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class switchDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();

        switch (userGrade) {

            case "A+":
            case "A":
                System.out.println("\nDistinction!");
                break;

            case "B":
                System.out.println("\nB Grade.");
                break;

            case "C":
                System.out.println("\nC Grade.");
                break;

            default:
                System.out.println("\nFail.");
                break;

        }

    }
}
