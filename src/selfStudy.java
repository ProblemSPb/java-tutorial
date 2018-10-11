import javax.swing.*;

public class selfStudy {

    public static void main(String[] args) {

        String numN = JOptionPane.showInputDialog("Type a number"); // input from a user
        int n = Integer.parseInt(numN);
        int sum = 0;

        for (int i = 1; i < n; i++) { // calculating the sum from 1 to n
            if (i%3 == 0) {
                sum = sum + i;
            }
            else if (i%5 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);

    }

}
// only multiples of 3 or 5 are considered in the sum, e.g. 3, 5, 6, etc.