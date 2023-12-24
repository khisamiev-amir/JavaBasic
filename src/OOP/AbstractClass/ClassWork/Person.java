package OOP.AbstractClass.ClassWork;

import Basic.Array;

public abstract class Person implements MadePurchase{
    @Override
    public void madePurchase(){

    };

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void getSalary();

}
