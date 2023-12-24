package OOP.Encapsulation.Test;
import OOP.Encapsulation.Theory.Theory;
// за пределами пакета в котором находится класс theory
public class Test {
    public static void main(String[] args) {
        Theory theory1 = new Theory(5, 9);
        System.out.println(theory1.a);
//        System.out.println(theory1.b); - пример с переменной protected
//        System.out.println(theory1.d);
    }
}
