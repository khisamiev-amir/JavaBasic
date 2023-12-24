package Basic;

import java.util.Scanner;

public class Task3108 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))){
                throw new Exception("Невалидная строка");
            }
        }
        int count=1;
        for (int i = 0; i < str.length()-1; i++) {
            // AAAA
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else if(str.charAt(i)!=str.charAt(i+1)&&count!=1){
                System.out.print(str.charAt(i)+String.valueOf(count));
                count=1;
            }else if(str.charAt(i)!=str.charAt(i+1)&&count==1){
                System.out.print(str.charAt(i));
                count=1;
            }
        }
        if(str.charAt(str.length()-1)==str.charAt(str.length()-2) ){
            System.out.println(str.charAt(str.length()-1)+String.valueOf(count));
        }else{
            System.out.println(str.charAt(str.length()-1));
        }

    }
}
