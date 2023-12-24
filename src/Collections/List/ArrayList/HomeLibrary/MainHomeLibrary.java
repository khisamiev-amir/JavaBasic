package Collections.List.ArrayList.HomeLibrary;

import java.util.Date;

public class MainHomeLibrary {


    public static void main(String[] args) {
        Books book1 = new Books("АЕсенин", new Date(14, 12, 12), "Шегане3");
        Books book2 = new Books("ВПушкин", new Date(13, 12, 12), "Шегане1");
        Books book3 = new Books("БЛермонтов", new Date(12, 12, 12), "Шегане2");
        Books book4 = new Books("БЛермонтов", new Date(12, 12, 12), "Шегане2");
        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        System.out.println(library1.sortCollectionsByThePublicationDate());
        System.out.println(library1.sortCollectionsByTheAuthor());
        System.out.println(library1.sortCollectionsByTheName());
        System.out.println(library1.findByAuthor("БЛермонтов"));

    }
}
