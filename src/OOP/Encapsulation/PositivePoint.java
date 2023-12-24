package OOP.Encapsulation;

public class PositivePoint {//всегда должен быть один публичный класс внутри файла с разрешение .java если в файле только один класс, то .java нет
    private int a;//обчно всегда создаем приватные переменные
    private int b;

    public PositivePoint(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public int getA() {//getter - это метод который, возвращает значение приватной переменной а
        return a;
    }

    public void setA(int a) throws Exception {//setter - это метод который, меняет значение приватной переменной а и перед этим проверяет условие
        if (a < 0) {
            throw new Exception();
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

