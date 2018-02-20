package khasang.level0.level0.homework.less7count;

public class Plate {
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void eat(Cat cat) {
        capacity -= cat.getFood();
        System.out.printf("Из тарелки кошка %s(ID %d) съела %d грамм еды  %n", cat.getName(), cat.getId(), cat.getFood());
    }

    void showBalance() {
        System.out.printf("В тарелке осталось еды %d %n", capacity);
    }
}
