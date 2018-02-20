package khasang.level0.level0.homework.less7;

public class Cat {
    static int count;
    int id;
    static int bowl = 2000;
    static int plate = 3000;
    int water;
    int food;

    public Cat() {
        count++;
    }

    public Cat(int water, int food) {
        this();
        id = count;
        this.water = water;
        this.food = food;
        bowl -= water;
        plate -= food;
    }

    void showForCat() {
        System.out.printf("Кошка № %d выпила воды %d мл съела еды %d грамм %n", id, water, food);
    }

    static void showBalance() {
        System.out.printf("Всего осталось воды %d мл  еды %d грамм%n", bowl, plate);
        System.out.println();
    }
}
