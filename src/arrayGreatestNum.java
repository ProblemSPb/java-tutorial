import java.util.Collections;

public class arrayGreatestNum {

    public static void main (String [] args) {

        int[] numArray = {12, 25, 30, 1, 4, 5, 6, 10, 16};

        int max = numArray[0], min = numArray[0];
        for (int i = 0; i < numArray.length; i++){
            if (max < numArray[i])
                max = numArray[i];
            if (min > numArray[i])
                min = numArray[i];
        }

        System.out.println("Max: "+max);
        System.out.println("Min:"+min);

    }
}
