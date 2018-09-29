import javax.swing.*;

public class nameAge {

    public static void main (String [] args) {

        String userName = JOptionPane.showInputDialog("Whats your name?");

        /*
        String userAge = JOptionPane.showInputDialog("Whats your age?");
        Integer userAge1 = Integer.parseInt(userAge);


        if (userAge1 > 16) {
            System.out.println("Hey " + userName + " How's life?");
        }
        else {
            System.out.println("Hi " + userName + " You can come in.");
        }  */

        switch (userName) {
            case "Dan":
                System.out.println("Hey " + userName + " How's life?");
            break;
            case "Elena":
                System.out.println("Hi " + userName + " You can come in.");
            break;
            default:
                System.out.println("Wazzzap");
        }

    }


}
