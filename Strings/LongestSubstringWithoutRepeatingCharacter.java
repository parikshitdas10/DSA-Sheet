import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0, maxCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                i = map.get(s.charAt(i));
                map.clear();
                c = 0;
            } else {
                c++;
                map.put(s.charAt(i), i);
            }
            maxCount = Math.max(maxCount, c);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(solution(s));
    }
}
/* ALGORITHM: */
// step 0: maintain hashmap, (count and maxCount for kadane application)
// step 1: run a loop to iterate String
// step 2: maintain a hashmap and check if charAt(i) is already present in map
// or not
// step 3: if not present then add that Character as key and add the position (i
// th index)
// as value [imp step]
// step 4: if already present that means char is repeating, hence clear the map,
// set count=0
// and start traversing the string for the character next to the repeating
// character.
