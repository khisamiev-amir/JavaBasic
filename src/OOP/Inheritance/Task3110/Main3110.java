package OOP.Inheritance.Task3110;

public class Main3110 {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Петров", "Иван", "101", 5, "Научная работа");
        Student[] arrayStudent = {
                new Aspirant("Петров", "Петр", "101", 5, "Научная работа Петров"),
                new Aspirant("Иванов", "Иван", "102", 4, "Научная работа Иванов"),
                new Student("Соколов", "Сокол", "103", 5),
                new Student("Кедров", "Кедр", "104", 3)
        };
        for (int i = 0; i < arrayStudent.length; i++) {
            System.out.println("Степендия " + arrayStudent[i].getLastName() + " " + arrayStudent[i].getFirstName()
                    + " из группы " + arrayStudent[i].getGroup() + " имеет оценку " + arrayStudent[i].getAverageMark() + " и получает степендию "
                    + arrayStudent[i].getScholarship());
        }
    }
}
