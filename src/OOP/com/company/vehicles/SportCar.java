package OOP.com.company.vehicles;

import OOP.com.company.details.Engine;
import OOP.com.company.professions.Driver;

public class SportCar extends Car {
    protected double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
