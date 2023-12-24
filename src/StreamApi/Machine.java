package StreamApi;

public class Machine {
    private String number;
    private Integer date;

    public Machine(String number, int date) {
        this.number = number;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "number='" + number + '\'' +
                ", date=" + date +
                '}';
    }

//    @Override
//    public int compareTo(Machine o) {
//        return date.compareTo(o.getDate());
//    }
}
