package khasang.level0.level0.homework.polymorphism;

/**
 * Created by Ленар on 07.02.2018.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        doSmth();
    }

    private static void doSmth() throws InterruptedException {
        Manager manager = new Manager();
        manager.showMenu();

        manager.addThing(new Book("Брюс Эккель", "Философия Java", "978-3-8272-6896-9"));
        manager.addThing(new Book("Герберт Шилдт", "Java 8. Руководство для начинающих", "978-5-8459-1918-2"));
        manager.addThing(new Book("Джеймс Гослинг", "Язык программирования Java", "978-5-8459-1875-8"));
        manager.addThing(new Book("Патрик Нимейер", "Программирование на Java", "978-5-699-71504-6"));
        manager.addThing(new Book("Яков Файн", "Программирование на Java для детей, родителей, дедушек и бабушек", " 0-9718439-5-3"));
        manager.addThing(new Book("Берт Бейтс", "Изучаем Java", "978-5-699-54574-2"));
        manager.addThing(new Book("Джошуа Блох", "Эффективное программирование", "978-5-85582-347-9"));
        manager.addThing(new Clothes("Italy", "T-Shirt(Gucci)", "XXXL"));
        manager.addThing(new Clothes("Россия", "Пальто(Красная заря)", "54"));
        manager.addThing(new Magnet("Россия", "Магнитик \"Эльбрус\"", "Нальчик"));

        manager.select();
    }
}
