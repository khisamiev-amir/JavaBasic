package OOP.Enumeration.HomeWork;

public enum Season {
//    SPRING("Весна, сейчас мы учимся"),
//    AUTUMN("Осень, сейчас мы учимся"),
//    SUMMER("Лето, сейчас мы отдыхаем"),
//    WINTER("Зима, сейчас мы учимся");
    SPRING("Весна"),
    AUTUMN("Осень"),
    SUMMER("Лето"),
    WINTER("Зима");

   private String s;


    Season(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
