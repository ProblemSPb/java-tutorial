import java.util.Scanner;

public class InheritanceDemo {


    // We declare six fields for the InheritanceDemo class.
    // A protected field is accessible within the class in which it is declared,
    // any class that is derived from it and any class that is in the same package.

    public String welcome = "Welcome to ABC fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    //constructors

    public InheritanceDemo() {
        System.out.println("Parent constructor with no parameter.");
    }

    // Prints message and assigns parameters to three of the private fields in the Member class.

    public InheritanceDemo(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent constructor with 3 parameters.");
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    // a getter and setter method for the private field discount so that other classes can access this field.

    public double getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Pls enter admin password: ");
        input = input.nextLine();

        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have access to edit the discount.");
        }
        else {
            System.out.print("Pls enter the discount: ");
            discount = input.nextInt();
        }
    }

    // Method: a series of println() statements to display information about a member.

    public void displeyMemInfo() {
        System.out.println("Member name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member since: " + memberSince);
        System.out.println("Annual fee: " + annualFee);
    }

    // Method: to calculate the annual fee of a member.


    public void calculateAnnualFee() {
        annualFee = 0;
    }
}

// Inheritance, constructors