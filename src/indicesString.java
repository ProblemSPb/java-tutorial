import javax.swing.*;

public class indicesString {

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Give us a word"); // getting a word from a user
        String firstTwo = userInput.substring(0, 2); // first two chars
        String lastTwo = userInput.substring(userInput.length() -2); // last two chars

        if (userInput.length() >= 2) {                  // checking if the word has at least 2 chars
            System.out.println(firstTwo + lastTwo);
        }
        else {
            System.out.println("EMPTY");
        }

    }
}

/*
Indices of a string.

Write a program to get a string made of the first 2 and the
last 2 chars from a given a string. If the string length is less than 2,
return instead of the empty string.
 */