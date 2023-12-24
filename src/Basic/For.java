package Basic;

import java.util.Scanner;

public class For {
    /* ЦИКЛ FOR */
//        int a= sc.nextInt();
//        int number = 0;
//        while (number<a){
//            number++;
//            System.out.println("Бегун пробежал " + number + " круг(ов)" );
//        }

//        int a= sc.nextInt();
//        for(int number = 0; number < a; number++){
//            System.out.println("Бегун пробежал " + number + " круг(ов)" );
//        }

//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
//        }
//        for (int i = 10; i >-1; i--) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 41; i++) {
//            if(i%2==0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 2; i <41 ; i=i+2) {
//            System.out.println(i);
//        }
}

class Task10305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 5
        int c = sc.nextInt(); // 0
        int d = sc.nextInt(); // 2
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }


        }
    }
}

// 5
// 5
// 10
// 25
// 99
// 3
class Task_1_0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_num = -1;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value >= max_num && value % 5 == 0) {
                max_num = value;
            }
        }
        System.out.println(max_num);
    }
}

class Task_2_0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value % 10 == 6) {
                sum += value;
            }

        }
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println(-1);
        }
    }
}

class Task_3_0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (400 % value == 0) {
                count++;
            }

        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}

class Task_4_0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min_num = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if ((min_num >= value || min_num == 0) && (value % 3 == 0 && value % 5 != 0)) {
                min_num = value;
            }

        }
        if (min_num != 0) {
            System.out.println(min_num);
        } else {
            System.out.println(-1);
        }

    }
}

class Task_5_0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_value = -1;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int decimalNum = value;
            String x = "";
            while (value > 0) {
                x = value % 5 + x; // 14
                value = value / 5; // value = 21 / 5 = 4
            }
            int a = Integer.parseInt(x);
            // System.out.println(a);

            if (a % 10 == 3 && (max_value < decimalNum || max_value == -1)) {
                max_value = decimalNum;
            }

        }
        if (max_value == -1) {
            System.out.println("Не найдено");
        } else {
            System.out.println(max_value);
        }
    }
}