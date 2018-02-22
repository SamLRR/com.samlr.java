package khasang.level1.battleship;

public class Ship {
    /**
     * Длина корабля
     */
    private int lenghtOfShip;
    /**
     * Координаты корабля
     */
    private int x;
    private int y;
    Point point;

    public int getLenghtOfShip() {
        return lenghtOfShip;
    }

    public Ship(int lenghtOfShip, Point point) {
        this.lenghtOfShip = lenghtOfShip;
        this.point = point;
    }
}
