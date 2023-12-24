package OOP.Enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class EnumerationMain {
    final int DAY = 20;
    final ArrayList<Integer> ARRAY = new ArrayList<>();

    public static void main(String[] args) {
//        Seassons current = Seassons.WINTER;
//        Book W = new Book("sdfdsf", 1, BookType.SCIENCE);
//        System.out.println(Seassons.WINTER.a);


        System.out.println(Arrays.toString(Color.values()));
        List<Color> colors1 = Arrays. asList(Color.values());
        for (int i = 0; i < colors1.size(); i++) {
            System.out.println(colors1.get(i)+": "+colors1.get(i).getСolor());
        }

        System.out.println(Operations.MULTIPLE.action(2,3));
    }

}
