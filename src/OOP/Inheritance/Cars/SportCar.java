package OOP.Inheritance.Cars;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String color, String brand, int maxSpeed) {
        super(color, brand);
    }

    public SportCar() {
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void starEngine() {
        System.out.println("Спортивный автомобиль запускается");

    }
}
