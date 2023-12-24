package OOP.Interface.Temperature;

public class MainTemperature {
    public static void main(String[] args) {
        C temperature1 = new C(11);
        F temperature2 = new F(12);
        K temperature3 = new K(13);
        System.out.println(temperature2.conversion()+" "+temperature3.conversion());
    }
}
