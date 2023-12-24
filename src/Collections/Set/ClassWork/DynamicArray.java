package Collections.Set.ClassWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    private ArrayList<HeavyBox> heavyBoxList;
    private int a;

    public void put(HeavyBox a) {
        this.heavyBoxList.add(a);
    }

    public void put(List<HeavyBox> a) {
        this.heavyBoxList.addAll(a);
    }

    public void delete() {
        this.heavyBoxList.clear();
    }

    public DynamicArray(ArrayList<HeavyBox> heavyBoxList, int a) {
        this.heavyBoxList = heavyBoxList;
        this.a = a;
    }

//    public DynamicArray() {
//    }

    public void deleteLastBox() {
        this.heavyBoxList.remove(heavyBoxList.size() - 1);
    }

//    public Object[] getArray(){
//        Object[] a = this.heavyBoxList.toArray();
//        return a;
//    }

    public ArrayList<HeavyBox> getArray() {
        return this.heavyBoxList;
    }


    public void printer() {

        for (HeavyBox a : this.heavyBoxList
        ) {
            System.out.println(a);

        }

    }

    public ArrayList<HeavyBox> union(ArrayList<HeavyBox> a, ArrayList<HeavyBox> b) {
        ArrayList<HeavyBox> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    public ArrayList<HeavyBox> intersect(ArrayList<HeavyBox> a, ArrayList<HeavyBox> b) {
        ArrayList<HeavyBox> c = new ArrayList<>();
        for (HeavyBox t : a
        ) {
            if (b.contains(t)) {
                c.add(t);
            }
        }
        return c;

    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "heavyBoxList=" + heavyBoxList +
                '}';
    }
}
