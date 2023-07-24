package lesson_20.classwork.Library;

import java.time.LocalDate;
import java.util.Objects;

public class Book<T> {
    private T id;
    private String title;
    private String author;
    private LocalDate expiration;
    private boolean isAvailable;

    public Book(T id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.expiration = LocalDate.of(2023, 01, 01);
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book<?> book = (Book<?>) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book {" +
                "id = " + id +
                ", title = " + title + '\'' +
                ", author = " + author + '\'' +
                ", expiration = " + expiration +
                '}';
    }
}


