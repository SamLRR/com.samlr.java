package khasang.level1.battleship;

import java.util.Scanner;

public class Player {
    static String nameOfGamer = "";
    private static Scanner scanner = new Scanner(System.in);

    static void greetingGamer() {
        System.out.println("Добро пожадовать в игру Морской бой\nВведите пожалуйста Ваше имя/ник:");
        nameOfGamer = scanner.nextLine();
    }

    int getShot() {
        int shot;
        System.out.println();
        System.out.println("Введите число");
        shot = scanner.nextInt();
        return shot;
    }
}
