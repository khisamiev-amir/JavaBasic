package Basic;

public class Recursion {
    static int factorialSum(int a) {
        int n = 1;
        for (int i = a; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    static int factorialRec(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorialRec(a - 1);
        }
        // factorialRec(3) = 3 * factorialRec(2);
        // factorialRec(2) = 2 * factorialRec(1);
        // factorialRec(1) = 1 * factorialRec(0);
        // factorialRec(0) = 1
    }

    // digitСalculation(1234) = 1 + digitСalculation(123)
    // digitСalculation(123) = 1 + digitСalculation(12)
    // digitСalculation(12) = 1 +  digitСalculation(1)
    // digitСalculation(1) = 1
    public static int digitСalculation(int a) {
        int b = 1;
        // a = 1 -> a / 10 == 0 - True
        if (a / 10 == 0) {
            return 1;
        } else {
            return b + digitСalculation(a / 10);
        }
    }


    public static void main(String[] args) {
//        System.out.println(factorialRec(5));
        System.out.println(digitСalculation(1234));
        // 5! = 1 * 2 * 3 * 4 * 5
        // 5! = 5 * 4!
        // 4! = 4 * 3!
        // 3! = 3 * 2!
        // 2! = 2 * 1!
        // 1! = 1 * 0!
        // n! = n * (n-1)!
        // 0! = 1
//        System.out.println(factorialSum(5));
    }
}
