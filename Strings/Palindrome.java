import java.util.*;

public class Palindrome {
    static Scanner sc;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        String s = "A man, a plan, a canal: Panama";
        char[] a = s.toCharArray();
        int st = 0;
        int e = a.length - 1;
        while (st < e) {

            if (Character.isLetterOrDigit(a[st]) && Character.isLetterOrDigit(a[e])
                    && Character.toLowerCase(a[st]) == Character.toLowerCase(a[e])) {
                st++;
                e--;
            }

            else if (!Character.isLetterOrDigit(a[e]))
                e--;

            else if (!Character.isLetterOrDigit(a[st]))
                st++;
            else
                System.out.println("false");

        }
        System.out.println("True");
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
/* Note */
// Character.isLetterOrDigit is a method that returns true
// if it is a letter and returns false if it is not a letter.