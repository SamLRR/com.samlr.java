package khasang.level1.cosmo;

class SpacePort {
    MissionControlCenter missionControlCenter;
    SpaceShip spaceship;
    String name;

    public SpacePort(String name) {
        this.name = name;
    }

    void initWithSpaceShip(SpaceShip spaceship) {
        this.spaceship = spaceship;
        missionControlCenter.currentSpaceShip = spaceship;
    }

    void cleaning() {

    }
}

