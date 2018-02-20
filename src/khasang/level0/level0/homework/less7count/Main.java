package khasang.level0.level0.homework.less7count;

public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        Count countForCat = new Count();
        Cat boris = new Cat("Boris", countForCat);
        Cat murka = new Cat("Murka", countForCat);

        Bowl bowl1 = new Bowl(1200);
        bowl1.drink(boris);
        bowl1.drink(murka);
        bowl1.showBalance();

        Plate plate1 = new Plate(2200);
        plate1.eat(boris);
        plate1.eat(murka);
        plate1.eat(boris);
        plate1.showBalance();
    }
}
