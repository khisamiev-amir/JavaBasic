package OOP.Enumeration;

public class Book {
    public String name;
    public Integer pageCount=1;
   public BookType bookType;

    public Book(String name, Integer pageCount, BookType bookType) {
        this.name = name;
        this.pageCount = pageCount;
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", bookType=" + bookType +
                '}';
    }
}
