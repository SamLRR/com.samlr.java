package khasang.level1;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        Cow cow = new Cow();
        cow.eatHerbi();
        Pterodactil pterodactil = new Pterodactil();
        pterodactil.fly();

        Flyable flyableDuck = duck; // traffaret
        Animal animalDuck = duck;
        Herbivore herbPter=cow;

        flyableDuck.landing();
        animalDuck.feed();

        Flyable tempDuck = (Flyable) animalDuck; // casting
        tempDuck.fly();
        Animal[] animals = new Animal[3];
        animals[0] = duck;
        animals[1] = cow;
        animals[2]=pterodactil;
        Flyable[] flyables = {flyableDuck};
        Herbivore[] herbivores = {cow, duck};
        herbivores[0].eatHerbi();
    }
}
