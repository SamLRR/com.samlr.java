package khasang.level0.level0.homework.less7;

public class Plate {
    int capacity;
    Cat cat;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
        capacity -= cat.food;
        System.out.printf("Из тарелки кошка № %d съела %d грамм еды  %n", cat.id, cat.food);
    }

    void showBalance() {
        System.out.printf("В тарелке осталось еды %d %n", capacity);
    }
}
