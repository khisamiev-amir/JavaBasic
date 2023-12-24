package OOP.Encapsulation.Task2610;

import Basic.Exceptions.task2610;

public class MainTask2610 {
    public static void main(String[] args) {
        try {
            Watch watch1 = new Watch(23, 59, 59); //при создании объекта я же могу, что угодно написать, как этого избежать?

            System.out.println(watch1);
//            watch1.setHour();
//            watch1.setMinutes();
            watch1.setSeconds();
            System.out.println(watch1);
        } catch (task2610 tsk2610) {
            System.out.println(tsk2610.getMessage());
        }

    }
}
