public class comparingNum {

    public static void main(String[] args) {

        int biggestSalary = 0;
        int [] salary = {2435,5456,4656,34,93485};

        for (int i = 0; i<salary.length; i++) {

            if (salary[i] > biggestSalary) {
                biggestSalary = salary[i];
            }

        }

        System.out.println(biggestSalary);

    }
}

// finding the biggest num in the array