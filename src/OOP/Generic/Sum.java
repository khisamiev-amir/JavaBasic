package OOP.Generic;

public class Sum <T extends Number>{
    private T value1;
    private T value2;

    public T v1plusv2() throws Exception {
        Number result;
        if (value1 instanceof Double) {
            result = getValue1().doubleValue() + getValue2().doubleValue();
        } else if(value1 instanceof Integer) {
            result = getValue1().intValue() + getValue2().intValue();
        } else{
            throw new Exception("Не число");
        }


         return (T) result;
    }
    public Sum(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }
}
