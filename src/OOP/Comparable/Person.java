package OOP.Comparable;
//если объекты классов будут сравниваться всегда имплементироваться от Comparable
public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    @Override
    public int compareTo(Person o) {

        return age.compareTo(o.getAge());
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
