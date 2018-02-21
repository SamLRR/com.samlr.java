package khasang.level1.battleship;

import java.util.Random;

public class ShipFactory {
    /**
     * это максимальная правая/нижняя граница от начала координат [0,0], необходимая для
     * того, чтобы при создании, корабли с макисмальной длиной палубы равной 4 не вышли за пределы
     * нашего игрового поля 10х10
     */
    private static final int BORDER = 6;
    /**
     * Количество типов кораблей
     */
    private static final int SIZE_TYPE_OF_SHIP = TypeOfShip.TypeShip.values().length;
    private Ship[] ships;

    public Ship[] getShips() {
        return ships;
    }

    void makeShip() {
        int i = 0;
        ships = new Ship[10];
        for (TypeOfShip.TypeShip typeShip : TypeOfShip.TypeShip.values()) {
            int lenghtOfShip = typeShip.getSum();
            for (int j = lenghtOfShip; j <= SIZE_TYPE_OF_SHIP; j++) {
                ships[i] = new Ship(lenghtOfShip, getPosition(), getPosition());
                i++;
            }
        }
    }

    private int getPosition() {
        Random ran = new Random();
        return ran.nextInt(BORDER);
    }
}
