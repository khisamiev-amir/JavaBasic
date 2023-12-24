package OOP.Telephone;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        Phone nokia= new Phone("79171234561", "A1", 100);
        Phone siemens = new Phone("89393954195","Ф105" );
        Phone alcatel = new Phone("89736165324","VJe",50);
        Phone onePlus = new Phone("78945612311", "9rt", 200);
        System.out.println(nokia.getNumber());
        nokia.receiveCall("Валера");
        System.out.println(siemens.getNumber());
        siemens.receiveCall("Валера");
        System.out.println(alcatel.getNumber());
        alcatel.receiveCall("Валера");
//        String[] numbers = {"123", "456"};
//        alcatel.sendMessage(numbers);
        alcatel.sendMessage(new String[]{"123", "456"});
    }
}
