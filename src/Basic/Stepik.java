package Basic;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Task42_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0 & i % 3 == 0 & i != 0) {
                count = 1;
            }
        }
        if (count == 1) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0 & i % 3 == 0 & i != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Таких чисел нет");
        }
    }
}


class Task42_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print(n + " ");

        }
    }
}

class Task42_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Task42_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println(a * a + " " + a * a * a + " " + a * a * a * a + " " + a * a * a * a * a);
        }
    }
}

class Task42_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {

                System.out.print(j != i ? j + " " : j);
            }
            System.out.println();
        }
    }
}

class Task42_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count > n) {
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

class Task42_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int l = 1; l <= n; l++) {
            int count = 0;


            for (int i = 1; i <= l; i++) {

                for (int j = 1; j <= i; j++) {
                    count++;
                    if (count > l) {
                        break;
                    } else {
                        System.out.print(count != l ? i + " " : i);
                    }
                }
            }
            if (l < n) {
                System.out.println("");
            }
        }
    }
}


class Task43_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.pow(x, y));
    }
}

class Task43_3 {
    public static void main(String[] args) {
        if ((Math.pow(Math.E, Math.PI)) > (Math.pow(Math.PI, Math.E))) {
            System.out.println(">");
        } else if ((Math.pow(Math.E, Math.PI)) < (Math.pow(Math.PI, Math.E))) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}

class Task43_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(Math.toRadians(n));
    }
}

class Task43_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Math.toRadians(sc.nextDouble());
        double result = Math.sin(a) + Math.cos(a);
        System.out.println(result);
    }
}

class Task43_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double scale = Math.pow(10, n);
        if (n > 0) {
            System.out.println(Math.round(Math.PI * scale) / scale);
        } else {
            System.out.println(Math.round(Math.PI));
        }
    }
}

class Task43_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double scale = Math.pow(10, 5);
        double result = (Math.pow(Math.pow(x, y), 1.0 / n));
        System.out.println(Math.round(result * scale) / scale);
    }
}

class Task43_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double p = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
        System.out.println((double) Math.round(p));
    }
}


class Task44_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}

class Task44_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char maxNum = number.charAt(0);
        if (maxNum < 0) {
            maxNum = number.charAt(1);
        }
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) > maxNum) {
                maxNum = number.charAt(i);
            }
        }
        System.out.println(maxNum);
    }
}

class Task44_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            for (int i = number2; i < number1 + 1; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = number1; i < number2 + 1; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

class Task44_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

class Task44_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Task51_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(arr.length);
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
}

class Task51_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(array[n - 1]);
    }
}

class Task51_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int id = sc.nextInt();
        System.out.println(array[id]);
    }
}

class Task51_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 1; i < array.length; i++) {
                if (i % 2 == 0) {
                    array[i] = i;
                    sum = sum + i;
                    System.out.print(array[i] + " ");
                }
            }
            System.out.print(n);
            sum = sum + n;
            System.out.println();
            System.out.print(sum);
        } else if (n % 2 != 0) {
            for (int i = 1; i < array.length - 2; i++) {
                if (i % 2 != 0) {
                    array[i] = i;
                    sum = sum + i + 1;
                    System.out.print(array[i] + 1 + " ");
                }
            }
            System.out.print(n - 1);
            sum = sum + n - 1;
            System.out.println();
            System.out.print(sum);
        }
    }
}

class Task51_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }

    }
}

class Task51_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(",");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}

class Task52_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            //n=n-n+(-n);
            System.out.println("Ошибка ввода");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
//            boolean sorted = false;//разобрать
//            while (!sorted) {
//                sorted = true;
//                for (int i = 1; i < n; i++) {
//                    if (array[i] < array[i - 1]) {
//                        int a = array[i];//почему через переменную надо?
//                        array[i] = array[i - 1];
//                        array[i - 1] = a;
//                        sorted = false;
//                    }
//                }
//            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int a = array[j];//почему через переменную надо?
                        array[j] = array[j + 1];
                        array[j + 1] = a;
                    }
                }
            }
            int k = sc.nextInt();
            if (k <= 0 || n < k) {
                //n=k-k+(-k);
                System.out.println("Ошибка ввода");
            } else if (n >= k - 1) {
                System.out.println(array[k - 1]);
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }
}


class Task52_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] str1 = str.split(" ");
        int arrayLength = str1.length;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.valueOf(str1[i]);
        }

        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
    }
}

