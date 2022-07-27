import java.util.*;

public class TrappingWater {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        // test case
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int i = 0;
        int n = height.length;
        left[0] = height[0];
        // preprossing array method
        // checking from left and filling the left arr with max value from height from
        // left
        for (i = 1; i < n; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        // same for right
        right[n - 1] = height[n - 1];
        for (i = n - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) {
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        int water = 0;
        // logic for filling water
        // checking if height is less than right and left blocks
        // then calculating amt of water w.r.t the min height from either left or right
        for (i = 1; i < n - 1; i++) {
            if (height[i] < left[i] && height[i] < right[i]) {
                water = water + (int) Math.min(right[i], left[i]) - height[i];
            }
        }
        System.out.println(water);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
/* NOTE */
// check https://www.youtube.com/watch?v=UZG3-vZlFM4
// for further simplification