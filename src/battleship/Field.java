package battleship;

public class Field {

    private static final int FIELDSIZE = 10;
    private char[][] cells = new char[FIELDSIZE][FIELDSIZE];
    private static int point;

    public static int getFIELDSIZE() {
        return FIELDSIZE;
    }

    void showCell() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void initField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    public void doShot(int x, int y) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[x - 1][y - 1] == 'O') {
                    cells[x - 1][y - 1] = 'X';
                    System.out.println("Корабль ранен");
                    point++;
                } else {
                    if (!(cells[x - 1][y - 1] == '*' || cells[x - 1][y - 1] == 'X')) {
                        cells[x - 1][y - 1] = '*';
                        System.out.println("Мимо");
                    }
                }
            }
        }
    }

    boolean isSink() {
        return point == 3;
    }

    void setShip() {
        Ship[] ship = null;
        ShipFactory shipFactory = new ShipFactory();
        ship=shipFactory.makeShip();

        for (int i = 0; i < 10; i++) {
//            cells[ship.][index + j] = 'O';

        }
    }
}
