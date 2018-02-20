package khasang.level1.battleship;

import java.util.Scanner;

public class Player {

    int getShot() {
        int shot;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите число");
        shot = scanner.nextInt();
        return shot;
    }

}
