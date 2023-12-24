package Basic;

import Basic.Exceptions.*;

public class Task_19102022 {
    public static void main(String[] args) {
       double a = numberDivider("1", "2");
        System.out.println(a);
    }

    public static double numberDivider(String number1, String number2) {
        boolean checkNumber1 = number1.matches("^[0-9]+$");
        boolean checkNumber2 = number2.matches("^[0-9]+$");

        double result = 0;
        try {
            if (!(checkNumber1 && checkNumber2)) {
                throw new DataEnteredIncorrectly("Данные введены некорректно");
            }
            result = Double.valueOf(number1) / Double.valueOf(number2);

        } catch (DataEnteredIncorrectly dei) {
            System.out.println(dei.getMessage());
        }


        return result;
    }

}
