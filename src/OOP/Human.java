package OOP;

public class Human {
    String name;
    int age;
    String favoriteColor;
    public House buyHouse(){
        House newHouse = new House();
        // this - объект класса Human, через который вызывается метод buyHouse, без this мы бы взяли age из 5-й строки
        newHouse.area = this.age * 2;
        newHouse.houseName=this.name+" "+newHouse.houseName;
        newHouse.color = this.favoriteColor;
        return newHouse;
    }

    public int getValue(){
        int a = 7;
        return a;
    }
}
