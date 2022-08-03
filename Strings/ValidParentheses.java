import java.util.*;

public class ValidParentheses {
    static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        char tmp = 'a';
        if (n == 1)
            return false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                if (s.charAt(i) == '(') {
                    stack.push(')');
                }
                if (s.charAt(i) == '{') {
                    stack.push('}');
                }
                if (s.charAt(i) == '[') {
                    stack.push(']');
                }
            }
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stack.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ']') {
                    tmp = stack.pop();
                }
                if (s.charAt(i) == '}') {
                    tmp = stack.pop();
                }
                if (s.charAt(i) == ')') {
                    tmp = stack.pop();
                }
                if (s.charAt(i) != tmp) {
                    return false;
                }
            }
        }
        if (stack.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "[(){})";
        System.out.println(isValid(s));
    }
}
