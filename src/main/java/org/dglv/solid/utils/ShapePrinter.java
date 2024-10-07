package org.dglv.solid.utils;

public record ShapePrinter() {

    public static String json(double sum) {
        return "{sum: %.3f}".formatted(sum);
    }

    public static String csv(double sum) {
        return "sum, %.3f".formatted(sum);
    }
}
