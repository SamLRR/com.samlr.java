package khasang.level1.cosmo;
public class Game {
    SpacePort spaceport;
    private Pilot pilot;

    public void init() {
        spaceport = new SpacePort("Baikonur");
        MissionControlCenter missionControlCenter = new MissionControlCenter();
        spaceport.missionControlCenter = missionControlCenter; // todo get-set

        SpaceShip spaceship = new SpaceShip();
        spaceport.initWithSpaceShip(spaceship);
        pilot=new Pilot("Titov");
        spaceship.control(pilot);
    }

    public void start() {
        spaceport.missionControlCenter.launch();
    }
}

