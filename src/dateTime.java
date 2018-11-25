import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class dateTime {

    public static void main(String[] args) {


        System.out.printf("%s%tc", "Due Date is: ", new Date());
        System.out.println();

        System.out.printf("%1$s %2$tB , %2$tY", "Due date is: ", new Date());
        System.out.println();

        System.out.printf("%s %tB%<te, %<tY", "Due date is: ", new Date());
        System.out.println();

        // Gregorian calendar in Java
        GregorianCalendar cd = new GregorianCalendar();

        GregorianCalendar locale = new GregorianCalendar(Locale.GERMANY);

        cd.set(1990, 12, 8); // setting a new value to the current date cd
        cd.add(Calendar.DATE, 50); // to add dates/months/years/etc to the date

        System.out.println(cd.getTime()); // printing the date

        /*

        SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm"); // date formatting
        String formattedDate = df.format(new Date());
        System.out.println(formattedDate);      // printing the date, you cannot print just straight away, you need to convert it to the String


        // we request a date pattern from the user and print out the current date acc to it:
        String pattern = JOptionPane.showInputDialog("Insert the date/time pattern");
        SimpleDateFormat dfUser = new SimpleDateFormat(pattern);
        String formattedDate2 = dfUser.format(new Date());
        System.out.println(formattedDate2);


        // we request the BD and print it out in a predefined pattern
        SimpleDateFormat ft3 = new SimpleDateFormat("yyyy-MM-dd");
        String input = JOptionPane.showInputDialog("Type in your birth date");

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft3.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft3);
        }


        // to measure the method performance is below:
        Date dateBefore = new Date();
        doLongOperation();
        Date dateAfter = new Date();

        // we use getTime cause Date is a Long
        System.out.println(dateAfter.getTime() - dateBefore.getTime() + " is taken to measure the method performance in miliseconds and it is " + ((dateAfter.getTime() - dateBefore.getTime()) / 1000) + " in seconds");

    }

    private static void doLongOperation() {
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {

        } */
    }



}

// measuring a method performance using dates
// how much time will it take to execute the method?
