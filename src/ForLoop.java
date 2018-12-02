public class ForLoop
{
    public static void main(String[] args) {

        int count;
        int max = 21;

        for (count = 0; count <= max; count+=2) {
            System.out.println(count);
        }

        System.out.println();
        
        // "enhanced for" when working with arrays and Collections.
        // An enhanced for statement is very useful if you want to get information
        // from an array without making any changes to it.

        int[] myNumbers = {10, 20, 30, 40, 50};

        for (int item : myNumbers)
            System.out.println(item);

    }
}

// For loop.

/*
int count;
        int max = 10;

        for (count = 0; count < max; count++)
        {
            System.out.println(count);
        }
 */