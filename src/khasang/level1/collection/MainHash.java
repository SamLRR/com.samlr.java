package khasang.level1.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainHash {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        List[] cats = new List[SIZE];
        for (int i = 0; i < cats.length; i++) {
            cats[i]=new LinkedList();
        }
        Cat barsik = new Cat("BarsBarsBar");
        Cat tom = new Cat("TomTomTomTo");
        int tempHash1 = barsik.hashCode()%SIZE;
        int tempHash2 = tom.hashCode()%SIZE;
        cats[tempHash1].add(barsik);
        cats[tempHash2].add(tom);

        //System.out.println(tempHash1);

        //System.out.println(tempHash2);

        List list = cats[tempHash1];
        int index1 = cats[tempHash1].indexOf(barsik);
        int index2 = cats[tempHash2].indexOf(tom);
        System.out.println(index1);
        System.out.println(list.get(index1));

        System.out.println(index2);
        System.out.println(list.get(index2));

       // System.out.println(cats[tempHash2].indexOf(tom));





    }
}
