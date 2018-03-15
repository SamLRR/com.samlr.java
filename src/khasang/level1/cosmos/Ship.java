package khasang.level1.cosmos;

public class Ship implements Launchable{
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public void launch() {
          System.out.println("Корабль взлетел!");
    }

    @Override
    public String toString() {
        return "Корабль " + name;
    }
}