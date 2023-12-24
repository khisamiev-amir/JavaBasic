package OOP.com.company.details;

public class Engine {
    protected int power;
    protected String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
