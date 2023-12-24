package OOP.Enumeration;

public enum Seassons {
    WINTER(5),
    SPRING(5),
    SUMMER(new Book("gdf", 1, BookType.FANTASY)),
    AUTUMN(7);
    int a;
    Book book;

    Seassons(int a) {
        this.a = a;
    }

    Seassons(Book book) {
        this.book = book;
    }
}
