package Basic;

import java.util.Scanner;

//вложенные циклы
public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Большой круг: " + (i + 1) + "\t\tМаленький круг: " + (j + 1));
            }
        }
    }
}

class Task1405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 1000;
        int k = sc.nextInt();
        int big = 0;
        int small = 0;
        for (int i = 1500; i + 300 < n; i += 1500) {
            big++;
            for (int j = 0; j < k && 300 + i < n; j++) {
                i += 300;
                small++;
            }
        }
        System.out.println(small + " " + big);

    }
}

class task1405_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i < n + 1 && c < n; i++) {
            for (int j = 1; j < i + 1 && c < n; j++) {
                System.out.print(i + " ");
                c++;
            }
        }
    }
}

