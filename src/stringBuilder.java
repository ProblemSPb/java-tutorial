import javax.swing.*;

public class stringBuilder {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        String gender = JOptionPane.showInputDialog("What is your gender?");
        String age = JOptionPane.showInputDialog("What is your age?");
        String nationality = JOptionPane.showInputDialog("What is your nationality?");
        String job = JOptionPane.showInputDialog("What is your job?");

        StringBuilder bio = new StringBuilder("Here is my bio: ");

        bio.append("My name is ")
                .append(name)
                .append(". I am ")
                .append(gender)
                .append(" and I am ")
                .append(age)
                .append(". My nationality is ")
                .append(nationality)
                .append(". I work as ")
                .append(job)
                .append('.');

        System.out.println(bio);

    }
}

// StringBuilder
// write a program that asks for name, gender, age, nationality, job and prints the bio using this data