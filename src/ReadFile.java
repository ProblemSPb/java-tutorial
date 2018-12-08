import java.io.*;

public class ReadFile {

    public static void main(String[] args) {

        String strLine;

        try {
            // LineNumberReader keeps track of line numbers
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("/Users/admin/Documents/Projects/java-tutorial/file_tutorial.txt"), "UTF-8"));

            // readLine() reads a line of text.
            // getLineNumber() gets the current line number.
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            // Closes the stream and releases any system resources associated with it.
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch (IOException e) {
            System.err.println("Unable to read the file");
        }

    }
}

// Checked Exceptions reading a file and printing first 3 lines.
// LineNumberReader
