package org.example.returnpairelement;

public class ReturnPairElement {

    public static String car(cons pair) {
        return pair.getA();
    }

    public static String cdr(cons pair) {
        return pair.getB();
    }
}
