package OOP.AbstractClass.HomeWork;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getSquare() {

        return this.length*this.width;
    }

    @Override
    public int getPerimeter() {
        return (this.length+this.width)*2;
    }
}
