import javax.swing.*;

public class ifStatement {

    public static void main(String[] args) {
        String userNum = JOptionPane.showInputDialog("Give me a num");
        int userNum1 = Integer.parseInt(userNum);

        if (userNum1 > 0) {
            System.out.println(userNum1 + " is Positive!");
        }
        else if (userNum1 < 0) {
            System.out.println(userNum1 + " is Negative!");
        }
        else {
            System.out.println("Is it a Zero?");
        }
    }

}


