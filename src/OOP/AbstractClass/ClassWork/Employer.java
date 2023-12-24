package OOP.AbstractClass.ClassWork;

public class Employer extends Person{
    public Employer(String name) {
        super(name);
    }


    @Override
    public void getSalary() {
        System.out.println("Высокая зп");
    }
}
