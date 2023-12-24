package OOP.Point;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Конструктор Point() - метод, который вызывается автоматически при создании объекта класса. Нужен для того, что бы создать объект класса.
        // Конструктор - это метод, который имеет название такое же, как и сам класс

        Point firstPoint = new Point(1,2); // объект класса Point
//        Point tempPoint = new Point();

//        firstPoint.x = 1;
//        firstPoint.y = 2;
//        String s = "ghhh";
//        String res = s.replace(); //this = s
//        String p = "ghhhhhh";
//        String res2 = p.replace() // this = p
        System.out.println(firstPoint);
        System.out.println(firstPoint.pointCoordinates());

        Point secondPoint = new Point(2,3); // объект класса Point
//        secondPoint.x = 2;
//        secondPoint.y = 3;
        System.out.println(secondPoint.pointCoordinates());

        Field field = new Field(); // объект класса Field
        field.insertPoint(firstPoint);
        field.insertPoint(secondPoint);
//        System.out.println(Arrays.toString(field.fieldPoints));
         field.printPoints();
//
//        Point secondPoint = new Point();
//        System.out.println(secondPoint.pointCoordinates());
//        int [] pointCoordinates=pointCoordinates();
//        System.out.println(Arrays.toString(pointCoordinates));
    }
}
