package khasang.level0.level0.homework.bookrep;

/**
 * Created by Ленар on 07.02.2018.
 */
public class Book {
    private static int count;
    private int index;
    private String nameOfBook;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getIndex() {
        return index;
    }

    public Book(String author, String nameOfBook) {
        index = ++count;
        this.author = author;
        this.nameOfBook = nameOfBook;
    }


    @Override
    public String toString() {
        return String.format(". Автор: " + "%-30s", author +
                ". " + nameOfBook + ".");
    }
}
