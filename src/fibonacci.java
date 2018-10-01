public class fibonacci {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int sum;

        System.out.println(num1);

        for (int i=1; i <13; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(num1);
        }
    }

}

// fibonacci for 