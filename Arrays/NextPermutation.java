import java.util.*;

public class NextPermutation {
    static Scanner sc;

    static void solution(int[] nums) {
        int n = nums.length;
        int ind = 0;
        int tmp;
        if (n > 1) {
            int flg = 0;
            // Finding the point where a[i]<a[i+1] and marking it as ind
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    ind = i;
                    flg = 1;
                    break;
                }
            }
            if (flg == 0) {// flg ==0 means no break pt. so simply sort and return
                Arrays.sort(nums);
                return;
            } else {
                // now looking for the element just greater than brk pt(value at ind)
                for (int j = n - 1; j >= 0; j--) {
                    if (nums[j] > nums[ind]) {
                        tmp = nums[ind];
                        nums[ind] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
                // now reversing the subarray at the right of ind to the end
                if (n > ind + 2) {// to make sure there are atleast 2 elements left on the right side to reverse
                    int l = ind + 1;
                    int r = n - 1;
                    while (l < r) {
                        tmp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = tmp;
                        l++;
                        r--;

                    }
                }

            }
        }
    }

    static void printArr(int[] nums) {
        for (int e : nums) {
            System.out.print(e + ",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3 };
        solution(nums);
        printArr(nums);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
// Algorithm:
// Step1: Traverse from the right and find the breaking pt (The index at which
// a[i]<a[i+1])
// Step2: mark the brk pt as ind
// Step3:Again traverse from right and find the element first element greater
// than a[ind]
// Step4: Swap that element with a[ind];
// Step5: reverse all elements to the right of ind
// Edge Case1: number of elements in the array could be 1
// Edge Case2: There might be no brk pt. In that case sort the array
// Edge Case3: There has to be atleast 2 or more elements to the right of ind in
// order to reverse (step5)