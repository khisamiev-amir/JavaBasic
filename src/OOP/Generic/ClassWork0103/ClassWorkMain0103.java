package OOP.Generic.ClassWork0103;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassWorkMain0103 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
       GeneratedResult <List<Integer>> generatedResult = new GeneratedResult<>();
        Collection <Integer> asd = generatedResult.generate(list1);
//        GeneratedResult <Integer> generatedResult1 = new GeneratedResult<>();
//        generatedResult1.generate(2);
        System.out.println(asd);
    }



}
