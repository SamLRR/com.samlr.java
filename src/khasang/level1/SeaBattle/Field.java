package khasang.level1.SeaBattle;

/**
 * Created by Ленар on 06.02.2018.
 */
public class Field {
    private static final int FIELDSIZE = 10;
    private char[] cells = new char[FIELDSIZE];
    private static int point;
    private Ship ship;

    void showCell() {
        System.out.println(cells);
    }

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    public void doShot(int shot) {

        if (cells[shot - 1] == 'O') {
            cells[shot - 1] = 'X';
            System.out.println("Корабль ранен");
            point++;
        } else {
            if (!(cells[shot - 1] == '*' || cells[shot - 1] == 'X')) {
                cells[shot - 1] = '*';
                System.out.println("Мимо");
            }
        }
    }

    boolean isSink() {
        return point == 3;
    }

    void setShip(Ship ship) {
        this.ship = ship;
        int index = ship.setPosition();
        for (int i = 0; i < 3; i++) {
            cells[index + i] = 'O';
        }
    }
}
