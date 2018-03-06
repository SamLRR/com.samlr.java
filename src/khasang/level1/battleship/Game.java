package khasang.level1.battleship;

import java.util.List;

public class Game {
    private Field field;
    private ShipFactory shipFactory;

    public void init() {
//        Player.greetingGamer();
        field = new Field();
//        shipFactory = new ShipFactory();
//        shipFactory.makeShip();
        List<Ship> ships = ShipFactory.makeShips();
        field.initField();
        field.setShip(ships);
        field.showCell();
    }

    //Заглушка, пока не реализовано
    public void start() {
        System.out.println("Победил игрок " + Player.nameOfGamer);
    }
}
