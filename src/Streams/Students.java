package Streams;

import java.io.Serializable;
import java.util.Objects;

public class Students implements Serializable,Comparable<Students> {
    private final   String name;
    private final int rating;
    private static final  long serialVersionUID = 1L;

    public Students(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rating == students.rating &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    @Override
    public String toString() {
        return name + " rating - " + rating;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.getRating(), o.getRating());
    }
}