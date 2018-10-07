// adding two 2D arrays

public class TwoDArraysHW {

    public static void main(String[] args) {

        int [][] arrayOne = new int [4][4];

        arrayOne[0][0] = 9;
        arrayOne[0][1] = 8;
        arrayOne[0][2] = 9;
        arrayOne[0][3] = 1;

        arrayOne[1][0] = 8;
        arrayOne[1][1] = 7;
        arrayOne[1][2] = 6;
        arrayOne[1][3] = 8;

        arrayOne[2][0] = 4;
        arrayOne[2][1] = 2;
        arrayOne[2][2] = 3;
        arrayOne[2][3] = 2;

        arrayOne[3][0] = 5;
        arrayOne[3][1] = 7;
        arrayOne[3][2] = 9;
        arrayOne[3][3] = 0;

        int [][] arrayTwo = new int[4][4];

        arrayTwo[0][0] = 9;
        arrayTwo[0][1] = 0;
        arrayTwo[0][2] = 8;
        arrayTwo[0][3] = 5;

        arrayTwo[1][0] = 6;
        arrayTwo[1][1] = 7;
        arrayTwo[1][2] = 5;
        arrayTwo[1][3] = 4;

        arrayTwo[2][0] = 3;
        arrayTwo[2][1] = 5;
        arrayTwo[2][2] = 8;
        arrayTwo[2][3] = 4;

        arrayTwo[3][0] = 5;
        arrayTwo[3][1] = 0;
        arrayTwo[3][2] = 8;
        arrayTwo[3][3] = 7;

        int [][] arraySum = new int[4][4];

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[0].length; j++) {
                arraySum[i][j] = arrayOne[i][j] + arrayTwo[i][j];
            }
        } // end of for loop => arraySum

        for (int i = 0; i < arraySum.length; i++) {
            for (int x = 0; x < arraySum[0].length; x++) {
                System.out.print(arraySum[i][x] + "|");
            }
            System.out.println(); // printing on a new line
        } // printing the arraySum

    }
}
