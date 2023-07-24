package lesson_20.classwork.Library;

import java.util.Objects;
import java.util.Set;

public class Reader<T> {
    private T id;
    private String name;
    private String surname;
    private Set<Book> books;

    public Reader(T id, String name, String surname, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader<?> reader = (Reader<?>) o;
        return Objects.equals(id, reader.id) && Objects.equals(name, reader.name) && Objects.equals(surname, reader.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
