import javax.swing.*;

public class leapYear {

    public static void main(String[] args) {


        String userInput = JOptionPane.showInputDialog("Give me the year I should start with");
        int year = Integer.parseInt(userInput);
        int leapYear = 1;

        System.out.println("These are the next 20 leap years: ");


        for (int i = 0; leapYear <=20; i++) {

            if (year%4 == 0 && (year % 100 != 0|| year%400 == 0)) { // this is a leap year
                System.out.println(year);
                leapYear = leapYear +1;
                year++;
            }

            else {
                year++;
            }

        }


    }
}


        /* if (year is not divisible by 4) then (it is a common year)
else if (year is not divisible by 400) then (it is a common year)
else if (year is not divisible by 100) then (it is a leap year)
else (it is a leap year) */