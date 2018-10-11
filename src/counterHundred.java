public class counterHundred {

    public static void main(String[] args) {

        int counter;

        System.out.println("These numbers are divisible by 3:");
        for (counter = 1; counter <= 100; counter++) {
            if ((counter % 3) == 0) {
                System.out.print(counter + ", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("These numbers are divisible by 5:");
        for (counter = 1; counter <= 100; counter++)
            if (counter%5 == 0) {
                System.out.print(counter + ", ");
            }

        System.out.println();
        System.out.println();

        System.out.println("These numbers are divisible by both 3 and 5:");

        for (counter = 1; counter <=100; counter++) {
            if (counter%3 == 0 && counter%5 == 0) {
                System.out.print(counter + ", ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("These numbers are divisible neither by 3 or 5:");
        for (counter = 1; counter <= 100; counter++)
            if ((counter % 3 != 0) && (counter % 5 != 0)) {
                System.out.print(counter + ", ");
            }

    }
}

// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
