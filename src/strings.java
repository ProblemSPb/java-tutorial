import javax.swing.*;

public class strings {

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Whats your first name?");
        // String secondName = JOptionPane.showInputDialog("Whats your second name?");

        System.out.println(firstName);

        // System.out.println(firstName.concat("_").concat(secondName));

        // System.out.println(String.format("My name is %s %s" , firstName, secondName));

        String upperFirstName = firstName.toUpperCase();
        System.out.println(upperFirstName); // convert to upper case

        String trimFisrtName = firstName.trim();
        System.out.println(trimFisrtName); // trimming the spaces

        String substringFirstName = firstName.substring(2);
        System.out.println(substringFirstName); // starting from the char requested

        char[] chars = firstName.toCharArray(); // convert to char array

        String lowerFirstName = firstName.toLowerCase();
        System.out.println(lowerFirstName); // to lower case

        String replaceFirstName = firstName.replace("l","p"); // replacing chars
        System.out.println(replaceFirstName);

        String replaceAllFirstName = firstName.replaceAll("lena", "max"); //replacing regex
        System.out.println(replaceAllFirstName);

        String replaceFirstFirstName = firstName.replaceFirst("le", "ko"); // replacing substring
        System.out.println(replaceFirstFirstName);

        String[] splitFirstName = firstName.split(" "); // split
        System.out.println(splitFirstName[1]);
    }
}

// concatenation, upper and lower case, etc
// String.format