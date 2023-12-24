package Repeat;

import java.util.*;

public class ClassWork2805 {

public static void printer(List<Integer> a){
    for (int i = 0; i < a.size(); i++) {
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] anya = new Integer[n];
        Integer[] borya = new Integer[m];
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            anya[i] = c;
        }
        for (int i = 0; i < m; i++) {
            int c = sc.nextInt();
            borya[i] = c;
        }
        System.out.println(Arrays.toString(anya));
        System.out.println(Arrays.toString(borya));
        int e = 0;
        List<Integer> f = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d;
            d = anya[i];
            for (int j = 0; j < m; j++) {
                if (d == borya[j]) {
                    e++;
                    f.add(d);
                }
            }
        }
        Collections.sort(f);
        System.out.println(e);

        printer(f);
        List<Integer> newAnya = Arrays.asList(anya);
        Collections.sort(newAnya);
        List<Integer> newnewAnya = new ArrayList<>();
        for (int i = 0; i < newAnya.size(); i++) {
            if (!(f.contains(newAnya.get(i)))){
                newnewAnya.add(newAnya.get(i));
            }
        }
        System.out.println(newnewAnya.size());
        printer(newnewAnya);

    }
}


