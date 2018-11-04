public class bubbleSortHeight {

    public static void main(String[] args) {

        int [] height = {150, 180, 189, 130, 168, 155};


        for (int i = 0; i < height.length-1; i++)
            for (int j = 0; j < height.length-i-1; j++)
                if (height[j] > height[j+1])
                {
                    // swap temp and arr[i]
                    int temp = height[j];
                    height[j] = height[j+1];
                    height[j+1] = temp;
                }

        for (int i = 0; i < height.length; i++) {

            System.out.print(height[i] + " ");
        }
    }
}
