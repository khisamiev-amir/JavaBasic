package OOP.Comparable;

public class MainComparable {
    public static void main(String[] args) {
        Person men1 = new Person("Artur", 21);
        Person women1 = new Person("Liza", 22);
        System.out.println(men1.compareTo(women1));
    }
}
