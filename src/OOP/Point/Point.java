package OOP.Point;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    Пустой конструктор
    public Point(){
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public String pointCoordinates(){ // почему статик?
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int[] point = new int[2];
//        point[0]=x;
//        point[1]=y;
//        return point;

        return "(" + this.x + "," + this.y + ")";
    }


}
