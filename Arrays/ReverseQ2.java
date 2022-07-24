import java.util.*;

public class ReverseQ2 {
    static Scanner sc;

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int tmp;
        while (start < end) {
            tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] arr = { 23, 10, 18, 77, 5, 32, 100, 78, 12, 3 };
        reverse(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println("\n" + (end - start) + "ms");
    }
}