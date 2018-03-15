package khasang.level1.cosmos;

public class MissionControlShip {

    void prepareForFly(Launchable launchable) {
        System.out.println("Ко взлёту " + launchable + " готов");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            pause();
        }
    }

    private void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}
