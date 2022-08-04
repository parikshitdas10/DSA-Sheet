public class LongestCommonPrefix {
    static String solution(String[] strs) {
        int n = Integer.MAX_VALUE;
        // Running this loop to find the smallest string
        // (I had to do this in order to tackle edge cases)
        for (int k = 0; k < strs.length; k++) {
            if (strs[k].length() < n) {
                n = strs[k].length();
            }
        }
        StringBuilder ans = new StringBuilder();
        char ch;
        int flag = 0;

        for (int i = 0; i < n; i++) {// loop for every element in a string
            ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {// loop for iterating to different strings
                if (strs[j].charAt(i) != ch) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                ans.append(ch);
            } else {
                break;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution(strs));
    }
}
//Time complexity is O(n^2) worst case
//I have added break statements which will greately reduce the iterations