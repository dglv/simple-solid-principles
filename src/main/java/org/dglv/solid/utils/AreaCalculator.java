package org.dglv.solid.utils;


import org.dglv.solid.model.Shape;

import java.util.List;

public record AreaCalculator() {

    public static double sum(List<Shape> shapes) {
        return shapes.stream()
                .mapToDouble(Shape::area)
                .sum();
    }
}
