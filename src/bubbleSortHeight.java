public class bubbleSortHeight {

    public static void main(String[] args) {

        int [] height = {150, 180, 67, 189, 130, 168, 155, 170};


        for (int i = 0; i < height.length; i++)
            for (int j = 0; j < height.length-i-1; j++)
                if (height[j] > height[j+1])
                {
                    // swap temp index and array[i]
                    int temp = height[j];
                    height[j] = height[j+1];
                    height[j+1] = temp;
                }

        for (int i = 0; i < height.length; i++) {

            System.out.print(height[i] + " ");
        }
    }
}
