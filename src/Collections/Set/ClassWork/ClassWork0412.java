package Collections.Set.ClassWork;

import java.util.*;

public class ClassWork0412 {
    public static void f(int a){

    }
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(1,1,1,1);
        HeavyBox box2 = new HeavyBox(2,2,2,2);
        HeavyBox box3 = new HeavyBox(3,3,3,3);
        HeavyBox box4 = new HeavyBox(4,4,4,4);

//        DynamicArray dynamicArray1 = new DynamicArray();
        String a;
        ArrayList<HeavyBox>heavyBoxList2 = new ArrayList<>();
        DynamicArray dynamicArray2 = new DynamicArray(new ArrayList<>(),12 );
        ArrayList<HeavyBox> heavyBoxList = new ArrayList<>();
        heavyBoxList.add(box1);
        heavyBoxList.add(box2);
        heavyBoxList.add(box3);
        heavyBoxList2.add(box3);
        heavyBoxList2.add(box4);

//        dynamicArray1.put(box1);
//        dynamicArray1.printer();
//        dynamicArray1.put(heavyBoxList);
//        dynamicArray1.printer();
//        dynamicArray1.deleteLastBox();
//        System.out.println(dynamicArray1);
////        System.out.println(Arrays.toString(dynamicArray1.getArray()));
//        System.out.println(dynamicArray1.getArray());
        System.out.println(heavyBoxList);
        TreeSet<HeavyBox> treeSet1 = new TreeSet<>();
        treeSet1.addAll(heavyBoxList);
        System.out.println(treeSet1);
        ArrayList<HeavyBox> heavyBox3;
        heavyBox3 = dynamicArray2.union(heavyBoxList,heavyBoxList2);
        System.out.println(heavyBox3);
        ArrayList<HeavyBox> heavyBox4;
        heavyBox4 = dynamicArray2.intersect(heavyBoxList,heavyBoxList2);
        System.out.println(heavyBox4);



    }
}
