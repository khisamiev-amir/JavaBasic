package OOP.Generic.ClassWork0103;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedResult <T extends Collection>{
    private T a;

    public T generate(T a){
        Set set = new HashSet(a);
        return (T) set;
    }
}
