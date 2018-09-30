import javax.swing.*;

public class lessonMethod {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please insert your age");
        int age = Integer.parseInt(input);

        int newAge = sumNum(age, 5);
        System.out.println(newAge);

    }

    public static int sumNum (int num1, int num2) {
        return num1 + num2;
    }


}
