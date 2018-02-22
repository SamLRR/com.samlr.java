package khasang.level1.battleship;

public class Game {
    private Field field;
    private ShipFactory shipFactory;

    public void init() {
//        Player.greetingGamer();
        field = new Field();
        shipFactory = new ShipFactory();
        shipFactory.makeShip();
        field.initField();
        field.setShip(shipFactory);
        field.showCell();
    }

    //Заглушка, пока не реализовано
    public void start() {
        System.out.println("Победил игрок " + Player.nameOfGamer);
    }
}
