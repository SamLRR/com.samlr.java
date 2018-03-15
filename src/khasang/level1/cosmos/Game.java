package khasang.level1.cosmos;

public class Game {
    Launchable launchable;

    public void init() {
        CosmoPort cosmoPort = new CosmoPort("Байконур");
        //launchable = new Ship("Союз");
        launchable = new Rocket("Метеор");
        MissionControlShip controlShip = new MissionControlShip();
        controlShip.prepareForFly(launchable);
    }

    public void start() throws InterruptedException {
        launchable.launch();
    }
}
