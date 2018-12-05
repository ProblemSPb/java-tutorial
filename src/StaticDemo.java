class MyClass {

    // non-static field and method

    public String message = "Hello world";
    public void displayMessage() {
        System.out.println("Message = " + message);
    }

    // static field and method

    public static String greetings = "Good morning";
    public static void displayGreetings() {
        System.out.println("Greeting = " + greetings);
    }

}

public class StaticDemo {

    public static void main(String[] args) {

        MyClass sd = new MyClass();     // to access non static field and class we must instantiate an object
        System.out.println(sd.message); // printing String message = "Hello world"
        sd.displayMessage();            // calling displayMessage() and printing ("Message = " + message)

        System.out.println(MyClass.greetings); // to access the static ones, we do not need to create any object
        MyClass.displayGreetings();
    }
}