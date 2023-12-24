package OOP.Interface.Temperature;

public class F implements ParentTemperatureInterface{
    private double degree;
    @Override
    public double conversion() {
        return this.degree+32;
    }

    public F(double degree) {
        this.degree = degree;
    }

}
