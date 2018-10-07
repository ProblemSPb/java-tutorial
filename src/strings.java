import javax.swing.*;

public class strings {

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Whats your first name?");
        String secondName = JOptionPane.showInputDialog("Whats your second name?");

        // System.out.println(firstName.concat("_").concat(secondName));

        System.out.println(String.format("My name is %s %s" , firstName, secondName));
    }
}

// concatenation
// String.format