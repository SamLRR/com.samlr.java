package khasang.level0.level0.homework.polymorphism;

public class Magnet extends Thing {
    private String whereFrom;

    public Magnet(String producer, String name, String whereFrom) {
        super(producer, name);
        this.whereFrom = whereFrom;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    @Override
    public String toString() {
        return String.format("Производство: " + "%-30s", super.getProducer() +
                ". " + super.getName() + "." + ". Откуда привезен: " + whereFrom);
    }
}
