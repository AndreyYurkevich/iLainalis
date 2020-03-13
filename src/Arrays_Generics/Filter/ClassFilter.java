package Arrays_Generics.Filter;


import java.util.Collection;


public class ClassFilter  {

    public  void Sorted(Collection collection){
        collection.removeIf(x -> x instanceof Integer);
    }
}
