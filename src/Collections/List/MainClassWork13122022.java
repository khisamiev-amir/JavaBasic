package Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainClassWork13122022 {
    public static ArrayList<Integer> addMillionElementsArrayList() {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            arrayList1.add(0);
        }
        return arrayList1;
    }

    public static LinkedList<Integer> addMillionElementsLinkedList() {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList1.add(0);
        }
        return linkedList1;
    }

    public static void randomValueArrayList(ArrayList<Integer> a) {
        for (int i = 0; i < 100000; i++) {
            Random random1 = new Random();
            a.get(random1.nextInt(a.size()));
        }
    }

    public static void randomValueLinkedList(LinkedList<Integer> a) {
        for (int i = 0; i < 100000; i++) {
            Random random1 = new Random();
            a.get(random1.nextInt(a.size()));
        }

    }

    public static void removeFirstElementAL(ArrayList<Integer> a) {
        for (int i = 0; i < 100000; i++) {
            a.remove(0);
        }

    }

    public static void removeFirstElementLL(LinkedList<Integer> a) {
        for (int i = 0; i < 100000; i++) {
            a.remove(0);
        }

    }

    public static void main(String[] args) {
        long startArrayList = System.currentTimeMillis();
        ArrayList<Integer> arrayList2 = addMillionElementsArrayList();
        long finishArrayList = System.currentTimeMillis();
        long elapsedArrayList = finishArrayList - startArrayList;
        System.out.println(elapsedArrayList);

        long startLinkedList = System.currentTimeMillis();
        LinkedList<Integer> linkedList2 = addMillionElementsLinkedList();
        long finishLinkedList = System.currentTimeMillis();
        long elapsedLinkedList = finishLinkedList - startLinkedList;
        System.out.println(elapsedLinkedList);

//        long startArrayList1 = System.currentTimeMillis();
//        randomValueArrayList(arrayList2);
//        long finishArrayList1 = System.currentTimeMillis();
//        long elapsedArrayList1 = finishArrayList1 - startArrayList1;
//        System.out.println(elapsedArrayList1);
//
//        long startLinkedList1 = System.currentTimeMillis();
//        randomValueLinkedList(linkedList2);
//        long finishLinkedList1 = System.currentTimeMillis();
//        long elapsedLinkedList1 = finishLinkedList1 - startLinkedList1;
//        System.out.println(elapsedLinkedList1);

        long startArrayList1 = System.currentTimeMillis();
        removeFirstElementAL(arrayList2);
        long finishArrayList1 = System.currentTimeMillis();
        long elapsedArrayList1 = finishArrayList1 - startArrayList1;
        System.out.println(elapsedArrayList1);

        long startLinkedList1 = System.currentTimeMillis();
        removeFirstElementLL(linkedList2);
        long finishLinkedList1 = System.currentTimeMillis();
        long elapsedLinkedList1 = finishLinkedList1 - startLinkedList1;
        System.out.println(elapsedLinkedList1);

    }
}
