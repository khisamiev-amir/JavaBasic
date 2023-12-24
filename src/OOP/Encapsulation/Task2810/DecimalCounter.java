package OOP.Encapsulation.Task2810;

import Basic.Exceptions.DecimalCounterExceptionTask2810;

public class DecimalCounter {
    private int a;

    public DecimalCounter(int a) throws DecimalCounterExceptionTask2810 {
        if (a < 0) {
            throw new DecimalCounterExceptionTask2810("Счетчик не может быть меньше 0");
        }
        this.a = a;
    }

    public int get_counter() {
        return a;
    }

    public void increment(int increment) {

        this.a = a + increment;
    }

    public void decrement(int decrement) throws DecimalCounterExceptionTask2810 {
        this.a = a - decrement;
        if (a < 0) {
            throw new DecimalCounterExceptionTask2810("Счетчик не может быть меньше 0");
        }
    }

    @Override
    public String toString() {
        return "DecimalCounter{" +
                "a=" + a +
                '}';
    }
}
