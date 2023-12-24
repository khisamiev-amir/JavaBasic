package Basic;

import java.nio.charset.StandardCharsets;

public class OverloadMethods {
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    static String sum(String a) {
        String sum = a;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.3f, 2.3f));
        System.out.println(sum("a"+"b"));
    }
}
