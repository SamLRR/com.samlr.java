package khasang.level0.level0.homework.inheritance;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void doSmth() {
        System.out.println();
    }

    @Override
    void about() {
        super.about();
    }
}
