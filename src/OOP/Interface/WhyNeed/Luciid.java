package OOP.Interface.WhyNeed;

public class Luciid implements Car, PowerBank{
    @Override
    public void Moving() {
        System.out.println("800 km");
    }

    @Override
    public void Charge() {
        System.out.println("10 h");
    }
}
