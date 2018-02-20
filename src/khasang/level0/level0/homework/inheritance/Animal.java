package khasang.level0.level0.homework.inheritance;

public class Animal {
    private String name;
    private int age;
    private int storage = 10;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void about() {
        System.out.println("Меня зовут " + name + " мне " + age + " лет");
    }

    protected int vault() {
        int b = storage;
        storage = 0;
        return storage;
    }
}
