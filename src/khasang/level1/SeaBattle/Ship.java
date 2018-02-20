package khasang.level1.SeaBattle;

import java.util.Random;

/**
 * Created by Ленар on 06.02.2018.
 */
public class Ship {

    int setPosition(){
        Random ran = new Random();
        int index = ran.nextInt(6);
        return index;
    }
}
