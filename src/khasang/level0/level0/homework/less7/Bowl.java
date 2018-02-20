package khasang.level0.level0.homework.less7;

public class Bowl {
    int capacity;
    Cat cat;

    public Bowl(int capacity) {
        this.capacity = capacity;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
        capacity -= cat.water;
        System.out.printf("Из миски кошка № %d выпила воды %d %n", cat.id, cat.water);
    }

    void showBalance() {
        System.out.printf("В миске осталось воды %d %n", capacity);
    }
}
