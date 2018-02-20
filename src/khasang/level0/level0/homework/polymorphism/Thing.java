package khasang.level0.level0.homework.polymorphism;

public class Thing {
    private static int count;
    private int id;
    private String producer;
    private String name;

    public int getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public Thing(String producer, String name) {
        id = ++count;
        this.producer = producer;
        this.name = name;
    }
}
