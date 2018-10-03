public class Operators {

    public static void main(String[] args) {

        int i = 3;
        i++;                     // 4
        System.out.println(i);  // 4
        ++i;                    // 5
        System.out.println(i);  // 5
        System.out.println(++i); // 6
        System.out.println(i++); // 6
        System.out.println(i);   // 7
    }
}

// post increment (i ++) и pre increment (++ i)
// ++a увеличивает, а затем использует переменную.
// a++ использует, а затем увеличивает эту переменную