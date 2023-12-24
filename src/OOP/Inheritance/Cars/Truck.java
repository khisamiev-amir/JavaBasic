package OOP.Inheritance.Cars;


public class Truck extends Car {

    private Integer countWells ;

//    public Truck(String color, String brand) {
//        super(color, brand);
//    }

    public Truck(String color, String brand, Integer countWells) {
        super(color, brand);//super - это объект родительского класса, т.е. всё, что есть в родительском классе должно быть тут и это обязательно
        //переносится через super


        this.countWells = countWells;//this - это объект класса в котором он находится
    }

    @Override
    public void starEngine() {
        System.out.println("Грузовой автомобиль запускается");
    }

    public int Volume(int length, int wight, int high){
        return length*wight*high;
    }
}
