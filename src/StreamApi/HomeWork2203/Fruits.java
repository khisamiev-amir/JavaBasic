package StreamApi.HomeWork2203;

public class Fruits implements Comparable<Fruits>{
    private String color;
    private Integer weight;

    public Fruits(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruits o) {
        return weight.compareTo(o.getWeight());
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
