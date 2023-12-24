package OOP;

public class ClassesAndObjects {
    public static void main(String[] args) {
//        Scanner sc;
//        int a = 2;

        Human petya = new Human();
        petya.name = "Петя";
        petya.age = 22;
        petya.favoriteColor = "Красный";
        House petyaHouse = petya.buyHouse();
        petyaHouse.buildHouse();
        System.out.println(petyaHouse.color);



//        House houseForRafail = new House(); // объект класса House
//        houseForRafail.buildHouse();
//        houseForRafail.area = 250;
//        houseForRafail.buildHouse();
//
//        House houseForAmir = new House();
//        System.out.println(houseForAmir.area);
//        houseForAmir.area = 500;
    }
}


