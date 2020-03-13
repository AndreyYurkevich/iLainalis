package Arrays_Generics.Filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class FilterApplication<T> {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("111");
        list.add(1);
        list.add("stroki");
        list.add(123341);
        list.add(123);
        list.add("Chisla");
        list.add("For_method.sort");
        list.add("14/12");
        System.out.println("Not filter,and not sorted: " + list);
        System.out.println("Filtered,but not sorted: " + filter(list,new ClassFilter()));
        System.out.println("Filtered and sorted: " + sort(list));
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Person1"));
        linkedList.add(new Person("Person2"));
        linkedList.add(new Person("I am not person!"));
        linkedList.add(new Person("Interesting situation "));
        System.out.println(sort(linkedList));

    }
    public static Collection filter(Collection collection, ClassFilter classFilter){
        classFilter.Sorted(collection);
        return  collection;
    }
    public static <T extends Comparable> Collection sort(Collection<T>collection){
        return new TreeSet<>(collection);

    }

    public static class Person implements Comparable<Person>{
        private String name;
        Person(String name){
            this.name = name;

        }
        String getName(){
            return  name;
        }

        @Override
        public int compareTo(Person o) {
            return this.getName().compareTo(o.getName());
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
