import javax.swing.*;

public class whileLoop {

    public static void main(String[] args) {

        String age = JOptionPane.showInputDialog("Whats your age?");
        int ageConverted = Integer.parseInt(age);

        while (ageConverted >= 18) {
            System.out.println("Your age is "+ ageConverted + ". You can enter the web site.");
            break;
        }


    }
}

//while loop