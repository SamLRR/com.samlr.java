package khasang.level1;

public abstract class Animal {
    String name;
    int age;

    void sleep() {
        System.out.println("i am sleeping");
    }

    abstract void feed();

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}