package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Junit2604{
    @MyAnnotations(count=10)
    public void qwe(){
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        Junit2604 kolbasa = new Junit2604();
        kolbasa.qwe();
    }

    @Test
    public void test1() {
        String str = "Hello, World!";
        assertEquals("Hello, World!", str);
    }

}
