package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);
        arrayList.iterator();

        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());
            itr.next();
        }

//        System.out.println(itr.toString());

        for (Integer integer: arrayList) {

            System.out.println(integer);
        }
    }


}
