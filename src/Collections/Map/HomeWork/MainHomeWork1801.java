package Collections.Map.HomeWork;

import Basic.Array;

import java.util.*;

//Словарь уже дан его создаю сам отдельно(создаю словарь)
//1. Написать метод, который запрашивает количество песен, который хотят прослушать из этого списка, внутри есть Scanner, здесь же запрашивают названия этих песен,
// после общее время звучания выводится на экран
//сделать один метод для считывания который должен найти эти песни в словаре и куда-то сохранить, ворой метод берет этот список и считает количество времени прослушивания


public class MainHomeWork1801 {
    public static void getSongs(HashMap<String, Double> violatorSong) {
//        HashMap<String,Double> result = new HashMap<>();
        double b = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i = 0;
        while (Integer.parseInt(a) > i) {
//            System.out.println(sc.nextLine());
            String song = sc.nextLine();
            b = b + violatorSong.get(song);
            i++;
        }
        System.out.println(b);

//        while (c != a) {
//            int a = sc.nextInt();
//            String song = sc.nextLine();
//            b = b + violatorSong.get(song);
//            c++;
//
//        }


    }

    public static void main(String[] args) {
        HashMap<String, Double> violatorSong = new HashMap<>();
        violatorSong.put("World in My Eyes", 4.86);
        violatorSong.put("Sweetest Perfection", 4.43);
        violatorSong.put("Personal Jesus", 4.56);
        violatorSong.put("Halo", 4.9);
        violatorSong.put("Waiting for the Night", 6.07);
        violatorSong.put("Enjoy the Silence", 4.20);
        violatorSong.put("Policy of Truth", 4.76);
        violatorSong.put("Blue Dress", 4.29);
        violatorSong.put("Clean", 5.83);

        getSongs(violatorSong);
//        System.out.println(a);

    }
}
