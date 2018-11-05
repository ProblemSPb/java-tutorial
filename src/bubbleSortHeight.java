public class bubbleSortHeight {

    public static void main(String[] args) {

        int [] height = {150, 180, 67, 189, 130, 168, 155, 170};


        for(int i = 0; i < height.length; i++) {
            for(int j = 0; j < height.length; j++) {
                if(height[i] < height[j]) {
                    int temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;
                }
            }
        }

/*
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < height.length - 1; i++) {
                if(height[i] > height[i + 1]) {
                    int temp = height[i];
                    height[i] = height[i + 1];
                    height[i + 1] = temp;
                    swapped = true;
                }
            }
        }

*/
        for (int i = 0; i < height.length; i++) {

            System.out.print(height[i] + " ");
        }
    }
}
