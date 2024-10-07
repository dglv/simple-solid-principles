package org.dglv.solid.utils;

public final class ShapePrinter {
    private ShapePrinter() {
    }

    public static String json(double sum) {
        return "{sum: %.3f}".formatted(sum);
    }

    public static String csv(double sum) {
        return "sum, %.3f".formatted(sum);
    }
}
