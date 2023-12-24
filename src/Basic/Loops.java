package Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*ЦИКЛ WHILE*/
//        boolean is_good_weather = false;
        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
/*
        while (is_good_weather){
            System.out.println("he is running");
            System.out.println("does the sun shine?");
//            String response = sc.nextLine();
//            if (response.equals("No")){
//                is_good_weather=false;
//            }
        }*/


//        do {
//            System.out.println("he is running");
//            System.out.println("does the sun shine?");
//        } while (is_good_weather);

//        int a = 0;
//        while (a < 10) {
        // Тело цикла

//            System.out.println(a);
//            a++; // 1
//        }

        // Команда Break
//        while (a>0) {
//            System.out.println(a);
//            a = sc.nextInt();
//        }
//        if (a < 0){
//            System.out.println("Введено отрицательное число");
//        }


//        while (a!=0) {
//            System.out.println(a);
//            if (a < 0){
//                System.out.println("Введено отрицательное число");
//                break;
//            }
//            a = sc.nextInt();
//        }


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
}

// 4
// 3
// 2
// 0

// 9
class Task_1_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count_num = 0;
        while (a != 0) {
            count_num++; // sum_num = sum_num + 1
            a = sc.nextInt();
        }
        System.out.println(count_num);
    }
}

class Task_2_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum_num = 0;
        while (a != 0) {
            sum_num += a; // sum_num = sum_num + a
            a = sc.nextInt();
        }
        System.out.println(sum_num);
    }
}

class Task_3_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum_num = 0;
        int count_num = 0;
        while (a != 0) {
            sum_num += a; // sum_num = sum_num + a
            count_num++; // sum_num = sum_num + 1
            a = sc.nextInt();
        }
        System.out.println(sum_num / count_num);
    }
}

class Task_4_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count_num_even = 0;
        while (a != 0) {
            if (a % 2 == 0) {
                count_num_even++;
            }
            a = sc.nextInt();
        }
        System.out.println(count_num_even);
    }
}

class Task_5_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max_value = a;
        while (a != 0) {
            if (a >= max_value) {
                max_value = a;
            }
            a = sc.nextInt();

        }
        System.out.println(max_value);
    }
}

class Task_6_3004 { //?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int amount = 0;
        while (a != 0) {
            int a1 = sc.nextInt();
            if (a < a1) {
                amount++;
            }
            a = a1;
        }
        System.out.println(amount);
    }
}

class Task_7_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int max_value, prev_max_value;
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Нет второго максимума");
        } else {
            if (a > b) {
                max_value = a;
                prev_max_value = b;
            } else {
                prev_max_value = a;
                max_value = b;
            }
            a = sc.nextInt();
            while (a != 0) {
                if (a >= max_value) {
                    prev_max_value = max_value;
                    max_value = a;
                } else if (a >= prev_max_value) {
                    prev_max_value = a;
                }
                a = sc.nextInt();
            }
            System.out.println(prev_max_value);
        }
    }
}

class Task_8_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max_value = a;
        int max_count = 0;
        while (a != 0) {
            if (a > max_value) {
                max_value = a;
                max_count = 1;
            } else if (a == max_value) {
                max_count++;
            }
            a = sc.nextInt();
        }
        System.out.println(max_count);
    }
}

class Task_9_1_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = 0;
        int sum_num = 0;
        while (a != 0 && a1 != 0) {
            int b1 = sc.nextInt();
            b1 = a1;
            sum_num += a;
            a = a1;
        }
        System.out.println(sum_num);
    }
}

class Task_9_2_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum_num = 0;
        int sum_num1 = 0;
        while (a != 0 || (sum_num) == sum_num1) {
            sum_num = sum_num + a; // sum_num = sum_num + a
            a = sc.nextInt();
            sum_num1 = sum_num + a;
        }
        System.out.println(sum_num);
    }
}

class Task_9_3_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_num = 0;
        if (a == 0 && b == 0) {
            System.out.println("0");
        } else {
            sum_num = a + b;
            while (a != 0 || b != 0) {
                a = sc.nextInt();
                System.out.println("Значение приняло а:" + a);
                b = sc.nextInt();
                System.out.println("Значение приняло b: " + b);
                sum_num = sum_num + a + b;
            }
            System.out.println(sum_num);
        }
    }
}

class Task_10_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 1 1 1 3 4 4 -> 3
        // a = 2 b = 3
        int count = 0;
        int countMax = 0;
        while (a != 0) {
            int b = sc.nextInt();
            if (a == b) {
                // count = 3
                count++;

            } else  {
                count = 0;
            }
            if(count>countMax){
                countMax=count;
            }
            a = b;
        }
    }
    // 1 10 5 -> 1
}