class Task53_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] a = new int[str1.length]; // str1.length=6
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 1; i < a.length; i = i + 2) {
            if (i % 2 != 0 && i != a.length - 1 && a.length % 2 == 0) {
                int b = a[i];
                a[i] = a[i + 1];
//                System.out.print(a[i]);
                a[i + 1] = b;
//                System.out.print(a[i + 1]);

            } else if (i % 2 != 0 && i != a.length - 1 && i != a.length - 2) {
                int b = a[i];
                a[i] = a[i + 1];
//                System.out.print(a[i]);
                a[i + 1] = b;
//                System.out.print(a[i + 1]);
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + " ");
            }


        }

    }
}

class Task53_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        String minSymbols = str1[0];
        int a = 0; //счётчик совпадений
        int b = 0; //индекс
        for (int i = 0; i < str1.length; i++) {
            if (minSymbols.length() > str1[i].length()) {
                minSymbols = str1[i];
                b = i;
            }

        }
        System.out.println(b + 1);
    }
}

class Task53_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] a = new int[str1.length];
        int minSum = 0;
        if (str1.length <= 3) {
            System.out.println(0);
        } else {
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(str1[i]);
            }
            System.out.println(Arrays.toString(a));
            minSum = a[0] + a[2];
            for (int i = 0; i < a.length - 2; i++) {
                if (minSum > a[i] + a[i + 2]) {
                    minSum = a[i] + a[i + 2];
                }
            }
            System.out.println(minSum);

        }

    }
}

class Task54_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] a = new int[Integer.valueOf(str1[0])];
        int[] b = new int[Integer.valueOf(str1[1])];
//        System.out.println(a.length);
        for (int i = 1; i <= a.length; i++) {
            a[i - 1] = i;
        }
        for (int i = 1; i <= b.length; i++) {
            b[i - 1] = i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (j == b.length) {
                    System.out.print(i * j);
                } else {
                    System.out.print(i * j + " ");
                }

            }
            System.out.println();

        }

    }
}

class Task54_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[][] array = new String[Integer.parseInt(a)][];
        for (int i = 0; i < Integer.parseInt(a); i++) {
            array[i] = sc.nextLine().split(" ");
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

class Task54_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int i = 1;
        while (sc.hasNext()) {
            i++;
            String[] arr = sc.nextLine().split(" ");
        }
        System.out.println("Строк: " + i);
        System.out.println("Столбцов: " + a.length);
    }
}


class Task54_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        String[][] arr = new String[a.length][];
        System.out.print(a[0] + " ");
        for (int i = 1; i < a.length; i++) {
            String[] b = sc.nextLine().split(" ");
            System.out.print(b[i] + " ");
        }
    }
}

class Task54_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        System.out.print(arr1[0] + " ");
        int i = 1;
        while (sc.hasNext()) {
            if (arr1.length == i) {
                break;
            }
            String[] arr = sc.nextLine().split(" ");
            System.out.print(arr[i] + " ");
            i++;

        }

    }
}

class Task54_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String c = "";
        while (sc.hasNextLine()) {
            String str1 = sc.nextLine();

        }
    }
}

class Task55_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = Integer.valueOf(a);
        String[] c = sc.nextLine().split(" ");
        if (b < 0 || b > c.length) {
            System.out.println("Неверный ввод");
        } else {
            System.out.println(c[b]);
        }
    }
}

class Task55_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = sc.nextLine().split(" ");
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i].equals(c[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(c[i] + " ");
            }
        }
    }
}

//import java.util.Scanner;


class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        String tmp = "";
        int x = 0;
        while (sc.hasNext()) {
            String tmp2 = sc.nextLine();
            tmp += tmp2 + " ";                        // tmp временная строка
            row++;                                // row строка
        }
        String[] column = tmp.split(" ");          // column.length/rom  столбцы
        //System.out.print(Arrays.toString(column));    // проверка
        int[][] num = new int[row][column.length / row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column.length / row; j++) {
                num[i][j] = Integer.parseInt(column[x]);
                x++;  //заливаем двумерный массив преобразовывая                                                            строчный одномерный в числовой двумерный
            }
        }

        int[][] num2 = new int[column.length / row][row];      // транспонируем матрицу
        // меняем столбцы на строки
        for (int i = 0; i < column.length / row; i++) {
            for (int j = 0; j < row; j++) {
                num2[i][j] = num[j][i];
                //System.out.print(num2[i][j]+" ");    // проверка
            }   //System.out.println();
        }

        int [][]num3=new int[column.length/row][row];

        for(int i=(column.length/row-1); i>=0; i--){
            for(int j=0; j<row; j++){
                num3[i][j]=num2[i][j];
                if(j==(row-1))
                    System.out.print(num2[i][j]);
                else
                    System.out.print(num2[i][j]+" ");
            }  System.out.println();
        }

    }
}