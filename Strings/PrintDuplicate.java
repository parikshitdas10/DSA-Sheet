import java.util.*;

public class PrintDuplicate {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + "=" + map.get(ch));
            }
        }
    }
}
