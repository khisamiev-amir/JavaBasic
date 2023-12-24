package OOP.com.company.professions;

public class Driver extends Person{
    protected int experience;

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + super.toString().replaceAll("[^0-9]", "") +
                ", experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
