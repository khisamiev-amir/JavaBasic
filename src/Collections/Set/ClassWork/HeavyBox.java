package Collections.Set.ClassWork;

public class HeavyBox implements Comparable{
    private int length;
    private int width;
    private int height;
    private int mass;

    public HeavyBox(int length, int width, int height, int mass) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.mass = mass;

    }

    public HeavyBox() {
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", mass=" + mass +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        if (this.mass>((HeavyBox)o).getMass()){//кастанули
            return 1;
        } else if (this.mass<((HeavyBox)o).getMass()) {
            return -1;
        }
        return 0;
    }
}
