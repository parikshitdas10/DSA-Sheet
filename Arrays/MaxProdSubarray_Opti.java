import java.util.*;

public class MaxProdSubarray_Opti {
    static Scanner sc;

    static int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 2, 3, -2, 4 };
        int n = nums.length;
        int res = getMax(nums);// storing the max element
        int curMax = 1, curMin = 1;
        int tmp;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                curMax = 1;
                curMin = 1;
                continue;
            }
            tmp = curMax * nums[i];
            curMax = Math.max(curMax * nums[i], curMin * nums[i]);
            curMax = Math.max(curMax, nums[i]);// if the current element is max even after multiplying

            curMin = Math.min(tmp, curMin * nums[i]);
            curMin = Math.min(curMin, nums[i]);// if the current element is min even after multiplying
            res = Math.max(res, curMax);

        }
        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}