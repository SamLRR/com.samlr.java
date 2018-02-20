package khasang.level0.tryjava;

import java.util.Random;
import java.util.Scanner;

/*
Напишите код, который в цикле спрашивает у пользователя число от 1 до 10 (по одному числу за раз),
до тех пор, пока сумма этих чисел не станет равной 21.
Если сумма чисел превысила 21, то завершите программу.
Если сумма чисел составила точно 21, то поздравьте пользователя с выигрышем.
Например, пользователь ввел число 2, затем число 5, затем число 6, их сумма будет
2 + 5 + 6 = 13
*/

public class Game21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumGamer1 = 0;
        int sumGamer2 = 0;
        int card = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ходит игрок №" + (i % 2 + 1) + " нужна карта, введите +, если нет нажмите -:");
            String sign = scanner.nextLine();
            if (("+".equals(sign) && (i % 2 == 0))) {
                card = new Random().nextInt(10) + 1;
                System.out.println("Игрок №1 выбрал карту : " + card);
                sumGamer1 = sumGamer1 + card;

            } else {
                if ("+".equals(sign) && (i % 2 == 1)) {
                    card = new Random().nextInt(10) + 1;
                    System.out.println("Игрок №2 выбрал карту : " + card);
                    sumGamer2 = sumGamer2 + card;

                }
            }

            if ("-".equals(sign) && (i % 2 == 0)) {
                System.out.println("Ход пропущен игроком №1");
                break;
            } else {
                if ("-".equals(sign) && (i % 2 == 0)) {
                    System.out.println("Ход пропущен игроком №2");
                }
            }
            if (sumGamer1 == 21) {
                System.out.println("Остановка игры выиграл игрок №1");
            }
            if (sumGamer2 == 21) {
                System.out.println("Остановка игры выиграл игрок №2");
            }


            if (sumGamer1 > 21) {
                System.out.println("Игрок №1 набрал очков: " + sumGamer1 + " это больше 21, он проиграл");
                break;
            } else {
                if (sumGamer2 > 21) {
                    System.out.println("Игрок №2 набрал очков: " + sumGamer2 + " это больше 21, он проиграл");
                    break;
                }
            }

        }


        System.out.println("Игрок №1 набрал очков: " + sumGamer1);
        System.out.println("Игрок №2 набрал очков: " + sumGamer2);


    }
}
