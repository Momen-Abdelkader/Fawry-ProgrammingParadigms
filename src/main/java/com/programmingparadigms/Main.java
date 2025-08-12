package com.programmingparadigms;


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Double> doubleNumber = CurryUtil.multiplyBy(2);
        Function<Double, Double> halveNumber = CurryUtil.multiplyBy(0.5);

        System.out.println(doubleNumber.apply(5));
        System.out.println(halveNumber.apply(6.0));
        System.out.println(CurryUtil.multiplyBy(5).apply(6)); // same as multiply(5)(6) in JavaScript
    }
}