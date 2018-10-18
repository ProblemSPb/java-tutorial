public class DArrayTraingle {

    public static void main(String[] args) {

        int[][] triangle = new int[5][9];


        for (int x = 1; x < 5; x++) {
            for (int y = x; y < (triangle[x].length - x); y++ ) {
                triangle[x][y] = 1;
            }
        }

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 9; y++) {
                System.out.print(triangle[x][y] + " ");
            }
            System.out.println();
        }


        /* printing of the array below

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[0].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }  end of printing the array */

    }
}

// array 1/0 triangle