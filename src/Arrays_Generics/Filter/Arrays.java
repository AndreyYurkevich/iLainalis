package Arrays_Generics.Filter;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Double>arrayList = new ArrayList<>();
        long time = System.currentTimeMillis(); //засекаем время перед добавлением
            for (int i = 0; i <10000000;i++){
                arrayList.add(Math.random());
            }
        System.currentTimeMillis();     //засекаем время после добавления
        System.out.println("Time for ArrayList " + (System.currentTimeMillis() -time));
//        for (Double x :arrayList
//             ) {
//            System.out.println(" Кучаа итераций :" + x);
//        }
        long timeA = System.currentTimeMillis();
           arrayList.clear();
        System.out.println("Время удаления Аррэй Листа :" + (System.currentTimeMillis() - timeA));
    }
}
