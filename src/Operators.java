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

        int a=5, c;

        // b=++a + ++a + a++;
        // a=++a + ++a + a++;
        c=a++ + ++a + ++a;

        // System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
    }
}

// post increment (i ++) и pre increment (++ i)
// ++a увеличивает, а затем использует переменную.
// a++ использует, а затем увеличивает эту переменную