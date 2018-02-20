package battleship;

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

    public int getLenghtOfShip() {
        return lenghtOfShip;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Ship(int lenghtOfShip, int x, int y) {
        this.lenghtOfShip = lenghtOfShip;
        this.x = x;
        this.y = y;
    }
}
