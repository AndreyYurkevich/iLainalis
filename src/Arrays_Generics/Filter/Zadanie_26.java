package Arrays_Generics.Filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Zadanie_26 {
    public static void main(String[] args) {
           Zadanie_26 a = new Zadanie_26();
           a.someMethod();
           new Zadanie_26().TrenirovkaRemoveIF();
           new Zadanie_26().YdaleniePovtorov();
    }

    void   someMethod(){
        int negative = 4;
        ArrayList<Integer> list = new ArrayList();
        for (int a = 0; a < 15;a++){
            list.add((int)(Math.random()*10)+1);
        }
        System.out.println(list.toString());
       list.removeIf(x -> x <= negative);

        System.out.println(list.toString());

    }

    void TrenirovkaRemoveIF(){
        Collection<String> names = new ArrayList<>();
        names.add("JKSQQ");
        names.add("JKSQQ");
        names.add("JKSQQ");
        names.add("JKSQQ");
        names.add("HashMap");
        names.add("ArrayLIst");
        names.add("LinkedList");
        names.add("Jsad21");
        names.add("Posqw");
        names.add("Hey");
        names.add("OQsdq2");

        names.removeIf(e->e.startsWith("J"));
        System.out.println(names);

    }

    void YdaleniePovtorov(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int a = 0; a < 20; a++){
            list.add((int)(Math.random()*10)+1);
        }
        System.out.println(list.toString());
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set.toString());


    }

}








