import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {2.5, 8.1, 6.7, 15.2, -9.5, 6.1, 56.91,
                -5.27, -3.5, 7.13, -9.72, -81.3, 63.5, 8.92, -2.67};
        double positive = 0;
        int reach = 0;
        boolean positiveNum = false;
        for (double i :
                nums) {
            if (i < 0) {
                positiveNum = true;
            } else if (positiveNum) {
                reach++;
                positive = positive + i;

            }
        }
        System.out.println(positive/reach);

        Arrays.sort(nums);

        for (double sorting: nums) {
            System.out.print(sorting + ", ");
        }

    }
}
