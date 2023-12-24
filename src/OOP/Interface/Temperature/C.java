package OOP.Interface.Temperature;

public class C implements ParentTemperatureInterface{
    private double degree;
    @Override
    public double conversion() {
        return this.degree;
    }

    public C(double degree) {
        this.degree = degree;
    }
}
