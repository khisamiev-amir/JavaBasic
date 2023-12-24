package OOP.Encapsulation.Theory;

public class Theory {


    // public - это публичный метод или переменная, которая доступна внутри класса, внутри пакета и за пределами пакета(везде)
    public int a; //атрибут
    // protected - это защищенный метод или переменная, которая доступна внутри класса или внутри пакета
    protected int b;
    // private - это метод или переменная, которая доступна только внутри класса
    private int c;
    int d=5;//по умолчанию protected

    public Theory(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Theory(int a) {
        this.a = a;
    }

    public Theory(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        //внутри класса
        Theory theory = new Theory(2,3, 4);
        System.out.println(theory.a);
        System.out.println(theory.b);
        System.out.println(theory.c);
        System.out.println(theory.d);
    }
}
