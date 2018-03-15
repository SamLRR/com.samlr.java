package khasang.level1.atm;

public class A {
    int a;
    int b = 1;

    void foo() {
        System.out.println("A");
    }
}

class B extends A {
    int b = 2;


    void foo() {
        System.out.println("B");
    }
}

class Main1 {
    public static void main(String[] args) {
        A a = new B();
        int c = a.b;
        System.out.println(c);
    }

}