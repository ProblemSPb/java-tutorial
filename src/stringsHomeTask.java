import javax.swing.*;

public class stringsHomeTask {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What's your full name?");

        String nameClean = name.replaceAll(" +", " "); // replacing all spaces with one space
        System.out.println(nameClean);

        String [] nameArray = name.split(" "); // splitting and putting into array
        System.out.println(nameArray[1] + " " + nameArray[0]); // swapping name and 2nd name

        String email = JOptionPane.showInputDialog("What's your email?");
        String domain = email .substring(email .indexOf("@") + 1); // getting everything after @
        String domainEnd =domain .substring(domain.indexOf(".") + 1); // getting domain
        String [] emailName = email .split("@"); // splitting to get data before and after @

        System.out.print(emailName[0] + "@joji." + domainEnd);


    }
}

// eliminates extra spaces, swapping name and 2nd name
// elena@mail.ru into elena@JOJI.ru