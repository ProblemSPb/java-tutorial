import java.io.*;

public class IOStreams {

    public static void main(String[] args) throws IOException {

        //FileInputStream in = null; // defining the streams
        //FileOutputStream out = null;

        FileReader in = null;
        FileWriter out = null;

        try {
            // in = new FileInputStream("/Users/admin/Documents/Projects/java-tutorial/file_tutorial.txt"); // giving the file
            // out = new FileOutputStream("output.txt");   // how to output, if does not exist -> create it

            in = new FileReader("/Users/admin/Documents/Projects/java-tutorial/file_tutorial.txt");
            out = new FileWriter("output2.txt");

            int c;                  // a temp place in the memory to read from the file, by the time you are reading it's a number
            while ((c = in.read()) != -1 ) { // in.read is getting the next number from the file; -1 means that there is nothing, end of the file
                out.write(c); // put it into out output file
                out.flush();  // to "reset" the buffer, not to store anything in the buffer
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
        finally {              // in any case (success or fail) we will close the stream anyway
            if (in != null) { // we are checking if anything is in the stream
                in.close();
            }
            if (out != null)
                out.close();
        }

    }
}

// I/O Streams Pt1.
// Byte Stream (Byte by Byte, every 8 bits) and Character Stream (this one reads char by char, every 16 bits)
