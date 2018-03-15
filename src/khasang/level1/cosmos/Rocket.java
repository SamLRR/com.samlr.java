package khasang.level1.cosmos;

public class Rocket implements Launchable {

    private String name;

    public Rocket(String name) {
        this.name = name;
    }

    @Override
    public void launch() {
        System.out.println("Ракета взмыла!");
    }

    @Override
    public String toString() {
        return "Ракета " + name;
    }
}
