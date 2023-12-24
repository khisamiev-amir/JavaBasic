package OOP.Enumeration.HomeWork;

public class HomeWork2502 {
    public static void result(School school) {
        System.out.print("Школа №" + school.getSchoolNumber() + ", учащихся " + school.getNumberOfStudent() + ", ");
        switch (school.getSeason()){
            case AUTUMN:
                System.out.println("сейчас мы учимся");
                break;
            case WINTER:
                System.out.println("сейчас мы учимся");
                break;
            case SPRING:
                System.out.println("сейчас мы учимся");
                break;
            case SUMMER:
                System.out.println("сейчас мы отдыхаем");
                break;
        }

    }

    public static void main(String[] args) {
        School school125 = new School(125, 123, Season.WINTER);
        School school156 = new School(156, 325, Season.SUMMER);
        result(school125);
        result(school156);
    }
}
