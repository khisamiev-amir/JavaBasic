package OOP.Encapsulation.Task2410;

import java.sql.SQLOutput;

public class MainTask2410 {
    public static void main(String[] args) {
        Author gogol = new Author("Гоголь", "gogol@mail.ru", 'm');
        Book book1 = new Book("Ревизор", gogol, 1000, 10 );

        System.out.println(book1.getBookName());
        System.out.println(book1.getAuthor().getEmail());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());
        Integer a = new Integer(2);
        String authorStr = book1.getAuthor().toString();

        int b = 2;
        String.valueOf(b);
    }
}
