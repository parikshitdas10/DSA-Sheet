import java.util.*;

public class ProductOfArrayExceptSelf {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 0, 4, 0 };
        int product = 1;
        int i;
        int n = nums.length;
        int flag = 0;
        int c = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] == 0) {
                flag = 1;
                c++;
                continue;
            }
            product = product * nums[i];
        }
        int ans[] = new int[n];
        if (flag != 1) {
            for (i = 0; i < n; i++) {
                ans[i] = product / nums[i];
            }
        } else if (c > 1) {
            for (i = 0; i < n; i++) {
                ans[i] = 0;
            }
        }

        else if (flag == 1) {
            for (i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            }
        }
        for (int e : ans) {
            System.out.print(e + "\t");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
/* USING DIVISION METHOD */
// calculate the total product without zeros
// if there are more than one zeros every product will be zero
// if there is only one zero then all the products will be zero except for the
// zero itself