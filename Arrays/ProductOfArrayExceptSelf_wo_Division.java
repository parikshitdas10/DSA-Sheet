import java.util.*;

public class ProductOfArrayExceptSelf_wo_Division {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3, 4 };
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int i;
        // populating left
        left[0] = 1;// since there are no elements to the left of first element
        int prod = 1;
        for (i = 1; i < n; i++) {
            prod = prod * nums[i - 1];
            left[i] = prod;
        }
        right[n - 1] = 1;// no elements to the right of last element
        prod = 1;
        for (i = n - 2; i >= 0; i--) {
            prod = prod * nums[i + 1];
            right[i] = prod;
        }
        int[] ans = new int[n];
        for (i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        for (int e : ans) {
            System.out.print(e + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
/* Algorithm */
// Idea behind: Product of array except self just means the product of every
// element at its right eith every element on its left.

// Step1:Populate the left array from left side.
// the net product on the left for the 0th element will be none. so 1 at 0th
// index,
// for first index, the product will be upto 0th index, for second , the product
// will be upto 1st index and so on.

// Step2: Use the same algorithm for populating the right product array from
// right to left.

// Step3: the product of array except self is just the product of all elements
// to its left with the product of all elements
// to its right
// just multiply left[i] with right[i]