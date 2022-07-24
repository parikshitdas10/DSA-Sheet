import java.util.*;

public class ChocDistributionQ5 {
    static Scanner sc;

    static int getMin(int[] arr, int n, int m) {
        int diff;
        int maxDiff = Integer.MAX_VALUE;
        if (n == 0 || m == 0) {
            return 0;
        }
        if (n < m) {
            return -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i + m - 1 < n; i++) {
            diff = arr[i + m - 1] - arr[i];
            if (diff < maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int arr[] = { 12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50 };
        int m = 7;
        System.out.println(getMin(arr, arr.length, m));
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}