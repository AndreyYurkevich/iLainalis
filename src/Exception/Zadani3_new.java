package Exception;

import java.util.*;

public class Zadani3_new  {
    public static void main(String[] args) {
        System.out.println("Заполните массива,у вас 3 попытки :");
        int[] array = new int[5];
        for (int j = 0; j < 3;) {
            try {
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < array.length; i++) {
                    int A = scanner.nextInt();
                    array[i] = A;
                }
                break;
            } catch (Exception e) {
                if (j == 0) {
                    System.out.println("Exception 1,repeat please :");
                } else if (j == 1) {
                    System.out.println("Exception 2,repeat please,this last attempt :");
                } else if (j == 2) {
                    System.out.println("Game Over.Run the program again.");
                   System.exit(0);
                }
            }
            j++;
        }
        System.out.print("Получен массив :");
        System.out.println(Arrays.toString(array));
        System.out.println("Array to List");
        List<Integer>list = new ArrayList<>();
        for (int x: array) { list.add(x); }
        Collections.sort(list);
        System.out.println("Sorted list :" + list);
    }
}
