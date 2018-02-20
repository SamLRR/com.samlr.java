package khasang.level0.level0.homework.less7;

public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        Cat cat1 = new Cat(300, 200);
        Cat cat2 = new Cat(200, 100);
        Cat cat3 = new Cat(400, 200);

//        Это блок для проверки static
        cat1.showForCat();
        cat2.showForCat();
        cat3.showForCat();
        Cat.showBalance();

//        Это блок для проверки не static
        Bowl bowl1 = new Bowl(1200);
        bowl1.setCat(cat1);
        bowl1.setCat(cat2);
        bowl1.showBalance();

        Plate plate1 = new Plate(2200);
        plate1.setCat(cat1);
        plate1.setCat(cat2);
        plate1.setCat(cat3);
        plate1.showBalance();

        Plate plate2 = new Plate(1200);
        plate2.setCat(cat1);
        plate2.setCat(cat2);
        plate2.setCat(cat3);
        plate2.showBalance();

    }
}
