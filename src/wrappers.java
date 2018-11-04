public class wrappers {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age);

        Integer ageWrapper = Integer.valueOf(age); // converting to a wrapper
        int value = ageWrapper.intValue(); //converting back to a primitive

    }
}
