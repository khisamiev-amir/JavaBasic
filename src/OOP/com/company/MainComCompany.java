package OOP.com.company;

import OOP.com.company.details.Engine;
import OOP.com.company.professions.Driver;
import OOP.com.company.vehicles.Car;

public class MainComCompany {
    public static void main(String[] args) {
        Engine bmv = new Engine(200, "bmw");
        Car lada = new Car(
                "Премиус",
                new Engine(100, "ваз"),
                new Driver(10, "Володя", 10),
                "2109"
        );
        Car bmw = new Car(
                "Эконом",
                bmv,
                new Driver(1,"Крот", 1),
                "уцдлк"
        );
        System.out.println(lada);
        System.out.println(bmw);


    }
}
