package OOP;

public class Youtube {
    // null
    String name;//атрибуты это переменные внутри класса

    // 0
    static int activePeriod; // это переменная , которая имеет одинаковое значение как для всех объектов класса так и для самого класса

    static void changeActivePeriod(int newPeriod){
        if (newPeriod < 1){
            System.out.println("Неверное значение пероида");
        } else {
            activePeriod = newPeriod;
        }
    }
    public static void main(String[] args) {
        Youtube i = new Youtube();//объект класса youtube
        Youtube mama = new Youtube();
        Youtube papa = new Youtube();
        Youtube brat = new Youtube();

        i.name = "Rafail";
        mama.name = "Maria";
        papa.name = "Vladimir";

        System.out.println(brat.name);

//      papa.activePeriod = 30;
        Youtube.activePeriod = 30;
        System.out.println(i.activePeriod + " " + papa.activePeriod + " " +  mama.activePeriod);

        changeActivePeriod(-10);
        System.out.println(i.activePeriod + " " + papa.activePeriod + " " +  mama.activePeriod);

        changeActivePeriod(60);
        System.out.println(i.activePeriod + " " + papa.activePeriod + " " +  mama.activePeriod);
    }
}
