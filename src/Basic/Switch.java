package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.next();
        switch (item) {
            case "Monday":
                System.out.println("Один");
                break;
            case "Thursday":
                System.out.println("Два");
                break;
            default:
                System.out.println("Не один и не два");
                break;
        }
    }
}

class Task2205_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        boolean x = true;
        while (x) {
            String answer = sc.next();
            switch (answer) {
                case "Троллейбус":
                    System.out.println("Правильно");
                    x = false;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: троллейбус");
                    x = false;
                    break;
                default:
                    System.out.println("Подумай еще.");
                    break;

            }
        }
    }
}
