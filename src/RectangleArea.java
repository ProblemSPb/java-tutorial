import java.util.Scanner;

public class RectangleArea {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        area(height, width);

    }

    // rectangle area + unchecked exception for negative numbers

    public static void area(int height, int width) {

        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Negative sizes or null: width = " + width + " height = " + height + ".");
        }
        else {
            System.out.println("Rectangle Area: " + height * width);
        }
    }
}
