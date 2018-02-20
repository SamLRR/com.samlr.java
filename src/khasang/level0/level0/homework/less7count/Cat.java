package khasang.level0.level0.homework.less7count;

public class Cat {
    private static int bowl = 2000;
    private static int plate = 3000;
    private String name;
    private int id;
    private int water;
    private int food;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getWater() {
        return water;
    }

    public int getFood() {
        return food;
    }

    public Cat(String name, Count count) {
        this.name = name;
        id = count.getNextCount();
        drinkNorm();
        eatNorm();
    }

    void drinkNorm() {
        this.water = 200;
        bowl -= water;
    }

    private void eatNorm() {
        this.food = 150;
        plate -= food;
    }
}