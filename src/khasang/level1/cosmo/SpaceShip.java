package khasang.level1.cosmo;

class SpaceShip {
    int speed;
    String name;
    Pilot pilot;
    public int size;
    public double id;


    void launch() {
        System.out.println("take off");
    }

    void landing() {
    }

    public void control(Pilot pilot) {
        this.pilot=pilot;
        System.out.println("Кораблем управляет " + pilot.name);
    }
}