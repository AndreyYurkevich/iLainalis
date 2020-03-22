package Streams;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StudentsMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PE70\\Desktop\\Domashka.txt");
        List<Students> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(new Students("Student" + i, random.nextInt(10)));
        }

        if (file.exists()) {
            new Read().readmethod(file.getPath());
        } else if (!file.exists()) {
            new Save().savemethod(list, file.getPath());
            new Read().readmethod(file.getPath());
        }

        List<Students>listmoreSeven = list.stream()
                .sorted()
                .filter(students -> students.getRating()<7)
                .collect(Collectors.toList());
        File file1 = new File("C:\\Users\\PE70\\Desktop\\Domashkamore7.txt");
        if (!file.exists()){
            new Save().savemethod(listmoreSeven,file1.getPath());
        }
        else {
            new Read().readmethod(file1.getPath());
        }

        for (int i = 0; i < 3 ; i++) {
            int count = random.nextInt(listmoreSeven.size());
            System.out.println("Lucky boy -"+ listmoreSeven.get(count) );
            listmoreSeven.remove(count);
        }
        new Save().savemethod(listmoreSeven,file1.getPath());


    }
}
