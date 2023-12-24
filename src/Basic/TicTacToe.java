package Basic;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Добро пожаловать в игру!
    // 1 2 3
    // 4 5 6
    // 7 8 9
    static int draw = 0;

    // Ввыедите число:
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру, каждый символ - это место на поле");
        String[][] field = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
//        printField(field);
        int a = firstTurn();
        while (checkGameResult(field) && draw == 0) {
            if (a == 0) {
                turnPlayer(field);
                a = 1;
            } else {
                turnComputer(field);
                a = 0;
            }
        }
        printField(field);


        if (a == 1 && draw != 1) {
            System.out.println("Выиграл пользователь");
        } else if (a != 1 && draw != 1) {
            System.out.println("Выиграл компьютер");
        } else {
            System.out.println("Ничья");
        }


    }

    private static void turnComputer(String[][] field) {
        printField(field);
        String a;
        boolean symbolInsert = false;
        Random random = new Random();
        do {
            a = String.valueOf(random.nextInt(9) + 1);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field[i][j].equals(a)) {
                        field[i][j] = "0";
                        symbolInsert = true;
                        System.out.println("Ход компьютера: " + a);
                    }
                }
            }
        } while (!symbolInsert);

    }

    public static void printField(String[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int firstTurn() {
        int a = -1;
        Random random = new Random();
        a = random.nextInt(2);
        if (a == 0) {
            System.out.println("Первый ходит игрок");
        } else {
            System.out.println("Первый ходит компьютер");
        }
        return a;
    }

    public static void turnPlayer(String[][] field) {
        printField(field);
        System.out.print("Ход игрока: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        boolean isExist = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(value)) {
                    field[i][j] = "x";
                    isExist = true;
                }
            }
        }

        if (!isExist) {
            System.out.println("Сделан неверный ход");
            turnPlayer(field);
        }
    }

    public static boolean checkGameResult(String[][] field) {
        // Ряды
        for (int i = 0; i < 3; i++) {
            String firstElem = field[i][0];
            boolean isEqual = true;

            for (int j = 0; j < 3; j++) {
                if (!firstElem.equals(field[i][j])) {
                    isEqual = false;
                }
            }

            if (isEqual) {
                return false;
            }

        }
        // Столбцы

        // x 0 0
        // x x 0
        // x 0 x -> (2,0) (1,1) (0,2) -> (2-0, 0) (2-1,1) (2-2,2)
        for (int i = 0; i < 3; i++) {
            String firstElem = field[0][i];
            boolean isEqual = true;

            for (int j = 0; j < 3; j++) {
                if (!firstElem.equals(field[j][i])) {
                    isEqual = false;
                }
            }

            if (isEqual) {
                return false;
            }
        }

        String firstElem = field[0][0];
        boolean isEqual = true;


        // Диагонали
        for (int i = 0; i < 3; i++) {

            if (!firstElem.equals(field[i][i])) {
                isEqual = false;
            }
        }
        if (isEqual) {
            return false;
        }

        // i == j
        // j = len - 1 - i
        firstElem = field[field.length - 1][0];
        isEqual = true;

        for (int i = 0; i < 3; i++) {
            if (!firstElem.equals(field[field.length - 1 - i][i])) {
                isEqual = false;
            }
        }

        if (isEqual) {
            return false;
        }
        int countSymbol = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("x") || field[i][j].equals("0")) {
                    countSymbol++;
                }
            }
        }

        if (countSymbol == 9) {
            draw = 1;
        }


        return true;
    }
}
