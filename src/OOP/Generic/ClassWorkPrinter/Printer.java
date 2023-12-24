package OOP.Generic.ClassWorkPrinter;

import java.util.Collection;

public class Printer {
    public <T> void print(Collection<T> a){
        for (T s:a
             ) {
            System.out.println(s);
        }
    }
}
