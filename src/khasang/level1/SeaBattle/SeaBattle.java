package khasang.level1.SeaBattle;

public class SeaBattle {

    public static void main(String[] args) {
        doGame();
    }

     static void doGame() {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();

        ship.setPosition();
        field.init();
        field.setShip(ship);

        do {
            field.showCell();
            int shot = player.getShot();
            field.doShot(shot);

        } while (!field.isSink());

        field.showCell();
        System.out.println("Корабль потоплен");
    }
}