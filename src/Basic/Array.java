package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int a[](можно и так) = new int[5]; //массив из 10 чисел
        int[] a = new int[5]; //массив из 10 чисел
        String[] str = new String[10]; //массив из 10 строк
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        a[3] = 2;
        a[4] = a[3] - 1;

//        for (int i = 0; i <= 4; i++) {
//            System.out.println(a[i]);
//        }
        // 1 6 3 9 ... 5
        // 0 1 2 3 ... 10

        //одно и тоже
        int[] b = new int[]{5, 4, 3, 2, 1, 0};
        int[] c = {5, 4, 3, 2 + 0, 1, 0};
        System.out.println(b.length); // вывести длину массива, количество символов
        System.out.println(b[b.length - 1]); // последний элумент массива
        System.out.println(b[0]); // первый элемент массива
        String[] d = {"a", "b"};
    }
}

class task1_0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int b = -1;
        for (int c = 0; b != 0; c++) {
            b = sc.nextInt();
            a[c] = b; //положить в массив
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
    }
}

class task2_0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество учеников
        //int a = 0; // количетсво учеников
        int[] b = new int[n];
        int place = 1;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt(); //рост ученика
            b[i] = c;// в элемент массива b по индексу i положить в с

        }
        int highPetya = sc.nextInt();
        for (int j = 0; highPetya <= b[j]; j++, place++) { // как стало
            //place++;  как было
        }
        System.out.println(place);
    }
}

class Task3_0206 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int lenght = a.length;
        for (int i = 0; i < lenght / 2; i++) {
            //System.out.println(a[i]);
            int b = a[i];
            a[i] = a[lenght - 1 - i];
            a[lenght - 1 - i] = b;
        }
        System.out.println(Arrays.toString(a)); //вывести данные для одномерного массива
    }
}

//двумерные массивы
class TwoDimArray {
    // rafailvv
    public static void main(String[] args) {
        // 1 - свободно
        // 0 - занято
        int[][] cinema_hall = {{0, 1, 1}, {0, 0, 1}, {1, 1, 1}};
        for (int i = 0; i < cinema_hall.length; i++) {
            for (int j = 0; j < cinema_hall[i].length; j++) {
                System.out.print(cinema_hall[i][j] + " ");
            }
            System.out.println();
        }
        cinema_hall[0][1] = 0; //[0] индекс первого массива [1] индекс второго массива
        System.out.println();
        cinema_hall[2] = new int[]{0, 0, 0}; // поменял все элементы в массиве


        for (int i = 0; i < cinema_hall.length; i++) {
            for (int j = 0; j < cinema_hall[i].length; j++) {
                System.out.print(cinema_hall[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*3 4
4 3 5 2
5 2 7 4
6 3 2 6*/
class task1_0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];


        for (int i = 0; i < n; i++) {
//           // System.out.println("");
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt() + 1;
//                System.out.print(a[i][j] + " ");
            }

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(a)); //вывести данные для двумерного массива
    }
}

class task2_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        int max_value = a[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] >= max_value) {
                    max_value = a[i][j];
                    row = i;
                    column = j;


                }
            }
        }
        System.out.println(max_value + " " + row + " " + column);
        // a = 1, b = 2
        System.out.printf("%s %s %s%n", max_value, row, column);
    }
}

class task2_1_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        int max_value = a[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] >= max_value) {
                    max_value = a[i][j];
                    row = i;
                    column = j;


                }
            }
        }
        System.out.println(max_value + " " + row + " " + column);
    }
}

class task3_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean is_symmetry = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    is_symmetry = false;
                }
            }
        }
        if (is_symmetry) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

class task4_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 - j) {
                    a[i][j] = 1;
                } else if (i > n - 1 - j) {
                    a[i][j] = 2;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class task5_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = i * 10 + j; //почему не работает a[i][j]=a[i][j]+1
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m/2; j++) {
//                if(i%2!=0){
//                    int b = a[i][j];
//                    a[i][j] = a[i][m- 1 - j];
//                    a[i][m - 1 - j] = b;
//                    System.out.print(a[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = m - 1; j > -1; j--) {
                    a[i][j] = i * 10 + j; //почему не работает a[i][j]=a[i][j]+1
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int l = 0; l < m; l++) {
                    a[i][l] = i * 10 + l; //почему не работает a[i][j]=a[i][j]+1
                    System.out.print(a[i][l] + " ");
                }
            }
            System.out.println();
        }
    }
}

class task6_1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int max_value = 0;
        int countMaxValue = 1;
        int[] playerResult = new int[n];
        int winner = 0;
//заполняем результаты
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c = sc.nextInt();
                a[i][j] = c;
            }
        }
// ищем лучший бросок
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max_value) {
                    max_value = a[i][j];
                    countMaxValue = 1;
                    winner = i;

                } else if (a[i][j] == max_value) {
                    countMaxValue++;
                }
            }

        }
//Считаем результаты, если максимальных значений несколько
        if (countMaxValue >= 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    playerResult[i] = playerResult[i] + a[i][j];


                }
            }
            int[] temp = playerResult.clone();
            // System.out.println(Arrays.toString(playerResult));
            Arrays.sort(playerResult);
            // System.out.println(Arrays.toString(playerResult));
//            System.out.println(playerResult[playerResult.length-1]);
            int max_sum = playerResult[playerResult.length - 1];
//            System.out.println(Arrays.toString(temp));
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == max_sum) {
                    System.out.println(i);
                    break;
                }
            }

        } else {
            System.out.println(winner);
        }


// смотрю, что внутри
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(a[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        System.out.println(max_value);
    }
}