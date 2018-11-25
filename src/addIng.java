import javax.swing.*;

public class addIng {

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Give us a word");
        boolean ingEnding = userInput.endsWith("ing");

        if (userInput.length() >= 3) {
            // System.out.println("It's more than 3 letters.");

            if (ingEnding == false) {
                System.out.println(userInput+"ing");
            }
            else {
                System.out.println(userInput+"ly");
            }

        }
        else {
            System.out.println("Here is your word: " + userInput);
        }
    }
}

// add 'ing' at the end, if it is there alredy => add "ly".