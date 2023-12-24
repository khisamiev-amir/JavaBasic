package OOP.Generic.ClassWorkPrinter;

import java.util.ArrayList;
import java.util.List;

public class PrinterMain {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        List<String> list2 = new ArrayList<String>() {
            {
                add("один");
                add("два");
                add("три");
            }
        };
        Printer printer = new Printer();
        printer.print(list1);
        printer.print(list2);

    }
}
