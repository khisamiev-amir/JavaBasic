package Basic;

import javafx.beans.binding.Bindings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Methods {
//  [модификаторы необязательны](public/protected/private или static или final) + тип_возвращаемого_значения (int, double, char, void ...) название_метода_глагол ([параметры не обязательно]){
//          тело метода
//          return
//    }

    public static void main(String[] args) {
        int a = 2;
        int variable = 5;
        System.out.println(helloReturner());
        System.out.println(wordReturner(1));
        System.out.println(wordReturner(-12321));
        System.out.println(wordReturner(variable));


    }

    static String helloReturner() { //если не указано public или private, то автоматически private
        String str = "Hello";
        return str;
    }

    static String wordReturner(int num) {
//        if (num==1){
//            return "Hello";
//        }else {
//            return "Bye";
//        }
        if (num == 1)
            return "Hello"; //всё что после return не выполняется
        return "Bye";
    }
}

class Calculator1 {
    public static void main(String[] args) {
        // 5
        // 4 6 3 45 6
        // сумма всех чисел
        int[] a = readValue();
        String method = readMethod();
        int b = calculatedResult(a, method);
        System.out.println(b);


    }

    /**
     * @return возвращает считанные числа
     */
    static int[] readValue() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        return intArray;

    }

    static String readMethod() {
        Scanner sc = new Scanner(System.in);
        String method = sc.next();
        return method;
    }

    static int calculatedResult(int[] readValue, String readMethod) {
        int res = 0;
        for (int i = 0; i < readValue.length; i++) {
            if (readMethod.toLowerCase(Locale.ROOT).equals("сложение")) {
                res = res + readValue[i];
            } else if (readMethod.toLowerCase(Locale.ROOT).equals("вычитание")) {
                res = res - readValue[i];
            } else if (readMethod.toLowerCase(Locale.ROOT).equals("умножение")) {
                if (i == 0) {
                    res = readValue[i];
                } else {
                    res = res * readValue[i];
                }
            }

        }
        return res;
    }
}

class task0507 {
    public static void main(String[] args) {
        String[] info = inputData();
        // String o = info[0];
        result(info); //нельзя просто так взять и засунуть значение в метод

        //System.out.println(result());
    }

    static String[] inputData() {
        Scanner sc = new Scanner(System.in);
        String figure = sc.next();

        if (figure.equals("circle")) {
            String[] circle = new String[2];
            String radius = sc.next();
            circle[0] = figure;
            circle[1] = radius;
            return circle;
        } else if (figure.equals("rectangle")) {
//            String[] rectangle = new String[3];
//            String length = sc.next();
//            String width = sc.next();
//            rectangle[0] = figure;
//            rectangle[1] = length;
//            rectangle[2] = width;

//            String[] rectangle = {figure, sc.next(), sc.next()};
//            return rectangle;
            return new String[]{figure, sc.next(), sc.next()};
        } else {
            String[] triangle = {figure, sc.next(), sc.next(), sc.next()};
            return triangle;
        }
    }

    static int result(String[] info) {
        String figure = info[0];
        if (figure.equals("circle")) {
            int a = Integer.parseInt(info[1]);
            return areaCircle(a);
        } else if (figure.equals("rectangle")) {
            int a = Integer.parseInt(info[1]);
            int b = Integer.parseInt(info[2]);
            return areaRectangle(a, b);
        } else {
            int a = Integer.parseInt(info[1]);
            int b = Integer.parseInt(info[2]);
            int c = Integer.parseInt(info[3]);
            return areaTriangle();

        }
    }

    private static int areaCircle(int radius) {
        int result = radius * radius;
        return result;
    }

    private static int areaTriangle() {
        return 0;
    }

    private static int areaRectangle(int a, int b) {
        return 0;

    }


}

class TempMethods {
    public static void main(String[] args) {
        int a = 2;
        temp(a, 4);

    }

    private static void temp(int i, int j) { // int i = a;
        String b = "Иванов Иван Иванович";
        String[] v = b.split("а");
        System.out.println(Arrays.toString(v));

    }
}

class Average {
    public static void main(String[] args) {
        // Считывание данных
        int[] readerResult = reader();
        System.out.println(Arrays.toString(readerResult));
/*        int readerResultLength = readerResult.length;
        System.out.println(readerResultLength);*/
        // Вычисление ответа
        //calculation(readerResult);
        // Вывести ответ
        double result = calculation(new int[]{1,2,3});
        System.out.println(result);

    }

    public static int[] reader() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int countSpace = 1;
        for (int i = 0; i < strLength; i++) { // '1 2 3 4' -> [1,2,3,4,5]
            char a = str.charAt(i);

            if (a == ' ') {
                countSpace++;
            }
        }
        int[] arrayOfNumber = new int[countSpace];
        String number = "";
        int countNumber = 0;
        for (int i = 0; i < strLength; i++) {
            char a = str.charAt(i); // '2', '2', '2', ' ' -> "222"
            if (a != ' ') {
                number = number + a;
            }
            if (a == ' ' || i == strLength - 1) {
                arrayOfNumber[countNumber] = Integer.valueOf(number);
                countNumber++;
                number = "";
            }
        }
        return arrayOfNumber;
    }

    public static double calculation(int[] readerResult) {
        double sum = 0;
        for (int i = 0; i != readerResult.length; i++) {
            sum = sum + readerResult[i];

        }
        double averageSum = sum/readerResult.length;
        return averageSum;
    }
}


