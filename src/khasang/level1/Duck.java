package khasang.level1;

public class Duck extends Animal implements Flyable, Herbivore {
    @Override
    void feed() {

    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void landing() {
        System.out.println("duck is landing");
    }

    @Override
    public void eatHerbi() {
        System.out.println("Утка есть траву");
    }
}
