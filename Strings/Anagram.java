import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (s.length() != t.length())
            System.out.println("False");
        char carr1[] = s.toCharArray();
        char carr2[] = t.toCharArray();
        Arrays.sort(carr1, 0, carr1.length);
        Arrays.sort(carr2, 0, carr2.length);
        for (int i = 0; i < carr1.length; i++) {
            if (carr1[i] != carr2[i])
                System.out.println("false");
        }
        System.out.println("True");
    }
}
