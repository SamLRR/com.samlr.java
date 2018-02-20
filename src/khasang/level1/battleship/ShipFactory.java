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


     void makeShip() {
        int i = 0;
        Ship[] ship = new Ship[10];
        for (TypeOfShip.TypeShip typeShip : TypeOfShip.TypeShip.values()) {
            do {
                ship[i] = new Ship(typeShip.getSum(), getPosition(), getPosition());
                i++;
            } while (i < 10);
            System.out.println(SIZE_TYPE_OF_SHIP);
        }

    }

  /*  void setShip(Cel){
        this.ship = ship;
        int index = getPosition();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[index + i][index+j] = 'O';
            }
        }
    }*/

    int getPosition() {
        Random ran = new Random();
        int index = ran.nextInt(BORDER);
        return index;
    }
}
