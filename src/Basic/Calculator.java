package Basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter operator:");
        String operator = scanner.next();
        if (operator.equals("+")){
            System.out.println(firstNumber + secondNumber);
        }
        else if (operator.equals("-")){
            int result =  firstNumber - secondNumber;
            System.out.println(result);
        }
        else if(operator.equals("*")){
            int result =  firstNumber * secondNumber;
            System.out.println(result);
        }
        else if (operator.equals("/")){
            int result =  firstNumber / secondNumber;
            System.out.println(result);
        }
        else {
            System.out.println("Non-existent operator");
        }
        //System.out.println(operator);

    }
}