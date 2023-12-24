package Basic;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int min=2;
        int i = 2;
        while (i!=1){
            if(x%i==0){
                min=i;
                //i = 0;
                break;
            }
            i++;
        }
        System.out.println(min);
    }
}


class BreakInFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 2;;i++) {
            if (x%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}

class Continue{
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
            System.out.println("Привет");

        }
    }
}

