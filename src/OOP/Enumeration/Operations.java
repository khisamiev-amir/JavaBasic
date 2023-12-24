package OOP.Enumeration;

public enum Operations {
    SUM{
        public int action(int x, int y){return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){return x - y;}
    },
    MULTIPLE{
        public int action(int x, int y){return x * y;}
    };

    public abstract int action(int x, int y);
}
