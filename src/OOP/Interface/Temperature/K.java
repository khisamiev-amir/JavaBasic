package OOP.Interface.Temperature;

public class K implements ParentTemperatureInterface{
    private double degree;

    @Override
    /**
     * This method
     */
    public double conversion() {
        return this.degree+273.15;
    }

    public K(double degree) {
        this.degree = degree;
    }
}
