package OOP.Encapsulation.Task2810;

import Basic.Exceptions.DecimalCounterExceptionTask2810;

public class Main2810 {
    public static void main(String[] args) {
        try {
            DecimalCounter decimalCounter1 = new DecimalCounter(1);
            decimalCounter1.increment(10);
            decimalCounter1.decrement(11);
            System.out.println(decimalCounter1.get_counter());
            System.out.println(decimalCounter1);
        } catch (DecimalCounterExceptionTask2810 dcet2810) { //всё равно не понимаю почему так, просто так делаю
            System.out.println(dcet2810.getMessage());
        }
    }
}
