package khasang.level1.collection;

public class Cat {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public String toString() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }
}
