package OOP.Telephone;

public class Phone {
    String number; //это атрибуты.
    String model;
    double weight;

    public Phone(String number, String model, double weight) { //конструктор имеет такое же название, как и у класса. Вызывается автоматически.
        this(number, model);
//        this.number = number;
//        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String a, String b) { //String a, String b - Это параметры, они только для методов. Аргу
        String name=a;
        String number=b;
    }
    
    public void sendMessage (String[] a ){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +";");
        }
    }

    public String getNumber() {
        return number;
    }
}
