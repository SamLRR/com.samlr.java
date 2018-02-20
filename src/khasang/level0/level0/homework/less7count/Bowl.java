package khasang.level0.level0.homework.less7count;

public class Bowl {
    private int capacity;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public void drink(Cat cat) {
        capacity -= cat.getWater();
        System.out.printf("Из миски кошка %s (ID %d) выпила воды %d %n", cat.getName(),
                cat.getId(), cat.getWater());
    }

    void showBalance() {
        System.out.printf("В миске осталось воды %d %n", capacity);
    }
}
