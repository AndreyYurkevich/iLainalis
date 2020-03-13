package Exception;

import java.util.*;

public class Zadnaie3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Заполните пять элемнтов  массива  у вас 3 попытки :");

        try {
           Scanner input = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
        } catch (InputMismatchException S) {
            System.out.println("Ошибка,Заполните массив числами пожалуйста у вас осталось 2 попытки: ");
            try {
               Scanner input = new Scanner(System.in);
                for (int i = 0; i < array.length; i++) {
                    array[i] = input.nextInt();
                }

            } catch (InputMismatchException E) {
                System.out.println("Болван я же сказал заполни массив числами :");
                try {
                    Scanner input = new Scanner(System.in);
                    for (int i = 0; i < array.length; i++) {
                        array[i] = input.nextInt();
                    }

                } catch (InputMismatchException D) {
                    System.out.println("Попытки закончились,запусти программу заново!");
                    System.exit(0);
                }
            }

        } finally {
            System.out.print("Получены элементы массива :");
            System.out.println(Arrays.toString(array));
            //   Arrays.sort(array);
            //  System.out.println("Отсортированный массив :" + Arrays.toString(array));

        }
        System.out.println("Преобразование полученного массива в коллекцию ArrayList");

    ArrayList<Integer> list = new ArrayList<>();
        for (int a :array) {list.add(a); }
//        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println("Сортирвока : " + list.toString());
      // Arrays.toString(array);
     //  System.out.println(Arrays.toString(array));

    }




}