package khasang.level0.tryjava;
/*
 Напишите вывод на экран чисел в арифметической прогрессии. Например: 0, 5, 10, 15, 20, 25

Для этого:

1. Создайте метод, который бы принимал два параметра: начальное значение и Разность Прогрессии
(то есть число, на которое нужно постоянно увеличивать прогрессию. В примере выше это будет число 5).

2. Выводите на экран первый параметр.
3. Сделайте выход из метода, если это число больше, например, 100

4. Внутри метода вызывайте его самого, увеличив первый параметр на Разность Прогрессии.

 */
public class Recursion {
    public static void main(String[] args) {

        //recursion(8,5);
        double a;
        int i1 = 100;
        int i2 = 1000; // вывод 0.0
        a =(double) i1 /  i2;
        System.out.println(a); // вывод 0.1
    }

    private static void recursion(int start, int diff) {

        int sum = start;


        if (start>100){System.exit(0);

            }
        //sum += diff;
        recursion(start+diff, diff);
        System.out.println(start);
//        System.out.println(start);
//            System.exit(0);


    }
}
