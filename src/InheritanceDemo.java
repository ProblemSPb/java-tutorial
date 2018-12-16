// parent class for NormalMember

import java.lang.reflect.Member;
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
        password = input.nextLine();

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

    public static void main(String[] args) {

/*        // creating two objects for the two derived (child) classes.
        // Behind the scene, the values "James", 1 and 2010 are assigned to the fields name, memberID and memberSince.
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        System.out.println();

        // use the calculateAnnualFee() methods in the respective classes
        mem1.calculateAnnualFee();
        System.out.println();

        mem2.calculateAnnualFee();
        System.out.println();

        // use the displayMemberInfo() method from the parent class
        mem1.displeyMemInfo();
        System.out.println();

        mem2.displeyMemInfo();
        System.out.println();

        // modifying the discount (private field)
        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displeyMemInfo();
        */

// Polymorphism

        InheritanceDemo[] clubMembers = new InheritanceDemo[6];

        clubMembers[0] = new NormalMember("James", 1, 2010);
        clubMembers[1] = new NormalMember("Andy", 2, 2011);
        clubMembers[2] = new NormalMember("Bill", 3, 2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] = new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] = new InheritanceDemo("Yvonne", 6, 2013);

        for (InheritanceDemo m: clubMembers) {
            m.calculateAnnualFee();
            m.displeyMemInfo();
        }
    }
}

// Inheritance, constructors. Polymorphism.