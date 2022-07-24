import java.util.*;

public class maxSubArrayQ3 {
    static Scanner sc;

    static void getMaxsub(int[] arr) {
        int sum = 0, max = arr[0];
        for (int e : arr) {
            sum = sum + e;
            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        getMaxsub(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}