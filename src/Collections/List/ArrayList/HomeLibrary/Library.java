package Collections.List.ArrayList.HomeLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> bookCollections = new ArrayList<>();

    public Library() {
    }

    public Library(List<Books> a) {
        bookCollections = a;
    }
    public void addBook(Books book){

        this.bookCollections.add(book);
    }
    public void removeBook(Books book){

        this.bookCollections.remove(book);
    }

    public List<Books> sortCollectionsByTheName(){
        List<Books> mas = bookCollections;
        boolean isSorted = false;
        Books buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.size()-1; i++) {
                if ((mas.get(i).getName().compareTo(mas.get(i + 1).getName())) > 0)  {
                    isSorted = false;

                    buf = mas.get(i);
                    mas.set(i, mas.get(i+1)) ;
                    mas.set(i+1,buf);
                }
            }

        }
        return mas;

    }
    public List<Books> sortCollectionsByThePublicationDate() {

        List<Books> mas = bookCollections;
        boolean isSorted = false;
        Books buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.size()-1; i++) {
                if (mas.get(i).getPublicationDate().after(mas.get(i+1).getPublicationDate()) ) {
                    isSorted = false;

                    buf = mas.get(i);
                    mas.set(i, mas.get(i+1)) ;
                    mas.set(i+1,buf);
                }
            }

        }
        return mas;
    }
    public List<Books> sortCollectionsByTheAuthor() {
        List<Books> mas = bookCollections;
        boolean isSorted = false;
        Books buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.size()-1; i++) {
                if ((mas.get(i).getAuthor().compareTo(mas.get(i + 1).getAuthor())) > 0)  {
                    isSorted = false;

                    buf = mas.get(i);
                    mas.set(i, mas.get(i+1)) ;
                    mas.set(i+1,buf);
                }
            }

        }
        return mas;

    }
    public List<Books> findByAuthor(String a){
        List<Books> mas = bookCollections;
        List<Books> mas1 = new ArrayList<>();
        for (int i = 0; i < mas.size(); i++) {
            if(a.equals(mas.get(i).getAuthor())){
                mas1.add(mas.get(i));
            }

        }
        return mas1;
    }
}
