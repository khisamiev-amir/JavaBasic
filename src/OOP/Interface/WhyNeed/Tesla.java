package OOP.Interface.WhyNeed;

public class Tesla implements Car, PowerBank {

    @Override
    public void Moving() {
        System.out.println("500 km");
    }

    @Override
    public void Charge() {
        System.out.println("20 h");
    }
}
