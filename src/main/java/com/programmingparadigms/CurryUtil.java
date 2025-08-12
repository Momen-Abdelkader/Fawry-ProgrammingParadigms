package com.programmingparadigms;

import java.util.function.Function;

public class CurryUtil {
    public static <T extends Number> Function<T, Double> multiplyBy(T num) {
        return (T num2) -> num.doubleValue() * num2.doubleValue();
    }
}
