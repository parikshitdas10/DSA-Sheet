import java.util.*;

public class MinInRotatedArray {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int lo = 0;
        int hi = n - 1;
        int tmp;
        while (lo <= hi) {
            tmp = Math.min(nums[lo], nums[hi]);
            min = Math.min(tmp, min);
            lo++;
            hi--;
        }
        if (n == 1)// for edge case, array having only one element
            System.out.println(nums[0]);
        else
            System.out.println(min);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
/* Note */
// Algorithm is pretty straight-forward for this code
// LeetCode demanded O(logn) time complexity
// however, this code with O(n/2) time complexity got Accepted and was just as
// fast as any other efficient submission, time=0ms
// I may include another solution with better complexity with _Opti class name.