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

    // below: Primitive types vs reference types in methods

    public void passPrimitive (int primitivePara) { // primitive type parameter
        primitivePara = 10;                         // tries to change its value and then prints it
        System.out.println("Value inside method is " + primitivePara);
    }

    public void passReference (int[] refPara) {      // reference type parameter
        refPara[1] = 5;                             // tries to change its value and then prints it
        System.out.println("Value inside method is" + refPara[1]);
    }
}

public class ArrayMethodDemo {

    public static void main(String[] args) {

        MyClass2 amd = new MyClass2(); // To use those two methods above, we initialized a MyClass2 object -> amd

        int[] myArray = {1, 2, 3, 4, 5};
        amd.printingFirstElement(myArray);

        int[] myArray2 = amd.returnArray(); // assigned the result of the returnArray() method to a new array
        System.out.println(Arrays.toString(myArray2));

        // Primitive types vs reference types in methods
        int number = 2;
        System.out.println("\nnumber before " + number);
        amd.passPrimitive(number);
        System.out.println("number after " + number);

        System.out.print("\n");

        System.out.println("myArray[1] before " + myArray[1]);
        amd.passReference(myArray);
        System.out.println("myArray[1] after " + myArray[1]);

    }

}



// Using Arrays in Method
// This method shows how you can use an array as a parameter.
// returnArray() shows how you can return an array from a method.
// Primitive types vs reference types in methods