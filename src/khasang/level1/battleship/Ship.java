package khasang.level1.battleship;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Point> cells = new ArrayList<Point>();
    /**
     * Длина корабля
     */
    private int lenghtOfShip;
    /**
     * Начальные координаты корабля
     */
    Point point;

    public ArrayList<Point> getCells() {
        return cells;
    }

    public int getLenghtOfShip() {
        return lenghtOfShip;
    }

    public Ship(int lenghtOfShip, Point point, int direction) {
        this.lenghtOfShip = lenghtOfShip;
        this.point = point;
        for (int i = 0; i < lenghtOfShip; i++)
            cells.add(
                    new Point(point.getX() + i * ((direction == 1) ? 0 : 1),
                            point.getY() + i * ((direction == 1) ? 1 : 0)));
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
                for (int dy = -1; dy < 2; dy++)
                    if (ctrlCell.getX() == cell.getX() + dx &&
                            ctrlCell.getY() == cell.getY() + dy)
                        return true;
        return false;
    }
}
