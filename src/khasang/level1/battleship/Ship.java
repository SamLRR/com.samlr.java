package khasang.level1.battleship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ship {
    private List<Point> cells = new ArrayList<Point>();
    /**
     * Длина корабля
     */
    private int lengthOfShip;
    /**
     * Начальные координаты корабля
     */
    private Point point;

    public List<Point> getCells() {
        return Collections.unmodifiableList(cells);
    }

    public int getLengthOfShip() {
        return lengthOfShip;
    }

    public Ship(int lenghtOfShip, Point point, int direction) {
        this.lengthOfShip = lenghtOfShip;
        for (int i = 0; i < lenghtOfShip; i++) {
            int x = point.getX() + i * ((direction == 1) ? 0 : 1);
            int y = point.getY() + i * ((direction == 1) ? 1 : 0);
            cells.add(new Point(x, y));
        }
    }

    boolean isOutOfField(int bottom, int top) {
        for (Point cell : cells)
            if (cell.getX() < bottom || cell.getX() > top ||
                    cell.getY() < bottom || cell.getY() > top)
                return true;
        return false;
    }

    boolean isOverlayOrTouch(Ship ctrlShip) {
        for (Point cell : cells)
            if (ctrlShip.isOverlayOrTouchCell(cell))
                return true;
        return false;
    }

    boolean isOverlayOrTouchCell(Point ctrlCell) {
        for (Point cell : cells)
            for (int dx = -1; dx < 2; dx++)
                for (int dy = -1; dy < 2; dy++) {
                    if (ctrlCell.getX() == cell.getX() + dx &&
                            ctrlCell.getY() == cell.getY() + dy)
                        return true;
                }
        return false;
    }
}
