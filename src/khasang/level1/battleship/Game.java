package khasang.level1.battleship;

public class Game {
    private Field field;
    private ShipFactory shipFactory;

    public void init() {
        field = new Field();
        shipFactory = new ShipFactory();
        shipFactory.makeShip();
        field.initField();
        field.setShip(shipFactory);
        field.showCell();
    }

    public void start() {
            return;
    }
}
