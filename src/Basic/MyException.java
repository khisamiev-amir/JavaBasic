package Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//как создать свой эксепшн
class MyNewException extends Exception {
    MyNewException(String comment) {
        super(comment);
    }
}

//class ExampleException{
//    public static void main(String[] args) {
//        try {
//            checkFirstNumber();
//        } catch (Exception e){
//
//        }
//    }
//
//    public static void checkFirstNumber() throws Exception{
//        if (...){
//            throw new Exception("...");
//        }
//    }
//}

public class MyException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double result;
        int[] a = new int[10];
        try { // какая-то часть кода пробуем выполнить, если ошибок нет, всё как обычно, но если мы пойма эксепшн,то он будет захоить в кэтч блок
            result = calculated(sc.nextInt(), sc.nextInt());
            if (result * 10 % 10 == 0) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }
//            for (int i = 0; i < 12; i++) {
//                a[i] = i;
//            }
//            int b = Integer.parseInt("ghiuw98ire7u");
            if (result == -1) {
                throw new MyNewException("Небезопасно"); //к любому выбрасываему исключению есть комментарий
            }
        } catch (InputMismatchException ime) {
            System.out.println("Ошибка считывания");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Ошибка добавления данных в массив по индексу");
        } catch (Exception e) { // если хотим обработать все исключения
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (int i = stackTraceElements.length - 1; i >= 0; i--) {
                System.out.println(stackTraceElements[i]);

            }
            System.out.println(e.getMessage());
        }
        System.out.println("Программа продолжается...");
    }

    public static double calculated(double a, double b) {
        return a / b;
    }
}

class Date3107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        try {
//            int a = sc.nextInt();
//        } catch (InputMismatchException ime) {
//            System.out.println("Ошибка считывания");
//        }
//        try {
//            int b = sc.nextInt();
//        } catch (InputMismatchException ime) {
//            System.out.println("Ошибка считывания");
//        }

        boolean[] rows = new boolean[10];
        for (int i = 0; i < rows.length; i++) {
            if (i % 2 == 0) {
                rows[i] = true;
            } else {
                rows[i] = false;
            }
        }

        for (boolean k : rows) { // вывести все элементы массива
            System.out.println(k);
        }
    }

}

class Task1508 {
    public static void main(String[] args) {
        try {
            String value = reader();
            checkFirstDigit(value);
            checkBrackets(value);
            checkHyphen(value);
            String result = resultMaker(value);
            System.out.println(result);
        } catch (Exception e) { //Exception надо назвать, так же как например String n
            System.out.println(e.getMessage());
        }

    }

    public static String reader() {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        number = number.replace(" ", ""); //если в методе есть return то результат надо где-то сохранить
        return number;
    }

    public static void checkFirstDigit(String number) throws Exception { //если не хотим в try/catch оборачивать Exception в данном методе, то пишем throws Exception, но надо обязательно обработать в другом месте
        if (!(number.startsWith("+7") || number.startsWith("8"))) {
            throw new Exception("Неверное начало номера");
        }
    }

    public static void checkBrackets(String number) throws Exception {
        int countOpen = 0;
        int countClose = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '(') {
                countOpen++;
            }
            if (countOpen > 1) {
                throw new Exception("Неверное количество пар скобок");
            }
        }

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == ')') {
                countClose++;
            }
            if (countClose > 1) {
                throw new Exception("Неверное количество пар скобок");
            }

        }
        if (countOpen == 0 && countClose == 1 || countOpen == 1 && countClose == 0) {
            throw new Exception("Неверное количество пар скобок");
        }

        int indOpen = -1;
        int indClose = -1;
        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == '(') {
                indOpen = i;
            }
            if (number.charAt(i) == ')') {
                indClose = i;
            }

        }

        if (indOpen > indClose) {
            throw new Exception("Неверное расположение скобок");
        }

    }

    public static void checkHyphen(String number) throws Exception {
        if (number.charAt(0) == '-' || number.charAt(number.length() - 1) == '-') {
            throw new Exception("Дефис не может стоять в начале или в конце");
        }
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-' && number.charAt(i) == number.charAt(i + 1)) {
                throw new Exception("Не может стоять 2 дефиса подряд");
            }
        }
    }

    public static String resultMaker(String number) {
        StringBuilder result = new StringBuilder("+7");
        // 893
        // +7432
        int startInd = 2;
        if (number.charAt(0) == '8') {
            startInd = 1;
        }

        for (int i = startInd; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                result.append(number.charAt(i));
            }
        }
        return result.toString();
    }

//        public static boolean isDigit(char digitNumber) {
//        try {
//            Integer.parseInt(String.valueOf(digitNumber));
//            return true;
//        } catch (Exception e){
//            return false;
//        }
//    }


}
