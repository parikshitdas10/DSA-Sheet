import java.util.*;

public class MaxProdSubarray_BruteForce {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 2, 3, -2, 4 };
        int prod = 1;
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++)
                    prod = prod * nums[k];
                arr.add(prod);
                prod = 1;
            }

        }

        System.out.println(Collections.max(arr));
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
/*Brute Force*/
// Generating all possible subarrays and finding out the max
// Time complexity O(n^3)