import java.util.Arrays;

class MyClass2 {

    // This method shows how you can use an array as a parameter.

    void printingFirstElement(int[] a) {
        System.out.println("The first element is " + a[0]);
    }

    // returnArray() shows how you can return an array from a method.

    int[] returnArray() {
        int[] a = new int[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
        }
        return a;
    }
}

public class ArrayMethodDemo {

    public static void main(String[] args) {

        MyClass2 amd = new MyClass2(); // To use those two methods above, we initialized a MyClass2 object -> amd

        int[] myArray = {1, 2, 3, 4, 5};
        amd.printingFirstElement(myArray);

        int[] myArray2 = amd.returnArray(); // assigned the result of the returnArray() method to a new array
        System.out.println(Arrays.toString(myArray2));

    }

}

// Using Arrays in Method
// This method shows how you can use an array as a parameter.
// returnArray() shows how you can return an array from a method.