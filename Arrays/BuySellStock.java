import java.util.*;

public class BuySellStock {
    static Scanner sc;

    static void solution(int[] arr, int n) {
        int left = 0;
        int right = 1;
        int profit;
        int mp = 0;
        while (right < n) {
            profit = arr[right] - arr[left];
            if (profit >= 0) {
                mp = Math.max(mp, profit);
                right++;
            } else {
                left = right;
            }
        }
        System.out.println(mp);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        solution(arr, n);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}