public class Staff {

    //contstructors

    public Staff(String name) {
        nameOfStaff = name;

        System.out.println("\n" + nameOfStaff);
        System.out.println("------------------------");

    }

    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;

        System.out.println("\n" + nameOfStaff);
        System.out.println("------------------------");
    }

    // below are the fields of the class
    // A field is simply a variable that is declared inside a class.
    // We can declare a field as either private, public or protected.
    //

    private String nameOfStaff; // private can be accessed only within Staff class itself.
    private final int hourlyRate = 30;  // final indicates that the value cannot be changed after it is created.
                                        // final must be initialized at declaration or within the constructor
    private int hoursWorked;

    public void printMessage() {  // void -> does not return anything
        System.out.println("Calculating Pay...");
    }

    // declaring another method
    //

    public int calculatePay() {
        printMessage(); // calling the method

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0) {
            return staffPay;
        } else {
            return -1;
        }
    }

    public int calculatePay(int bonus, int allowance) {
        printMessage();

        if (hoursWorked > 0) {
            return hoursWorked * hourlyRate + bonus + allowance;
        } else {
            return 0;
        }

    }

    // setter method below

    public void setHoursWorked (int hours) {
        if (hours > 0) {
            hoursWorked = hours;
        }
        else {
            System.out.println("Error: HoursWorked cannot be smaller than zero.");
            System.out.println("Error: HoursWorked is not updated.");
        }
    }

    // setter method below

    public int getHoursWorked() {
        return hoursWorked;
    }
}

// !!!!!!!!!!!!
// Encapsulation enables a class to hide data and behaviour from other classes that do not need to know about them.
//
// Constructor
// getter and setter