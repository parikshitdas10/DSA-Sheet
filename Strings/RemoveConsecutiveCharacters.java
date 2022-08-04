public class RemoveConsecutiveCharacters {
    static String removeConsecutiveCharacter(String S) {
        int n = S.length();
        if (n == 1) {
            return S;
        }
        char[] ans = new char[n];
        ans[0] = S.charAt(0);
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == S.charAt(i - 1))
                continue;
            else {
                ans[c] = S.charAt(i);
                c++;
            }

        }
        String str = new String(ans);
        return str;

    }

    public static void main(String[] args) {
        String S = "aabaa";
        System.out.println(removeConsecutiveCharacter(S));
    }
}
