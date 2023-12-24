package OOP.AbstractClass.ClassWork;

public class Client extends Person {
    public Client(String name) {
        super(name);
    }

    @Override
    public void getSalary() {
        System.out.println("Неизвестно");
    }
}
