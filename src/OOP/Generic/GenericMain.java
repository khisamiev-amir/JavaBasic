package OOP.Generic;

public class GenericMain {
    public static void main(String[] args) throws Exception {
        Account<Integer> account1 = new Account<>(0,100000.5);
        Account<String> account2 = new Account<>("123",500000.2);
        System.out.println(account2.getId());
        Integer a = account1.getId()*2;
        NailsImp<Integer> nailsImp1 = new NailsImp<>();
        NailsImp<String> nailsImp2 = new NailsImp<>();
        Sum <Integer> sum1 = new Sum<>(1,2);
        Integer b =sum1.v1plusv2();
        System.out.println(sum1.v1plusv2());
        System.out.println(b);
    }
}
