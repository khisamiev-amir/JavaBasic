package Collections.List.ArrayList.HomeLibrary;

import java.util.Date;

public class Books {
    private String author;
    private Date publicationDate;
    private String name;

    public Books(String author, Date publicationDate, String name) {
        this.author = author;
        this.publicationDate = publicationDate;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                ", name='" + name + '\'' +
                '}';
    }
}
