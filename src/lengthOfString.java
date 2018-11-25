public class lengthOfString {

    public static void main(String[] args) {

        String programming = new String("programming");
        String four = new String("4");
        String all = new String("all");

        String bigString = (programming.concat(four).concat(all)); // concatenating 3 strings

        int stringSize = bigString.length(); // counting the length

        System.out.println(stringSize); // printing teh length

        // converting the string into an array of chars and counting its length with the for loop
        char[] arrayString = bigString.toCharArray();
        int numArray = 1;

        for (int i = 1; i<= arrayString.length; i++) {
            numArray = i;
        }

        System.out.println(numArray);
    }
}
