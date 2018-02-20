package khasang.level0.level0.homework.bookrep;

/**
 * Created by Ленар on 07.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        BookManager manager = new BookManager();
        manager.showMenu();

        manager.addBook(new Book("Брюс Эккель", "Философия Java"));
        manager.addBook(new Book("Герберт Шилдт", "Java 8. Руководство для начинающих"));
        manager.addBook(new Book("Джеймс Гослинг", "Язык программирования Java"));
        manager.addBook(new Book("Патрик Нимейер", "Программирование на Java"));
        manager.addBook(new Book("Яков Файн", "Программирование на Java для детей, родителей, дедушек и бабушек"));
        manager.addBook(new Book("Берт Бейтс", "Изучаем Java"));
        manager.addBook(new Book("Джошуа Блох", "Эффективное программирование"));

        manager.select();
    }
}
