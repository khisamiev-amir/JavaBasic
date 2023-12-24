package Collections.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedlist1 = new LinkedList<>();
        linkedlist1.addFirst("Russia");
        linkedlist1.addFirst("USA");
        linkedlist1.addLast("France");
        linkedlist1.addLast("France1");
        linkedlist1.addLast("France2");
        System.out.println(linkedlist1);
        for (String s: linkedlist1) {
            System.out.println(s);
        }
    }
}


