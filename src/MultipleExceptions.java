import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {

    public static void main(String[] args) {
        example();
    }

    private static int example() {

        try {
            FileInputStream file = new FileInputStream("");
            byte x = (byte) file.read();
            Thread.sleep(5000);
        }
        catch (FileNotFoundException f) {
            f.printStackTrace();
            return -1;              // this is a flag (-1, 0, 1)
        }
        catch (IOException i) {
            i.printStackTrace();
            return -1;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}

// multiple exceptions
// hierarchy: from more specific ("children") first =>> to more generic (less specific, "parent") in the end