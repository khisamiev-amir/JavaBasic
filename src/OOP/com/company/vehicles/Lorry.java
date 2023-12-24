package OOP.com.company.vehicles;

import OOP.com.company.details.Engine;
import OOP.com.company.professions.Driver;

public class Lorry extends Car{
    protected int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
