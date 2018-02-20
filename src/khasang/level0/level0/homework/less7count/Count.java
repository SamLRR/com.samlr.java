package khasang.level0.level0.homework.less7count;

public class Count {
    private static int count;
    private int id;

    public int getNextCount() {
        return id++;
    }

    public Count() {
        this.id = ++count;
    }
}