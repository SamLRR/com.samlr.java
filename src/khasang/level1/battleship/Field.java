package khasang.level1.battleship;

public class Field {
    private static final int FIELDSIZE = 10;
    private char[][] cells = new char[FIELDSIZE][FIELDSIZE];
    private static int hitting;

    public static int getFIELDSIZE() {
        return FIELDSIZE;
    }

    void showCell() {
        System.out.println("   A  B  C  D  E  F  G  H  I  J");
        for (int i = 0; i < cells.length; i++) {
            if (i == 9) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print(i + 1 + "  ");
            }
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
                    hitting++;
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
        return hitting == 3;
    }

    void setShip(ShipFactory shipFactory) {
        for (int i = 0; i < 10; i++) {
            int lenghtOfShip = shipFactory.getShips().get(i).getLenghtOfShip();
            for (int j = 0; j < lenghtOfShip; j++) {
                Point point = shipFactory.getShips().get(i).getCells().get(j);
                int x = point.getX();
                int y = point.getY();
                cells[x][y] = (char) (lenghtOfShip + '0');
            }
        }
    }
}
