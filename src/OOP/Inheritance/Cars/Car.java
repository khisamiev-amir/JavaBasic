package OOP.Inheritance.Cars;

public class Car {
    private String color;
    private String brand;

    public Car() {
    }
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    private void checkRules(){}

    public void starEngine(){
        System.out.println("Автомобиль запускается");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}
