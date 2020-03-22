package Streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Save {
    public void savemethod(List<Students> list, String filename){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
