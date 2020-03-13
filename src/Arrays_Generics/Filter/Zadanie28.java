package Arrays_Generics.Filter;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie28 {
    public static void main(String[] args) {
        new Zadanie28().method();
    }

    void method(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println(list.toString());

        System.out.println(Collections.max(list));

             }
        }

