import java.util.Date;

public class dateTime {

    public static void main(String[] args) {

        Date dateBefore = new Date();
        doLongOperation();
        Date dateAfter = new Date();

        // we use getTime cause Date is a Long
        System.out.println(dateAfter.getTime() - dateBefore.getTime() + " is taken to measure the method performance in miliseconds and it is " + ((dateAfter.getTime() - dateBefore.getTime()) / 1000) + " in seconds");

    }

    private static void doLongOperation() {
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {

        }
    }
}

// measuring a method performance using dates
// how much time will it take to execute the method?