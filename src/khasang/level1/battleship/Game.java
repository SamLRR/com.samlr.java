package khasang.level1.battleship;

public class Game {
    Field field;
    ShipFactory shipFactory;

    public void init() {
        field = new Field();
        shipFactory = new ShipFactory();
        field.initField();
        field.setShip(shipFactory);
        field.showCell();

    }

    public void start() {
        do {

        } while (true);
    }
}
