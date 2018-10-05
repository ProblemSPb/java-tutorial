public class SingleLineConditionalOp {

    public static void main(String[] args) {

        int age;
        int height;

        if(age >=18 && age <=16) {
        if(height >180) {
            System.out.println("You are not allowed");
        }
            else{
                System.out.println("You are allowed");
            }
        } else {
            System.out.println("Age is not permitted");
        }

    }
}

// single line conditional operator
// variable x = (expression) ? value if true : value if false

// string msg = (age >=18 && age <=18) ? (height >180 ? System.out.println(“You are not allowed”) :
// System.out.println(“You are allowed”)) : System.out.println(“Age is not permitted”);