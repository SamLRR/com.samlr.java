package khasang.level1.cosmo;

public class MissionControlCenter {
    SpaceShip currentSpaceShip;
    int staffAmount;

    void launch() {
        if (countDown()) {
            currentSpaceShip.launch();
        }
    }

    boolean countDown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            pause();
        }
        System.out.println("start");
        return true;
    }

    private void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}