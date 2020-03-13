package Arrays_Generics.Filter;

import java.util.LinkedList;

public class Listt {
    public static void main(String[] args) {
        LinkedList<Double>linkedList = new LinkedList<>();
        long time = System.currentTimeMillis();
        for(int i =0; i < 10000000;i++){
            linkedList.add(Math.random());
            linkedList.clear();
        }
        System.currentTimeMillis();
        System.out.println("Время добавления для ЛинкедЛиста: " +(System.currentTimeMillis()- time));
//        long timeA = System.currentTimeMillis();
//      linkedList.removeAll(linkedList);
//        System.out.println("Время удаления всех элементов Линкед Листа составит :" + (System.currentTimeMillis()- timeA));
    }

}
