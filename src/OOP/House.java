package OOP;

import java.util.Scanner;

public class House{ // класс - модель чего-то, класс нельзя сделать статическим, статическим может быть только метод или атрибут
    int area=200; // атрибут
    String houseName = "Home sweet home";
    String color;
    public void buildHouse(){// метод
        System.out.println("Строится дом "+houseName+" с площадью "+area);
    }
}