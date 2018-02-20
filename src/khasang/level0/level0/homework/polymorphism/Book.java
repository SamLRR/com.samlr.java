package khasang.level0.level0.homework.polymorphism;

/**
 * Created by Ленар on 07.02.2018.
 */
public class Book extends Thing {
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public Book(String producer, String nameOfBook, String isbn) {
        super(producer, nameOfBook);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Автор: " + "%-30s", super.getProducer() +
                ". " + super.getName() + "." + ". ISBN: " + isbn);
    }
}
