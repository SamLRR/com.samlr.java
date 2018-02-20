package khasang.level0.level0.homework.polymorphism;

public class Clothes extends Thing {
    private String sizeClothes;

    public Clothes(String producer, String name, String sizeClothes) {
        super(producer, name);
        this.sizeClothes = sizeClothes;
    }

    public String getSizeClothes() {
        return sizeClothes;
    }

    @Override
    public String toString() {
        return String.format("Производитель: " + "%-30s", super.getProducer() +
                ". " + super.getName() + "." + ". Size: " + sizeClothes);
    }
}
