package Basic;

import java.util.Scanner;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        String str1 = "Java";
        String str3 = "Klaviatura";
        StringBuffer str = new StringBuffer( "Java");
//        str.append(10*10*10*10*10*10*10*10*10*10);
//        System.out.println(str.capacity());
        str.setCharAt(1,'o');
        //System.out.println(str);
        str.replace(1,3, "abcfje");
        str1.replace('a','b');
       // System.out.println(str+" "+str1);

        StringBuilder str2=new StringBuilder(str3);
        str2.insert(2, "m");
        System.out.println(str2);
        str2.setLength(5);
        System.out.println(str2);
        str2.setLength(100);
        System.out.println(str2);
        str2.delete(0,1);//последний символ не включительно
        System.out.println(str2);

        // Разница StringBuilder и StringBuffer
        // Методы одни и те
        // НО StringBuffer УСТОЙЧИВ К МНОГОПОТОЧНОСТИ - он медленне
        // StringBuilder - если без многопоточности

    }
}


class task1_2905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        String result = " + = ";
        StringBuilder result1 = new StringBuilder(result);
        //result1.append(0, number1); - почему если я запускаю не этот класс, запуск другого ломается из-за этой строки
    }
}

class task2_0106{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Студент ");

        StringBuilder surname = new StringBuilder(sc.next());
        StringBuilder grade = new StringBuilder(sc.next());
//        String subject = sc.next();
        surname.setLength(15);

        str.append(surname);
        str.append(" получил " + grade);

        System.out.println(str);



    }
}