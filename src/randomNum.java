import javax.swing.*;
import  java.util.Random;

public class randomNum {

    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(10) + 0; // range
        int numTries = 0; // number of tries
        boolean win = false;

        // System.out.println(randNum);

        while (win == false) {
            String userNum = JOptionPane.showInputDialog("Guess a number from 0 to 10");
            int secretNum = Integer.parseInt(userNum);
            numTries++;


            if (secretNum == randNum) {
                System.out.println("BINGO! ");
                win = true;
                System.out.println("You needed " + numTries + " attepts to guess");

            } else if (secretNum < randNum) {
                System.out.println("Your number is " + secretNum + " and it is smaller than the Secret Number");

            } else if (secretNum > randNum) {
                System.out.println("Your number is " + secretNum + " and it is bigger than the Secret Number");

            }

        }
    }
}
