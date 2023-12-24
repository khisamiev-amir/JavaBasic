package Basic;

import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
//        int a = 10;
//        if (a<20){
//            a -= 2;
//        }
//        if (a==8){
//            a = 100500;
//        }
//        System.out.println(a);

       /* // if | else if | else
        int a = 10;
        if (a > 20) {
            a -= 2;
        } else {
            a = 100500;
        }
        System.out.println(a);*/

//        double a = 3;
//        int b = 3;
//        System.out.println(a / 2);
//        System.out.println(b / 2);


    }
}

class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ruble = sc.nextInt(); //??????? ??????
        int penny = sc.nextInt(); //??????? ??????
        int count = sc.nextInt(); //??????? ????????
        int pennySum = penny * count; // ????? ?????? ?? ???-?? ????????
        int pennySumRuble = pennySum / 100; //??????? ?????????? ?????? ???????
        int pennySumPenny = pennySum % 100; //??????? ? ????? ??????? ??????
        int sumRuble = ruble * count + pennySumRuble;
        System.out.println(sumRuble + " " + pennySumPenny);


    }
}

class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        int number2 = sc1.nextInt();
        if (number1 > number2) {
            System.out.println("1");
        } else if (number2 > number1) {
            System.out.println("2");

        } else {
            System.out.println("0");
        }
    }
}

//??
class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = number / 100;
        int second = (number / 10) % 10;
        int theThird = number % 10;
        System.out.println(first + second + theThird);
        /*System.out.println(first);
        System.out.println(second);
        System.out.println(theThird);*/
    }
}

class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstHours = sc.nextInt();
        int firstMinutes = sc.nextInt();
        int firsSeconds = sc.nextInt();
        int secondHours = sc.nextInt();
        int secondMinutes = sc.nextInt();
        int secondSeconds = sc.nextInt();
        int sumSecondsFirst = firstHours * 60 * 60 + firstMinutes * 60 + firsSeconds;
        int sumSecondsSecond = secondHours * 60 * 60 + secondMinutes * 60 + secondSeconds;
        if (sumSecondsFirst >= sumSecondsSecond) {
            System.out.println(sumSecondsFirst - sumSecondsSecond);
        } else {
            System.out.println(sumSecondsSecond - sumSecondsFirst);
        }
        System.out.println("Валера");
    }
}


class Boolean {
    public static void main(String[] args) {
//        boolean a=true, b=false;
//        System.out.println(a || b);
//        System.out.println(a || a);
//        System.out.println(b || b);
//        System.out.println(!b);

        // от 1 до 5 или в прожутке от 20 до 25
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a > 0 && a < 6) || (a > 19 && a < 26)) {
            System.out.println("Находится");
        } else {
            System.out.println("Не находится");

        }
    }
}

class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0 || a % 4 == 0 && a % 400 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if ((k % m == 0 || k % n == 0) && n * m >= k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

class Regina {
    public static void main(String[] args) {
        int a = 18 % 4;
        System.out.println(a);
    }
}

//дз 26.04
//1. x&yv!y, true*false||true, false||true, true
//2. !(x||!(y*x)), !(true||!(false), !(true||true), false


class Task_1_2604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты слона по горизонтали: ");
        int slong = sc.nextInt();
        System.out.println("Введите координаты слона по вертикали: ");
        int slonv = sc.nextInt();
        System.out.println("Введите координаты фигуры по горизонтали: ");
        int figurag = sc.nextInt();
        System.out.println("Введите координаты фигуры по вертикали: ");
        int figurav = sc.nextInt();
        if ((slong + slonv == figurag + figurav) || (slong - slonv == figurag - figurav)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}

class Task_2_2604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a%2==0 || b%2==0 || c%2==0) && (a%2!=0 || b%2!=0 || c%2!=0)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}





class Task_4_2604{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && b>=c){
            System.out.println(a);
        }else if (b>=a && a>=c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}