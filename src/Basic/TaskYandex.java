package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class TaskYandex {
    public static void main(String[] args) {

        int[] m = reader();
        String result = f(m);
        System.out.println(result);
    }

    private static int[] reader() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) { // n = 3 -> цикл будет бежать 3 раза
            int a = sc.nextInt();
            m[i] = a;
        }
        return m;
    }

    // Целых неповторяющихся чисел. Тебе нужно свернуть этот массив

//     3
//     1 3 2
    // [1,3,2] -> "1-3"

    // 4
    // 1 3 2 5
    // [1,3,2,5] -> "1-3,5"

    // 8
    // 1 4 5 3 7 11 10 12
    // [1,4,5,3,7,11,10,12] -> "1,3-5,7,10-12"


    // Два указателя
    public static String f(int[] m) {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        boolean notInSegment = true;
        int segmentStart = 0;
        int segmentEnd = 0;

        int dot;
        String res = "";
        // 0 1 2 4 6 7 8
        for (int i = 0; i < m.length; i++) {
            if (i != m.length - 1 && m[i] + 1 == m[i + 1] && notInSegment) {
                segmentStart = m[i];
                notInSegment = false;
            }
            if ((i == m.length - 1 || m[i] + 1 != m[i + 1]) && notInSegment == false) {
                segmentEnd = m[i];
                notInSegment = true;
                if (i == m.length - 1) {
                    res += Integer.toString(segmentStart) + "-" + Integer.toString(segmentEnd);
                } else {
                    res += Integer.toString(segmentStart) + "-" + Integer.toString(segmentEnd) + ",";
                }
            } else if ((i == m.length - 1 || m[i] + 1 != m[i + 1]) && notInSegment) {
                dot = m[i];
                if (i == m.length - 1) {
                    res += dot;
                } else {
                    res += dot + ",";
                }
            }
        }

        return res;
    }
}
