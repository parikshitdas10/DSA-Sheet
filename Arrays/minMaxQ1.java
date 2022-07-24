import java.util.*;

public class minMaxQ1 {
    static class Pair {
        int min, max;
    }

    static Scanner sc;

    static Pair getMinMax(int[] arr, Pair mm) {
        mm.min = mm.max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mm.max) {
                mm.max = arr[i];
            }
            if (arr[i] < mm.min) {
                mm.min = arr[i];
            }
        }
        return mm;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sc = new Scanner(System.in);
        Pair mm = new Pair();
        // int[] arr = { 23, 10, 18, 77, 5, 32, 100, 78, 12, 3 };
        int[] arr = { 98911462, 17464859, 76344398, 47704014, 53168615, 92396538, 3200725, 53720156, 39480340, 56389958,
                10033590, 21846224, 82026621, 60207784, 39528070, 27872695, 60733894, 49745135, 88019782, 3607068,
                92456631, 3457557, 76850597, 51760740, 26843570, 65579026, 5374485, 48222185, 37766632, 58706855,
                71945962, 81039138, 18385141, 19343243, 99771708, 77142632, 25380410, 57906805, 2753214, 71657025,
                84828919, 58671157, 64709053, 98681300, 96367264, 16237426, 50159800, 36632526, 44589924, 59191031,
                51860901, 58945532, 53029049, 59421261, 26301977, 89551538, 29575409, 68322456, 44232916, 46285171,
                7971466, 4644414, 85547381, 63813961, 90277118, 98962822, 59936158, 50956711, 43661552, 39046790,
                73017557, 14415099, 84426182, 91014723, 43383457, 32588778, 29977052, 51086176, 58503538, 78820994,
                82214263, 54643694, 53798887, 40679458, 44349552, 17847293, 74053437, 23693448, 88652717, 41392179,
                24592079, 33571021, 54378428, 64037474, 40455819, 52379168, 25718238, 44975714, 3780495, 33715336 };
        getMinMax(arr, mm);
        System.out.println("max is: " + mm.max);
        System.out.println("min is: " + mm.min);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}