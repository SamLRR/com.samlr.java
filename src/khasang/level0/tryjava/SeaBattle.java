package khasang.level0.tryjava;

import java.util.Random;
import java.util.Scanner;

public class SeaBattle {

    private static final int FIELDSIZE = 10;

    public static void main(String[] args) {
        daGame();
    }

    private static void daGame() {
        char[] cells = new char[FIELDSIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int shot;
        int point = 0;
        Random ran = new Random();
        int index = ran.nextInt(6);
        for (int i = 0; i < 3; i++) {
            cells[index+i] = 'O';
        }
        do {
            for (char cell : cells) {
                System.out.print(cell);
            }
            System.out.println();
            System.out.println("Введите число");
            shot = scanner.nextInt();
            if(cells[shot-1] == 'O'){
                cells[shot-1] = 'X';
                System.out.println("Корабль ранен");
                point++;
            } else {
                if(!(cells[shot-1] == '*'||cells[shot-1] == 'X')){
                    cells[shot-1] = '*';
                    System.out.println("Мимо");
                }
            }
        } while(!(point == 3));

        System.out.println("Корабль потоплен");
    }
}
