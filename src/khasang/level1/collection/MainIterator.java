package khasang.level1.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat barsik = new Cat("Barsik");
        cats.add(barsik);
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Seriy"));
        cats.add(new Cat("Tom"));
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat nextCat=iterator.next();
            if (nextCat==barsik) {
                iterator.remove();
            }
        }
        String second = "second";
        String second2="second";
        System.out.println(second.equals(second2));

    }
}
