package OOP.Point;

public class Field {
    Point [] fieldPoints = new Point[100];
    //[null, null, null...]
    // null
    public void insertPoint(Point p){
        for (int i = 0; i <= fieldPoints.length-1; i++) {
           if(fieldPoints[i]==null){
               fieldPoints[i]=p; // (1,2)
               break;

           }
        }

    }

    public void printPoints(){
        System.out.print("[");
        // .. .., null, null, null
        for (int i = 0; i <= fieldPoints.length-1; i++) {
            if(i == fieldPoints.length-1 || fieldPoints[i+1]==null && fieldPoints[i]!=null){
                System.out.print(fieldPoints[i]);
                break;
            }else if (fieldPoints[i]!=null){
                System.out.print(fieldPoints[i]+"; ");
            }
        }
        System.out.println("]");
    }

    // TODO метод для вывод координат точки на поле
    // подсказка: можно использовать метод pointCoordinates в классе Point
    // (1,2); (2,3)


}
