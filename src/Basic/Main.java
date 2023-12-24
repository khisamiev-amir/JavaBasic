package Basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter operator:");
        int operator = scanner.nextInt();
        if (operator==1){
            int result =  firstNumber + secondNumber;
            System.out.println(result);
        }
        if (operator==2){
            int result =  firstNumber - secondNumber;
            System.out.println(result);
        }
        if (operator==3){
            int result =  firstNumber * secondNumber;
            System.out.println(result);
        }
        if (operator==4){
            int result =  firstNumber / secondNumber;
            System.out.println(result);
        }
        //System.out.println(operator);

    }
}
