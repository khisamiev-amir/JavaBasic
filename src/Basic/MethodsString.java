package Basic;

import java.util.Scanner;


public class MethodsString {
    int main = 3;

    public static void main(String[] args) {
        String a = "1";
        Scanner sc = new Scanner(System.in);
        boolean b = a.isEmpty(); //определяет является ли строка пустой
        String c = "f";
        System.out.println(b);
        String d = a.concat("c");//обединяет строки
        String e = a.concat(c);
        System.out.println(d + " " + e);
        System.out.println(d.compareTo("c")); //сравнивает 2 строки
        System.out.println("d".compareTo("a"));
        String f = " abraka dabra ";
        int index = f.indexOf("k"); //находит индекс первого вхождения подстроки в строку
        System.out.println(index);
        int indexLast = f.lastIndexOf("k");//находит индекс последнего вхожения подстроки в строку
        System.out.println(indexLast);
        boolean startsWith = f.startsWith("ab");//определяет начнается ли строка с подстроки
        System.out.println(startsWith);
        String replace = f.replace("a", "e");//заменяет в строке одну подстроку на другую
        System.out.println(replace);
        String replace1 = f.replace(" ", "");
        System.out.println(replace1);
        String substring = f.substring(f.trim().length() - 2);//возвращает подстроку, начиная с опеределнного ндекса до конца или до определенного индекса
        System.out.println(substring);


    }
}


class Task_1_2905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//         int count = StringUtils.countMatches(" ");//? почему нет такого метода, и почему ругается, если запускаю другую часть кода

    }
}

//In the towm where I was born
class Task_1_2_2905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) { //пробежаться по всем символам строки
            //System.out.println(str.charAt(i));
            char str1 = str.charAt(i);
            if (str1 == ' ') {
                count++;

            }

        }
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(count + 1);
        }


    }
}

//abba
class task2_2905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        for (int i = str.length() - 1; i > -1; i--) {
            //System.out.println(str.charAt(i));
            str1 = str1 + Character.toString(str.charAt(i));
            //System.out.println(str1);
        }
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

