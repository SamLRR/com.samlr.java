package khasang.level1.atmcontinue.bank;

import java.util.HashSet;
import java.util.Set;

public class Pin {
    private int pin;
    private static int count = 1000;
    private static Set<Integer> setPin = new HashSet<>();

    public Pin() {
        pin = ++count;
        setPin.add(pin);
    }

    public int getPin() {
        return pin;
    }

    public static Set<Integer> getHashSetPin() {
        return setPin;
    }
}
