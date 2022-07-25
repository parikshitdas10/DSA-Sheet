import java.util.HashMap;

public class RepeatAndMissing {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] A = { 2, 2 };
        int i;
        int n = A.length;

        for (i = 1; i <= n; i++) {
            map.put(i, 0);
        }
        for (i = 0; i < n; i++) {
            map.replace(A[i], map.get(A[i]) + 1);
        }
        int a = 0, b = 0;
        for (i = 1; i <= n; i++) {
            if (map.get(i) > 1) {
                a = i;
            }
            if (map.get(i) == 0) {
                b = i;
            }
        }
        System.out.println(a + "," + b);
    }
}
