package OOP.Encapsulation.Theory;
//классы test и theory находятся внутри одного пакета
public class Test {
    public static void main(String[] args) {
        Theory theory1 = new Theory(5, 2, 5);
        System.out.println(theory1.a+" "+theory1.b);
//        System.out.println(theory1.c); пример с приватной переменной
        System.out.println(theory1.d);
    }
}
