import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        
        // in-build method Arrays.sort() to sort arrays
        //

        int[] nums = {23, 34, 67, 2, 0, 45};

        Arrays.sort(nums);
        System.out.printf("Sorted []: %s", Arrays.toString(nums)); // to print array without loops

    }
}
