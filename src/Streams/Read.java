package Streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public List<Students>readmethod(String filename){
        List<Students>list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream(filename));
           list = ((ArrayList<Students>)objectInputStream.readObject());
        }
        catch (Exception e){
            e.printStackTrace();

        }
        return list;
    }
}
