public class DArray {

    public static void main(String[] args) {
        int [][] nameArray = new int [5][10];

        for (int x = 0; x < nameArray.length; x++) {
            for (int y = 0; y < 10; y++) {
                nameArray[x][y]=y;
            }
        }

        for (int x = 0; x < nameArray.length; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(nameArray[x][y] +" ");
            }
            System.out.println();
        }
    }
}

// 2D arrays