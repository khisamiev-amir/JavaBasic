package OOP.Inheritance.Cars;

public class CarMain {
    public static void main(String[] args) {
        Truck t = new Truck("red", "toyota", 6);
        Car car1 = new Car();
        SportCar c1 = new SportCar();
        System.out.println(t.getBrand());

        car1.starEngine();
        t.starEngine();
        c1.starEngine();
        Car c2 = new Truck("red", "toyota", 6);
//        System.out.println(c2.);
        System.out.println(t.Volume(1,2,3));

        Car[] cars = {
                new Truck("red", "toyota", 6),
                new SportCar("red", "toyota", 310),
                new Car()
        };
        ((Truck) cars[0]).Volume(12,2,3);
        cars[0].starEngine();
        cars[1].starEngine();
        cars[2].starEngine();

    }
}
