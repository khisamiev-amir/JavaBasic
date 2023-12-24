package Basic;/*import java.util.Scanner;
import java.util.Random;

public class Basic.SuYeFa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] options = new String[3];
        options[0] = "Камень";
        options[1] = "Ножницы";
        options[2] = "Бумага";
        System.out.println("Введите Камень или Ножницы или Бумага:");
        String playerChoice = sc.nextLine();
        int randomChoice = random.nextInt(3); //? почему не 2, с 2 не выпадала бумага
        System.out.println("Компьютер выбрал: " + options[randomChoice]);
        if (playerChoice.equals(options[randomChoice])) {
            System.out.println("Ничья");
        } else if (playerChoice.equals("Камень") && options[randomChoice].equals("Ножницы")) {
            System.out.println("Камень выигрывает Ножницы: Игрок победил");
        } else if (playerChoice.equals("Камень") && options[randomChoice].equals("Бумага")) {
            System.out.println("Камень проигрывает Бумаге: Игрок проиграл");
        } else if (playerChoice.equals("Ножницы") && options[randomChoice].equals("Камень")) {
            System.out.println("Ножницы проигрывают Камню: Игрок проиграл");
        } else if (playerChoice.equals("Ножницы") && options[randomChoice].equals("Бумага")) {
            System.out.println("Ножницы выигрывают Бумагу: Игрок победил");
        } else if (playerChoice.equals("Бумага") && options[randomChoice].equals("Камень")) {
            System.out.println("Бумага выигрывает Камень: Игрок победил");
        } else if (playerChoice.equals("Бумага") && options[randomChoice].equals("Ножницы")) {
            System.out.println("Бумага проигрывает Ножницам: Игрок проиграл");
        }

    }
}*/

import java.util.Scanner;
import java.util.Random;

public class SuYeFa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String rock = "Камень";
        String scissors = "Ножницы";
        String paper = "Бумага";
        System.out.println("Введите Камень или Ножницы или Бумага:");
        String playerChoice = sc.nextLine();
        int randomChoice = random.nextInt(3); //? почему не 2, с 2 не выпадала бумага
        String computerChoice;
        if (randomChoice == 0) {
            computerChoice = rock;
        } else if (randomChoice == 1) {
            computerChoice = scissors;
        } else {
            computerChoice = paper;
        }

        System.out.println("Компьютер выбрал: " + computerChoice);
        // Ты - камень, он бумага
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Ничья");
        } else if (playerChoice.equals("Камень") && computerChoice.equals("Ножницы")) {
            System.out.println("Камень выигрывает Ножницы: Игрок победил");
        } else if (playerChoice.equals("Камень")) {
            System.out.println("Камень проигрывает Бумаге: Игрок проиграл");
        } else if (playerChoice.equals("Ножницы") && computerChoice.equals("Камень")) {
            System.out.println("Ножницы проигрывают Камню: Игрок проиграл");
        } else if (playerChoice.equals("Ножницы")) {
            System.out.println("Ножницы выигрывают Бумагу: Игрок победил");
        } else if (playerChoice.equals("Бумага") && computerChoice.equals("Камень")) {
            System.out.println("Бумага выигрывает Камень: Игрок победил");
        } else if (playerChoice.equals("Бумага")) {
            System.out.println("Бумага проигрывает Ножницам: Игрок проиграл");
        } else{
            System.out.println("Игрок выбрал не существующую опцию");
        }
    }
}

