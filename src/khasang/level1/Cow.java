package khasang.level1;

public class Cow extends Animal implements Herbivore {
    @Override
    void feed() {

    }

    @Override
    public void eatHerbi() {
        System.out.println("Корова жует траву");
    }
}
