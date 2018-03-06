package khasang.level1.battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipFactory {
    /**
     * Количество типов кораблей
     */
    private static final int SIZE_TYPE_OF_SHIP = TypeShip.values().length;
    private static List<Ship> ships = new ArrayList<>();
    private static Point point;
    private static Random random;

    public static List<Ship> getShips() {
        return ships;
    }

    static List<Ship> makeShips() {
        int fieldSize = Field.getFIELDSIZE();
        random = new Random();
        int i = 0;
        for (TypeShip typeShip : TypeShip.values()) {
            int lenghtOfShip = typeShip.getSum();
            Ship ship;
            for (int j = lenghtOfShip; j <= SIZE_TYPE_OF_SHIP; j++) {
                do {
                    int x = random.nextInt(fieldSize);
                    int y = random.nextInt(fieldSize);
                    point = new Point(x, y);
                    int position = random.nextInt(2);
                    ship = new Ship(lenghtOfShip, point, position);
                } while (ship.isOutOfField(0, fieldSize - 1) || isOverlayOrTouch(ship));

                ships.add(ship);
                i++;
            }
        }
        return ships;
    }

    static boolean isOverlayOrTouch(Ship ctrlShip) {
        for (Ship ship : ships) {
            if (ship.isOverlayOrTouch(ctrlShip)) {
                return true;
            }
        }
        return false;
    }
}
