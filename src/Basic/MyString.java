package Basic;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        char a = '5'; //один символ
        //Строка - упорядоченная и пронемерованная последовательность символов
        String string = "Java";
        String emptyString = "";
        String emptyString2 = new String(); // пустая строка
        String str1 = new String("Привет");
        // Строка - массив char
        String str2 = new String(new char[]{'П', 'р', 'и'}, 1, 2);
        char[] b = str2.toCharArray();
//        System.out.println(b);
//        System.out.println(string.charAt(2));
        for (int i = 0; i < string.length(); i++) { //пробежаться по всем символам строки
            System.out.println(string.charAt(i));
        }
        System.out.println("Привет".substring(0, "Привет".length() - 1));
    }
}

class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        for (int i = 0; i < number.length(); i++) { //пробежаться по всем символам строки
            System.out.println(number.charAt(i));
            int a = number.charAt(i);
            int b = Integer.valueOf(number.charAt(i));
            System.out.println(a + " " + b);
        }
    }
}


class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
//        int a = number.charAt(0);
//        int b = Integer.valueOf(number.charAt(0));
//        int c = Character.getNumericValue(a);
        int a = Character.getNumericValue(number.charAt(0));
        int b = Character.getNumericValue(number.charAt(1));
        int c = Character.getNumericValue(number.charAt(2));
        int d = Character.getNumericValue(number.charAt(3));
        int e = Character.getNumericValue(number.charAt(4));
        int f = Character.getNumericValue(number.charAt(5));
        if (a + b + c == d + e + f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

class Task_3 {
    int a =2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int firstPart = 0;
        int secondPart = 0;
        for (int i = 0; i < number.length(); i++) { //пробежаться по всем символам строки
            //System.out.println(number.charAt(i));
//            int a = number.charAt(i);
            int currentSymbol = Character.getNumericValue(number.charAt(i));
            if (i < 3) {
                firstPart = currentSymbol + firstPart;
            } else {
                secondPart = currentSymbol + secondPart;
            }
           // int b = Character.getNumericValue(number.charAt(i));
//            System.out.println(b);
        }
        if(firstPart==secondPart){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
