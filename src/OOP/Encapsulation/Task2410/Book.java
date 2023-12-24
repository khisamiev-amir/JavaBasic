package OOP.Encapsulation.Task2410;

public class Book {
    private String bookName;

    private Author author;
    private double price;
    private int qty = 0;

    public Book(String bookName, Author author, double price, int qty) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String bookName, Author author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public String getAuthor() {
//       String authorstr = author.getName() + " " + author.getEmail() + " " + author.getGender();
//        return authorstr;
//    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
